package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public interface Bookable {

  int MAX_BOOKABLE_SLOTS = 20;

  int freeSlots();
  boolean book(int slots) throws NotEnoughFreeSlotsException;

  default boolean reserve(int slots){
    return false;
  }

}
