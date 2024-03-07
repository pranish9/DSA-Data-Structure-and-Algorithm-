package SecondChapter;

public class ReverseString {
    public static void main(String[] args) {
        String name= "Virinchi";
        char[] text = name.toCharArray();
        int top=text.length-1;
        while(true){
            if(top == -1){
                break;
            }else{
                System.out.println(text[top]);
            }
        }
    }
}
