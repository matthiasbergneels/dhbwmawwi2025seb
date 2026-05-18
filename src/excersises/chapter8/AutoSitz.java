package excersises.chapter8;

public class AutoSitz {

    private boolean ledersitz;
    private SeatColor farbe;

    public enum SeatColor{
        WHITE, BLACK, BLUE, RED, GREEN, YELLOW;

        public String toString(){
            return switch(this) {
                case WHITE -> "Weiss";
                case BLACK -> "Schwarz";
                case BLUE -> "Blau";
                case RED -> "Rot";
                case GREEN -> "Grün";
                case YELLOW -> "Gelb";
            };
        }
    }

    public AutoSitz(boolean ledersitz, SeatColor farbe) throws FalscheParameter {


        if (ledersitz && !(farbe == SeatColor.WHITE || farbe == SeatColor.BLACK)) {
            throw new FalscheParameter(ledersitz, farbe);
        }

        this.setFarbe(farbe);
        this.setLedersitz(ledersitz);
    }

    public boolean isLedersitz() {
        return ledersitz;
    }

    private void setLedersitz(boolean ledersitz) {
        this.ledersitz = ledersitz;
    }

    public SeatColor getFarbe() {
        return farbe;
    }

    private void setFarbe(SeatColor farbe) {
        this.farbe = farbe;
    }
}