import java.util.List;

public class StoreUtils{

  public static <T extends BaseEntity> void printAll(List<T> items){
    items.forEach(System.out::println);
  }
}
