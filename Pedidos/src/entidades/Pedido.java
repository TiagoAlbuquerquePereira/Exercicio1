package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidadesEnum.Status;

public class Pedido {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momento;
	private Status status;
	private Cliente cliente;
	private String formato = sdf.format(momento);

	private List<PedidoItem> itens = new ArrayList<>();

	public Pedido(Date momento, Status status, Cliente cliente) {
		super();
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Pedido(Status status, Cliente cliente, String formato) {
		super();
		this.status = status;
		this.cliente = cliente;
		this.formato = formato;
	}

	public Date getMomento() {
		return momento;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<PedidoItem> getItens() {
		return itens;
	}

	public void addPedido(PedidoItem p) {
		itens.add(p);
	}

	public void removerProduto(PedidoItem p) {
		itens.remove(p);
	}

	public double total() {
		double soma = 0;

		for (PedidoItem item : itens) {

			soma += item.subtotal();
		}

		return soma;
	}

	@Override
	public String toString() {
		return "Pedido [status=" + status + ", cliente=" + cliente + ", formato=" + formato + ", itens=" + itens + "]";
	}
	
	

}
