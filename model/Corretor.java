import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import interfaces.ReceberValor;

public class Corretor extends Pessoa implements ReceberValor {

    private String registry;
    private LocalDate admissionDate;
    private double commission;
    private double totalAccumulatedCommission;
    private List<Locacao> locacoes = new ArrayList<>();

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Corretor(String name, String document) {
        super(name, document);
    }

    public Corretor(String name, String document, String registry, String admissionDate) {
        super(name, document);
        this.registry = registry;
        this.admissionDate = LocalDate.parse(admissionDate, formatter);
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = LocalDate.parse(admissionDate, formatter);
    }

    public double getCommission() {
        return commission;
    }

    public double getTotalAccumulatedCommission() {
        return totalAccumulatedCommission;
    }

    public void addLocacao(Locacao locacao) {
        this.locacoes.add(locacao);
    }

    public List<Locacao> list() {
        return locacoes;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void withdrawValue(double value) {
        try {
            if (value > 0 && value < totalAccumulatedCommission) {
                this.totalAccumulatedCommission -= value;
                System.out.println("\nO corretor " + super.getName() + " sacou o valor de R$ " + value);
            } else if (value > totalAccumulatedCommission) {
                System.out.println("\nVocê não possui esse valor diponível para saque");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void receive(double value) {
        try {
            if (value > 0) {
                this.commission += value;
                this.totalAccumulatedCommission += value;
                System.out.println("\nO  corretor " + super.getName() + " está recebendo o valor de: R$ " + value
                        + "\nValor total da comissão acumulada: R$ " + totalAccumulatedCommission);
            } else {
                System.out.println("Não são aceitos valores negativos!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Corretor " + super.toString() + "[registry=" + registry + ", admissionDate="
                + formatter.format(admissionDate)
                + ", commission=" + commission
                + ", totalAccumulatedCommission=" + totalAccumulatedCommission + "]";
    }

}
