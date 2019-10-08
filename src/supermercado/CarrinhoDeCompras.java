package supermercado;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    private int codigo;
    private ArrayList<Produto> produtos;
    private double valorTotal = 0.0;
    private ArrayList<Integer> totalProdutos;

    public int getCodigo() {
        return codigo;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public ArrayList<Integer> getTotalProdutos() {
        return totalProdutos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void addProduto(Produto prod) {
        this.produtos.add(prod);
    }

}
