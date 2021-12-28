package au.com.mir.java;

public class ReverseString {

    public String[] reverse(String input) {
        var sizeOfInput = input.length();

        var characters = input.split("");
        var reversedArray = new String[sizeOfInput];

        for (int i = input.length() - 1, k = 0; i >= 0; i--) {
            reversedArray[k] = characters[i];
            k++;
        }
        return reversedArray;
    }
}
