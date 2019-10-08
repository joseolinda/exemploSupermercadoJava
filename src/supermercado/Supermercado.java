package supermercado;

import java.util.ArrayList;
import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        // Cadastro de produtos
        ArrayList<Produto> produtos = cadastrarProdutos();
    }
    
    public static ArrayList<Produto> cadastrarProdutos() {
       ArrayList listaDeProdutos = new ArrayList<Produto>(); 
       System.out.println("### TELA DE CADASTRO DE PRODUTOS ###");
       Scanner entrada = new Scanner(System.in);
       boolean parar = false;
       while (!parar) {
        Produto novoP = new Produto();
        
        System.out.println("Nome do produto:");
        novoP.setNome(entrada.nextLine());
        
        System.out.println("Marca do produto:");
        novoP.setMarca(entrada.nextLine());
        
        System.out.println("Preço do produto:");
        novoP.setPreco(entrada.nextDouble());
        
        listaDeProdutos.add(novoP);
        System.out.println("Produto cadastrado.\n\n\n");
        System.out.println("Adicionar novo? [s/n]: ");
        if (entrada.nextLine().equals("n") ) {
            parar = true;
        }
       }
       
       return listaDeProdutos;
    }
    
}
