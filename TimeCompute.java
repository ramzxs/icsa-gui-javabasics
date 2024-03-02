public class TimeCompute {
    public static void main(String[] args) {
        System.out.println("TIME COMPUTE APP\n");

        // CHALLENGE 1
        // Seconds 583
        // Hours:Mins:Seconds 0:00:00

        int secs = 7261;
        System.out.println("Seconds: " + secs + " *****");

        int h = secs / 3600;
        int m = (secs % 3600) / 60;
        int s = secs % 60;

        // Solution
        // int s = secs - ((h * 3600) + (m * 60));
        // int s = (secs % 3600) % 60; // 50 % 60 = 0 r 50

        System.out.println("Elapsed: " + h + ":" + m + ":" + s);
        System.out.format("Duration: %d:%02d:%02d %n", h, m, s);

        // CHALLENGE 2
        // H: M
        // Start 08:01
        // End 13:23
        // Duration/Elapsed 05:15

        int startH = 8, startM = 30; // 08:01
        int endH = 8, endM = 33; // 13:23

        System.out.println();
        System.out.println("Start Time: " + startH + ":" + startM + " ******");
        System.out.println("End Time: " + endH + ":" + endM);

        // Hint: 60

        // Solution 1
        // 08:01 - 09:00 59
        // 09:00 - 13:00 04
        // 13:00 - 13:01 1
        // 59 + 23 = 82
        // 82 - 60 = 22
        // 1
        // 05:22

        int H = 0, M = 0;
        if (startH == endH) {
            M = endM - startM;
            H = 0;
        } else {
            int minFirstHour = 60 - startM; // 59
            H = endH - startH - 1; // 4
            M = minFirstHour + endM; // 59 + 23 = 82
            H = H + (M / 60); // 4 + 1 = 5
            M = M % 60; // 82 % 60 = 1 r 22
        }
        System.out.println();
        System.out.println("Time Minus - Solution 1");
        System.out.println("Elapsed: " + H + ":" + M);

        // Solution 2
        // Start Time = Convert to seconds
        // End Time = Convert to seconds
        // Subtract
        // Convert the difference to h:m:s format

        int startSecs = (startH * 3600) + (startM * 60); // (8 * 3600) + (1 * 60) = 28800 + 60 = 28860
        int endSecs = (endH * 3600) + (endM * 60); // (8 * 3600) + (1 * 60) = 28800 + 60 = 28860        

        secs = endSecs - startSecs;
        h = secs / 3600;
        m = (secs % 3600) / 60;
        s = secs % 60;
        System.out.println();
        System.out.println("Time Minus - Solution 2 (" + startSecs + " - " + endSecs + ")");
        System.out.format("Duration: %d:%02d:%02d %n", h, m, s);
    }
}
