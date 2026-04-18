import java.util.ArrayList;
import java.util.List;

public class DataStore<T> {
  private List<T> tList = new ArrayList<>();

  public void add(T item){
    tList.add(item);
  }

  public T getById(int index) {
    if (index < tList.size()){
      return tList.get(index);
    } else {
      throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
    }
  }
}