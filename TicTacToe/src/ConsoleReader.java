import java.util.Scanner;

public class ConsoleReader {

    private Scanner scanner;

    public ConsoleReader() {
        scanner = new Scanner(System.in);
    }

    public int readCoordinate () {
        return scanner.nextInt();
    }

    public String readName (){
        return scanner.nextLine();
    }
}
