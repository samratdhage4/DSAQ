class RevArray
{
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void rev(int[] arr,int i,int j)
    {
        if(i>=j)
            return;

        swap(arr, i, j);
        rev(arr,i+1,j-1);
    }

    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,6,7,8,9,10};

        rev(arr, 0, arr.length-1);

        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}