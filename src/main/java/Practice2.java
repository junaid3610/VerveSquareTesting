
public class Practice2 {

	public static void main(String[] args) {
		
//		// Duplicate in the String
//		String s="1213";
//		char[] a=s.toCharArray();
//		for(int i=0;i<=a.length-1;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					System.out.println(a[j]);
//				}
//			}
//		}
		
		String s="Ab@12";
		StringBuilder cap = new StringBuilder();
		StringBuilder small = new StringBuilder();
		StringBuilder no = new StringBuilder();
		StringBuilder special = new StringBuilder();
		
		for(char ch:s.toCharArray()) {
			if (Character.isLowerCase(ch)) 
			{
				small.append(ch);				
			}
			else if(Character.isUpperCase(ch)) 
			{
				cap.append(ch);
			}
			else if(Character.isDigit(ch))
			{
				no.append(ch);
			}
			else 
			{
				special.append(ch);
			}
		}
		System.out.println(small+ " is small");
		System.out.println(cap+ " is capital");
		System.out.println(no+ " is number");
		System.out.println(special+ " is special");
	
		
		
		
		
		
	}
	
		
	
}
