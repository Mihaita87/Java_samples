import java.util.Scanner;

public class Mihaita2
{
        private static Scanner sc;

	public static void main(String[] args) 
       {
            int a,b;
            
            int num, count = 0;
            sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();         
            
       System.out.println("Hello Mihai,");

       System.out.println("a is: "+a);
       System.out.println("b is: "+b);

            double c = Math.pow(a,b);

       System.out.println("\n The result of number a raised at power of number b is:"+c);
            
       System.out.println("\n Please enter any number:");
             num = sc.nextInt();

           while (num > 0) 
             {
             num = num / 10;
             count = count +1;
             }
  
        System.out.format("\n Number of digits in the given number: = %d ", count);
        System.out.print("\n \n Thank you for your help, \n Mihai ");
       
       }

}
