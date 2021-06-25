package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private String nome;
	private String email;
	private Date data_Nascimento;

	public Cliente() {

	}

	public Cliente(String nome, String email, Date data_Nascimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.data_Nascimento = data_Nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getData_Nascimento() {
		return data_Nascimento;
	}

	public void setData_Nascimento(Date data_Nascimento) {
		this.data_Nascimento = data_Nascimento;
	}

}
