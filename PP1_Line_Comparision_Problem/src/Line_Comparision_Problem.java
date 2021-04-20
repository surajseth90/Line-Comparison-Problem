import java.util.Scanner;


public class Line_Comparision_Problem {
 
	public static final int length_Of_Line = 1;
	public static final int equality_Of_Two_Lines=2;
	public static final int compare_Two_Lines =3; 	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Which action you want to perform : ");
		System.out.println("1.Length of a line ");
		System.out.println("2.Check the equality of two line");
		System.out.println("3. Compare two lines1");
		
		int input =sc.nextInt();
	
		switch(input)
		{
		case length_Of_Line:
		{
			Length_Of_Line length_Of_Line = new Length_Of_Line();
			length_Of_Line.length();
			break;
			
		}
		case equality_Of_Two_Lines:
		{
			Equality_Of_Two_Lines equality_Of_Two_Lines = new Equality_Of_Two_Lines();
			equality_Of_Two_Lines.equality();
			break;
		}
		case compare_Two_Lines:
		{
			Comparision_Of_Two_Lines comparision_Of_Two_Lines = new Comparision_Of_Two_Lines();
			comparision_Of_Two_Lines.comparision();
			break;
		}
		}
 }

}
