public class BreakAndContinue {
    public static void main(String[] args) {

    // BREAK
        byte pages = 12;
        for (byte j = 0; j <= pages; j++) {
            System.out.println(j); // Now we run through all 0 to 'pages'.

            if (j == 5) {   // Enter here only when j == 5.
                System.out.println("STOP");  // Do something
                break;      // Finishes loop run.
            }
        }


    System.out.println("---------------");


    //CONTINUE
        //DO WHILE

        do {
            if (pages == 8){
                System.out.println("No imprimas este número");
                pages--;    // Make sure to add the counter, to avoid infinite loop.
                            // Otherwise variable 'pages' don't update and will skip the counter
                            // and return here forever.
                continue;
            }
            System.out.println(pages);
            pages--;
        } while (pages > 3);

    }
}
