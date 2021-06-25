package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Pedido;
import entidades.PedidoItem;
import entidades.Produto;
import entidadesEnum.Status;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		List<PedidoItem> pedidos = new ArrayList<>();
		List<Produto> produtos = new ArrayList<>();

		System.out.println("Programa para registrar pedidos de produtos");
		System.out.println("Dados do pedido: ");
		System.out.print("Nome do cliente: ");
		String nome = sc.nextLine();
		System.out.print("email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento dd/MM/yyyy : ");
		String data_nascimento = sc.nextLine();
		Date data = sdf2.parse(data_nascimento);

		Cliente cliente = new Cliente(nome, email, data);

		Date momento = new Date();

		System.out.print("Status do pedido: ");
		String Status_pedido = sc.nextLine();
		Status status = Status.valueOf(Status_pedido);

		Pedido pedido = new Pedido(momento, status, cliente);

		System.out.print("Quantidade de itens do pedido: ");
		double quantidade = sc.nextDouble();

		for (int i = 0; i < quantidade; i++) {
			System.out.println("Digite os dados do Pedido " + (i + 1) + ": ");
			System.out.print("Nome do produto: ");
			String nome_Produto = sc.nextLine();
			System.out.print("Preço: ");
			double preco_Produto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade_Produto = sc.nextInt();
			sc.nextLine();

			Produto produto = new Produto(nome_Produto, preco_Produto);
			produtos.add(produto);

			PedidoItem pedido_Item = new PedidoItem(quantidade_Produto, produto);
			pedidos.add(pedido_Item);
		}

		System.out.println("Dados do pedido");
		System.out.println(pedido);

		sc.close();
	}

}
