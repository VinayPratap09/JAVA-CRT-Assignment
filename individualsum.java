import java.util.*;
public class individualsum{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
long n,sum;
System.out.println("Enter a number ");
n=sc.nextLong();
for(sum=0 ;n!=0 ;n/=10)
{
sum+=n%10;
}
System.out.println("Sum ="+sum);
}
}