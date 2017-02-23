import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 23.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            builder.insert(0, input.nextInt()).insert(0, " ");
        }
        System.out.println(builder.toString());
    }
}
