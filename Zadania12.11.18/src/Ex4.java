import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        String firstliteral = readLetteringFromConsole(1);




    }

    static String readLetteringFromConsole(int letteringInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literal: " + letteringInOrder);
        return scanner.nextLine();
    }
}
