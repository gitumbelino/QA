package Domain;

public class Sales {

private int attraction;
private String date;
private String clientType;


    public Sales(int attraction, String date, String clientType) {
        this.attraction = attraction;
        this.date = date;
        this.clientType = clientType;
    }


    public int getAttraction() {
        return attraction;
    }

    public void setAttraction(int attraction) {
        this.attraction = attraction;
    }

    public String getDate() {
        return date;
    }

}
