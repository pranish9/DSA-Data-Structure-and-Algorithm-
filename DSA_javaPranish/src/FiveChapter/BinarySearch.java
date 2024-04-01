package FiveChapter;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 18;
        int size = arr.length;
        int left = 0;
        int right = size - 1;
        boolean found = false;
        while(left<=right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                System.out.println("the traget is found in"+ mid);
                found = true;
                break;
            } else if(arr[mid]>target){
                right = mid - 1;
            } else if (arr [mid]<target){
                left = mid + 1;
            }
        }
        if(!found){
            System.out.println("Data not found in array");
        }
    }
}
