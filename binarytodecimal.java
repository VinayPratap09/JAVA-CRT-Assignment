import java.io.*;
import java.util.*;
public class binarytodecimal {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no ");
        int n = scn.nextInt();
        System.out.print("Decimal value of  number "+n + " of base " + 2 + " is ");
        System.out.println(binaryodecimal(n));
        sc.close(); 
    }

    public static int binaryodecimal(int n)
    {
        int temp = n;
        int resdec=0;
        int p=0;
        while(temp>0)
        {
            int d= temp%10;
            resdec+=(d*(int)Math.pow(2,p));
            temp/=10;
            p++;
        }
         return resdec;
    }
    
}