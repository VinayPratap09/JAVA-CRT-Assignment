import java.util.*;
public class randomgame{

public static void main(String[] args){
  int varun=10;
  Random rand=new Random();
  while(varun!=0){
    System.out.println("Number is:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ran=rand.nextInt(10);
    if(varun==ran){
      varun++;
      System.out.println("Money  is:"+varun);
    }
    else{
      varun--;
      System.out.println("Money  is:"+varun);
    }

  }
  if(varun ==20){
    System.out.println("WON");
  }
  else{
    System.out.println("LOSS");
  }

}
}