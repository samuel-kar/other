package more_repetition.investing;

public class Investor {
    private String name;
    private int id;
    private int numberOfStocks;
    private double totalNetWorth;

    public Investor() {

    }
    public Investor(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Investor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", numberOfStocks=" + numberOfStocks +
                ", totalNetWorth=" + totalNetWorth +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfStocks() {
        return numberOfStocks;
    }

    public void setNumberOfStocks(int numberOfStocks) {
        this.numberOfStocks = numberOfStocks;
    }

    public double getTotalNetWorth() {
        return totalNetWorth;
    }

    public void setTotalNetWorth(double totalNetWorth) {
        this.totalNetWorth = totalNetWorth;
    }
}
