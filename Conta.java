public class Conta {
    private Long id;
    private Cliente cliente;
    private double saldo;

    public void creditar(double valor) {
        saldo += valor;
    }

    public boolean debitar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}