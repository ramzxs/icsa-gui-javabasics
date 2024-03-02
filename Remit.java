public class Remit {
    public static void main(String[] args) {
        System.out.println("REMIT APP");

        float CASH = 100.50F;

        // A-B Offerings
        float aForex    = 180.00F,    bForex    = 180.10F;
        float aCommi    =   0.75F,    bCommi    =   1.25F;
        float aPHCharge = 100.00F,    bPHCharge = 100.00F;

        // Final A
        float aNetKWD = CASH - aCommi;
        float aNetPHP = aNetKWD * aForex;
        float aFinalPHP = aNetPHP - aPHCharge;
        // float aFinalPHP = ((CASH - aCommi) * aForex) - aPHCharge;

        // Final B
        float bFinalPHP = ((CASH - bCommi) * bForex) - bPHCharge;

        System.out.println("Remittance Amount: " + CASH);
        System.out.println("Remittance Center A: " + aFinalPHP);
        System.out.println("Remittance Center B: " + bFinalPHP);
        System.out.println("Difference: " + (aFinalPHP - bFinalPHP));
    }    
}
