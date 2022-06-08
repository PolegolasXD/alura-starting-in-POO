public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.deposita(300);
        System.out.println("Saldo da primeira conta " + primeiraConta.pegaSaldo());

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta " + segundaConta.pegaSaldo());

        segundaConta.deposita(100);
        System.out.println("Saldo da segunda conta " + segundaConta.pegaSaldo());
        System.out.println("Saldo da primeira conta " + primeiraConta.pegaSaldo());

        if(primeiraConta == segundaConta){
            System.out.println("\nSão as mesmas coisas");
        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }

}
