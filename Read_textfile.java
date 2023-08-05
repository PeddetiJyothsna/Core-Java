package Core_Java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_textfile {

	public static void main(String[] args) throws IOException {
		FileReader obj=new FileReader("C:\\Users\\pedde\\OneDrive\\Desktop\\java\\Java_textfile.txt");
		BufferedReader br=new BufferedReader(obj);
		String name;
		while((name=br.readLine())!=null) {
			System.out.println(name);
		}

	}

}

