import java.util.Scanner;
class A{
	public static void main(String Args[]){
		int arr[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int count=0;
		int t=0;
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				if(arr[i][j]==arr[i+1][j+1]){
					count++;
					t=arr[i][j];
				}
			System.out.println("Duplicate element: "+t);
			System.out.println("No of occurence: "+count);
			}
		}
	}
}