import java.util.Arrays;

public class SortString {
  public static void main(String[] args) {
    String s = "abczzzzzzzzzyyyyyydefabcdt";

    int[] arr = new int[26];

    for (int i = 0; i < s.length(); i++) {

      int indexL = s.charAt(i) - 97;
      arr[indexL] = arr[indexL] + 1;
    }

    String r = "";
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i]; j++) {
        int temp = i + 97;
        r += (char) temp;
        System.out.println(r);
      }

    }
    // System.out.println(Arrays.toString(arr));
  }
}
