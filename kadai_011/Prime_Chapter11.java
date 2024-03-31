package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		boolean[] primeNumber = new boolean[100];
		
		for(int i = 0; i < primeNumber.length; i++) {
			primeNumber[i] = true;
		}
		
		for(int i = 1; i < primeNumber.length; i++) {
			int number = i + 1;
		
		boolean flag = false;
		
		for(int j = 2; j < number; j++) {
			if(number % j == 0) {
				flag = true;
			}
		}
		if(flag){
		}else {
			System.out.println(number);
		}
			
		}

    }
}