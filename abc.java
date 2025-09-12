import java.util.Scanner;
class MyClass{
    String name;
void setname(String name){
    this.name=name;
}    
void display(){
    System.out.println("Name:"+name);
}
public static void main(String[]args){
    MyClass m = new MyClass();
    System.out.println("Enter your name:");
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine(); 
    m.setname(name);
    m.display();     
}    
}