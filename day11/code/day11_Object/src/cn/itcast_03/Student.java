package cn.itcast_03;

//��ʹ�ÿ�¡��ʱ�򣬱���CloneNotSupportedException
//ԭ������Ϊ����Ҫʵ��һ���ӿ�Cloneable
public class Student implements Cloneable {
	private String name;
	private int age;

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
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}