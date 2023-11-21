import java.util.ArrayList;
import java.util.List;

public abstract class Imovel {

    private int code;
    private String address;
    private Double rentalValue;
    private int parkingSpaces;
    private int bedrooms;
    private int bathrooms;
    private Proprietario proprietario;
    private List<Locacao> locacoes = new ArrayList<>();

    public Imovel(int code) {

    }

    public Imovel(int code, String address, Double rentalValue, int parkingSpaces, int bedrooms, int bathrooms,
            Proprietario proprietario) {
        this.code = code;
        this.address = address;
        this.rentalValue = rentalValue;
        this.parkingSpaces = parkingSpaces;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        setProprietario(proprietario);
        proprietario.addImovel(this);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getRentalValue() {
        return rentalValue;
    }

    public void setRentalValue(Double rentalValue) {
        this.rentalValue = rentalValue;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public abstract double calculateRent();

    public void addLocacao(Locacao locacao) {
        this.locacoes.add(locacao);
    }

    public List<Locacao> list() {
        return locacoes;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
        proprietario.addImovel(this);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + code;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Imovel other = (Imovel) obj;
        if (code != other.code)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Imovel [code=" + code + ", address=" + address + ", rentalValue=" + rentalValue + ", parkingSpaces="
                + parkingSpaces + ", bedrooms=" + bedrooms + ", bathrooms=" + bathrooms + "]";
    }

}