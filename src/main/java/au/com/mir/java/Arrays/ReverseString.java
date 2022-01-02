package au.com.mir.java.Arrays;

public class ReverseString {

    public String reverse(String input) {
        if (input == null) return "";

        var strBuf = new StringBuffer();
        var characters = input.split("");

        for (int i = input.length() - 1; i >= 0; i--) {
            strBuf.append(characters[i]);
        }
        return strBuf.toString();
    }
}
