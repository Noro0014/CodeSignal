package dad.codesignal;

public class TheJourneyBegins {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int centuryFromYear(int year) {
		int century = 0;
		if (year % 100 == 0) {
			century = (year/100);
		} else 
			century = (year/100) + 1; 
		
		return century;
	}
	
	public static boolean palindrome (String inputString) {
	    
		StringBuilder cadenaInvertida = new StringBuilder(inputString);
		
		cadenaInvertida = cadenaInvertida.reverse();
		
		String cadenaInvertidaFinal = cadenaInvertida.toString();
		
		
		

		boolean isPalindrome;
		
		if (inputString.equals(cadenaInvertidaFinal)){
			isPalindrome = true;
		} else {
			isPalindrome = false;
		}
		
		return isPalindrome;

}
	
}
