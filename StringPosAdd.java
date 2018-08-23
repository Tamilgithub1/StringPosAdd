import java.util.*;
public class te {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String a=in.next().toLowerCase();
	String b=in.next().toLowerCase();
	int sumA=0,sumB=0;
	for(int i=0;i<a.length();i++)
		sumA+=a.charAt(i)-96;
	for(int i=0;i<b.length();i++)
		sumB+=b.charAt(i)-96;
	System.out.println(Math.abs(sumA-sumB));
}}
