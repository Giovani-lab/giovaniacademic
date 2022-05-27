public abstract class CompraCartaoCredito extends CompraCartao{
    int diaFatura;

    CompraCartaoCredito(int data, String idCompra, float valor, Conta conta){
        super(data, idCompra, valor, conta);
        this.conta = conta.getdiaFatura();
    }
}