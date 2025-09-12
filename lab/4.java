import java.util.*;
class A{
    String Name;
    String Id;
    String Branch;
    String Univ;

    void setDetails(String Name,String Id,String Branch,String Univ){
        this.Name=Name;
        this.Id=Id;
        this.Branch=Branch;
        this.Univ=Univ;
    }


    void showDetails(){
        System.out.println("Name : "+Name);
        System.out.println("Id : "+Id);
        System.out.println("Branch: "+Branch);
        System.out.println("Univ: "+Univ);
    }

}

class main{
    public static void main(String Args[]){
    A a=new A();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name: ");
    String Name=sc.nextLine();
    System.out.println("Enter your id: ");
    String Id=sc.nextLine();
    System.out.println("Enter your branch: ");
    String Branch=sc.nextLine();
    System.out.println("Enter your University: ");
    String Univ=sc.nextLine();
    a.setDetails(Name,Id,Branch,Univ);
    a.showDetails();
}
}