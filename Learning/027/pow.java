public class pow {

  public static void main(String[] args) {

    int a = 5;
    int b = 4;
    int res = 1;

    while (b > 0) {
      if (b % 2 == 1) {
        res = res * a;
      }
      a = a * a;
      b = b / 2;
    }

    System.out.println(res);
  }
}
