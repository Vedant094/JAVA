import java.io.*;
class file4{
	public static void main(String Args[])throws IOException{
		FileInputStream fis=new FileInputStream("file.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("1.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int x=0;
		while((x=bis.read())!=-1){
		bos.write(x);
		}
		bos.close();
		fos.close();
		bis.close();
		fis.close();
	}
}