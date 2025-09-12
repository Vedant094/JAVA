import java.util.Scanner;
class A{
	String pan_no;
	String name;
	int taxIncome;
	double tax;

	void input_info(String pan_no,String name,int taxIncome){
		this.pan_no=pan_no;
		this.name=name;
		this.taxIncome=taxIncome;
	}

	void taxCalc(int taxIncome){
		if(taxIncome>250000&&taxIncome<=300000){
			tax=tax+(taxIncome-250000)*0.01;
		}
		else if(taxIncome>300000&&taxIncome<=400000){
			tax=5000+(taxIncome-300000)*0.02;
		}
		else{
			tax=25000+(taxIncome-400000)*0.03;
		}
	}

	void show(){
		System.out.println("Pan_no: "+pan_no);
		System.out.println("Name: "+name);
		System.out.println("Tax: "+tax);
	}
}
class main{
	public static void main(String Args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pan no:");
		String pan_no=sc.nextLine();
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter your annual income: ");
		int taxIncome=sc.nextInt();
		A obj=new A();
		obj.input_info(pan_no,name,taxIncome);
		obj.taxCalc(taxIncome);
		obj.show();
	}
}