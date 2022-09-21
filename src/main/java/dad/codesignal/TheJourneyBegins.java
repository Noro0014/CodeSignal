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
	
	public String palindrome(String inputString) {
	    String cadenaInvertida = "";
	    
	    for (int i = 0; i < inputString.length(); i--) {
	    	cadenaInvertida = String.valueOf(inputString.charAt(i));
	    }
	    	return cadenaInvertida;
	    	
	}
	
}
