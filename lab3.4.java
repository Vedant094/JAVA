import java.util.*;
class Bank{
	double amount;
	double getRateofIntrest();
}
class HDFC extends Bank{
	double getRateofIntrest(){
		return 4.5;
	}
}
class SBI extends Bank{
	double getRateofIntrest(){
		return 5.0;
	}
}
class XYZ{
	public static void main(String Args[]){
		Bank b=new HDFC();
		double a=b.getRateofIntrest();
	}
}