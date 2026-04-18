import java.lang.reflect.Field;

public class User extends BaseEntity {

  private String name;
  private String lastName;
  private String veryLastName;

  public static void print(Object obj) {
    Class<?> clazz = obj.getClass();
    System.out.println(clazz.getSimpleName() + " {");

    while (clazz != null) {
      for (Field field : clazz.getDeclaredFields()) {
        field.setAccessible(true);
        try {
          System.out.println("  " + field.getName() + " = " + field.get(obj));
        } catch (IllegalAccessException e) {
          System.out.println("  " + field.getName() + " = [inaccessible]");
        }
      }
      clazz = clazz.getSuperclass();
    }

    System.out.println("}");
  }

  public User(int id, String name) {
    super(id);
    this.name = name;
  }
}
