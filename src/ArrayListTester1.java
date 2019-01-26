import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTester1 {
    public static void main(String[] args) {


        List<Integer> myList = new ArrayList();
        List<Integer> myList2 = new ArrayList();

        myList.add(123);
        myList.add(4);
        myList.add(18);
        myList.add(0);

        for (int i = 0; i<1000; i++){
            myList2.add(i*i);
        }

        System.out.println("Rozmiar myList: " + myList.size());
        System.out.println("Rozmiar myList2: " + myList2.size());

        List<Integer> numbers = new ArrayList();
        numbers.addAll(myList);
        numbers.addAll(myList2);

        System.out.println("Rozmiar numbers: " + numbers.size());

//        for (Integer i :numbers) {
//            System.out.println(i);
//
//        }

        int index = numbers.lastIndexOf(40000);
        System.out.println(numbers.lastIndexOf(40000));
        //usuwamy tę wartosć
        numbers.set(index, 0);

        System.out.println(numbers.lastIndexOf(40000));

        System.out.println(numbers);





















































































































































//        Object[] arr1=myList.toArray();
//
////        Integer[] arr2 = new Integer[myList.size()];
////        arr2 = myList.toArray(arr2);
//
//        Integer[] arr2 = myList.toArray(new Integer[myList.size()]);
//
//        for (Integer i :arr2) {
//            System.out.println(i);
//
//        }
    }
}
