public abstract class Pessoa {

    private String name;
    private String phone;
    private String address;
    private String document;

    public Pessoa(String name) {
        this.name = name;
    }

    public Pessoa(String name, String document) {
        this.name = name;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "Pessoa [name=" + name + ", phone=" + phone + ", address=" + address + ", document=" + document + "]";
    }

}