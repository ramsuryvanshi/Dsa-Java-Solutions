//Time Complexity:O(n)
//Space  Complexity::O(1)

class  SecondLargest  {
    public int getSecondLargest(int[] a) {
   int max=Integer.MIN_VALUE;
   int secm=Integer.MIN_VALUE;
   for(int i=0;i<a.length;i++)
   {
       if(a[i]>max)
       {
           secm=max;
           max=a[i];
           
       }
       else if(a[i]>secm && a[i]!=max)
       {
           secm=a[i];
       }
   }
   return (secm==Integer.MIN_VALUE)?-1:secm;
  
        
    }
}