public class TestaBanco {
    public static void main(String[] args) {
        Cliente fabio = new Cliente();
        fabio.nome = "Fabio Higor";
        fabio.cpf = "222.222.222.22";
        fabio.profissao = "Programador";

        Conta contaDoFabio = new Conta();
        contaDoFabio.deposita(100);

        contaDoFabio.titular = fabio;
        System.out.println(contaDoFabio.titular.nome);
        System.out.println(contaDoFabio.titular);

    }
}
