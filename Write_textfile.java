package Core_Java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_textfile {

	public static void main(String[] args) throws IOException {
		FileWriter obj=new FileWriter("C:\\Users\\pedde\\OneDrive\\Desktop\\java\\Java_textfile.txt");
		BufferedWriter br=new BufferedWriter(obj);
		br.write("Failure is the first step to sucess  ");
		br.write("  Step By step day by day");
		br.close();
	}

}
