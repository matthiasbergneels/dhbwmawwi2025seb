package excersises.chapter8;

public class TestAutoSitzeException {

    public static void main(String[] args) {

        // Leder Schwarz - gültig
        try {
            AutoSitze sitz = new AutoSitze("Leder", "Schwarz");
            System.out.println("Sitz bezogen: " + sitz.getMaterial() + " in " + sitz.getFarbe());
        } catch (FalscheParameter e) {
            System.out.println(e.getMessage());
            System.out.println("Beziehen fehlgeschlagen!");
        }

        // Leder Rot - ungültig
        try {
            AutoSitze sitz = new AutoSitze("Leder", "Rot");
            System.out.println("Sitz bezogen: " + sitz.getMaterial() + " in " + sitz.getFarbe());
        } catch (FalscheParameter e) {
            System.out.println(e.getMessage());
            System.out.println("Beziehen fehlgeschlagen!");
        }

        // Stoff Blau - gültig
        try {
            AutoSitze sitz = new AutoSitze("Stoff", "Blau");
            System.out.println("Sitz bezogen: " + sitz.getMaterial() + " in " + sitz.getFarbe());
        } catch (FalscheParameter e) {
            System.out.println(e.getMessage());
            System.out.println("Beziehen fehlgeschlagen!");
        }

        // Leder Weiss - gültig
        try {
            AutoSitze sitz = new AutoSitze("Leder", "Weiss");
            System.out.println("Sitz bezogen: " + sitz.getMaterial() + " in " + sitz.getFarbe());
        } catch (FalscheParameter e) {
            System.out.println(e.getMessage());
            System.out.println("Beziehen fehlgeschlagen!");
        }

        // Leder Grün - ungültig
        try {
            AutoSitze sitz = new AutoSitze("Leder", "Grün");
            System.out.println("Sitz bezogen: " + sitz.getMaterial() + " in " + sitz.getFarbe());
        } catch (FalscheParameter e) {
            System.out.println(e.getMessage());
            System.out.println("Beziehen fehlgeschlagen!");
        }
    }
}