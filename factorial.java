import java.util.*;
public class factorial {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(factorial(n));
	
}
public static int factorial(int n) {
	if(n==0) {
		return 1;
	}
	int rec = factorial(n-1);
	int ans = n*rec;
	return ans;
}
}