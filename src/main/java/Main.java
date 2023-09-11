import cryptLogic.Crypter;
import cryptLogic.Decrypter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String inputText = scanner.nextLine();
        scanner.close();
        boolean isLatin = true;
        char c = inputText.charAt(0);
        if (Character.UnicodeBlock.of(c) == Character.UnicodeBlock.CYRILLIC) {
            isLatin = false;
        }

        Facade facade = null;
        if (isLatin) {
           facade = new Facade(new Decrypter(inputText));
            System.out.println("Your message in cyrillic alphabet: " + facade.decrypt());
        } else {
            facade = new Facade(new Crypter(inputText));
            System.out.println("Your message in latin alphabet: " + facade.crypt());
        }


    }
}
