import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTester {
    public static void main(String[] args) {


        List<Integer> myList = new ArrayList();

        myList.add(123);
        myList.add(4);
        myList.add(18);
        myList.add(0);

        for (int i = 0; i<myList.size(); i++){
            System.out.println("Liczba: " + myList.get(i));
        }

        for (Integer i :myList) {
            System.out.println("Liczba: " + i);

        }


        Iterator<Integer> iterator = myList.iterator();
//        while (iterator.hasNext()){
//            if(iterator.next()==18){
//                iterator.remove();
//            }
//            System.out.println("hasNext: " + iterator.hasNext());
//            System.out.println("Liczba: " + iterator.next());
//        }


        ListIterator<Integer> listIterator = myList.listIterator();
        while (iterator.hasNext()){
            System.out.println("Liczba: " + iterator.next());
        }

        while (listIterator.hasPrevious()){
            Integer index = listIterator.previousIndex();
            Integer value = listIterator.previous();

            System.out.println("Liczba: " + value + "ma index: " + index);
        }


//        System.out.println("Rozmiar naszej listy: " + myList.size());
//        System.out.println(myList.get(0));
//        System.out.println(myList.remove(0));
//        System.out.println(myList.get(0));
//        System.out.println(myList.size());
//
//        myList.clear();
//        System.out.println("Rozmiar naszej listy: " + myList.size());
////        System.out.println(myList.get(2)); - odwołanie się do 2 indeksu tablicy, która jest psta;

//        ArrayList arrayList = new ArrayList();
//        arrayList.add(1);
//        arrayList.add(new Object());
//        arrayList.add("siedem");
//
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(1));
//        System.out.println(arrayList.get(2));
//
//        System.out.println((int)arrayList.get(0) + (String)arrayList.get(2));

    }
}
