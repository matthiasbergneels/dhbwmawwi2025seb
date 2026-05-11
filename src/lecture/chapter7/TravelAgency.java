package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

import java.sql.SQLOutput;

public class TravelAgency {

  public static void main(String[] args) {

    Hotel oneHotel = new Hotel(5);
    Airplane oneAirplane = new Airplane(150);
    Hotel twoHotel = new Hotel(200);

    IO.println("Freie Plätze im Hotel: " + oneHotel.freeSlots());
    //boolean successfulBooking = oneHotel.book(15);
    //IO.println("Erfolgreich im Hotel gebucht: " + successfulBooking);

    Bookable[] bookableEntities = new Bookable[4];
    // Narrowing Cast
    bookableEntities[0] = oneHotel;
    bookableEntities[1] = oneAirplane;
    bookableEntities[2] = twoHotel;
    bookableEntities[3] = new Airplane(5);

    // Reisedaten
    int travelingPersons = 7;
    for(Bookable bookableEntity : bookableEntities) {

      try {
        // Polymorphie
        IO.println("Aktuelle freie Plätze: " + bookableEntity.freeSlots());
        boolean successfulBooking = bookableEntity.book(travelingPersons);
        if (successfulBooking) {
          IO.println("Erolgreich für " + travelingPersons + " gebucht");
          IO.println("Verbleibende freie Plätze: " + bookableEntity.freeSlots());
        } else {
          if (bookableEntity instanceof PriorityBookable priorityBookableEntity) {
            priorityBookableEntity.priorityBooking(travelingPersons);

          }
        }
      }  catch (NotEnoughFreeSlotsException notEnoughFreeSlotsException) {
        System.out.println(notEnoughFreeSlotsException.getMessage());
        //System.out.println(notEnoughFreeSlotsException.getStackTrace());

        try {
          bookableEntity.book(notEnoughFreeSlotsException.getRemainingSlots());
          System.out.println("Buchung erfolgreich - verbleibende Plätze: " + bookableEntity.freeSlots());
        } catch (NotEnoughFreeSlotsException secondNotEnoughFreeSlotsException){
          System.out.println("Es sollte einfach nicht sein!");
        }
        System.out.println("Hat keinen Sinn mehr - alles Doof!");
        return;

      } catch (Exception e){
        // CatchAll - Ausgelöste Ausnahmen weitergeben
        //throw e;
      } finally {
        // wird IMMER ausgeführt!
        System.out.println("An mir geht NICHTS vorbei.");
      }

    }

    System.out.println("Travel Agency wird geschlossen");
  }
}
