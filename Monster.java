import java.util.Random;
import java.util.Scanner;

public class Monster {
    private String image = "\uD83E\uDDDF";
    private final int x, y;
    private final boolean cursed;

    Monster(int sizeBoard) {
        Random random = new Random();
        x = 1 + random.nextInt(sizeBoard);
        y = 1 + random.nextInt(sizeBoard - 1);
        cursed = random.nextInt(100) < 5; // 5% шанс проклятого монстра
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean conflictPerson(int personX, int personY) {
        return personX == x && personY == y;
    }

    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу:");

        if (difficultGame == 1) {
            Random random = new Random();
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            int trueAnswer = a + b;

            System.out.println("Реши пример: " + a + " + " + b + " = ?");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();

            if (trueAnswer == answer) {
                System.out.println("Верно! Ты победил монстра");
                return true;
            } else {
                System.out.println("Ты проиграл эту битву!");
                return false;
            }
        } else {
            Random random = new Random();
            int a = random.nextInt(10 * (difficultGame - 1), 10 * difficultGame);
            int b = random.nextInt(10 * (difficultGame - 1), 10 * difficultGame);

            System.out.println("Реши пример: " + a + " * " + b + " = ?");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();

            if (a * b == answer) {
                System.out.println("Верно! Ты победил монстра");
                return true;
            } else {
                System.out.println("Ты проиграл эту битву!");
                return false;
            }
        }
    }

    public boolean isCursed() {
        return cursed;
    }
}