public class validacao import java.time.YearMonth;

// Interface para definir o contrato das estratégias de pagamento
interface EstrategiaPagamento {
    boolean processarPagamento(double valor);
}

// Implementação da estratégia de pagamento via Cielo com Cartão de Crédito
class PagamentoCieloCartaoCredito implements EstrategiaPagamento {
    private String numeroCartao;
    private String cpfCliente;
    private String cvv;
    private YearMonth dataValidade;

    public PagamentoCieloCartaoCredito(String numeroCartao, String cpfCliente, String cvv, YearMonth dataValidade) {
        this.numeroCartao = numeroCartao;
        this.cpfCliente = cpfCliente;
        this.cvv = cvv;
        this.dataValidade = dataValidade;
    }

    private boolean validarNumeroCartao() {
        // Implemente a lógica de validação do número do cartão de crédito aqui
        // Retorne true se for válido, false caso contrário
    }

    private boolean validarCPFCliente() {
        // Implemente a lógica de validação do CPF do cliente aqui
        // Retorne true se for válido, false caso contrário
    }

    private boolean validarCVV() {
        // Implemente a lógica de validação do CVV aqui
        // Retorne true se for válido, false caso contrário
    }

    private boolean validarDataValidade() {
        // Implemente a lógica de validação da data de validade aqui
        // Retorne true se for válida, false caso contrário
    }

    @Override
    public boolean processarPagamento(double valor) {
        // Realize as validações antes de processar o pagamento
        if (!validarNumeroCartao() || !validarCPFCliente() || !validarCVV() || !validarDataValidade()) {
            System.out.println("Pagamento não autorizado devido a problemas de validação.");
            return false;
        }

        // Implemente a lógica de processamento do pagamento via Cielo com Cartão de Crédito aqui
        // Retorne true se o pagamento for bem-sucedido, false caso contrário

        System.out.println("Pagamento via Cielo com Cartão de Crédito no valor de R$" + valor + " processado com sucesso.");
        return true;
    }
}

// Implementação da estratégia de pagamento via Cielo com Cartão de Débito
class PagamentoCieloCartaoDebito implements EstrategiaPagamento {
    private String numeroCartao;

    public PagamentoCieloCartaoDebito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    private boolean validarNumeroCartao() {
        // Implemente a lógica de validação do número do cartão de débito aqui
        // Retorne true se for válido, false caso contrário
    }

    @Override
    public boolean processarPagamento(double valor) {
        // Realize a validação antes de processar o pagamento
        if (!validarNumeroCartao()) {
            System.out.println("Pagamento não autorizado devido a problemas de validação.");
            return false;
        }

        // Implemente a lógica de processamento do pagamento via Cielo com Cartão de Débito aqui
        // Retorne true se o pagamento for bem-sucedido, false caso contrário

        System.out.println("Pagamento via Cielo com Cartão de Débito no valor de R$" + valor + " processado com sucesso.");
        return true;
    }
}

public class Principal {
    public static void main(String[] args) {
        // Exemplo de pagamento via Cielo com Cartão de Crédito
        String numeroCartaoCredito = "1234567890123456";
        String cpfCliente = "123.456.789-09";
        String cvv = "123";
        YearMonth dataValidade = YearMonth.of(2024, 12);
        double valorPagamento = 100.0;

        EstrategiaPagamento pagamentoCredito = new PagamentoCieloCartaoCredito(numeroCartaoCredito, cpfCliente, cvv, dataValidade);
        pagamentoCredito.processarPagamento(valorPagamento);

        // Exemplo de pagamento via Cielo com Cartão de Débito
        String numeroCartaoDebito = "9876543210987654";
        double valorPagamentoDebito = 50.0;

        EstrategiaPagamento pagamentoDebito = new PagamentoCieloCartaoDebito(numeroCartaoDebito);
        pagamentoDebito.processarPagamento(valorPagamentoDebito);
    }
}
{
}
