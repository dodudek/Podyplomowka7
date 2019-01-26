public class Tshirt {

    private TshirtSize size;
    private String manufacture;

    public Tshirt(TshirtSize size, String manufacture) {
        this.size = size;
        this.manufacture = manufacture;
    }

    public TshirtSize getSize() {
        return size;
    }

    public void setSize(TshirtSize size) {
        this.size = size;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
}
