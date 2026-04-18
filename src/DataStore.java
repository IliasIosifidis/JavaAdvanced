import java.util.*;

public class DataStore<T extends BaseEntity> {
  private final List<T> tList = new ArrayList<>();
  private final Map<Integer, T> hashMap = new HashMap<>();

  public void add(T item) {
    tList.add(item);
    hashMap.put(item.getId(), item);
  }

  public T findById(int id) {
    if (hashMap.containsKey(id)){
      return hashMap.get(id);
    } else {
      throw new NoSuchElementException("There is not an element like that");
    }
  }

  public List<T> getAll(){
    return Collections.unmodifiableList(tList);
  }

  public T getById(int index) {
    if (index < tList.size()) {
      return tList.get(index);
    } else {
      throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
    }
  }
}