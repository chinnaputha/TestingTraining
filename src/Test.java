
public class Test {

	
	public static void stringReverse() {
		
		String str="test";
		String revString = "";
		for(int i=str.length()-1;i>=0;i--) {
			revString = revString+str.charAt(i);
		}
		System.out.println("revevese string-->"+revString);
	}
	public static void main(String[] args) {
		stringReverse();
		String str1="Hello";
		String str2=str1;
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		String str5 = new String(str1);
		
		
		System.out.println("str1==str2 "+(str1==str2));//true
		System.out.println("str1 equals str2 "+str1.equals(str2));//true
		
		System.out.println("str3==str4 "+(str3==str4));//false
		System.out.println("str3 equals str4 "+str3.equals(str4));//true
		
		System.out.println("str1==str5 "+(str1==str5));//false
		System.out.println("str1 equals str5 "+str1.equals(str5));//true
		
		

	}

}
