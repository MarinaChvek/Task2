
import java.util.Scanner;
    public class Main51 {
        public static void main(String[] args) {
            Scanner in=new Scanner (System.in);
                    System.out.print("Введите число x: ");
                        double x=in.nextDouble();
                    System.out.print("Введите число a: ");
                        double a=in.nextDouble();
                    System.out.print("Введите число b: ");
                        double b=in.nextDouble();
                    System.out.print("Введите число c: ");
                        double c=in.nextDouble();
                    System.out.print("Введите число n: ");
                        double n=in.nextDouble();
                    System.out.print("Введите число m: ");
                         double m=in.nextDouble();
                              if (x==0) {
                                    System.out.println(" a) Неккоректное выражение ");
                                    } else {
                                    double z = (-1)/Math.pow(x,2);
                                    System.out.println("a)"+z);
                                    };
                              if (b*c==0) {
                                    System.out.println(" б) Неккоректное выражение ");
                                    } else {
                                     double d = a/(b*c);  
                                    System.out.println("б)"+d);
                                    };  
                              if (b==0) {
                                    System.out.println("в) Неккоректное выражение ");
                                    } else {
                                      double v = (a/b)*c;
                                System.out.println("в)"+v);
                                    };      
           
             double g = (a+b)/2;
              System.out.println("г)"+g);
                              if (a==2) {
                                    System.out.println("д) Неккоректное выражение ");
                                    } else {
                                            double k = 5.45*(a+2*b)/(2-a);
                                       System.out.println("д)"+k);
                                    };  
    
                             if (a==0) {
                                    System.out.println("е) Неккоректное выражение ");
                                    } else {
                                            double e = (-b+ Math.sqrt(Math.pow(2,b)-4*a*c))/(2*a);
                                     System.out.println("е)"+e);
                                    };      
       
                            if (c==0 || a==0) {
                                    System.out.println("ж) Неккоректное выражение ");
                                    } else {
                                             double j = (-b+(1/a))/(2/c);
                                       System.out.println("ж)"+j);
                                    };      
                           if (1+(a+b)/2==0) {
                                    System.out.println("з) Неккоректное выражение ");
                                    } else {
                                               double o = 1/(1+(a+b)/2);
                                      System.out.println("з)"+o);
                                    };      

             double i = 1/(1+1/(2+1/(2+3/5)));
                   System.out.println("и)"+i);
             double w = Math.pow(2,Math.pow(n,m));
                      System.out.println("к)"+w);

    }
}
