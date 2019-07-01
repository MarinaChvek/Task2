
//в логических выражениях сначало выполняются все "не", потом все "и" и потом все "или", если порядок действий не изменен скобками
//! - логический оператор НЕ
//& - логический оператор И
//| - логический оператор ИЛИ
public class Main10 {
    public static void main(String[] args) {
         boolean x = false;
         boolean y = false;
         boolean z = true;
         System.out.println("X - ложь,Y - Ложь, Z - Истина" );
              boolean a = x | y & !z;
              boolean b = !x & !y;
              boolean v = !(x & z) | y;
              boolean g = x & !y | z;
              boolean d = x & (!y | z);
              boolean e = x & (!(y | z));
               System.out.println("a) " + a);
    System.out.println("б) " + b);
    System.out.println("в) " + v);
    System.out.println("г) " + g);
    System.out.println("д) " + d);
    System.out.println("е) " + e);

    }
}
