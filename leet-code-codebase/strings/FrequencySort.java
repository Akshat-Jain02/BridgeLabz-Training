import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FrequencySort {

    //Method for frequency sort
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Bucket sort based on frequency
        ArrayList<Character>[] arr = new ArrayList[s.length() + 1];

        for (char ch : map.keySet()) {
            int freq = map.get(ch);
            if (arr[freq] == null) {
                arr[freq] = new ArrayList<>();
            }
            arr[freq].add(ch);
        }

        // Build result string
        StringBuilder str = new StringBuilder();
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != null) {
                for (char ch : arr[i]) {
                    for (int k = 0; k < i; k++) {
                        str.append(ch);
                    }
                }
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = frequencySort(input);

        System.out.println("String sorted by character frequency:");
        System.out.println(result);

        sc.close();
    }
}
