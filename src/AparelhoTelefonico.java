public class AparelhoTelefonico {

    boolean atender = false;

    public void atender(){
        atender = true;
        
        System.out.println("Atendendo ligação...");
    }


    public void ligar(){
        System.out.println("Ligando para contato...");
    }

    public void iniciarCorreioVoz(){
        if (atender == false){
            System.out.println("Sua chamada está sendo encaminhada para a caixa de mensagem.");
        }
    }

}

