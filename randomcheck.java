import java.util.*;
public class randomcheck {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int rn = (int)(Math.random()*((10) + 1));
        if(rn==n){
        System.out.println("yes match");
    }else{
        System.out.println("Does not match");
    }
    }
    
}
