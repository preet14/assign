import java.util.*;
class Armstrong{  
      public static void main(String[] args)  {  
        int a,temp,t;
        double s=0,c=0;  
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        n=sc.nextInt(); 
        temp=n;
        t=n;
        while(t>0)
        {
          t=t/10;
          s++;
        }
        
        while(n>0)  
        {  
        a=n%10;  
        n=n/10;  
        c=c+Math.pow(a,s);  
        }  
        if(temp==c)  
        System.out.println("armstrong number");   
        else  
            System.out.println("Not armstrong number");   
       }  
    }  