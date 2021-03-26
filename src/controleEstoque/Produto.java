package controleEstoque;

public class Produto {
	
	public String nome; 
	public  int qnt; 
	public  float preco; 
	public  int custoTotal; 
	
	public Produto() {
	}

	public Produto(String nome, int qnt, float preco, int custoTotal) {
		super();
		this.nome = nome;
		this.qnt = qnt;
		this.preco = preco;
		this.custoTotal = custoTotal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getCustoTotal() {
		return custoTotal;
	}

	public void setCustoTotal(int custoTotal) {
		this.custoTotal = custoTotal;
	}

}