package lecture.chapter7;

public interface Bookable {

  int MAX_BOOKABLE_SLOTS = 20;

  int freeSlots();
  boolean book(int slots);

  default boolean reserve(int slots){
    return false;
  }

}
