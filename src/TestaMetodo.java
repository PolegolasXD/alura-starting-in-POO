public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaA = new Conta();
        contaA.saldo = 100;
        contaA.deposita(50);
        System.out.println(contaA.saldo);

        boolean conseguiuRetirar = contaA.saca(20);
        System.out.println(contaA.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaB = new Conta();
        contaB.deposita(1000);

        boolean sucessoTransferencia =  contaB.transfere(3000, contaA);

       if(sucessoTransferencia){
           System.out.println("Transferencia feita com sucesso");
       }else {
           System.out.println("faltou dinheiro");
       }
    }
}
