import java.io.*;
import java.util.*;

public class Chumma {
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		File p = new File("E:/file1.txt");
		File q = new File("E:/file2.txt");
		String input = "" ;
		String inter = "" ;
		String find = sc.next();
		String replace = sc.next();
		String output ="";
		InputStream i = new FileInputStream("E:/file1.txt");
		OutputStream o = new FileOutputStream("E:/file2.txt");
		
		int j=i.read();
		while(j!=-1)
		{
			input+=(char) j ;
			j = i.read();
		}
		int k=0;
		while(k<input.length())
		{
			if((input.charAt(k)==32)|| (input.charAt(k)==10) || (k==input.length()-1))
			{
				if(inter.equals(find))
				{
					inter = replace;
					output += inter + input.charAt(k);
					if(k==input.length()-1){
						output+=input.charAt(k);
					}
					inter = "";
					k++;
				}
				else
				{
					output += inter + input.charAt(k);
					k++;
					inter = "";
					if(k==input.length()-1){
						output+=input.charAt(k);
					}
				}
			}
			if(k >= input.length())
				break;
			inter += input.charAt(k);
			k++;
		}
		System.out.print(output);
		byte[] buf = output.getBytes();
		o.write(buf);
	}
}


