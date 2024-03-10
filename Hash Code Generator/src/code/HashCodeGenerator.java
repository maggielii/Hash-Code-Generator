package code;

import java.util.Scanner;

public class HashCodeGenerator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String word = input.next();
		char[] wordArray = word.toCharArray();
		
		int hashCode = 0;
		
		for(int x = 0; x < wordArray.length; x++)
		{
			hashCode += wordArray[x]*(x+1);
		}

		System.out.println(hashCode);
	}

}
