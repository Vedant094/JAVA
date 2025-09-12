package oopsdemo1;

/**
* Author  : Vedant.Raturi
* Date    : Sep 3, 2025
* Time    : 12:15:08 PM
* Project : CoreJava

*/

public class CandidateTest {

	public static void main(String[] args) {
		Candidate c1=new Candidate(101,"James Gosling",5000.00f);
		Candidate c2=new Candidate(102,"Navin Kumar",6000.00f);
		
		
		c1.calculateDA();
		c1.display();
		
		c2.calculateDA();
		c2.display();
	}

}
