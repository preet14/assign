import java.util.*;
public class Reverse
{
 public static void main(String args[])
 {
   int n,r,s=0;
   Scanner sc = new Scanner(System.in);
   n=sc.nextInt();
   while(n>0)
   {
     r=n%10;
     s=(s*10)+r;
     n=n/10;
   }
  System.out.println("Reverse of a number : "+s);
 }
} 