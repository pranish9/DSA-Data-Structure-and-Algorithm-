package ThreeChapter;

public class TowerOfHanoi {
    public static void main(String[] args) {
        TOH(3, "A", "B", "C");
    }
    static void TOH(int n, String source, String helper, String destination){
        if(n==1){
            System.out.println("Dist Moves from \t "+ source + "-1" + destination);
            return;
        } else{
            TOH(n-1, source, destination, helper);
            TOH(1, source, helper, destination);
            TOH(n-1, helper, source, destination);
        }
    }
}
