
import java.io.*;
import java.util.*;
public class Readstuff {
	public static void main(String[] args) throws Exception{
		FileReader file=new FileReader("C://Users/Vivek/Desktop/vivek.txt");
		BufferedReader reader = new BufferedReader(file);
		String text = "";
		String line = reader.readLine();
		while(line!=null){
			text +=line;
			line=reader.readLine();
		}
		System.out.println(text);
	}

}
