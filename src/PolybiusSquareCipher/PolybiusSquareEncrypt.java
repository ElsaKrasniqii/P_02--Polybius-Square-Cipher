package PolybiusSquareCipher;

public class PolybiusSquareEncrypt {
    private static final String[][] square = {
            {"0", "1", "2", "3", "4", "5"},
            {"1", "A", "B", "C", "D", "E"},
            {"2", "F", "G", "H", "I", "K"},
            {"3", "L", "M", "N", "O", "P"},
            {"4", "Q", "R", "S", "T", "U"},
            {"5", "V", "W", "X", "Y", "Z"}
    };

    public static String encrypt(String text) {
        text = text.toUpperCase().replace("J", "I");
        StringBuilder encryptedText = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (ch != ' ') {
                for (int i = 1; i < square.length; i++) {
                    for (int j = 1; j < square[i].length; j++) {
                        if (square[i][j].equals(String.valueOf(ch))) {
                            encryptedText.append(i).append(j);
                        }
                    }
                }
            } else {
                encryptedText.append(" ");
            }
        }
        return encryptedText.toString();
    }
}
