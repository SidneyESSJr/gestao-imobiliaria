public class Casa extends Imovel {

    private int numberOfFloors;

    public Casa(int code) {
        super(code);
    }

    public Casa(int code, String address, Double rentalValue, int parkingSpaces, int bedrooms, int bathrooms,
            int numberOfFloors, Proprietario proprietario) {
        super(code, address, rentalValue, parkingSpaces, bedrooms, bathrooms, proprietario);
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public double calculateRent() {
        return super.getRentalValue();
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
        return "Casa" + super.toString() + "[numberOfFloors=" + numberOfFloors + "]";
    }

}
