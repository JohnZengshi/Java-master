/*
	Ȩ�����η���
				����	ͬһ�����µ������������	��ͬ���µ�����		��ͬ����������
	private		Y		
	Ĭ��		Y		Y
	protected	Y		Y							Y
	public		Y		Y							Y					Y
*/
package cn.itcast;

public class Father {
	private void show() {
		System.out.println("show");
	}

	void show2() {
		System.out.println("show2");
	}

	protected void show3() {
		System.out.println("show3");
	}

	public void show4() {
		System.out.println("show4");
	}

	public static void main(String[] args) {
		Father f = new Father();
		f.show();
		f.show2();
		f.show3();
		f.show4();
	}
}