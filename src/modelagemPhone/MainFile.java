package modelagemPhone;

public class MainFile {

	public static void main(String[] args) {
		Iphone phoneOne = new Iphone("IphoneThiago", 499, "thpc14@outlook.com");
		
		System.out.println("Reprodutor Musical:");
		phoneOne.tocar();
		phoneOne.pausar();
		phoneOne.selecionarMusica("A viagem");
		System.out.println();
		System.out.println("Aparelho Telefônico: ");
		phoneOne.ligar("8876544");
		phoneOne.atender();
		phoneOne.iniciarCorreioVoz();
		System.out.println();
		System.out.println("Navegador da Internet: ");
		phoneOne.exibirPagina("www.globo.com");
		phoneOne.adicionarNovaAba();
		phoneOne.atualizarPagina();
		

	}

}
