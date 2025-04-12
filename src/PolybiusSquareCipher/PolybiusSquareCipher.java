package PolybiusSquareCipher;

import java.util.Scanner;

public class 2PolybiusSquareCipher {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Zgjedh një proces: ");
            System.out.println("1. Enkriptim");
            System.out.println("2. Dekriptim");
            System.out.println("3. Shfaq Shembujt (Enkriptim dhe Dekriptim)");
            System.out.println("0. Dalje");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

            } else if (choice == 2) {

            } else if (choice == 3) {

            } else if (choice == 0) {
                System.out.println("Dalim...");
                break;
            } else {
                System.out.println("Zgjedhje e pavlefshme. Provoni përsëri.");
            }

            System.out.println("Deshironi të vazhdoni? (Po/Jo):");
            String continueChoice = scanner.nextLine();
            if (!continueChoice.equalsIgnoreCase("Po")) {
                break;
            }
        }

        scanner.close();
    }
}
