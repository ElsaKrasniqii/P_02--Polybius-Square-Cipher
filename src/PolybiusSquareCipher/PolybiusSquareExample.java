package PolybiusSquareCipher;

public class PolybiusSquareExample {

        public static void runExamples() {

            String textToEncrypt = "DATA";
            String encryptedText = PolybiusSquareEncrypt.encrypt(textToEncrypt);
            String decryptedText = PolybiusSquareDecrypt.decrypt(encryptedText);

            System.out.println("Shembuj të Enkriptimit dhe Dekriptimit:");
            System.out.println("Teksti origjinal: " + textToEncrypt);
            System.out.println("Teksti i enkriptuar: " + encryptedText);
            System.out.println("Teksti i dekriptuar: " + decryptedText);


            String textToEncrypt2 = "FIEK";
            String encryptedText2 = PolybiusSquareEncrypt.encrypt(textToEncrypt2);
            String decryptedText2 = PolybiusSquareDecrypt.decrypt(encryptedText2);

            System.out.println("\nShembuj të tjerë:");
            System.out.println("Teksti origjinal: " + textToEncrypt2);
            System.out.println("Teksti i enkriptuar: " + encryptedText2);
            System.out.println("Teksti i dekriptuar: " + decryptedText2);
        }

}
