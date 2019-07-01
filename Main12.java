import java.util.Scanner;

public class Main12 {

    public static void main(String[] args) {
	Scanner xx = new Scanner(System.in);
	int x = xx.nextInt();
	double y;
	if (x > 0)
        {
            y = Math.sin(x)*Math.sin(x);
            System.out.println(y);
        }
	else
	    {
	        y = 1 - 2 * Math.sin(Math.pow(x,2));
	        System.out.println(y);
        }
    }
}
