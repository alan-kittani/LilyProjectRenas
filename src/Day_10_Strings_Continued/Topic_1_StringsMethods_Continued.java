package Day_10_Strings_Continued;

import java.util.Locale;

public class Topic_1_StringsMethods_Continued {

    public static void main(String[] args) {

        /**
         substring()	          Extracts the characters from a string,
        beginning at a specified start position,
        and through the specified number of character	                    String
        toLowerCase()	      Converts a string to lower case letters	                        String
        toUpperCase()	      Converts a string to upper case letters	                        String
        trim()	              Removes whitespace from both ends of a string	                    String
         */


        //substring()	          Extracts the characters from a string,
        //        beginning at a specified start position,

        String str1 = "AlanKittani";
        String substr1 = str1.substring(4);
        System.out.println("substr1 = " + substr1);
        String substr2 = str1.substring(4,7);
        System.out.println("substr2 = " + substr2);
        String substr3 = str1.substring(10);
        System.out.println("substr3 = " + substr3);
        String substr4 = str1.substring(2,str1.length());
        System.out.println("substr4 = " + substr4);

        // end index point will be EXCLUDED, while the beginning index character will be INCLUDED

        // toLowerCase()	      Converts a string to lower case letters	                        String

        String str2 = "HeLoLLo";
        String lowStr1 = str2.toLowerCase();
        System.out.println("lowStr1 = " + lowStr1);

        // toUpperCase()	      Converts a string to upper case letters	                        String

        String upStr1 = str1.toUpperCase();
        System.out.println("upStr1 = " + upStr1);

        // trim()	              Removes whitespace from both ends of a string	                    String

        String str3 = " Al an ";
        String trStr3 = str3.trim();
        System.out.println("trStr3 = " + trStr3);
        System.out.println(trStr3.length());




    }
}
