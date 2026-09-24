class Solution {

    public static void mergesort(int[] arr,int l,int r){
        int mid = l+(r-l)/2;
        if(l>=r){
            return;
        }
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void merge(int[] arr,int l,int mid,int r){
        int[] temp = new int[r-l+1];
        int i = l;
        int j =mid+1;
        int k =0;
        while(i<=mid&&j<=r)
        {
            if(arr[i]<=arr[j])
            {
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
            while(i<=mid)
            {
                temp[k++]=arr[i++];
            }
            while(j<=r){
                temp[k++]=arr[j++];
            }

            for(int x=0;x<temp.length;x++){
                arr[x+l]=temp[x];
            }

        
    }
    public int[] sortArray(int[] arr) {
         int n = arr.length;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n-i-1;j++)
        //     {
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // return arr;
        // bubble sort
        // for(int i=1;i<n;i++)
        // {
        //     int key = arr[i];
        //     int j=i-1;
        //     while(j>=0&&arr[j]>key)
        //     {
        //         arr[j+1]=arr[j];
        //         j--;
        //     }
        //     arr[j+1]=key;
        // }
        // return arr;
        // insertion sort

        // for(int i =0 ;i<n-1;i++)
        // {
        //     int min = i;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[min]>arr[j]){
        //             min = j;
        //         }
        //     }
        //     int temp = arr[min];
        //     arr[min] = arr[i];
        //     arr[i] = temp;
        // }
        // return arr;
        //selection sort

        mergesort(arr,0,n-1);
        return arr;

    }
}