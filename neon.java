
import java.util.*;
public class neon {
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    for(int i=1;i<=n;i++){
        int val=i*i;
        int sum=0;
        while(val>0){
                int k=val%10;
                sum+=k;
                val=val/10;
        }
        if(sum==i){
            System.out.println(i);
        }
        
    }
    
}}
