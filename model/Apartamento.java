public class Apartamento extends Imovel {

    private int floor;
    private int number;
    private double monthlyCondominiumCost;
    private double reserveFundCost;
    private double investment;

    public Apartamento(int code) {
        super(code);
    }

    public Apartamento(int code, String address, Double rentalValue, int parkingSpaces, int bedrooms, int bathrooms,
            Proprietario proprietario) {
        super(code, address, rentalValue, parkingSpaces, bedrooms, bathrooms, proprietario);
    }

    public Apartamento(int code, String address, Double rentalValue, int parkingSpaces, int bedrooms, int bathrooms,
            int floor, int number, double monthlyCondominiumCost, double reserveFundCost, double investment,
            Proprietario proprietario) {
        super(code, address, rentalValue, parkingSpaces, bedrooms, bathrooms, proprietario);
        this.floor = floor;
        this.number = number;
        this.monthlyCondominiumCost = monthlyCondominiumCost;
        this.reserveFundCost = reserveFundCost;
        this.investment = investment;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getMonthlyCondominiumCost() {
        return monthlyCondominiumCost;
    }

    public void setMonthlyCondominiumCost(double monthlyCondominiumCost) {
        this.monthlyCondominiumCost = monthlyCondominiumCost;
    }

    public double getReserveFundCost() {
        return reserveFundCost;
    }

    public void setReserveFundCost(double reserveFundCost) {
        this.reserveFundCost = reserveFundCost;
    }

    public double getInvestment() {
        return investment;
    }

    public void setInvestment(double investment) {
        this.investment = investment;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Apartamento" + super.toString() + " [floor=" + floor + ", number=" + number
                + ", monthlyCondominiumCost="
                + monthlyCondominiumCost + ", reserveFundCost=" + reserveFundCost + ", investment=" + investment + "]";
    }

    @Override
    public double calculateRent() {
        return (super.getRentalValue() + monthlyCondominiumCost) - (reserveFundCost + investment);
    }

}
