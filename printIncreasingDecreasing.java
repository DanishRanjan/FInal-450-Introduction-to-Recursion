import java.util.*;
public class printIncreasingDecreasing {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	printBoth(n);
}
public static void printBoth(int n) {
	if(n==0) {
		return;
	}
	System.out.println(n);
	printBoth(n-1);
	System.out.println(n);
}
}
