package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public class Hotel implements Bookable, Buildable {

  private int roomCount;
  private int bookedRoomCount;

  public Hotel(int roomCount) {
    this.roomCount = roomCount;
    this.bookedRoomCount = 0;
  }



  public void clean(){
    IO.println("Cleaning hotel...");
  }

  @Override
  public int freeSlots() {
    return roomCount - bookedRoomCount;
  }

  @Override
  public void build() {

  }

  @Override
  public boolean book(int slots) throws NotEnoughFreeSlotsException{

    if(slots > freeSlots() && slots < MAX_BOOKABLE_SLOTS) {
      //return false;
      throw new NotEnoughFreeSlotsException(slots, freeSlots());
    }

    bookedRoomCount += slots;

    return true;
  }
}
