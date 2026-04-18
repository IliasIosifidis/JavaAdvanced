void main() {
  var store = new DataStore<>();
  store.add(67);
  System.out.println(
    store.getById(0)
  );
}