import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        List<String> wordArray = Arrays.stream(word.split(""))
                .collect(Collectors.toList());

        for (String p : wordArray ) {
            int count = Collections.frequency(wordArray, p);
            if (count == 1) {
                System.out.println(p);
                return;
            }
        }


    }
}
