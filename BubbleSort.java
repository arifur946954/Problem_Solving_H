public class BubbleSort {
    public static void main(String[] args) {
        Integer[] arr={1,200,58,1,25,45,69,5,20,588,1,200,15};
        int len=arr.length;
        for (int i=0;i<len;i++){
            for (int j=0;j<len-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }

        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
