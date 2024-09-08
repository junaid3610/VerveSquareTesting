import java.util.Arrays;

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
//		String s = "I Love Java Coding";
//		String[] a = s.split(" ");							// output -> ILJC
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i].charAt(0));		
//		}
		
		
					// Identify the leap year
//		int year=101;
//		if(year%4==0) {
//			System.out.println(year+" is leap year");
//		}													// Output -> 101 is not leap year
//		else {
//			System.out.println(year+" is not leap year");
//		}
		
		
		
					// write a programme to calculate the profit		
//		int buy =10; int sell =15;
//		int profit;		 						// output -> the profit is 5
//		profit= sell-buy;
//		System.out.println("the profit is "+profit);
		
					// print the number of vowels present in the string
//		String s= "Hello java programming ";
//		for( char c: s.toCharArray()) {
//			switch(c) {
//				case 'a':				// output -> e o a a o a i 
//				case 'e':
//				case 'i':
//				case 'o':
//				case 'u':
//					System.out.print(c+" ");
//					break;
//			}
//		}
		
		
//		// Arrange random order array in descending order
//		int a[]= {12,10,11,5,19,2,4};
//		Arrays.sort(a);   // sort method convert in ascending order
//		for(int i=a.length-1;i>=0;i--) {		// output -> 19 12 11 10 5 4 2 
//			System.out.print(a[i]+" ");
//		}
		
//		// sort string in alphabetic order
//		String s= "rock";						// output -> ckor
//		char[] a = s.toCharArray();
//		Arrays.sort(a);
//		System.out.println(new String(a));
		
		
		// missing number in Array
//		int a[]= {1,2,3,4};
//		int sum1=0;
//		for(int i =0;i<a.length;i++) {
//			sum1=sum1+a[i];
//			
//		}											// output -> 5 is missing
//		
//		int sum2=0;
//		for(int i=1;i<=5;i++) {
//			sum2=sum2+i;
//		}
//		System.out.println(sum2-sum1+" is missing");
		
		
		// Find maximum and minimum number in the array
//		int a[]= {12,4,5,11,20};
//		int max=a[0];
//		for(int i=0;i<a.length;i++) {
//			if(max<=a[i]) {
//				max=a[i];
//			}									// output -> maximum value in the array-> 20
//		}
//		System.out.println("maximum value in the array-> "+max);
			
//		// to find minimum value
//		int min=a[0];
//		for(int i=0;i<a.length;i++) {			// ouput -> minimum value is -> 4
//			if(min>a.length) {
//				min=a[i];
//			}
//		}
//		System.out.println("minimum value is -> "+min);
		
	
//		// Print average in the array
//		int a[] = {12, 4, 5, 11, 20};
//		int sum = 0;
//		for(int no : a) {
//		    sum += no; 						 // output -> average is -> 10.4 
//		}
//		double avg = (double) sum / a.length;  // Cast 'sum' to double to get a precise average
//		System.out.println("average is -> " + avg);  // Concatenate the average to the string

		// Print even and odd numbers in the array
		int a[] = {12, 4, 5, 11, 20};
		int even = 0;
		int odd = 0;

		for (int i = 0; i < a.length; i++) {
		    if (a[i] % 2 == 0) {  					// output -> Even numbers: 3
		        even++;								//			 Odd numbers: 2
		    } else {
		        odd++;
		    }
		}
		

		System.out.println("Even numbers: " + even);
		System.out.println("Odd numbers: " + odd);

		
		
	}
	
	

}
