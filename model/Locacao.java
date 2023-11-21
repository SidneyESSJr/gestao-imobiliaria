import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Locacao {

    private LocalDate startDate;
    private LocalDate endDate;
    private int dateOfPayment;
    private int commissionPercentage;
    private Locatario locatario;
    private Corretor corretor;
    private Imovel imovel;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Locacao(Locatario locatario, Corretor corretor, Imovel imovel) {
        this.locatario = locatario;
        this.corretor = corretor;
        this.imovel = imovel;
        locatario.addLocacao(this);
        corretor.addLocacao(this);
        imovel.addLocacao(this);
    }

    public Locacao(String startDate, int dateOfPayment, int commissionPercentage, Locatario locatario,
            Corretor corretor, Imovel imovel) {
        this.startDate = LocalDate.parse(startDate, formatter);
        this.dateOfPayment = dateOfPayment;
        this.commissionPercentage = commissionPercentage;
        this.locatario = locatario;
        this.corretor = corretor;
        this.imovel = imovel;
        locatario.addLocacao(this);
        corretor.addLocacao(this);
        imovel.addLocacao(this);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = LocalDate.parse(startDate, formatter);
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = LocalDate.parse(endDate, formatter);
    }

    public int getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(int dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
        locatario.addLocacao(this);
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
        corretor.addLocacao(this);
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
        imovel.addLocacao(this);
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(int commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public void sendBill() {
        System.out.println("\nPrezado! " + locatario.getEmail() + "\nO valor referente ao seu aluguel neste mês foi de: R$ "
                + imovel.calculateRent());
    }

    public void payOwner() {
        double commission = imovel.calculateRent() * commissionPercentage / 100;
        this.imovel.getProprietario().receive(imovel.calculateRent() - commission);
        this.corretor.receive(commission);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
        result = prime * result + ((imovel == null) ? 0 : imovel.hashCode());
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
        Locacao other = (Locacao) obj;
        if (startDate == null) {
            if (other.startDate != null)
                return false;
        } else if (!startDate.equals(other.startDate))
            return false;
        if (imovel == null) {
            if (other.imovel != null)
                return false;
        } else if (!imovel.equals(other.imovel))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Locacao [startDate=" + formatter.format(startDate) + ", endDate=" + formatter.format(endDate)
                + ", dateOfPayment=" + dateOfPayment
                + ", locatario=" + locatario + ", corretor=" + corretor + ", imovel=" + imovel + "]";
    }

}
