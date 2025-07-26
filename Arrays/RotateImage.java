//Time Complexity:O(n^2)
//Space  Complexity::O(1)
class RotateImage {
    public void rotate(int[][] a) {
    for(int i=0;i<a.length;i++)
    {
        for(int j=i;j<a[0].length;j++)
        {
            int temp=a[i][j];
            a[i][j]=a[j][i];
            a[j][i]=temp;

        }
    }
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a.length/2;j++)
        {
            int temp=a[i][j];
            a[i][j]=a[i][a.length-1-j];
            a[i][a.length-1-j]=temp;
        }
    }
    }
}