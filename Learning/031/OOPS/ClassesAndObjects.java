public class ClassesAndObjects {
  // Each class can have one and only public class
  // It should be same as the class name
  public static void main(String[] args) {
    Person p1 = new Person();
    // we can create as many as instances of the class

    p1.name = "Tapan";
    p1.age = 23;
    // System.out.println("My name is " + p1.name + " and my age is " + p1.age);
    p1.walk();
    // p2
    Person p2 = new Person();
    p2.name = "Kumar Barik";
    p2.age = 23;
    // System.out.println("My name is " + p2.name + " and my age is " + p2.age);
    p2.sleep();

    p2.sleep(20);

    // accessing the count as its static, it is a class member rather the member of
    // object , means we can access it like Person.count rather than p1.count or
    // p2.count
    // System.out.println(Person.count);

    // p3

    // craeting person p3 by calling the overloaded constructor
    Person p3 = new Person("Tapan newly Created ", 22);
    // System.out.println("My name is " + p3.name + " and my age is " + p3.age);

    // ****************************************************************8 */

    // Inheritnce
    Developer d1 = new Developer("Developer Tapan  ", 22);
    System.out.println("My name is " + d1.name + " and my age is " + d1.age);
    d1.sleep(99);
  }
}

class Person {
  //
  // Static keyword
  static int count;

  //
  //
  // Constructor
  // Default constructor
  // should be public and should be same name as class
  public Person() {
    count++;
    System.out.println("A new object has been created and count== " + count);
  }

  //

  // Overload construstor

  public Person(String name, int age) {

    this();
    // this this() with no agguments will call the default constructor
    // name=name;
    // age=age;
    // here there are ambiguity so we can use this i e properties of parent class
    this.name = name;
    this.age = age;

  }

  String name;
  int age;
  // name and age are PROPERTIES

  // Methods are nothing but behaviours

  void walk() {
    System.out.println(name + " can walk");
  }

  void sleep() {
    System.out.println(name + " can sleep");
  }

  // polymorphisim of sleep method as it can have many forms like it can be called
  // with arguments and without arguments
  // compile time polymorphism as code knows which method to call at compile time
  void sleep(int hours) {
    System.out.println(name + " can sleep upto " + hours);
  }

}

class Developer extends Person {
  // Inheritance as Dveloper extends Person . here person is the parent class and
  // Developer is the child class.

  // object is the final parent of all
  // Child class extends all the functionality (Method and properties) of parents

  public Developer(String string, int i) {

    // parameterized constuctor of the children class
    super(string, i);
    // super method calls the parents constuctor from the children class i e it
    // creates all the properties of the object while creating the object
  }
  // Polymorphisim
  // run time polymorphisim
  // same method is present in parents but if we have implemented method here and
  // calling , it will choose the children one and its called
  // RUN TIME POLYMORPHISIM

  void sleep(int hours) {
    System.out.println("Developer" + name + " can sleep upto " + hours);
  }

}
