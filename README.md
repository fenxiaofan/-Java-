# -Java-
大话设计模式的代码

#第一章 简单工厂模式

## 主要通过一个简单的例子，实现一个计算器来讲解面向对象的基本概念（继承、封装、多态）。
- 封装：通过定义一个Operation类，让其在内部实现加减乘除的逻辑运算，外部只要调运其方法即可
- 继承：父类OPeration只是定义了方法，没有具体实现，具体的方法有子类进行实现
- 多态：父类引用子类对象
***
简单工厂模式：对象的创建不需要自己去new，通过调用工厂类Factory的方法来返回需要的对象。优点是：需要增加新的功能时，只需要创建新的子类，
并修改工厂类即可。
