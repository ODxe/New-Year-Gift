import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Вы хотите самостоятельно выбрать сладости для подарка из ассортимента или " +
                "система автоматически подберет сладости для вашего подарка? Введите соответствующее: самостоятельно " +
                "или автоматически");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equals("самостоятельно")){
            UserSweetsChoise chooseSweetsManually = new UserSweetsChoise();
            chooseSweetsManually.userChoise();
        }
        else if (answer.equals("автоматически")){
            SystemSweetsChoise chooseSweetsAutomatically = new SystemSweetsChoise();
            chooseSweetsAutomatically.systemChoise();
        }

    }
}