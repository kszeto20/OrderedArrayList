import java.util.ArrayList;
import java.lang.IllegalArgumentException;
public class NoNullArrayList<T> extends ArrayList<T> {

  private ArrayList<T> data;

  public NoNullArrayList () {
    data = new ArrayList<T>();
  }

  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException("member being added cannot be null");
    }
    super.add(value);
    return true;
  }


}
