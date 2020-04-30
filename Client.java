import java.util.Scanner;

class Client {
    private String indirizzo;
    private String nPorta;
    Scanner s = new Scanner(System.in);
    public Client(String indirizzo,String nPorta){
        System.out.printf("Creazione socket client in corso... indirizzo = %s, porta = %s\n",indirizzo,nPorta);
        this.indirizzo = indirizzo;
        this.nPorta = nPorta;
    }
    
    public void Connect(){
        Server tmp = new Server(); 
        System.out.printf("SYN = 1 : ACK = 0 Connessione al server con indirizzo = %s e numero di porta = %s\n",tmp.getIndirizzo(),tmp.getnPorta());
    }
    
    public void ack(){
        System.out.printf("ACK = 1 : Conclusione handshake,pronto per comunicare\n");
    }
    
   public int write(){
    String tmp;
    System.out.printf("Client,scrivi il messaggio di richiesta\n");
    tmp = s.nextLine();
    if (tmp.equals("quit")){
        
        return 0;
    }else{
        
        return 1;
    }
    }
    
    public void CloseC(){
        System.out.printf("Client : richiesta chiusura di connessione, invio FIN =1\n ");
    }
}