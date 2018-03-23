package packaging;

public class Operations {
	public static int nSum( int input ) {

		int result = 0;
		for(int i=0; i<=input; i++){
			result += i;
		}
		return result;
	}

	public static int factorial( int input ) {

		int result=1;
		for(int i = 1; i<=input ; i++){
			result = result * i;
		}
		return result;
	}

	public static int fibonacci( int input ) {

		if(input == 0)
			return 0;
		if(input == 1)
			return 1;
		else{

			int result = (fibonacci( input-1) + fibonacci(  input-2 ));
			System.out.print(result + ",");
			return result;
		}
	}
}
