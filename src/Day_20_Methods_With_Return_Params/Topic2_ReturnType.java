package Day_20_Methods_With_Return_Params;

public class Topic2_ReturnType {



    // public               static           void               main        (String [] args){
    // Access-modifer       specifier        return-type        methodName  (paramater)


    public static String name (int a, int b) {

        if (a > b) {

            return "Alan";
            // you cannot return to string array, because a string array is an object
        }
        else if (b > a){
            return "Ziya";
            }
        else {
            return "No name found";
        }

    }

    public static void main(String[] args) {
        String theNames = name(3, 4);
        System.out.println(theNames);
    }



}
