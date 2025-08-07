
import java.util.*;

public class Colours {

    private static final String[] COMPLIMENTS = {
        "is totally rocking that colour!",
        "just made that colour famous.",
        "and this colour? A power combo.",
        "owns this vibe now.",
        "and this colour? A perfect match."
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printIntro();

        int size = getValidInt(scanner, "\nEnter the number of names and colours: ");

        List<String> names = getListInput(scanner, size, "name");
        List<String> colours = getListInput(scanner, size, "colour");

        while (true) {
            dramaticPause("Shuffling colours", 500);

            Collections.shuffle(colours);
            System.out.println("\nName and Colour Pairs:\n");

            for (int i = 0; i < size; i++) {
                String name = names.get(i);
                String colour = colours.get(i);
                String compliment = COMPLIMENTS[new Random().nextInt(COMPLIMENTS.length)];
                System.out.println(name + " → " + colour + " — " + compliment);
            }

            System.out.print("\nDo you want to reshuffle and try again? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();

            if (!response.equals("yes")) {
                System.out.println("\nSlay bestiee!! Goodbyeee!");
                break;
            }
        }

        scanner.close();
    }

    private static void printIntro() {
        System.out.println("Welcome to the Name + Colour Matcher");
        System.out.println("Where names meet their perfect colour pairing.");
    }

    private static void dramaticPause(String message, int delayMillis) {
        System.out.print(message);
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(delayMillis);
                System.out.print(".");
            }
            System.out.println();
        } catch (InterruptedException e) {
            System.out.println("\nAn unexpected pause interruption occurred.");
        }
    }

    private static int getValidInt(Scanner scanner, String prompt) {
        int number;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine(); // Clear newline
                if (number > 0) {
                    break;
                } else {
                    System.out.println("Please enter a number greater than 0.");
                }
            } else {
                System.out.println("Invalid number. Please try again.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        return number;
    }

    private static List<String> getListInput(Scanner scanner, int size, String type) {
        List<String> list = new ArrayList<>();
        System.out.println("\nEnter the " + type + "s:");
        for (int i = 0; i < size; i++) {
            while (true) {
                System.out.print(capitalize(type) + " " + (i + 1) + ": ");
                String input = scanner.nextLine().trim();
                if (!input.isEmpty()) {
                    list.add(input);
                    break;
                } else {
                    System.out.println("Please enter a valid " + type + ".");
                }
            }
        }
        return list;
    }

    private static String capitalize(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}
