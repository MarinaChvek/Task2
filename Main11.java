import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {
    System.out.println("������� �������� A,B � C: ");
    Scanner aa = new Scanner(System.in);
	Scanner bb = new Scanner(System.in);
	Scanner cc = new Scanner(System.in);
	int A = aa.nextInt();
	int B = bb.nextInt();
	int C = cc.nextInt();
	boolean a = A > 100 && B > 100;
	boolean b = (A % 2 == 0) && !(B % 2 == 0) || !(A % 2 == 0) && (B % 2 == 0);
	boolean v = (A > 0) && (B < 0) || (A < 0) && (B > 0) || (A > 0) && (B > 0);
	boolean g = (A % 3 == 0) && (B % 3 == 0) && (C % 3 == 0);
	boolean d = (A < 50) && (B > 50) && (C > 50) || (A > 50) && (B < 50) && (C > 50) || (A > 50) && (B > 50) && (C < 50);
	boolean e = (A < 0) || (B < 0) || (C < 0);
	System.out.println("a)=" + a);
	System.out.println("�)=" + b);
	System.out.println("�)=" + v);
	System.out.println("�)=" + g);
	System.out.println("�)=" + d);
	System.out.println("�)=" + e);
    }
}
