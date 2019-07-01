import java.util.Scanner;

public class Main15{

    public static void main(String[] args) {
	Scanner xx = new Scanner(System.in);
                   System.out.print("Введите вещественное число x ");
	double x = xx.nextDouble();
	double y;
	if ((x>= -2.4)&&(x<=5.7)){
	    y = x*x;
	    System.out.println(y);
    }else {
	    y = 4;
	    System.out.println(y);
    }

    }
}
