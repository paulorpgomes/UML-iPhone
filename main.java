
public class main {

	// Interfaces
	interface ReprodutorMusical {
	    void tocar();
	    void pausar();
	    void selecionarMusica();
	}

	interface AparelhoTelefonico {
	    void ligar();
	    void atender();
	    void iniciarCorreioVoz();
	}

	interface NavegadorInternet {
	    void exibirPagina();
	    void adicionarNovaAba();
	    void atualizarPagina();
	}

	// Classe iPhone que implementa as interfaces
	class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	    // Implementação dos métodos das interfaces
	    public void tocar() {
	        // Implementação
	    }

	    public void pausar() {
	        // Implementação
	    }

	    public void selecionarMusica() {
	        // Implementação
	    }

	    public void ligar() {
	        // Implementação
	    }

	    public void atender() {
	        // Implementação
	    }

	    public void iniciarCorreioVoz() {
	        // Implementação
	    }

	    public void exibirPagina() {
	        // Implementação
	    }

	    public void adicionarNovaAba() {
	        // Implementação
	    }

	    public void atualizarPagina() {
	        // Implementação
	    }
	}

	
}
