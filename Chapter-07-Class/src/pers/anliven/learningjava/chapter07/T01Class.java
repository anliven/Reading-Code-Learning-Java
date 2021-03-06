package pers.anliven.learningjava.chapter07;

public class T01Class { // 使用class关键字定义类
	String name; // 定义成员变量

	public void getName() { // 定义无返回值的public成员方法
		int id = 0; // 定义局部变量，必须赋值或初始化
		System.out.println("ID：" + id + " 名称：" + name);
	}

	public static void main(String[] args) { // 定义主方法
		T01Class test = new T01Class(); // 创建对象
		test.getName(); // 通过“对象.成员方法”方式调用类的成员方法
	}

}

/*
 * 
 * ### 类与对象 
 * 类：用来描述同一类事物的状态和行为，是创建对象的模板。
 * 对象：是类的一个实例，包含具体的状态和行为。
 * 
 * ### 面向对象的特征 
 * 封装：将对象的属性和行为以类的形式封装起来，隐藏细节
 * 继承：类的复用，父类和子类 
 * 多态：子类除了继承有父类的特征，还具有其他的自身特征
 * 
 * ### 类成员
 * 成员变量：定义类的属性。定义在类中，方法体之外。可以不做赋值或初始化。
 * 成员方法：定义类的行为。
 * 
 * ### 局部变量
 * 定义在成员方法内。
 * 在方法被执行时创建，在方法执行结束时被销毁。 
 * 局部变量的作用域，从变量的声明开始到变量的结束为止。
 * 使用时，必须进行赋值或初始化，否则会出现编译错误。
 * 
 * ### public class
 * 声明类 在一个java文件中，只能有一个public class的声明，并且类名与文件名相同，但是允许有多个class的声明。
 * 
 */
