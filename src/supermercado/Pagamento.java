package supermercado;

public class Pagamento {
    private CarrinhoDeCompras carrinho;
    private double valorAPagar = 0;
    private String tipoDePagamento = "dinheiro";
    private double troco;

    public Pagamento(CarrinhoDeCompras carrinho) {
        this.carrinho = carrinho;
    }

    public String getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(String tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double totalPago) {
        this.troco = this.valorAPagar - totalPago;
    }

    public double getValorAPagar() {
        this.valorAPagar = this.carrinho.getValorTotal();
        return this.valorAPagar;
    }
    
    public boolean realizarPagamento(String tipoPagamento,
                                  double valorPago ) {
        if( valorPago >= this.valorAPagar ) {
            this.setTroco(valorPago);
            System.out.println("Pagamento realizado com sucesso.\n");
            System.out.println("Troco R$ " + this.getTroco());
            return true;
        } else {
            System.err.println("Valor insuficiente");
            return false;
        }
    }
    
    
}
