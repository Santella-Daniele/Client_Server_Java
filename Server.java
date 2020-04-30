class Server {
    private String indirizzo;
    private String nPorta;
    

    public Server(){
        this.indirizzo = "12.0.45.22";
        this.nPorta = "10000";
    }
    
    public String getIndirizzo(){
        return this.indirizzo;
    }
    
    public String getnPorta(){
        return this.nPorta;
    }
    
    public void accept(){
        System.out.printf("SYN = 1 : ACK = 1 Richiesta accettata\n");
    }
    
    public void receive(){
        System.out.printf("Messaggio ricevuto\n");
    }
    
    public void closeS(){
        System.out.printf("Server : richiesta di chiusura ricevuta ,inoltro ACK =1\n ");
    }
    
    
    
}