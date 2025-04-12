package PolybiusSquareCipher;


public class PolybiusSquareDecrypt {
    private static final String[][] square = {
            {"0", "1", "2", "3", "4", "5"},
            {"1", "A", "B", "C", "D", "E"},
            {"2", "F", "G", "H", "I", "K"},
            {"3", "L", "M", "N", "O", "P"},
            {"4", "Q", "R", "S", "T", "U"},
            {"5", "V", "W", "X", "Y", "Z"}
    };
    public static String decrypt(String cipherText) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < cipherText.length(); i += 2) {
            String row = String.valueOf(cipherText.charAt(i));
            String col = String.valueOf(cipherText.charAt(i + 1));

            int rowIndex = Integer.parseInt(row);
            int colIndex = Integer.parseInt(col);

            decryptedText.append(square[rowIndex][colIndex]);
        }

        return decryptedText.toString();
    }
}


