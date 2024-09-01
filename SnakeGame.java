import java.util.Scanner;

public class SnakeGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                GameFrame easyLevel = new GameFrame();
                easyLevel.level1();
                break;

            case 2:
                GameFrame mediumLevel = new GameFrame();
                mediumLevel.level2();
                break;

            case 3:
                GameFrame difficultLevel = new GameFrame();
                difficultLevel.level3();
                break;

            case 4:
                break;

            default:
                System.out.println("Invalid Level Input");
        }
    }
}
