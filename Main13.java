import java.util.Scanner;

public class Main13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int click=1;
      
         while(click !=0) {
            System.out.println("Выбирите график (1 или 2):");
           click=in.nextInt();
            switch (click) {
                case 0:
                    break;
             case 1:
                 
	   double x = in.nextDouble();
	   double y;
	   if (x <=2 )
                  {
                    y = x;
                    System.out.println(y);
                  }
	    else if (x>2)
	    {
	        y = 2;
	        System.out.println(y);
                     };
                    break;
            case 2:
   
	   double xx = in.nextDouble();
	   double yy;
	   if (xx <=3 )
                  {
                    yy = - xx;
                    System.out.println(yy);
                  }
	    else if (xx>3)
	    {
	        yy = -3;
	        System.out.println(yy);
                     };
                    break;
                default:
                    System.out.println("График выбран неверно");

            }

            }
         in.close();
	
    }
}
