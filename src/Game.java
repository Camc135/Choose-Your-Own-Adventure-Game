import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        boolean gameRunning = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are walking through an enchanted forest at sunset. You come to a crossroads. Do you (1) go right and follow a path along a river, or (2) go left and follow a path up a mountain? ");
        String response = scanner.nextLine();
        while (gameRunning) {
            if (response.equals("1")) {
                System.out.println("After walking for a while, you come across a rickety bridge crossing the river. Do you (1) cross the bridge, or (2) continue following the path? ");
                String responsea1 = scanner.nextLine();
                while (gameRunning) {
                    if (responsea1.equals("1")) {
                        System.out.println("The bridge cannot support human weight. You get swept away in the river. Game Over.");
                        gameRunning = false;
                    } else if (responsea1.equals("2")) {
                        System.out.println("You follow the path leading to an abandoned castle. You explore the castle, finding many riches. Game Over.");
                        gameRunning = false;
                    } else {
                        System.out.println("Choose 1 or 2");
                        responsea1 = scanner.nextLine();
                    }
                }
            } else if (response.equals("2")) {
                System.out.println("As you climb up the mountain, you come across a cave. Inside the cave, you can hear a faint snoring, but there is also a fire inside the cave. Do you (1) explore the cave or (2) continue climbing up the mountain?");
                String responseb1 = scanner.nextLine();
                while (gameRunning) {
                    if (responseb1.equals("1")) {
                        System.out.println("Inside the cave, you find a dragon guarding its piles of treasure. However, the dragon is kind, and allows you to warm yourself by the fire and take a small portion of its treasure in exchange for leaving the mountain. You choose to leave the mountain with the riches. Game Over.");
                        gameRunning = false;
                    } else if (responseb1.equals("2")) {
                        System.out.println("You happen upon a cliff while climbing the mountain. You are now stranded. Game Over.");
                        gameRunning = false;
                    } else {
                        System.out.println("Choose 1 or 2");
                        response = scanner.nextLine();
                    }
                }
            } else {
                System.out.println("Choose 1 or 2");
                response = scanner.nextLine();
            }
        }
    }
}