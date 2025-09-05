package ch18.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws Exception {
		// 직렬화
//		MyClass mc = new MyClass();
//		mc.n = 10;
//		mc.ssn = 999;
//		mc.str = "Hello";
//
//		writeObject(mc);
		
		MyClass mc = readObject();
		System.out.println(mc.n);
		System.out.println(mc.ssn);
		System.out.println(mc.str);
	}
	
	static void writeObject(MyClass mc) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myClass.dat"));
		oos.writeObject(mc);
		oos.close();
	}
	
	static MyClass readObject() throws Exception {
		MyClass mc = null;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myClass.dat"));
		mc = (MyClass)ois.readObject();
		ois.close();
		return mc;
	}
}
