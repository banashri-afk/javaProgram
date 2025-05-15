public class StringCompression {
    public static void main(String[] args) {

        String input = "aabcccccaaa";
        StringBuilder compressed = new StringBuilder();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            count++;

            if (i + 1 >= input.length() || input.charAt(i) != input.charAt(i + 1)) {
                compressed.append(input.charAt(i));
                compressed.append(count);
                count = 0;
            }
        }

        String result = compressed.length() < input.length() ? compressed.toString() : input;
        System.out.println("Compressed: " + result);
    }
}