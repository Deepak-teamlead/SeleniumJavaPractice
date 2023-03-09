package java_practice_1;
public class String_Methods {
//String Methods 1.length(); 2.startsWith(); 3)endswith(); 4)toUpperCase();  5)toLowerCase(); 6)concat(); 7)contains();
// 8)trim(); 9)replace();	
public static void main(String[] args) {
//1.length();
String a="deepak";
System.out.println("length of string : "+ a.length());  //length starts from one
//2.startsWith(); and check if string starts with a given Character
System.out.println("string starts with : " + a.startsWith("d"));	
if(a.startsWith("d")==true) 
	System.out.println("Condition True startswith");
	else 
		System.out.println("Condition False startswith");
//3)endswith(); and check if string ends with a given Character
System.out.println("string ends with : " + a.endsWith("k"));
//4)toUpperCase(); 
String uppercase = a.toUpperCase();
System.out.println(uppercase);
//5)toLowerCase();
String lowercase = a.toLowerCase();
System.out.println(lowercase);
//6)concat();         //To combine 2 Strings
String b="deepak";
String c="rocky";
String concat = b.concat(c);
System.out.println(concat);
//7)contains();       //To Check if String Contains Character
System.out.println("Contains character : " + b.contains("p"));
//8)trim();
String d="  brock     ";
String trim = d.trim();
System.out.println("removes spaces from string : " + trim);
//9)replace();       //Replaces one character with another
String replace = a.replace("d","f");
System.out.println("replace d with f : " + replace);
// 10) charat
	System.out.println("10) character at method "+a.charAt(5));
// 11) contentEquals()
	String z="pubg mobile";
	System.out.println("11) contentEquals() boolean result  "+z.contentEquals("pubg mobile"));
}
}


