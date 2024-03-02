public class Dataset {
    public static void main(String[] args) {
        // ARRAYS

        // PHP: $users = ['A', 'B', 'C'];

        //  STUDENT      GRADE
        //  Emily           10          Item 0
        //  Samira          20               1
        //  Sharill         30               2

        String[] students = new String[3];
        students[0] = "Emily";
        students[1] = "Samira";
        students[2] = "Sharill";

        float[] grades = new float[3];
        grades[0] = 10;
        grades[1] = 20;
        grades[2] = 30;

        System.out.println("STUDENT = GRADE");
        System.out.println("1. " + students[0] + " = " + grades[0]);
        System.out.println("2. " + students[1] + " = " + grades[1]);
        System.out.println("3. " + students[2] + " = " + grades[2]);

        System.out.println();
        for (int i = 0; i < 3; i++) { // 0 1 2
            System.out.println((i + 1) + ". " + students[i] + " = " + grades[i]);
        }

        // CHALLENGE
        System.out.println("Average: 30");
        System.out.println("Lowest: 10 (Emily)");
        System.out.println("Highest: 40 (Sharill)");
    }
}
