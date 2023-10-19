public class Navegador {
    int aba = 0;

    public void exibirPagina(int aba){
        System.out.println("Exibindo pagina " + aba);
    }

    public void adicionarAba(){
        aba++;
        System.out.println("Nova aba adicionada, Temos " + aba + " abas abertas.");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando ... ... ... ");
    }
}
