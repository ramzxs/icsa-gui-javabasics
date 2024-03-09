public class ArrayGrades {
    public static void main(String[] args) {
        // ARRAYS

        // PHP: $users = ['A', 'B', 'C'];

        //  STUDENT      GRADE
        //  Emily           10          Item 0
        //  Samira          20               1
        //  Sharill         30               2

        // int = char

        // String[] students = new String[3];

        String[] students;         // students = null;
        students = new String[3];  // students = Ljava.lang.String;@2f92e0f4 --> [null, null, null] 3MB

        students[2] = "Alpha";     // students = 0x7FFF5FBFFD98 --> [null, null, "Alpha"]
        students[1] = "Bravo";     // students = 0x7FFF5FBFFD98 --> [null, "Bravo", "Alpha"]
        students[0] = "" +  'C' + 'h' + 'a' + 'r' + 'l' + 'i' + 'e';    // students = 0x7FFF5FBFFD98 --> ["Charlie", "Bravo", "Alpha"]
         
        float[] grades = new float[3]; // grades = 0x12352545 -> [null, null, null];
        grades[0] = 40.0F;
        grades[1] = 20.0F;
        grades[2] = 30.0F;                // grades = 0x12352545 -> [10, 20, 30];

        System.out.println("STUDENT = GRADE");
        // System.out.println("1. " + students[0] + " = " + grades[0]);
        // System.out.println("2. " + students[1] + " = " + grades[1]);
        // System.out.println("3. " + students[2] + " = " + grades[2]);
        // System.out.println();
        for (int i = 0; i < 3; i++) { // 0 1 2
            System.out.print( "\t" + (i + 1) + ". " + students[i] + " = " + grades[i] + "\n"  );
            // i              0                        1                       2
            // i + 1          1                        2                       3
            // students[i]    "Charlie"                "Bravo"                 "Alpha"
            // grades[i]      10.0                     20.0                    30.0
            // println        "1. Charlie = 10.0"      "2. Bravo = 20.0"       "3. Alpha = 30.0"
        }

        // CHALLENGE


        float average = 0.0F;  // average = 0x000 -> [0.00000]
        for (int i = 0; i < grades.length; i++) {
            average = average + grades[i];
            //  i           0           1         2
            //  average     0.0         10.0      30.0
            //  grades[i]   10.0        20.0      30.0
            //  average     10.0        30.0      60.0
        }
        System.out.println("Sum: " + average); // "Sum: 60.0"

        average = average / grades.length;     // 60.0 / 3 = 20.0
        System.out.println("Average: " + average); // "Average: 20.0"


        // MIN
        float min = grades[0];                           // min = 40.0
        String studentWithMin = students[0];             // studentWithMin = "Charlie"

        if (grades[1] < min) {
            min = grades[1];                             // min = 20.0
            studentWithMin = students[1];                // studentWithMin = "Bravo"
        }       
        if (grades[2] < min) {
            min = grades[2];                             // Not Run
            studentWithMin = students[2];                // studentWithMin = "Alpha"
        }
        System.out.println("Lowest: " + min + " (" + studentWithMin + ")");



        float max = grades[0];                          // max        = 40.0
        String maxStudent = students[0];                // maxStudent = "Charlie"

        if (grades[1] > max) {
            max = grades[1];
            maxStudent = students[0];
        }

        if (grades[2] > max) {
            max = grades[2];
            maxStudent = students[2];
        }

        System.out.println("Highest: " + max  + " (" + maxStudent + ")");
    }
}
