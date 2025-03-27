package more_repetition.investing;

import java.util.ArrayList;

public class Platform {
    public static void main(String[] args) {
        Platform platform = new Platform();
        ArrayList<Investor> investorList = new ArrayList<>();

        Investor Frodo = new Investor("Frodo");
        Frodo.setId(0);
        Frodo.setNumberOfStocks(10);
        Frodo.setTotalNetWorth(2000000);
        investorList.add(Frodo);

        Investor Samwise = new Investor("Samwise");
        Samwise.setId(1);
        Samwise.setNumberOfStocks(1);
        Samwise.setTotalNetWorth(50000);
        investorList.add(Samwise);

        System.out.println(platform.getTotalNumberOfStocks(Frodo, Samwise));

        System.out.println(Frodo.toString());
        System.out.println(investorList);
    }
    public int getTotalNumberOfStocks(Investor nameOne, Investor nameTwo){
        return nameOne.getNumberOfStocks()+nameTwo.getNumberOfStocks();
    }
}
