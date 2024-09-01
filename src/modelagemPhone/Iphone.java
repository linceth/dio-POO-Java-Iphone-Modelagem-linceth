package modelagemPhone;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	private String nomeAparelho;
	private int preco;
	private String email;
	private boolean touchScreem;
	private boolean sensorProximidade;
	private boolean sensorLuminosidade;
	private boolean acelerometro;
	
	
	
	public Iphone(String nomeAparelho, int preco, String email) {
		super();
		this.nomeAparelho = nomeAparelho;
		this.preco = preco;
		this.email = email;
	}

	public String getNomeAparelho() {
		return nomeAparelho;
	}

	public void setNomeAparelho(String nomeAparelho) {
		this.nomeAparelho = nomeAparelho;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isTouchScreem() {
		return touchScreem;
	}

	public void setTouchScreem(boolean touchScreem) {
		this.touchScreem = touchScreem;
	}

	public boolean isSensorProximidade() {
		return sensorProximidade;
	}

	public void setSensorProximidade(boolean sensorProximidade) {
		this.sensorProximidade = sensorProximidade;
	}

	public boolean isSensorLuminosidade() {
		return sensorLuminosidade;
	}

	public void setSensorLuminosidade(boolean sensorLuminosidade) {
		this.sensorLuminosidade = sensorLuminosidade;
	}

	public boolean isAcelerometro() {
		return acelerometro;
	}

	public void setAcelerometro(boolean acelerometro) {
		this.acelerometro = acelerometro;
	}

	@Override
	public void tocar() {
		System.out.println("Estou tocando");
		
	}

	@Override
	public void pausar() {
		System.out.println("A música foi pausada");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("A música " + musica + " foi selecionada");
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("A página " + url + " está sendo exibida");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Uma nova aba foi criada");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("A página foi atualizada");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("O número " + numero + " está chamando");
		
	}

	@Override
	public void atender() {
		System.out.println("A chamada foi atendida");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Um correio de voz foi inciado");
		
	}

}
