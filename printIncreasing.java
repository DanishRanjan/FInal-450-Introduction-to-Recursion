import java.util.*;
public class printIncreasing {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	increasing(n);
}
public static void increasing(int n) {
	if(n==0) {
		return; 
	}
	increasing(n-1);
	System.out.println(n);
}
}
