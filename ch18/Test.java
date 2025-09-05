package ch18;

import java.io.File; //java.nio도 있음. 참고.

public class Test {

	public static void main(String[] args) throws Exception {
		// File
		String dirName = "C:" + File.separator + "myDir";
		File file1 = new File(dirName);
		
		if (file1.exists()) {
			System.out.println("폴더가 있다.");
		}else {
			System.out.println("폴더가 없다.");
			if(file1.mkdir()) {
				System.out.println("폴더를 생성.");
			}
		}
		
		// 파일 생성
//		File file2 = new File(dirName, "char.txt");
//		file2.createNewFile();

		// 파일 삭제
		File file2 = new File(dirName, "char.txt");
		file2.createNewFile();

		if (file2.exists()) {
			System.out.println("파일이 있다.");
			file2.delete();
		}
	}

}
