package ThreeChapter;

public class LinearSearching {
    public static void main(String[] args) {


    int[] arr = {9, 2, 5, 1, 7, 6, 3, 8, 4};
    int target = 5;
    boolean found = false;
    int n = arr.length;
    for(int i = 0; i <= n-1; i++){
        if(arr[i] == target){
            System.out.println("Data found at Array index "+ i + " 5and Data position " + (i + 1));
            found = true;
        }
    }
    if(!found)
    System.out.println("Data not found in the array");

}
}
