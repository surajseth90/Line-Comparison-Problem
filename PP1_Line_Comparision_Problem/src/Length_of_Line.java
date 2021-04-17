import java.util.*;
public class Length_of_Line {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("please entre x coordinates of the line ");
  	  int x11 = sc.nextInt();
  	  int x12 = sc.nextInt();
  	  System.out.println("please entre y coordinates of the line ");
  	  int y11 = sc.nextInt();
  	  int y12 = sc.nextInt();
  	  double length_of_line1 = Math.sqrt(((x11-x12)*(x11-x12))+((y11-y12)*(y11-y12)));
  	  System.out.println("Length of the line is : "+length_of_line1);
	}
}