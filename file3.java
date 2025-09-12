import java.io.*;
class file3{
	public static void main(String Args[])throws IOException{
		FileReader fr=new FileReader("file.txt");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter("1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		String s;
		while((s=br.readLine())!=null){
			bw.write(s);
		}
		bw.close();
		fw.close();
		br.close();
		fr.close();
	}
}