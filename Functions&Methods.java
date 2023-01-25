//FUNCTIONS and METHODS


/*returnType functionName(type arg1, type arg2..){
	//operations
}
*/


import java.util.*;

public class Functions void printMyName()
{	
	public static void main(String args[]){
	System.out.println(name);
	return;	
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		printMyName(name); //call kiya function ko
	}
	
}

//What happens in memory

/*
All functions are first preserved in stack formation. 1 thing saved - Stack frame


// EK stack frame mei, variables bhi add honge uske//

First frame made out of main.
Jaise hi main function call lagayega name function ko, ek aur fram banega.

Ek k call hote dusre k remove hote.


*/