public class User extends BaseEntity{

  private String name;

  public User(int id, String name) {
    super(id);
    this.name = name;
  }

  public String getName(){
    return name;
  }
}
