import java.util.Scanner;
class Banking{
	double balance;
	String name;
	String acc_no;
	double amount;

	void setdata(double balance,String name,String acc_no){
	this.balance=balance;
	this.name=name;
	this.acc_no=acc_no;
	}

	void getdata(){
	System.out.println("Name is: "+name);
	System.out.println("Account no is: "+acc_no);
	System.out.println("Remaining balance: "+balance);
	}

	void addmoney(double amount){
	balance=balance+amount;
	}

	void withdraw(double amount){
	if(amount<balance){
	balance=balance-amount;
	}
	else{
	System.out.println("Not sufficient balance");
	}
	}

	public static void main(String Args[]){
	double balance;
	String name;
	String acc_no;
	double amount;
	Banking b=new Banking();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name:");
	name=sc.nextLine();
	System.out.println("Enter your account no: ");
	acc_no=sc.nextLine();
	System.out.println("Enter the balance: ");
	balance=sc.nextDouble();
	b.setdata(balance,name,acc_no);
	System.out.println("Enter the money you want to add:");
	amount=sc.nextDouble();
	b.addmoney(amount);
	System.out.println("Enter the amount you want to withdraw: ");
	amount=sc.nextDouble();
	b.withdraw(amount);
	b.getdata();



	}
	

}