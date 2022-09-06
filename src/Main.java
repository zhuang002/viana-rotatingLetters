import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] rotatableLetters = {'I', 'O', 'S', 'H', 'Z', 'X', 'N'};  // memorize all the rotatable letters.
		Scanner sc = new Scanner(System.in);  // create a scanner object.
		String s = sc.nextLine(); // read a line of string from System.in (console) and save it in varialbe s.
		// iterate the letters(characters) in the string s.
		for (int i=0;i<s.length();i++) {  // i will loop from 0 to s.length() (exclusive) which are the indexes of the character of the string.
			// we are going to get all the characters one by one and check if the character is a ratating letter.
			char c = s.charAt(i);  // get the character of the s at index i
			// we will check if the c is a rotating letter by checking if c is in ratatableLetter.
			if (!isRotatableLetter(c, rotatableLetters)) { // isRotatableLetter(c, rotatableLetters) is to check if c is in rotatableLetter, which means if c is rotatable. 
				// if c is not rotatable, then the s is not rotatable. We should print "NO" and finish the program.
				System.out.println("NO");
				return;
			}
			// otherwise (c is rotatable), we need to go to check the next character. that is: do nothing and go to next loop.
		}
		// all letters in the string are checked and the program did not finish, which means
		// all of them are rotatable. So we need to print YES and finish the program.
		System.out.println("YES");
		
	}

	

	private static boolean isRotatableLetter(char c, char[] rotatableLetters) {
		// TODO Auto-generated method stub
		// We need to iterate all letters in rotatableLetters. If one of the character in rotatable letters is equal to c, 
		// the c is rotatable, otherwise c is not rotatable.
		for (int i=0; i<rotatableLetters.length; i++) { // we loop the index of the array elements. i is the index. 
			if (c == rotatableLetters[i]) { // if c equals the current rotatable letter, then c is rotatable. 
				// then we need to return true;
				return true;
			}
		}
		// if the method did not return within the loop, which means none of the letters in the rotatableLetters equals c. 
		// this means c is not rotatable, so we need to return false.
		return false;
	}

}


/* 
 * f(width, length) is to calculate the area of a rectangle. 
 
double f(double width, double length) {
	return width*length;
}
*/