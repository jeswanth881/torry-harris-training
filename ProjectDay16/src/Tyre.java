public class Tyre {
    private String tyreName;
    private double tyreSize;

    public Tyre(String tyreName, double tyreSize) {
        this.tyreName = tyreName;
        this.tyreSize = tyreSize;
    }

    public String getTyreName() {
        return tyreName;
    }

    public void setTyreName(String tyreName) {
        this.tyreName = tyreName;
    }

    public double getTyreSize() {
        return tyreSize;
    }

    public void setTyreSize(double tyreSize) {
        this.tyreSize = tyreSize;
    }
}

