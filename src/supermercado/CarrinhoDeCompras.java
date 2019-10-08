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
        double total = 0;
        for (int index = 0; index < this.produtos.size(); index++){
            total += this.produtos.get(index).getPreco()
                     * this.totalProdutos.get(index).intValue();
        }
        this.valorTotal = total;
        return valorTotal;
    }

    public ArrayList<Integer> getTotalProdutos() {
        return totalProdutos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void addProduto(Produto prod, int quantidade) {
        this.produtos.add(prod);
        this.totalProdutos.add(quantidade);
    }
    
    public void removerProduto(String nomeProd) {
        for (int index = 0; index < this.produtos.size(); index++){
            Produto produtoBuscado = this.produtos.get(index);
            if (produtoBuscado.getNome().equals(nomeProd)) {
                this.produtos.remove(index);
                this.totalProdutos.remove(index);
                break;
            }
        }
    }

}
