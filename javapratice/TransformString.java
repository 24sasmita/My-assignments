package javapratice;

public class TransformString {
    public static void main(String[] args) {
        String input = "This is batch jan24";
        String output = transformString(input);
        System.out.println(output);
    }

    public static String transformString(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    result.append((char) ((ch - 'a' + 1) % 26 + 'a'));
                } else {
                    result.append((char) ((ch - 'A' + 1) % 26 + 'A'));
                }
            } else if (Character.isDigit(ch)) {
                result.append((char) ((ch - '0' + 1) % 10 + '0'));
            } else {
                result.append(ch); // preserve spaces and other characters
            }
        }

        return result.toString();
    }
}