package cn.itcast_01;

//public class Student extends Object:���ּ̳���Ĭ�ϴ��ڵ�
public class Student {
	private String name;
	private int age;
	private Number test;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	public void setTest(Number test) {
		this.test = test;
	}
	
	public Number getTest() {
		return test;
	}
//	@Override
//	public String toString() {
//		return name+"---"+age;
//	}
	
	

	// @Override
	// public int hashCode() {
	// return 1000;
	// }

}