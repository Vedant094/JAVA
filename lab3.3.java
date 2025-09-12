import java.util.*;
class Student{
	String Id;
	String Name;
	String Branch;
	String City;
	String University;

	Student(String Id){
		this.Id=Id;
	}
	Student(String Id,String Name){
		this(Id);
		this.Name=Name;
	}
	Student(String Id,String Name,String Branch){
		this(Id,Name);
		this.Branch=Branch;
	}
	Student(String Id,String Name,String Branch,String City){
		this(Id,Name,Branch);
		this.City=City;
	}
	Student(String Id,String Name,String Branch,String City,String University){
		this(Id,Name,Branch,City);
		this.University=University;
	}
	void show(){
		System.out.println("Id is: "+Id);
		System.out.println("Name is: "+Name);
		System.out.println("Branch is: "+Branch);
		System.out.println("City is :"+City);
		System.out.println("University is :"+University);
	}

	public static void main(String Args[]){
		String Id;
		String Name;
		String Branch;
		String City;
		String University;
		Scanner sc=new Scanner(System.in);
		System.out.println("Id");
		Id=sc.nextLine();
		System.out.println("Name");
		Name=sc.nextLine();
		System.out.println("Branch");
		Branch=sc.nextLine();
		System.out.println("City");
		City=sc.nextLine();
		System.out.println("University");
		University=sc.nextLine();
		Student A=new Student(Id,Name,Branch,City,University);
		A.show();

	}

}