package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

import java.io.Serializable;

public class Airplane implements PriorityBookable, Serializable, Cloneable, Comparable {

  // true -> belegt; false -> frei
  private boolean[] bookedSeats;

  public Airplane(int seatCount) {
    bookedSeats = new boolean[seatCount];
    for(int i = 0; i < seatCount; i++) {
      bookedSeats[i] = false;
    }
  }

  public void fly(){
    IO.println("Ich ich flieg, flieg, flieg *sing*");
  }

  @Override
  public int freeSlots() {
    int freeSlotsCount = 0;
    for(boolean bookedSeat : bookedSeats) {
      if(!bookedSeat) {
        freeSlotsCount++;
      }
    }
    return freeSlotsCount;
  }

  @Override
  public boolean book(int slots) throws NotEnoughFreeSlotsException{
    if(slots > freeSlots() && slots < MAX_BOOKABLE_SLOTS) {
      //return false;
      NotEnoughFreeSlotsException myException = new NotEnoughFreeSlotsException(slots, freeSlots());
      throw myException;
    }

    for(int i = 0; i < slots; i++) {
      if(!bookedSeats[i]){
        bookedSeats[i] = true;
      }
    }
    return true;
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }

  @Override
  public boolean priorityBooking(int slots) {
    return false;
  }
}
