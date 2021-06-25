package entidades;

import java.util.ArrayList;
import java.util.List;

public class PedidoItem {

	private int quantidade;
	private double preco;
	private Produto produto;

	public PedidoItem(double quantidade_Produto, Produto produto2) {
	}

	public PedidoItem(int quantidade, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public PedidoItem(int quantidade, double preco, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public double subtotal() {

		return preco * quantidade;
	}

}
