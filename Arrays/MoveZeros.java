//Time Complexity:O(n)
//Space  Complexity::O(1)

class MoveZeros {
    public void moveZeroes(int[]a) {
        int ans=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                a[ans]=a[i];
                ans++;
            }

        }
        while(ans<a.length)
        {
            a[ans]=0;
            ans++;
        }
        
    }
}