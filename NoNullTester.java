public class NoNullTester {
  public static void main (String[] args) {
    OrderedArrayList<Integer> test = new OrderedArrayList<Integer>();

    test.add(1);
    test.add(5);
    test.add(23);
    test.add(2);
    test.add(765);
    test.add(6);
    test.add(10);
    test.add(98);
    test.add(1, 1234567890);
    System.out.println(test);
    test.set(6, 4);
    test.add(345667777);
    test.add(89);
    System.out.println(test);
    test.add(1, 1267890);
    System.out.println(test);
    test.set(8, 4);
    System.out.println(test);
    test.set(1, 55 );
    System.out.println(test);


  }

}
