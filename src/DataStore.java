import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DataStore<T extends BaseEntity> {
  private List<T> tList = new ArrayList<>();

  public void add(T item) {
    tList.add(item);
  }

  public T findById(int id) {
    for (T item : tList) {
      if (item.getId() == id) {
        return item;
      }
    }
    throw new NoSuchElementException("There is not an element like that");
  }

  public T getById(int index) {
    if (index < tList.size()) {
      return tList.get(index);
    } else {
      throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
    }
  }
}