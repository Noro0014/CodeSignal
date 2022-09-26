package dad.codesignal;


public class EdgeOfTheOcean {
	
	public static int solution (int[] numbers) {
		
		
		int producto = numbers[0]*numbers[1];
		
		
	for (int i = 0; i <numbers.length-1; i++) {
		if (producto <  numbers[i]*numbers[i+1]) {
			producto = numbers[i]*numbers[i+1];
		}
	}
	return producto;
	
	}
}
	


