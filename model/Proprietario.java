public class Proprietario extends Pessoa {

    private String account;
    private String agency;

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

    public String toString() {
        return "Proprietario " + super.toString() + "[account=" + account + ", agency=" + agency + "]";
    }

}
