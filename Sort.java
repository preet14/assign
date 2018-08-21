class Sort
{
 public static void main(String args[])
 {
   int arr[] = new int[]{ 1, 1, 1, 1, 0, 0, 1, 0 };
   int n = arr.length;
   int count = 0; 
      System.out.println("Before sort ");
      for(int i=0;i<n;i++)
      {
        System.out.println(arr[i]);
      }
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == 0)
                count++;
        }
 
           for (int i = 0; i < count; i++)
           { 
             arr[i] = 0; 
           }
 
        
          for (int i = count; i < n; i++)
          {
            arr[i] = 1;
          }

      System.out.println("After sort ");
      for(int i=0;i<n;i++)
      {
        System.out.println(arr[i]);
      }
 }
}