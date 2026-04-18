void main() {
  var store = new DataStore<>();
  Class<?> store1 = store.getClass();
  var user = new User(1,"ilias");
  User.print(user);

  System.out.println();
}