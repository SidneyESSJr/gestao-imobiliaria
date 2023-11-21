import java.util.ArrayList;
import java.util.List;

public class Locatario extends Pessoa {

    private String email;
    private double salary;
    private List<Locacao> locacoes = new ArrayList<>();

    public Locatario(String name, String document) {
        super(name, document);
    }

    public Locatario(String name, String document, String email, double salary) {
        super(name, document);
        this.email = email;
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Locatario " + super.toString() + " [email=" + email + ", salary=" + salary + "]";
    }

}
