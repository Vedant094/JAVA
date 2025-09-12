package oopsdemo1;

/**
* Author  : Vedant.Raturi
* Date    : Sep 3, 2025
* Time    : 10:53:08 AM
* Project : CoreJava

*/
class Faculty{
	int empId;
    String name;
    
    public void setData(int c,String d){
        this.empId=c;
       this.name=d;
     }
    
    public void showData(){
        System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
        System.out.println();
     }
}
public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		//create array of faculty object
		Faculty[] obj=new Faculty[5];
		
		//create actual faculty object
		for (int i = 0; i <5; i++) {
			obj[i]=new Faculty();
		}
		
		//assign data to Faculty Objects
		obj[0].setData(100, "James");
		obj[1].setData(101, "Gavin");
		obj[2].setData(102, "Navin");
		obj[3].setData(103, "Mary");
		obj[4].setData(104, "Rod");
		
		//display employee Object Data
		
		System.out.println("************Faculty Details************");
		for (int i = 0; i < 5; i++) {
			obj[i].showData();
		}
		System.out.println("***************************************");

	}

}
