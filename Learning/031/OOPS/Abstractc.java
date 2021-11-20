//one way of achieving abstraction is by abstraction class
//the other way can be interface

public class Abstractc {
  public static void main(String[] args) {

    // cannot make objects directly from abstart class as its a skeleton in real
    BMW b1 = new BMW();
    b1.name = "NEW BMW";
    System.out.println(b1.name + " is craeted");
    b1.work();

  }

}

// abstrsct class should have abstract keyword
abstract class Car {
  String name;

  abstract void work();
  // abstract method does not have any implementation
  // the classes extending the abstract class must define or override the abstract
  // method

}

// child 1\
class BMW extends Car {
  // this is a must
  // must have to override the abstarct methood
  @Override
  void work() {
    // TODO Auto-generated method stub
    System.out.println("Bmw runs so fast");

  }

}

// child2
class TataNano extends Car {
  // this is a must
  // must have to override the abstarct methood
  @Override
  void work() {
    // TODO Auto-generated method stub
    System.out.println("Cheapest car on the planet");

  }

}
//

/////////////////////////////////////////////////////////////////////////////////////////

//Interface is another way of achieving abstraaction

//Umlike class we dont use extents keyword but we use implements Interface

public class Interfaces implements Car {
  public static void main(String[] args) {
    Interfaces c1 = new Interfaces();
    c1.walk();
    c1.start();

  }

  @Override
  public void start() {
    // TODO Auto-generated method stub
    System.out.println("Jusr start me ");

  }

  @Override
  public void walk() {
    // TODO Auto-generated method stub
    System.out.println("I can walk");

  }
}

// sho=uld start with interface keyword
interface Car {
  void start();

  // by default methods are public and abstract
  // like void start=public abstract void start
  void walk();
}
