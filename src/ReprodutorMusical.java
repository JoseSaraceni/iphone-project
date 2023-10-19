public class ReprodutorMusical {
    boolean tocar;
    boolean pausar;
    String musica;


    public void tocarMusica(){
        tocar = true;

        System.out.println("TOCANDO...");
    }

    public void pausarMusica(){
        tocar = false;

        System.out.println("PAUSANDO...");
    }

    public void adicionarMusica(String musica){
        System.out.println("Musica " + musica + " adicionada.");
    }

    public void selecionarMusica(String musica){
        if(tocar == false){
            System.out.println("Musica está pausada, não é possivel selecionar");
        }
        else{
            System.out.println("Tocando: " + musica );
        }
    }

}
