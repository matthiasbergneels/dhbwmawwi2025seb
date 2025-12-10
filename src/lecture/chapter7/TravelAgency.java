package lecture.chapter7;

public class TravelAgency {

  public static void main(String[] args) {

    Hotel oneHotel = new Hotel(150);
    Airplane oneAirplane = new Airplane(150);
    Hotel twoHotel = new Hotel(200);

    IO.println("Freie Plätze im Hotel: " + oneHotel.freeSlots());
    boolean successfulBooking = oneHotel.book(15);
    IO.println("Erfolgreich im Hotel gebucht: " + successfulBooking);

    Bookable[] bookableEntities = new Bookable[4];
    // Narrowing Cast
    bookableEntities[0] = oneHotel;
    bookableEntities[1] = oneAirplane;
    bookableEntities[2] = twoHotel;
    bookableEntities[3] = new Airplane(200);

    // Reisedaten
    int travelingPersons = 7;
    for(Bookable bookableEntity : bookableEntities) {

      // Polymorphie
      IO.println("Aktuelle freie Plätze: " + bookableEntity.freeSlots());
      successfulBooking = bookableEntity.book(travelingPersons);
      if(successfulBooking) {
        IO.println("Erolgreich für " +  travelingPersons + " gebucht");
        IO.println("Verbleibende freie Plätze: " + bookableEntity.freeSlots());
      } else {
        if(bookableEntity instanceof PriorityBookable priorityBookableEntity) {
          priorityBookableEntity.priorityBooking(travelingPersons);

        }
      }

    }

  }
}
