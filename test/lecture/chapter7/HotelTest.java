package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

  @Test
  void bookWithExceptoin() {

    NotEnoughFreeSlotsException expected = null;
    String messageText = null;

    Hotel hotelUnderTest = new Hotel(100);

    try{
      hotelUnderTest.book(hotelUnderTest.freeSlots() + 1);
    }catch(NotEnoughFreeSlotsException e){
      System.out.println(e.getMessage());
      expected = e;
      messageText = e.getMessage();
    }

    assertNotNull(expected);
    assertTrue(expected instanceof NotEnoughFreeSlotsException);
    assertNotNull(messageText);
    assertEquals("Nicht genug freie Plätze! Es wurde versucht " + (hotelUnderTest.freeSlots() + 1) + " Plätze zu buchen, aber es sind nur " + hotelUnderTest.freeSlots() + " + Plätze frei.", messageText);

  }

  @Test
  void bookWithExceptionExpected() {

    assertThrows(NotEnoughFreeSlotsException.class, new HotelExceptionExecutable());

  }

  @Test
  void bookWithExceptionExpectedLambada() {

    Hotel hotelUnderTest = new Hotel(100);

    assertThrows(NotEnoughFreeSlotsException.class, () -> {
      hotelUnderTest.book(hotelUnderTest.freeSlots() + 1);
    });

  }

  @Test
  void bookWithOutExceptoin() {



  }
}