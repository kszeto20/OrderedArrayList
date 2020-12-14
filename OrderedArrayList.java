import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  private ArrayList<T> data;
  private int indRn;

  public OrderedArrayList() {
    data = new ArrayList<T>();
    indRn = 0;
  }

  public OrderedArrayList(int startingCapacity) {
    data = new ArrayList<T>(startingCapacity);
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

   private int locate(T element) {
    int realInd = 0;
    if(indRn > 0) {
      for(int i = 0; i < size()-1; i++) {
        if(((element).compareTo(get(i)) == 1) && ((element).compareTo(get(i + 1)) == -1)) {
          realInd = i + 1;
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
