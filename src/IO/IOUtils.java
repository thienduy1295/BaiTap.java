package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class IOUtils {
	//doc file nhi phan
	public static void readBinaryText(String path){
		try {
			//1 mo luong
			FileInputStream fileInputStream = new FileInputStream(path);
			//2 doc file
			byte[] buffer = new byte[7];
			String s ="";
			int len =0;
			while((len = fileInputStream.read(buffer))!=-1){
				s+= new String(buffer,0,len);
			}
			System.out.println(s);
			//3 dong luong
			fileInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//ghi file nhi phan
	public static void writeBinaryText(String path,String content){
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(path);
			fileOutputStream.write(content.getBytes());
			fileOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//doc file unicode = FileReader
	public static void readFileReader(String path) {
		try {
			FileReader fileReader = new FileReader(path);
			char[] buffer = new char[7];
			String s ="";
			int len = 0;
			while((len=fileReader.read(buffer))!=-1){
				s+= new String(buffer, 0, len);
			}
			System.out.println(s);
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readBinaryTextFileByBuffer(String path) {
		BufferedInputStream bufferedInputStream = null;
		try {
			bufferedInputStream = new BufferedInputStream(new FileInputStream(path));
			byte[] buffer = new byte[7];
			String s = "";
			int len = 0;
			while((len=bufferedInputStream.read(buffer))!=-1){
				s+= new String(buffer, 0, len);
			}
			System.out.println(s);
			bufferedInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//copy file
	public static void copyFile(String srcPath,String desPath){
		try {
			FileInputStream fileInputStream = new FileInputStream(srcPath);
			FileOutputStream fileOutputStream = new FileOutputStream(desPath);
			byte[] buffer = new byte[7];
			String s ="";
			int len = 0;
			while((len=fileInputStream.read(buffer))!=-1){
				fileOutputStream.write(buffer,0,len);
			}
			fileInputStream.close();
			fileOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//xu ly File
	public static void even(String path) {
		try {
			FileReader fileReader = new FileReader(path);
			char[] buffer = new char[1024];
			String s = "";
			int len = 0;
			while((len=fileReader.read(buffer))!=-1){
				s+=new String(buffer, 0, len);
			}
			for(int i = 0;i<=s.length();i++){
				if(i%2==0){
					System.out.print(s.charAt(i));
				}
			}
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void soNguyenTo(String path) {
		try {
			FileReader fileReader = new FileReader(path);
			char[] buffer = new char[1024];
			String s = "";
			int len = 0;
			while((len=fileReader.read(buffer))!=-1){
				s+=new String(buffer, 0, len);
			}
			for(int i = 0;i<=s.length();i++){
				if(TinhToan.Math.checkSNT(i)==true){
					System.out.print(s.charAt(i));
				}
			}
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void relate_3(String path) {
		try {
			FileReader fileReader = new FileReader(path);
			char[] buffer = new char[1024];
			String s = "";
			int len = 0;
			while((len=fileReader.read(buffer))!=-1){
				s+=new String(buffer, 0, len);
			}
			for(int i = 0;i<=s.length();i++){
				if(TinhToan.Math.checkRelate_3(i)==true){
					System.out.print(s.charAt(i));
				}
			}
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
