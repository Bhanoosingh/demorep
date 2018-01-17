import java.util.Scanner;

public class Q7Vowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a charaater:-");
		char c=sc.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("Entered character is a vowel");
		}
		else {
			System.out.println("Entered character is a Constant");
		}

	}
}