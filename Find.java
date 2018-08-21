import java.util.*;
class Find
{
  public static void main(String args[])
  {
     int a[]= new int[]{ 1, 4, 6, 7, 8, 9, 10 };
     int n=a.length;
     int f=0;
     int c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter : ");
    c=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      if(a[i]==c)
      {
         f=1;
         break;
      }
    }
     if(f==0)
     {
       System.out.println("Element not found ");
     }
     else
     {
       System.out.println("Element found");
     }
  }
}