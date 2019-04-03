public interface OrderedList {

  //no set method or add at index, due to ordered nature
  public Object get(int index);
   
  public void remove(int index);

  public void add(int value);

  //no add at end, due to it being just a version of add at index

  private static void addOne( String description, int value, String expect);
  // more method signatures