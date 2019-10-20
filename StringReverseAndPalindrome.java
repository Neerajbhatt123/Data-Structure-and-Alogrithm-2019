import java.util.*;

class StringReverseAndPalindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String originalS = sc.next();

		System.out.println("Original String is ::: "+originalS);

		String find = "";

		for(int i = originalS.length() - 1; i >= 0 ; i--)
			find+=originalS.charAt(i);
		
		System.out.println("Reverse String is ::: "+find);
		if (originalS.equalsIgnoreCase(find))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}