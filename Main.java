public class Main {

    public static void main(String[] args) {
        System.out.println("\n ------ GESTÃO IMOBILIARIA ------ ");

        Proprietario proprietario = new Proprietario("Sidney", "09345687612", "12456-6", "012");
        Imovel imovel = new Casa(1234, "Aveiro 314", 780.00, 2, 3, 2, 1, proprietario);
        Corretor corretor = new Corretor("Pedro", "98798645351", "123456", "12/06/2020");
        Locatario locatario = new Locatario("José", "87690053633", "jose@gmail.com", 5678.4);
        Locacao locacao = new Locacao("20/11/2023", 20, 25, locatario, corretor, imovel);

        locacao.sendBill();
        locacao.payOwner();
        corretor.withdrawValue(200);
    }
}