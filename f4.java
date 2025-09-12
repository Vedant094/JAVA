import java.io.*;
class A{
	public static void main(String args[]) throws IOException{
		FileReader fr=new FileReader("Documents\\Code\\Java\\abc.txt");
		BufferedReader brs=new BufferedReader(fr);
		FileWriter fw=new FileWriter("Documents\\Code\\Java\\Pqr.txt");
		BufferedWriter bws=new BufferedWriter(fw);
		String x;
		while((x=brs.readLine())!=null){
		bws.write(x+"\n");
	}
		brs.close();
		fr.close();
		bws.close();
		fw.close();
	}
}