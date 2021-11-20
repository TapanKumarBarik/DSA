public class AccessModifier {
  public static void main(String[] args) {

    Laptop l1 = new Laptop();

    // l1.price
    // we cannot aaccess it as its private

    l1.name = "Dell";
    // but we can change the price of laptop by calling the setter and getter
    // method;
    l1.setPrice(10);

    // getter
    int price = l1.getPrice();

    System.out.println("The name of the Laptop is " + l1.name + " and it costs around " + price);
  }

}
// class cannot be public more gthan once
// it can be private i e it canbe accessed in the same class , and unaccessible
// in ant other class
// it can be protected and its kinda pubpic but only available for its childrens

class Laptop {
  String name;
  private int price;

  // setter
  public void setPrice(int price) {
    this.price = price;
  }

  // getter
  public int getPrice() {
    return this.price;
  }
}
