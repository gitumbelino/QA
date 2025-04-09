package Domain;

public class Attractions {

    private int id;
    private String attraction;
    private double priceAdult;
    private double priceChildren;
    private int durationSeconds;

    public Attractions(int id, String attraction, double priceAdult, double priceChildren, int durationSeconds) {
        this.id = id;
        this.attraction = attraction;
        this.priceAdult = priceAdult;
        this.priceChildren = priceChildren;
        this.durationSeconds = durationSeconds;

    }


    public int getId() {return id; }

    public String getAttraction() {
        return attraction;
    }

    public double getPriceAdult() {
        return priceAdult;
    }

    public double getPriceChildren() {
        return priceChildren;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }



}

