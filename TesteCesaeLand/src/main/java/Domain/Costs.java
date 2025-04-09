package Domain;

public class Costs {

private int attraction;
private double maintenanceCostPerTicket;
private double fixedCostPerMonth;


    public Costs(int attraction, double maintenanceCostPerTicket, double fixedCostPerMonth) {
        this.attraction = attraction;
        this.maintenanceCostPerTicket = maintenanceCostPerTicket;
        this.fixedCostPerMonth = fixedCostPerMonth;
    }


    public int getAttraction() {
        return attraction;
    }

    public void setAttraction(int attraction) {
        this.attraction = attraction;
    }

    public double getMaintenanceCostPerTicket() {
        return maintenanceCostPerTicket;
    }

}
