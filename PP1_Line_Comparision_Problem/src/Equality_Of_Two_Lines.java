import java.util.*;
public class Equality_Of_Two_Lines {

	void equality() {
      Scanner sc = new Scanner (System.in);	
      System.out.println("please entre x coordinates of first line ");
	  int x11 = sc.nextInt();
	  int x12 = sc.nextInt();
	  System.out.println("please entre y coordinates of first line ");
	  int y11 = sc.nextInt();
	  int y12 = sc.nextInt();
	  System.out.println("please entre x coordinates of second line ");
	  int x21 = sc.nextInt();
	  int x22 = sc.nextInt();
	  System.out.println("please entre y coordinates of second line ");
	  int y21 = sc.nextInt();
	  int y22 = sc.nextInt();
	  Double length_of_line1 = Math.sqrt(((x11-x12)*(x11-x12))+((y11-y12)*(y11-y12)));
	  Double length_of_line2 = Math.sqrt(((x21-x22)*(x21-x22))+((y11-y12)*(y21-y22)));
		 
	  if(length_of_line1.equals(length_of_line2))
		  {
			  System.out.println("Lines are equal");
		  }
		  else
			  System.out.println("Lines are not equal");

}
}