
public class JavaProgramPractice {
	
	
	public static void main(String[] args) {
							// find prime number from 1-100 
//output-> 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 	
//		for(int no=1;no<=100;no++) 
//		{
//			int temp=0;
//			for(int i=2;i<=no-1;i++) 
//			{
//				if(no%i==0) 
//				{
//					temp=temp+1;
//				}				
//			}
//			if(temp==0) 
//			{
//				System.out.print(no+ " ");
//			}
//		
//		}
		
		
						// Duplicate element in array
//		int a[]= {1,2,3,4,1,2};
//		for(int i=0;i<a.length-1;i++) 
//		{ 												// output -> 1 2 
//			for(int j=i+1;j<a.length;j++) 
//			{
//				if(a[i]==a[j]) 
//				{
//					System.out.print(a[j]+" ");
//				}
//				
//			}
//		}
		
							// Duplicate in the String
//		String a[] = {"abc","pqr","xyz","abc","Qa","pqr"};
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {                           // output -> abc pqr 
//					System.out.print(a[i]+" ");
//				}
//			}
//		}
		
									// check whether the number is prime or not
//		int no=7;int temp=0;
//		for(int i=2;i<=no-1;i++) {
//			if(no%i==0) {
//				temp=temp+1;
//			}
//									// output -> 7 is prime number
//		}
//		if(temp==0) {
//			System.out.println(no+" is prime number");
//		}												
//		else {
//			System.out.print(no+" is not prime number");
//		}
		
				// reverse String 
		
//		String s ="life";
//		char[] a = s.toCharArray();						// output-> efil
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.print(a[i]);
//		}
		
//		String s ="mom";
//		String rev="";							
//		for(int i=s.length()-1;i>=0;i--) {
//			rev=rev+s.charAt(i); 
//		} 												// output -> mom is palindrome
//		if(s.equals(rev)) {
//			System.out.println(rev + " is palindrome" );
//		}
//		else {
//			System.out.println(rev+ " is not palindrome");
//		}
		
		
				// print specific element in the array
//		String a[] = {"abc","pqr","xyz","abc","Qa","pqr"};
//		System.out.println(a[2]); 			// output -> xyz
		
		
								// fibonacci series
//		int a =0; int b=1; 
//		for(int i=1; i<=5; i++){
//			int c;
//			c=a+b;							//output -> 1 2 3 5 8 
//			System.out.print(c+" ");
//			a=b;
//			b=c;
//		}
		
		
		// Reverse number
//		int no=123; int rev=0; int rem;
//		while(no!=0) {
//			rem= no%10;                 	// output -> 321
//			rev=rev*10+rem;
//			no=no/10;
//		}
//		System.out.println(rev);
		
		
					// print only number from the string
//		String a ="Juned123";
//		String s = a.replaceAll("[^0-9]","");                   // output -> 123
//		System.out.println(s);
					// print only Alphabate from the string
//		String a ="JuneD123";
//		String s = a.replaceAll("[^A-Z]","");                   // output -> JD
//		System.out.println(s);
					// print only Small Letter from the string
//		String a ="juned123";
//		String s = a.replaceAll("[^a-z]","");                   // output -> juned
//		System.out.println(s);
		
		
		// count the numbers of repeted words present the string
//		String s =" Java programming";
//		int total =s.length();					// output -> the number of occurance of a is 3
//		int after=s.replace("a", "").length();
//		int count=total-after;
//		System.out.println("the number of occurance of a is "+count);
		
		
			// find the duplicate character in the string
//		String s ="Java programming";
//		char[] a =s.toCharArray();
//		for(int i=0;i<a.length-1;i++) { 			// output -> a a a r g m 
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					System.out.print(a[j]+" ");
//				}
//			}
					
				
					// factorial number of 5
//		int no=5; int fact=1;
//		for(int i=1;i<=5;i++) {
//			fact=fact*i;						// output -> 120
//		}
//		System.out.println(fact);
		
		
		
						// check number is palindrome or not
//		int no =121; int rev=0;  int rem;
//		int t1=no;
//		while(t1!=0) {							// output -> 121 is palindrome number
//			rem=t1%10;
//			rev=rev*10+rem;
//			t1=t1/10;
//		}
//		if(rev==no) {
//			System.out.println(no+" is palindrome number");
//		}
//		else {
//			System.out.println(no+" is not palindrome number");
//		}
		
	
		// swapping number
//		int a=10; int b=20;
//		System.out.println("Before swapping-> "+a+" "+ b);
//		int c;										// output -> Before swapping-> 10 20
//		c=a;										//			 After swapping-> 20 10			
//		a=b;
//		b=c;
//		System.out.println("After swapping-> "+a+" "+ b);
		
		
		// remove the spaces from the string
//		String s = "j  a    va";
//		String a=s.replaceAll("\\s", "");		// output -> java
//		System.out.println(a);
		
		
					// reverse string ny StringBuilder		
//		StringBuilder a = new StringBuilder("THE");
//		System.out.println(a.reverse());					// output -> EHT
		
					// reverse string by Each words
//		String s = " We are four";
//		String [] a =s.split(" ");							// output -> four are We  
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.print(a[i]+" ");
//		}
		
		
					// print first letter of each words in the string
		String s = "I Love Java Coding";
		String[] a = s.split(" ");							// output -> ILJC
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i].charAt(0));		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
