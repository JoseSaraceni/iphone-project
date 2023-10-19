public class Iphone  {
    public static void main(String[] args) {
        
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        Navegador chrome = new Navegador();
        ReprodutorMusical spotify = new ReprodutorMusical(); 
        

        System.out.println("Telefone \n");
        telefone.iniciarCorreioVoz();
        telefone.ligar();
        telefone.atender();

        System.out.println("==============================================================================================");

        System.out.println("Navegador \n");
        chrome.adicionarAba();
        chrome.adicionarAba();
        chrome.exibirPagina(1);
        chrome.atualizarPagina();

        System.out.println("==============================================================================================");

        System.out.println("Spotify \n");
        spotify.tocarMusica();
        spotify.adicionarMusica("Cowboy fora da Lei");
        spotify.adicionarMusica("Gita");
        spotify.adicionarMusica("Ouro de tolo");
        spotify.pausarMusica();
        spotify.selecionarMusica("Gita");



    }
}


