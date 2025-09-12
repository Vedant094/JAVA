import java.io.*;
class A{
	public static void main(String Args[])throws IOException{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		FileOutputStream fos=new FileOutputStream("Documents\\Code\\Java\\Pqr.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		System.out.println("Enter your name: ");
		String name=br.readLine();
		System.out.println("Enter your branch: ");
		String branch=br.readLine();
		String s="Your name is= "+name+  " And your branch= "+branch;
		byte b[]=s.getBytes();
		bos.write(b);
		br.close();
		isr.close();
		bos.close();
		fos.close();
	}
}
