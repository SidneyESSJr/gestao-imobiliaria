import java.util.ArrayList;
import java.util.List;

import interfaces.ReceberValor;

public class Proprietario extends Pessoa implements ReceberValor {

    private String account;
    private String agency;
    private List<Imovel> imoveis = new ArrayList<>();

    public Proprietario(String name) {
        super(name);
    }

    public Proprietario(String name, String document) {
        super(name, document);
    }

    public Proprietario(String name, String document, String account, String agency) {
        super(name, document);
        this.account = account;
        this.agency = agency;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public void addImovel(Imovel imovel) {
        this.imoveis.add(imovel);
    }

    public List<Imovel> list() {
        return imoveis;
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
    public void receive(double value) {
        try {
            if (value > 0) {
                System.out.println("\nO proprietário " + super.getName() + " está recebendo o valor de: R$ " + value);
            } else {
                System.out.println("\nNão são aceitos valores negativos!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String toString() {
        return "Proprietario " + super.toString() + "[account=" + account + ", agency=" + agency + "]";
    }

}
