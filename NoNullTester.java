public class NoNullTester {
  public static void main (String[] args) {
    NoNullArrayList<Integer> test = new NoNullArrayList<Integer>();

    test.add(4);
    test.add(null);
    System.out.println(test);
  }

}
