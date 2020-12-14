public class NoNullTester {
  public static void main (String[] args) {
    OrderedArrayList<Integer> test = new OrderedArrayList<Integer>();

    test.add(0);
    test.add(6);
    test.add(5);
    test.add(7);
    //test.add(2);
    //test.add(3);
    //test.add(5);
    System.out.println(test);
    /*
    System.out.println(test.set(0, 12));
    test.add(1, 1234);
    test.set(0, 8);

    System.out.println(test);


    OrderedArrayList<Integer> test2 = new OrderedArrayList<Integer>(5);

    test2.add(345);
    System.out.println(test2.set(0, 93802));
    test2.add(1, 12);
    test2.add(1, 9023480);
    test2.add(1, 1444);
    test2.add(1, 909384480);
    test2.add(1, 9000);
    test2.set(0, 10);

    System.out.println(test2);
    */
  }

}
