package cn.itcast_01;

public class Teacher {
	private String name;
	private int age;
	static String address = "123";

	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("静态方法，不能用this");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		Teacher teacher01 = new Teacher("小明", 99);
		System.out.println(teacher01.getName());
		System.out.println(teacher01.getAge());
		System.out.println(Teacher.address);
	}

}
