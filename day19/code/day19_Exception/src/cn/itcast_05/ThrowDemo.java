package cn.itcast_05;

import java.text.ParseException;
import java.util.Arrays;

/*
 * throw:���ڷ����У��ó����ת�ġ�
 */
public class ThrowDemo {
	public static void main(String[] args) {
		// show(10, 0);

		// show();
	}

	public static void show() throws ParseException, ArithmeticException,
			NullPointerException {
		if ("hello".equals("world")) {
			throw new ParseException(null, 0);
		} else {
			System.out.println("over");
		}
	}

	public static void show(int a, int b) {
		if (b == 0) {
			// System.out.println("��������");
			throw new ArithmeticException();
		} else {
			System.out.println(a / b);
		}

		System.out.println("haha");
	}
}
