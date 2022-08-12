package Day_0_Alan_FreeCoding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_BulkOperations {

    public static void main(String[] args) {

        // addAll (Collection) --> adds all the values in the collection to the arrayList

        ArrayList<Integer> alanObjects = new ArrayList<>();
        alanObjects.add(4);
        System.out.println(alanObjects);

        alanObjects.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 123123)); // BULK ADDING GIGACHAD

        System.out.println(alanObjects);

        ArrayList<Integer> listOne = new ArrayList<>();

        Integer [] array = {9,23,231,32,324,24};

        listOne.addAll(Arrays.asList(array));

        System.out.println(listOne);

        // containsAll (CollectionType)

        ArrayList <Integer> listTwo = new ArrayList<>();

        listTwo.add(34);

        System.out.println("Does the array list contain 34 : " +listTwo.contains(34));

        listTwo.addAll(Arrays.asList(3,4,5,6,7,8,9,2,3,43));

        System.out.println("The list after the bulk operation is : " +listTwo);

        boolean checking = listTwo.containsAll(Arrays.asList(4, 3, 8, 434));

        System.out.println("checking = " + checking);

        // listTwo.remove();  it will remvoe one item

        // removeAll() will remove a collection of numbers

        listTwo.removeAll(Arrays.asList(3, 4, 5));

        System.out.println("List after the bulk removal : " +listTwo);

        System.out.println("------------------------------------");

        // retainAll() will retain the collection and get rid of the rest

        ArrayList<Integer> listThree = new ArrayList<>();

        listThree.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2 ,3));
        System.out.println(listThree);

        listThree.retainAll(Arrays.asList(2, 3, 4));

        System.out.println(listThree);


    }


































}
