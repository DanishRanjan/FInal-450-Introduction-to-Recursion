import java.util.*;
public class printZigzag {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	zigzag(n);
}

public static void zigzag(int n) {
	if(n==0) {
		return;
	}
	System.out.print(n+" ");
	zigzag(n-1);
	System.out.print(n+" ");
	zigzag(n-1);
	System.out.print(n+" ");
}
}
