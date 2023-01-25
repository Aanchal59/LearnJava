//ADD TWO NUMBERS

public class Functions {
	public static int calculateSum(int a, int b){
	int sum = a + b;
	return sum;

	}

	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();

	int sum = calculateSum(a,b);
	System.out.println(sum);

	}
}


//MULTIPLY 2 NUMBERS AND RETURN PRODUCT


public class Functions {
	public static int calculateProduct(int a, int b){
	int sum = a * b;
	return a * b;

	}

	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();

	System.out.println(calculateProduct(a,b));

	}
}

//FACTORIAL OF A NUMBER


public class Functions {
	public static void printFactorial(int n){

		if (n < 0 ){
			System.out.println("Invalid Number");
			return ;
		}
		int fact = 1;

		for(int i = n; i>=1; i--){
			fact = fact * i; 
		}
		
		System.out.println(fact);
		return;
	}

	}

	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	int n = sc.nextInt();

	printFactorial(n);
	

	}
}

