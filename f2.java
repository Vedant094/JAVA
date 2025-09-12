import java.io.*;
class A{
	public static void main(String args[]) throws IOException{
		FileInputStream fis=new FileInputStream("Documents\\Code\\Java\\abc.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("Documents\\Code\\Java\\Pqr.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int x=0;
		while((x=bis.read())!=-1){
		bos.write(x);
	}
		bis.close();
		fis.close();
		bos.close();
		fos.close();
	}
}