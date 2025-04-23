import java.time.LocalDate;

public class Fatura {
    private Long id;
    private Conta conta;
    private double valor;
    private LocalDate dataVencimento;
    private StatusFatura status;

    public void marcarComoPaga() {
        this.status = StatusFatura.PAGA;
    }
}