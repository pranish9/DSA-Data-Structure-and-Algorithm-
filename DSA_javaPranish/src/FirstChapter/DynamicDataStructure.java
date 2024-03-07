package FirstChapter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class DynamicDataStructure {
    //List: 1) arrayList 2) vector 3) LinkedList


    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Integer> intList2 = new Vector<>();
        List<Integer> intList3 = new LinkedList<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
                //how this is dynamic? how can we make it dynamic?
        //memory management is done garbage collector
        //list is non-primitive and memory allocation is not done until variable is define
       /* System.out.println(intList);
        intList.remove(2);
        System.out.println(intList);
        intList.add(4);
        System.out.println(intList);*/
        //indexing

        //simple for loop

        /*for(int i=0; i < intList.size(); i++){
            System.out.println(intList.get(i));
        }*/

        //2. Method Reference ForLoop. For each loop. its better and easy
       /* for(int a: intList){
            System.out.println(a);
        }
        */
        //3.lamda for loop

        //it can be asked in interviews
        /*intList.forEach(a-> System.out.println(a));*/

        //4. Stream Forloop operation

        intList.stream().forEach(System.out::println);

        //it can some time used
        //command provide by developer System.out::println
    }
}
