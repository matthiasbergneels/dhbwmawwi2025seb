package excersises.chapter8;

public class AutoSitze {

    private String material;
    private String farbe;

    // material: "Leder" oder "Stoff"
    // Leder ist nur in den Farben "Schwarz" und "Weiss" lieferbar
    public AutoSitze(String material, String farbe) throws FalscheParameter {
        if ("Leder".equals(material) && !("Schwarz".equals(farbe) || "Weiss".equals(farbe))) {
            throw new FalscheParameter(material, farbe);
        }
        this.material = material;
        this.farbe = farbe;
    }

    public String getMaterial() {
        return material;
    }

    public String getFarbe() {
        return farbe;
    }
}