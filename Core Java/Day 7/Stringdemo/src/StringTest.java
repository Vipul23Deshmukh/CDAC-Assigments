import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
	

		String s1="CdacIET";
		String s2="Good moring";
		
		
		System.out.println(s1);
		System.out.println(s2);
	
		int i=s1.length();
		System.out.println("s1 length="+i);
		
		
		
		System.out.println("s2 length ="+s2.length());
		
		
		
		
		System.out.println(s1.indexOf("s1 index ="+s1));
		System.out.println(s2.indexOf("Good"));

		
		
		
		System.out.println("s1 in lowercase ="+s1.toLowerCase());
		System.out.println("s2 in lowercase ="+s2.toLowerCase());
		
		
		
		
		System.out.println("s1 in uppercase ="+s1.toUpperCase());
		System.out.println("s2 in uppercase ="+s2.toUpperCase());
		
		
		System.out.println(s1.contains("IETACB"));
		System.out.println(s2.contains("Good"));
		
		//String s3="aaa,bbb,zzz-WWW";
		String s3="aaa,bbb,zzz,-WWW";
		String[] s4=s3.split(",");
		System.out.println(Arrays.toString(s4));
		
		System.out.println(s1.startsWith("Go"));
		System.out.println(s1.endsWith("go"));
		
	     System.out.println(s1.charAt(5));
	     System.out.println(s1.equals(s2));
	     
	     System.out.println(s1.compareTo(s2));
		
	}

}
