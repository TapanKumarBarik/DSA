public class LongestCommonPrefix {
  public static void main(String[] args) {
    String s1 = "abcdefgyyyyyyyyyyy";
    String s2 = "abcdefllllllwjhsafhsahfasjfgsajhgfjasllllll";

    int n1 = s1.length();
    int n2 = s2.length();
    int count = 0;
    String res = "";
    int iterationgValue = Math.min(n1, n2);

    for (int i = 0; i < iterationgValue; i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        System.out.println(res);
        break;
      }
      count++;
      res += s1.charAt(i);
    }

  }
}
