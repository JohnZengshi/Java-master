/*
	�����⣺�벹����룬���30��20��10

	ע�⣺�ڲ�������������ⲿ��û�м̳й�ϵ��
*/
class Outer {
	public int num  = 10;

	class Inner {
		public int num = 20;
		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			//System.out.println(new Outer().num);
			System.out.println(Outer.this.num);
		}
	}

}
class InnerClassTest {
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
	}
}
