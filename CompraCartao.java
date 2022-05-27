public abstract class CompraCartao extends Compra{
    String nomeBanco;
    String conta;

    public CompraCartao(int data, String idCompra, float valor, Conta conta){
        super(data, idCompra, valor);
        this.nomeBanco = conta.nomeBanco;
        
    }
}