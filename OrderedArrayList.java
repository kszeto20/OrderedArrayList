import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  private ArrayList<T> data;
  private int indRn;

  public OrderedArrayList() {
    data = new NoNullArrayList<T>();
    indRn = 0;
  }

  public OrderedArrayList(int startingCapacity) {
    data = new NoNullArrayList<T>(startingCapacity);
    indRn = 0;
  }

  public boolean add(T value){
    int corIndex = locate(value);
    if (indRn == 0){
      super.add(value);
      indRn++;
    }
    else {
      super.add(corIndex, value);
      indRn++;
    }
    return true;
  }

  public void add(int index, T element) {
    int corIndex = locate(element);
    if (indRn == 0) {
      super.add(element);
      indRn++;
    }
    else{
      super.add(corIndex, element);
      indRn++;
    }
  }

  public T set(int index, T value) {
    T previous = get(index);
    add(value);
    remove(index + 1);
    return previous;
  }


   private int locate(T element) {
    int realInd = 0;
    if(indRn > 0) {
      for(int i = 0; i < size()-1; i++) {
        if(((element).compareTo(get(i)) == 1) && ((element).compareTo(get(i + 1)) == -1)) {
          realInd = i + 1;
        }
        else if ((element).compareTo(get(i)) == 0){
          realInd = i;
        }
      }
      if((element).compareTo(get(0)) == -1){
        realInd = 0;
      }
      if((element).compareTo(get(size() - 1)) == 1){
        realInd = size();
      }
    }
    return realInd;
  }


}
