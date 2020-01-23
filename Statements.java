package Tutorial;
import java.util.*;
import javax.swing.*;
import java.awt.*;

class Student {
	public static enum GradeLevel {
		FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
	}
}
public class Statements {
	public static void main(String[] args) {
		
		
		
		JFrame win;
		Container contentPane;
		Graphics g;
		
		win = new JFrame("My First Rectangle");
		win.setSize(300, 200);
		win.setLocation(100, 100);
		win.setVisible(true);
		win.pack();
		
		contentPane = win.getContentPane();
		g = contentPane.getGraphics();
		g.draw3DRect(50, 50, 100, 30, true);
		g.fillRect(20, 29, 30, 50);
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Grade (Frosh-1, Soph-2, ...): ");
		int gradeLevel = sc.nextInt();
		
		switch (gradeLevel) {
		case 1: System.out.print("Go to the Gym");
				break;
		
		case 2: System.out.print("Go to the Science Aud");
		break;
		
		case 3: System.out.print("Go to Harris Hall Rm A3");
		break;
		
		case 4: System.out.print("Go to Bolt Hall Rm 101");
		break;
				
		}
		
		switch (20) {
		
			case  1: int x =10;
			case  2: int y =20;
			case  3: int z =30;
			
			default: System.out.print("Input error: Invalid Data");
			break;
		}
		
	}

}
