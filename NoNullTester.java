public class NoNullTester {
  public static void main (String[] args) {
    NoNullArrayList<Integer> test = new NoNullArrayList<Integer>();

    test.add(4);
    System.out.println(test.set(0, 3));
    test.add(0, 5);
    test.set(0, 8);

    System.out.println(test);
  }

}
