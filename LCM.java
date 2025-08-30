import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the first input");
        int a=sc.nextInt();
        System.out.println("give the second input");
        int b=sc.nextInt();
        int x=a;
        int y=b;
        while(b!=0){
            int store=b;
            b=a%b;
            a=store;
        }
        int gcd= a;

        int lcm = (x * y) / gcd;
         System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
        
    }
    
}
