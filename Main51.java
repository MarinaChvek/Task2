
import java.util.Scanner;
    public class Main51 {
        public static void main(String[] args) {
            Scanner in=new Scanner (System.in);
                    System.out.print("������� ����� x: ");
                        double x=in.nextDouble();
                    System.out.print("������� ����� a: ");
                        double a=in.nextDouble();
                    System.out.print("������� ����� b: ");
                        double b=in.nextDouble();
                    System.out.print("������� ����� c: ");
                        double c=in.nextDouble();
                    System.out.print("������� ����� n: ");
                        double n=in.nextDouble();
                    System.out.print("������� ����� m: ");
                         double m=in.nextDouble();
                              if (x==0) {
                                    System.out.println(" a) ������������ ��������� ");
                                    } else {
                                    double z = (-1)/Math.pow(x,2);
                                    System.out.println("a)"+z);
                                    };
                              if (b*c==0) {
                                    System.out.println(" �) ������������ ��������� ");
                                    } else {
                                     double d = a/(b*c);  
                                    System.out.println("�)"+d);
                                    };  
                              if (b==0) {
                                    System.out.println("�) ������������ ��������� ");
                                    } else {
                                      double v = (a/b)*c;
                                System.out.println("�)"+v);
                                    };      
           
             double g = (a+b)/2;
              System.out.println("�)"+g);
                              if (a==2) {
                                    System.out.println("�) ������������ ��������� ");
                                    } else {
                                            double k = 5.45*(a+2*b)/(2-a);
                                       System.out.println("�)"+k);
                                    };  
    
                             if (a==0) {
                                    System.out.println("�) ������������ ��������� ");
                                    } else {
                                            double e = (-b+ Math.sqrt(Math.pow(2,b)-4*a*c))/(2*a);
                                     System.out.println("�)"+e);
                                    };      
       
                            if (c==0 || a==0) {
                                    System.out.println("�) ������������ ��������� ");
                                    } else {
                                             double j = (-b+(1/a))/(2/c);
                                       System.out.println("�)"+j);
                                    };      
                           if (1+(a+b)/2==0) {
                                    System.out.println("�) ������������ ��������� ");
                                    } else {
                                               double o = 1/(1+(a+b)/2);
                                      System.out.println("�)"+o);
                                    };      

             double i = 1/(1+1/(2+1/(2+3/5)));
                   System.out.println("�)"+i);
             double w = Math.pow(2,Math.pow(n,m));
                      System.out.println("�)"+w);

    }
}
