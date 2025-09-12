import java.io.*;
class file{
	public static void main(String Args[])throws IOException{
		InputStreamReader fis=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(fis);
		System.out.println("Enter the text: ");
		String s=br.readLine();
		FileWriter fw=new FileWriter("file.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(s);
		bw.close();
		fw.close();
		br.close();
		fis.close();

	}
}