public class Conta {
    float saldo;
    String nomeBanco;
    float limite;
    float limiteDisponivel;
    int diaFatura;
    float taxaMensal;

    Conta(float saldo, String nomeBanco, float limite){
        float getTaxaMensal();
        void setTaxaMensal(float taxaMensal);
        float getLimiteDisponivel();
        void setLimiteDisponivel(float limiteDisponivel);
        int getDiaFatura(int diaFatura);
        float getSaldo();
        float getLimite();
        void setLimite(float limite);
        String getNomeBanco();
        void setNomeBanco(String nomeBanco);
        void setSaldo(float saldo);
        string toString();
    }
}