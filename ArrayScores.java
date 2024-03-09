public class ArrayScores {
    public static void main(String[] args) {
        String[] players = new String[6];
        players[0] = "Aa";
        players[1] = "Bb";
        players[2] = "Cc";
        players[3] = "Dd";
        players[4] = "Ee";
        players[5] = "Ff";

        int[] ages = new int[6];
        ages[0] = 10;
        ages[1] = 12;
        ages[2] = 14;
        ages[3] = 16;
        ages[4] = 18;
        ages[5] = 20;

        float[] scores = new float[6];
        scores[0] = 0.1F;
        scores[1] = 0.09F;
        scores[2] = 0.3F;
        scores[3] = 4.0F;
        scores[4] = 0.02F;
        scores[5] = 0.0102F;

        float minScore = scores[0]; // 0.1
        int minIndex = 0;

        for (int i = 1; i < scores.length; i++) { // 1 2 3 4 5
            if (scores[i] < minScore) { // scores[1] ... scores[4]
                minScore = scores[i];
                minIndex = i;
            }
        }

        System.out.format("Lowest: %f (%s, %d years old)%n", minScore, players[minIndex], ages[minIndex]);

        float maxScore = scores[0]; // 0.1
        int maxIndex = 0;

        for (int i = 1; i < scores.length; i++) { // 1 2 3 4 5
            if (scores[i] > maxScore) { // scores[1] ... scores[4]
                maxScore = scores[i];
                maxIndex = i;
            }
        }

        System.out.format("Highest: %f (%s, %d years old)%n", maxScore, players[maxIndex], ages[maxIndex]);
    }
}
