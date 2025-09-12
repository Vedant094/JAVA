import javax.swing.*;
import java.awt.*;
class GUI extends JFrame{
	GUI(){
		JTextField tf1,tf2,tf3,tf4;
		JLabel l1=new JLabel("First Name");
		JLabel l2=new JLabel("Last Name");
		JLabel l3=new JLabel("Age");
		JLabel l4=new JLabel("Gender");
		JLabel l5=new JLabel("D_O_B");
		JLabel l6=new JLabel("Student Information");
		tf1=new JTextField(20);
		tf2=new JTextField(20);
		tf3=new JTextField(20);
		tf4=new JTextField(20);
		JRadioButton r1=new JRadioButton("Male");
		JRadioButton r2=new JRadioButton("Female");
		ButtonGroup b=new ButtonGroup();
		b.add(r1);
		b.add(r2);
		setLayout(new FlowLayout());
		add(l6);
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(l5);
		add(tf4);
		add(l4);
		add(r1);
		add(r2);
	}
	public static void main(String Args[]){
		GUI d=new GUI();
		d.setSize(300,400);
		d.setVisible(true);
	}
}