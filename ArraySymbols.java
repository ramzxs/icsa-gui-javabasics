public class ArraySymbols {
    public static void main(String[] args) {
                         //                   2012345                        
                         //         10123456789
                         //0123456789  
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // alphabet.charAt(0)  = "A"
        // alphabet.charAt(25) = "Z"
        // alphabet.length()   = 26 

                            //0123456789
        String messageOrig = "DO NOT DO THIS AT HOME";   // If CIPHER = 3; KHOOR JXBV
        // messageOrig.charAt(0) = "H"
        // messageOrig.length()  = 10 
        // messageOrig.charAt(9) = "S"
        System.out.println("Message: " + messageOrig);
        System.out.println("Message Length: " + messageOrig.length());

        // CEASAR CIPHER
        int CIPHER = 5;
        String messageEnc = "";

        for (int i = 0; i < messageOrig.length(); i++) {      // 0  .. 9
            char letterOrig = messageOrig.charAt(i);          // H

            if (letterOrig == ' ') {
                messageEnc = messageEnc + " ";
            } else {
                int indexOfLetterFromTheAlphaber = -1;            // -1
                for (int j = 0; j < alphabet.length(); j++) {     // 0 ... 25
                    if (letterOrig == alphabet.charAt(j)) {       // H == A
                        indexOfLetterFromTheAlphaber = j;
                        break;
                    }
                }
                char letterEnc = alphabet.charAt((indexOfLetterFromTheAlphaber + CIPHER) % 26);
                
                messageEnc = messageEnc + letterEnc;
            }
        }


        System.out.println("Encrypted: " + messageEnc);        
    }
}
