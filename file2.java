import java.io.*;
class file2{
	public static void main(String Args[])throws IOException{
	FileReader fis=new FileReader("file.txt");
	BufferedReader br=new BufferedReader(fis);
	String s;
	while((s=br.readLine())!=null){
	System.out.println(s);
	}
	br.close();
	fis.close();
	}
}