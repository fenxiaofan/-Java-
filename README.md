# -Java-
大话设计模式的代码

# 第一章 简单工厂模式

## 主要通过一个简单的例子，实现一个计算器来讲解面向对象的基本概念（继承、封装、多态）。
- 封装：通过定义一个Operation类，让其在内部实现加减乘除的逻辑运算，外部只要调运其方法即可
- 继承：父类OPeration只是定义了方法，没有具体实现，具体的方法有子类进行实现
- 多态：父类引用子类对象
***
简单工厂模式：对象的创建不需要自己去new，通过调用工厂类Factory的方法来返回需要的对象。优点是：需要增加新的功能时，只需要创建新的子类，
并修改工厂类即可。

# 第二章 策略模式

策略模式（strategy）：它定义了算法家族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化，不会影响到算法的客户。

## 例子：商场收银系统（打折、满减等功能）
- 面向对象编程，并不是类越多越好，类的划分是为了封装，但分类的基础是抽象，具有相同属性和功能的对象的抽象集合才是类。
  v1中使用的便是上章讲的简单工厂模式，但这个模式只是解决了对象创建的问题。
  v2中使用的便是策略模式，打折、返利本质上一些算法，用简单工厂来生成算法对象，并没有错，但算法本身一种策略，这些算法是随时会被替换的，
    这就是变化点，而封装变化点是面向对象的一种重要思维方式。
    
## 策略模式解析
策略模式中一系列的算法本质上完成的是相同的工作，只是实现不同，它可以以相同的方式调用所有的算法类，减少了**算法类**与**使用算法类**之
间的耦合。具体的几个部分：Strategy、Context、具体实现算法的类

优点：Stragy利用继承抽象出不同具体算法的功能来给Context用。并且可以简化算法的单元测试，每个算法都有自己单独的类。

注：在不同行为堆砌在一个类时，就很难避免使用条件语句来选择合适的行为。基本的策略模式中，选择所用具体实现的职责由客户端承担，并转给
策略模式的Context。但当其与简单工厂类结合时，选择具体实现的职责便可以交给context来承担，大大减轻了客户端的之策。

# 第三章 单一职责原则

# 第四章 开放-封闭原则

# 第五章 依赖倒置原则

# 第六章 装饰器模式
装饰器模式（Decorator）动态地给一个对象添加一些额外的职责，就功能来说，装饰器比生成子类更为灵活
主要部分：Component(抽象构件)、ConcreateComponent(具体构件)、Decorator(抽象装饰类)、ConcreteDecoratorA(具体装饰类)

使用场合：为已有的功能动态的添加其他的功能
优点：把每个要装饰的功能放在单独的类，让这个类来包装要装饰的对象，这样就可以有选择、有顺序的使用装饰类了。


# 第七章 代理模式
主要部分：Subject(抽主题角色)、Proxy(代理主题角色)、RealSubject(真是主题角色)

使用场合：第一，远程代理。第二，虚拟代理。第三，安全代理。第四，只能代理
Java中的代理：jdk动态代理（需要接口）、cglib动态代理（不需要接口）（实现AOP的原理）

# 第八章 工厂方法模式

## 简单工厂 VS 工厂方法
简单工厂的优点是工厂类中包含了必要的逻辑判断，根据客户端的选择条件返回对应的相关对象。对客户端来说，去除了与具体的依赖。但是要新增类的
话，需要修改工厂类，如基础的判断逻辑case。

工厂方法的优点是抽象出一个工厂接口，需要新增需求功能的时候，只需要增加相应的功能类以及对应的工厂方法。但此时的逻辑判断转移到了客户端上，
此时需要修改客户端

# 第九章 原型模式
原型模式(**Prototype**),用原型实例制定创建对象的种类，并且通过拷贝这些原型创建新的对象。
原型模式其实就是从一个对象再创建另一个可定制的对象，而且不需要知道任何创建的细节

主要部分：Prototype(抽象原型类)、ConcretePrototype(具体原型类)、Client(客户端)
Java类都继承自Object，Object有clone方法，实现克隆的Java类必须实现Cloneable接口，表示这个Java类支持被复制，如果没有实现就会抛出
CloneNotSupportException异常。

一般在初始化的信息不发生变化的情况下，克隆方法是最好的办法。既隐藏了对象的细节，又对性能是大大的提高。

## 浅复制vs深复制
浅复制：被复制的对象的所有变量都含有与原对象相同的值，而所有的对其他对象的引用都仍指向原来的对象。
深复制：把引用对象的变量指向复制过的新对象，而不是原有的被引用的对象。

Java中实现深克隆，可以通过**序列化**(Serialization)等方式实现。序列化就是将对象写到流的过程，写到流的对象是原有对象的一个拷贝，而原
有对象仍然存在于内存中。通过序列化实现的拷贝不仅可以复制对象本身，而且可以复制其引用的成员对象。因此通过序列化将对象写到一个流中，再从
流里将其读出，可以实现深克隆。(注意：能够实现序列化的对象必须实现Serializable接口)

# 第十章 模板方法模式
模板方法模式:定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定
步骤。
主要角色：**AbstractClass**(抽象类)，在抽象类中定义一系列的基本操作(PrimitiveOperations)，同时抽象类中实现了一个模板方法(TemplateMethod)
,用于定义算法框架。**ConcreteClass**(具体子类)，用于实现在父类中声明的抽象操作以完成子类特定的具体操作。

例子：银行的利息计算模块，利息计算流程：
- 系统根据账号密码验证用户信息，如果信息错误，显示错误提示。
- 如果信息正确，根据用户类型的不同使用不同的利息计算公式
- 系统显示例子

模板方法是通过把不变行为搬移到超类，去除子类中的重复代码来体现他的优势。当不变的和可变的行为在方法的子类中混合在一起，不变的行为会重复出
现在子类中。通过模板方法把这些行为搬移到单一的地方，帮助子类摆脱重复的不变行为的纠缠。

# 第十一章 迪米特法则

# 第十二章 外观模式

外观模式(Facade),为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。

通过引入一个新的外观角色可以降低原有系统的复杂度，同时降低客户端与子系统的耦合度。
主要角色：Facade(外观角色)、SubSystem(子系统角色)

# 第十三章 建造者模式
将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
主要角色：Builder(抽象创建者)、ConcreteBuilder(具体创建者)、Product(产品角色)、Director(指挥者).

Director在建造者模式中扮演着重要的作用，Director指导建造者如何构建产品，它按照一定的次序调用Builder的buildPartX()方法。

# 第十四章 观察者模式
观察者模式，又叫发布-订阅(publish/subscribe)模式，它定义了一种一对多的关系，让多个观察者对象同时监听一个主题对象。这个主题对象在状态
发生变化时，会通知所有观察者对象，使他们能够自动更新自己。
主要角色：Subject(目标)、ConcreteSubject(具体目标)、Observer(观察者)、ConcreteObserver(具体观察者)

使用场合：当一个对象的改变需要同时改变其他对象时，并且不知道有多少个对象有待改变时，使用观察者模式。


