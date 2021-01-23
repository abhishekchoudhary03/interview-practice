package arrays_and_strings;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

public class CheckPermutation {

    public boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] s2Arr = s2.toCharArray();
        for (int i=0; i<s1.length(); i++) {
//            for (int j=0; j<s2Arr.length; j++) {
//                if (s1.charAt(i) == s2Arr[j]) {
//                    s2Arr = removeCharAt(j, s2Arr);
//                    break;
//                }
//            }
            if (!isPresent(s1.charAt(i), s2))
                return false;
        }

        return false;
    }

    private boolean isPresent(char c, String s) {
        boolean charFound = searchLinearly(c, s);

        return charFound;
    }

    private boolean searchLinearly(char c, String s) {
        char[] charArr = s.toCharArray();
        for (int i=0; i < charArr.length; i++) {
            if (charArr[i] == c) {
                removeCharAt(i, charArr);
                return true;
            }
        }
        return false;
    }

    private char[] removeCharAt(int index, char[] arr) {
        char[] newArr = new char[arr.length - 1];
        for (int i = 0; i <index; i++) newArr[i] = arr[i];
        for(int i=index; i<arr.length-1; i++) {
            newArr[i] = arr[i+1];
        }
        return newArr;
    }

    public static void main(String[] args) {
        System.out.println("args = " + Arrays.deepToString(args));
    }
}
