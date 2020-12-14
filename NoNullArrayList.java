import java.util.ArrayList;
import java.lang.IllegalArgumentException;
public class NoNullArrayList<T> extends ArrayList<T> {

  private ArrayList<T> data;

  public NoNullArrayList() {
    data = new ArrayList<T>();
  }

  public NoNullArrayList(int startingCapacity) {
    data = new ArrayList<T>(startingCapacity);
  }

  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException("member being added cannot be null");
    }
    super.add(value);
    return true;
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("member being added cannot be null");
    }
    super.add(index, element);
  }

  public T set(int index, T element) {
    T orig = get(index);
    if (element == null) {
      throw new IllegalArgumentException("member being added cannot be null");
    }
    super.set(index, element);
    return orig;
  }


}
