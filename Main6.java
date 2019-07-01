import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
	System.out.println("a) ");
	Scanner xx = new Scanner(System.in);
    double x =xx.nextDouble();
    double y;
    y = (7 * Math.pow(x,2)) - (x * 3) + 6 ;
    System.out.println("y = " + y);
    System.out.println("b)");
    Scanner aa = new Scanner(System.in);
    double a = aa.nextDouble();
    double xxx;
    xxx = 12 * Math.pow(a,2) + 7 * a - 16;
    System.out.println("x = " + xxx);
    }
}
