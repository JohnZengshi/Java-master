/*
	���������ʱ�򣬷�ΧԽСԽ�á�
*/
class Demo {
	public int sum(int x,int y) {
		return x + y;
	}
}

class Test2 {
	public static void main(String[] args) {
		Demo d = new Demo();
		int result = d.sum(10,20);
		System.out.println(result);
	}
}
