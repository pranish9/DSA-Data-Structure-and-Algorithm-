package FiveChapter;
public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray ={1, 5, 6, 7, 9, 11, 15, 16};
        int target = 9;
        int size = sortedArray.length;
        int left = 0;
        int right = size - 1;
        boolean found = false;
        while(left<=right){
            int mid = (left + right) / 2;
            if(sortedArray [mid] == target){
                System.out.println("the traget is found in "+ mid);
                found = true;
                break;
            } else if(sortedArray [mid]>target){
                right = mid - 1;
            } else if (sortedArray [mid]<target){
                left = mid + 1;
            }
        }
        if(!found){
            System.out.println("Data not found in array");
        }
    }
}
