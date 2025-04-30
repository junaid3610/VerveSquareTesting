package BasicJavaPractice;

public class PracticeJava {

	public static void main(String[] args) {
//		
//	// check duplicate in the array
//		int a[]= {1,2,3,4,1};
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					System.out.println(a[j]);
//				}
//			}
//		}
//	//check duplicate in the string
//		String a[]= {"a","b","c","a"};
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					System.out.println(a[j]);
//				}
//			}
//				
//		}
		
//	// fibonacci series upto 5
//		int a=0;int b=1;
//		for(int i =1;i<=5;i++) {
//			int c;
//			c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//		}
		
//		// reverse number
//		int no=123;int rev=0;int rem;
//		while(no!=0) {
//			rem=no%10;
//			rev=rev*10+rem;
//			no=no/10;
//					
//		}
//		System.out.println(rev);
		
//		// print the number from the string
//		String s ="ABc12";
//		String a=s.replaceAll("[^0-9]", "");
//		System.out.println(a);
		
//		// print the uppercase from the String
//		String s ="ABc12";
//		String a=s.replaceAll("[^A-Z]", "");
//		System.out.println(a);
		
		
//	// factorial number
//		int no=5;
//		int fact=1;
//		for(int i =1;i<=no;i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
		
		
		// Program for palindrome number
//		int no =121; int rev=0;int rem;
//		int t1=0;
//		while(t1!=0){
//			rem=t1%10;
//			rev=rev*10+rem;
//			t1=t1/10;
//		}
//		if(rev==no) {
//			System.out.println(no+" is palindrome");
//		}
//		else{
//			System.out.println(no+ " is not palindrome");
//		}
//		
//		// swapping a number
//		int a=1;int b=2;
//		System.out.println(a+"  "+ b);
//		int c;
//		c=a;
//		a=b;
//		b=c;
//		System.out.println(a+"  "+ b);
		
		
	// leap year
//		int year = 1200;
//
//		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//		    System.out.println(year + " is a leap year");
//		} else {
//		    System.out.println(year + " is not a leap year");
//		}

//		// remove extra spaces 
//		String s = " Jav         a    is  gooo d";
//		String a=s.replaceAll("\\s", "");
//		System.out.println(a);
		
		// Reverse String by each word
		String s = "we are four";
		String [] a=s.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
		
		
		
		
		
		
	}
}