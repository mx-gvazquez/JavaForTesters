public class TryCatch {
    public static void main(String[] args) {

        String[] students = {"Dmitry","Olga","Ramon"};
        try {
            System.out.println(students[3]); // Select Line > Menu Code > Surround With >  try / catch
        } // catch (Exception e) {
            catch (ArrayIndexOutOfBoundsException e) { // Copy and Paste EXACT exception from terminal.
          //  throw new RuntimeException(e);        // This was automatic
                System.out.println("Exception happened: " + e.getMessage());
        }

        System.out.println("Moving on the next task...");

    }
}
