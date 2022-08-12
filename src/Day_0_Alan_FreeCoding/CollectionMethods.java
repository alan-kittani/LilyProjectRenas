package Day_0_Alan_FreeCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import MyUtil.TestClassForPublic;

import static MyUtil.TestClassForPublic.breakLines;

public class CollectionMethods {

    public static void main(String[] args) {


        // Arraylist is a collection

        // sort() this will sort the ArrayList in increasing order

        ArrayList<Integer> listOne = new ArrayList<>();

        listOne.addAll(Arrays.asList(90, 2, 4, 6, 1,-2, 34, 45));

        Collections.sort(listOne);

        System.out.println(listOne);

        // listOne.get(listOne.size()-1));  this will get the max value after we sort the arrayList

        // or we can do

        breakLines();

        // max ()  this will return the max value in the arrayList

        ArrayList<Integer> listTwo = new ArrayList<>();

        listTwo.addAll(Arrays.asList(23,12,43145,3125,35,123,12,312,45135));

        System.out.println(Collections.max(listTwo));

        breakLines();

        // min () will return the minimum value in the array list

        int min = Collections.min(listTwo);
        System.out.println(min);

        breakLines();

        // replaceAll() will replace all the value you input with the value you want to replace it with

        ArrayList<Integer> listThree = new ArrayList<>();

        listThree.addAll(Arrays.asList(123,123,1,5,5,123,12,3124135,123));

        Collections.replaceAll(listThree, 123, 5);

        System.out.println(listThree);

        // frequency(CollectionsType, Object) : this will return the frequency of the given object
        //                                            from the given collection type

        System.out.println("How many objects with the name 5 in the list : " +Collections.frequency(listThree, 5));













    }
}
