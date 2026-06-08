package lecture.chapter7;

import org.junit.jupiter.api.function.Executable;

public class HotelExceptionExecutable implements Executable {

  @Override
  public void execute() throws Throwable {

    Hotel hotelUnderTest = new Hotel(100);

    hotelUnderTest.book(hotelUnderTest.freeSlots() + 1);

  }
}
