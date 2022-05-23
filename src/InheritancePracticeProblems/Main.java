package InheritancePracticeProblems;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {


    //ABC
    //        Class_A a = new Class_A();
//        Class_B b = new Class_B();
//        Class_C c = new Class_C();
//
//
//        a.a();
//        b.b();
//        c.c();

    Class_C c = new Class_C();

    c.a();
    c.b();
    c.c();

    //Person and subclasses
//        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
//        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
//        System.out.println(ada);
//        System.out.println(esko);

//        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//        System.out.println(ollie);
//        System.out.println("Study credits " + ollie.credits());
//        ollie.study();
//        System.out.println("Study credits "+ ollie.credits());

//      Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
//      Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
//      System.out.println(ada);
//      System.out.println(esko);
//
//      Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//
//      int i = 0;
//      while (i < 25) {
//        ollie.study();
//        i = i + 1;
//      }
//      System.out.println(ollie);

//      ArrayList<Person> persons = new ArrayList<Person>();
//      persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
//      persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
//
//      printingPersons(persons);
//    }
//  public static void printingPersons(ArrayList<Person> persons) {
//    for (Person person : persons) {
//      System.out.println(person);
//    }
//    }


    //Warehouse
//    ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
//    juice.addToWarehouse(1000.0);
//    juice.takeFromWarehouse(11.3);
//    System.out.println(juice.getName());
//    juice.addToWarehouse(1.0);
//    System.out.println(juice);

    ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
    juice.takeFromWarehouse(11.3);
    System.out.println(juice.getName()); // Juice
    juice.addToWarehouse(1.0);
    System.out.println(juice);

//    System.out.println(juice.history());
    juice.printAnalysis();

  }
}
