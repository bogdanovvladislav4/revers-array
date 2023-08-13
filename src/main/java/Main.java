public class Main {

    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";

        String[] words = line.split(",?\\s+");
        String[] array = ReverseArray.reverse(words);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
