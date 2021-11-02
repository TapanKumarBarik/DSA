import java.util.Arrays;

public class RecerseWordByWord {
  public static void main(String[] args) {

    String s = "i am Tapan kumar Barik";

    String reverse = "";
    char[] arr = new char[s.length()];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = s.charAt(i);
    }
    // reverse thr entire sentense;

    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      char temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }

    // reverse word one by one
    int start1 = 0;
    int end1 = 0;
    for (int i = 0; i < arr.length; i++) {

      if (arr[i] == ' ') {
        end1 = i - 1;
        changeTheFirstWord(arr, start1, end1);
      }
      if (arr[i] == ' ') {
        start1 = i + 1;
      }
    }

    // append all to string

    for (int i = 0; i < arr.length; i++) {
      reverse += arr[i];
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(reverse);
  }

  private static void changeTheFirstWord(char[] arr, int start12, int end12) {

    while (start12 <= end12) {
      char temp = arr[start12];
      arr[start12] = arr[end12];
      arr[end12] = temp;
      start12++;
      end12--;
    }
  }
}
