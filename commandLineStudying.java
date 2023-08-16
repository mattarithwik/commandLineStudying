import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String[][] elements = { { "aluminum", "Al" }, { "antimony", "Sb" }, { "argon", "Ar" }, { "arsenic", "As" },
                { "barium", "Ba" }, { "beryllium", "Be" }, { "bismuth", "Bi" }, { "boron", "B" }, { "bromine", "Br" },
                { "cadmium", "Cd" }, { "calcium", "Ca" }, { "carbon", "C" }, { "cesium", "Cs" }, { "chlorine", "Cl" },
                { "chromium", "Cr" }, { "cobalt", "Co" } };
        int turn = 0;
        boolean quit = false;

        while (quit != true) {

            List<String[]> shuffledElements = Arrays.asList(elements);
            Collections.shuffle(shuffledElements);
            shuffledElements.toArray(elements);

            for (String[] strings : elements) {

                turn = (Math.random() <= 0.5) ? 1 : 2;
                if (turn == 1) {
                    System.out.println(strings[0]);
                    String x = stdin.nextLine();

                    if (!x.equals(strings[1])) {
                        System.out.println("Incorrect! The correct answer is " + strings[1] + ".");
                    } else
                        System.out.println("Correct!");
                } else {
                    System.out.println(strings[1]);
                    String x = stdin.nextLine();

                    if (!x.equalsIgnoreCase(strings[0])) {
                        System.out.println("Incorrect! The correct answer is " + strings[0] + ".");
                    } else
                        System.out.println("Correct!");
                }
                System.out.println("****************************************");
            }
            System.out.println("Input 0 to exit. Input anything else to repeat.");
            String x = stdin.nextLine();
            if (x == "0") {
                quit = true;
            } else {
                System.out.println("---------------------------------------------");
            }
        }
    }
}