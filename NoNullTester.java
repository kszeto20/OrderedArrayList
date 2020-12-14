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
    test.set(6, 4);




    System.out.println(test);

  }

}
