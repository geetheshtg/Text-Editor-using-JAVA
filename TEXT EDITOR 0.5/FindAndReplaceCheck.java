package texteditor;
import java.io.*;
import java.util.*;

public class Files {
	Files(){
		
	}
	String input="";
	String output="";
	public String getInp() throws IOException {
		InputStream i = new FileInputStream("E:/file1.txt");
		
		int j=0;
		
		while(j!=-1)
		{
			j=i.read();
			if(j!=-1){
				input+=(char) j ;
			}
		}
		
		return input;
	}
public void finrep(String fin,String rep) throws IOException {
	Scanner sc = new Scanner(System.in);
	File p = new File("E:/file1.txt");
	File q = new File("E:/file2.txt");
	//String input = "" ;
	String inter = "" ;
	String find = fin;
	String replace = rep;
	String output ="";
//	InputStream i = new FileInputStream("E:/file1.txt");
	OutputStream o = new FileOutputStream("E:/file2.txt");
	
	String input=getInp();
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
	PrintWriter writer=new PrintWriter(p);
	writer.print("");
	
    InputStream m= new FileInputStream("E:/file2.txt");
    OutputStream n= new FileOutputStream("E:/file1.txt");
	int j=0;
	input="";
	while(j!=-1)
	{
		j=m.read();
		if(j!=-1){
			input+=(char) j ;
		}
	}
	 buf=input.getBytes();
	 n.write(buf);
	
	 PrintWriter write=new PrintWriter(q);
		write.print("");
	
	}


public boolean check(String ch) throws IOException {
	
	File p = new File("E:/file1.txt");
	File q = new File("E:/file2.txt");
	//String input = "" ;
	String inter = "" ;
	
	String output ="";
//	InputStream i = new FileInputStream("E:/file1.txt");
	OutputStream o = new FileOutputStream("E:/file2.txt");
	
	String input=getInp();
	int k=0;
	while(k<input.length())
	{
		if((input.charAt(k)==32)|| (input.charAt(k)==10) || (k==input.length()-1))
		{
			if(inter.equals(ch))
			{
				return true;
				
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
	
	
	return false;
	
	
}



	}


