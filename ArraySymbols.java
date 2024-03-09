public class ArraySymbols {
    public static void main(String[] args) {
        char[] letters = new char[26];
        letters[0] = 'A';
        letters[1] = 'B';
        letters[2] = 'C';

                         //                   2012345                        
                         //         10123456789
                         //0123456789
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            // Orig Letter = e --> index = 25
            // Cipher = 5
            // Enc Letter = (25+5) % 26 = 30 % 26 = 1 r 4 = index 4 --> letter 'E'

        // alphabet.charAt(0)  = "A"
        // alphabet.charAt(25) = "Z"
        // alphabet.length()   = 26 

                            //0123456789
        String messageOrig = "APPLE";   // If CIPHER = 3; KHOOR JXBV
        // messageOrig.charAt(0)  = "D"
        // messageOrig.length()   = 22 
        // messageOrig.charAt(9)  = " "
        // messageOrig.charAt(21) = "E"
        // messageOrig.charAt(22) = ERROR OUT OF BOUND
        System.out.println("Message: " + messageOrig);
        System.out.println("Message Length: " + messageOrig.length());

        // CEASAR CIPHER
        int CIPHER = 5;
        System.out.println("Cipher: " + CIPHER);                  // CIPHER = 1
        String messageEnc = "";                                   // messageEnc = "" + 'E' = "E"

        for (int i = 0; i < messageOrig.length(); i++) {          // i = 0 1 ... 22
            char letterOrig = messageOrig.charAt(i);              // letterOrig = 'O'

            if (letterOrig == ' ') {
                messageEnc = messageEnc + " ";                    
            } else {
                int indexOrig = -1;                               // indexOrig = -1 -> 14
                for (int j = 0; j < alphabet.length(); j++) {     // j = 0 1  -> 14
                    if (letterOrig == alphabet.charAt(j)) {       // alphabet.charAt(14) = 'O'
                        indexOrig = j;
                        break;
                    }
                }
                int result = (indexOrig + CIPHER) % 26;           // result = (14 + 1) % 26 = 15 % 26 = 0 r 15
                char letterEnc = alphabet.charAt(result);         // letterEnc = alphabet.charAt(15) = 'P'
                
                messageEnc = messageEnc + letterEnc;              // "E" + 'P' = "EP O"
            }
        }


        System.out.println("Encrypted: " + messageEnc);        
    }
}
