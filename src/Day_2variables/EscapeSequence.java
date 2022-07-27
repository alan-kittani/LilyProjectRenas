package Day_2variables;

import java.sql.SQLOutput;

public class EscapeSequence {

    public static void main (String [] args) {
        //    \t <-- this will leave a paragraph space on the console

        System.out.print("\tThis is an indent \tthis is another one");
        System.out.print("This is a test");

        //   \n  <-- this is going to tell the console to move onto a new line on the console

        System.out.print("\nNew line");

        //   \"  <-- prints double quote " on the console

        System.out.print("\n\"He said hi\"");

        //   \\ <-- prints \ on the console

        System.out.print("\n This is back slash \\");

        //   \' <-- prints single quote on the console

        System.out.print("\nThis is a single \'quote\'");


    }
}
