import java.util.Scanner;

public class Main16 {

    public static void main(String[] args) {
	Scanner xx = new Scanner(System.in);
	int x = xx.nextInt();
	int y;
	if (x < -1){
	    y = -1;
	    System.out.println(y);
    }else if (x > -1)
        {
         y = x;
         System.out.println(y);
        }
	else {
	    y = 1;
	    System.out.println(y);
    }
    }
}
