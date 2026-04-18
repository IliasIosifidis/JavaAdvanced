public class Product extends BaseEntity{

  public String title;

  public Product(int id, String title) {
    super(id);
    this.title = title;
  }

  public String getTitle() {
    return title;
  }
}
