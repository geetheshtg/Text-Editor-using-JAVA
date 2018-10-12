import java.io.*;
import java.util.*;

public class FindAndReplace {
	
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
		int j=0;
		while(j!=-1)
		{
			j=i.read();
			if(j!=-1){
				input+=(char) j ;
			}
		}
		
		int k=0;
		while(k<input.length())
		{
			
			if((input.charAt(k)==32)||(k==input.length()-1))
			{
				if(inter.equals(find))
				{
					
					inter = replace;
					output += inter;
					if(k==input.length()-1){
						output+=input.charAt(k);
					}
					inter = "";
				}
				else
				{
					output += inter;
					inter = "";
					if(k==input.length()-1){
						output+=input.charAt(k);
					}
				}
			}
			inter += input.charAt(k);
			k++;
		}
		System.out.print(output);
		byte[] buf = output.getBytes();
		o.write(buf);			
	}
}
