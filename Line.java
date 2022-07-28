import java.util.Scanner;

public class Line {
	int x1,x2,y1,y2;
	Scanner sc=new Scanner(System.in);
	void InputLengths()
	{
		System.out.println("Enter starting co-ordinates of line");
		int x1=sc.nextInt();
		 int y1=sc.nextInt();
		System.out.println("Enter end co-ordinats of line");
		 int x2=sc.nextInt();
		 int y2=sc.nextInt();
	}
	double LengthOfLine()
	{
		InputLengths();
		double length=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return length;
	}
	
	
}
