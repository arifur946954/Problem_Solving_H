public class binarySearch {
    int getBinarySearch(int[] search,int sValue){
        int low=0;
        int high=search.length-1;
        int mid=(high+low)/2;
        while (low <= high) {
            if (sValue == search[mid]) {
                return mid;
            }
            if (sValue > search[mid]) {
                low = mid + 1;
                high = search.length - 1;
                mid = (low + high) / 2;

            }
            if (sValue < search[mid]) {
                low = 0;
                high = mid - 1;
                mid = (low + high) / 2;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] binarySrch={1,2,3,4,5,6,7,8,9,10};
        int searchValue=1;
        binarySearch bs=new binarySearch();
        int result=bs.getBinarySearch(binarySrch,searchValue);
        System.out.println("For search value "+5 +"index number is : " +result);
    }
}
