void main() {

  var store = new DataStore<>();
  store.set("yellow");
  System.out.println(store.get());
  store.set(67);
  System.out.println(store.get());
}