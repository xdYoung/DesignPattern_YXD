package me.yang.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;
		InputStream in = null;

		try {
			in =
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("./resources/test.txt")));

			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) { in.close(); }
		}
		System.out.println("\n************************************************************************");
		try (InputStream in2 = 
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("./resources/test.txt"))))
		{
			while((c = in2.read()) >= 0) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n************************************************************************");
		try {
			InputStream in2 = new FileInputStream("./resources/test.txt");
			while((c = in2.read()) >= 0){
				System.out.print((char) c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
