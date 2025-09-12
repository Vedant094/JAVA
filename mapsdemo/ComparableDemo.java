package mapsdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
* Author  : Vedant.Raturi
* Date    : Sep 9, 2025
* Time    : 4:19:37 PM
* Project : CoreJava

*/

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(111,"John",29));
		al.add(new Student(222,"Mike",21));
		al.add(new Student(555,"Mary",26));
		al.add(new Student(666,"Jack",27));
		al.add(new Student(777,"Jim",28));
		System.out.println("Printing before sorting:   ");
		for(Student st:al) {
			System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());
		}
		System.out.println();
		Collections.sort(al);
		System.out.println("Printing after sorting:   ");
		for(Student st:al) {
			System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());
		}

	}

}
