import java.util.
Scanner;
class Bank{
	String name;
	String acc_no;
	int amount;
	int w;

	void setdata(String name,String acc_no,int amount){
	this.name=name;
	this.acc_no=acc_no;
	this.amount=amount;
	}	

	void withdraw(int w){
	this.w=w;
	if(w>amount){
	System.out.println("Not Available");
	}
	else{
	amount=amount-w;
	}
	}
	void display(){
	System.out.println("Name is:"+name);
	System.out.println("Account no:"+acc_no);
	System.out.println("Amount after withdrawing is:"+amount);
	}
	public static void main(String[]args){
	Bank b=new Bank();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name:");
	String name=sc.nextLine();
	System.out.println("Please enter your account number:");
	String acc_no=sc.nextLine();
	System.out.println("Enter the amount to be deposited:");
	int amount=sc.nextInt();
	b.setdata(name,acc_no,amount);
	System.out.println("Enter the amount you want to withdraw:");
	int w=sc.nextInt();
	b.withdraw(w);
	b.display();



	}
}