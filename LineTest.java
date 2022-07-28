
public class LineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line l1=new Line();
		System.out.println("Length of line l1 is:"+l1.LengthOfLine());
	
		Line l2=new Line();
		System.out.println("Length of line l2 is:"+l2.LengthOfLine());
		
		
		checkEuality(l1,l2);
	}

	private static void checkEuality(Line l1, Line l2) {
		// TODO Auto-generated method stub
		if(l1.LengthOfLine()==l2.LengthOfLine())
			System.out.println("Two lines are equal");
	else
		System.out.println("two lines are differnt");
	}

}
