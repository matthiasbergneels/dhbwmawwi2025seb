package lecture.chapter8;

public class NotEnoughFreeSlotsException extends Exception {

  private int remainingSlots;

  public NotEnoughFreeSlotsException(int slootsToBook, int remainingSlots){
    super("Nicht genug freie Plätze! Es wurde versucht " + slootsToBook + " Plätze zu buchen, aber es sind nur " + remainingSlots + " + Plätze frei.");
    this.remainingSlots = remainingSlots;
  }

  public int getRemainingSlots(){
    return remainingSlots;
  }


}
