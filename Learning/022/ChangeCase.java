public class ChangeCase {
  public static void main(String[] args) {
    String s = "AbCdEfGh";

    String res = "";

    for (int i = 0; i < s.length(); i++) {
      char temp = (char) (s.charAt(i) ^ 32);

      res += temp;

    }
    System.out.println(res);
  }
}
