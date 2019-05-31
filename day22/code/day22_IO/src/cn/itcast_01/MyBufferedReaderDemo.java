package cn.itcast_01;

import java.io.FileReader;
import java.io.IOException;

/*
 * ��Readerģ��BufferedReader��readLine()����
 */
public class MyBufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		MyBufferedReader mbr = new MyBufferedReader(new FileReader("my.txt"));

		String line = null;
		while ((line = mbr.readLine()) != null) {
			System.out.println(line);
		}

		mbr.close();
	}
}
