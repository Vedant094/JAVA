import java.io.*;
class A{
	public static void main(String args[]) throws IOException{
		FileInputStream fis=new FileInputStream("Documents\\Code\\Java\\abc.txt");
		FileOutputStream fos=new FileOutputStream("Documents\\Code\\Java\\Pqr.txt");
		int x=0;
		while((x=fis.read())!=-1){
		fos.write(x);
	}
		fis.close();
		fos.close();
	}
}