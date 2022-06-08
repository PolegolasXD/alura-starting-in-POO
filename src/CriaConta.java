public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.pegaSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.pegaSaldo());


        Conta segundaConta = new Conta();
        segundaConta.deposita(300);
        System.out.println("Primeira conta tem " + primeiraConta.pegaSaldo());
        System.out.println("segunda conta tem " + segundaConta.pegaSaldo());

        primeiraConta.agencia = 01;
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        segundaConta.agencia = 02;
        System.out.println(segundaConta.agencia);
        System.out.println(segundaConta.numero);

        if(primeiraConta == segundaConta){
            System.out.println("Mesma coisa");
        }else{
            System.out.println("São diferentes\n");
        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
