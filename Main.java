import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Server server = new Server();
	    Scanner s = new Scanner(System.in);
	    String indirizzo;
	    String nPorta;
	    int temp;
	     
	    System.out.printf("Inserisci indirizzo IP per il primo client\n");
	    indirizzo = s.nextLine();
	    System.out.printf("Inserisci numero di porta per il primo client\n");
	    nPorta = s.nextLine();
	    Client client1 = new Client(indirizzo,nPorta);
	    client1.Connect();
	    server.accept();
	    client1.ack();
	    
	    System.out.printf("------------------------------------------------\n");
	    System.out.printf("Inserisci indirizzo IP per il secondo client\n");
	    indirizzo = s.nextLine();
	    System.out.printf("Inserisci numero di porta per il secondo client \n");
	    nPorta = s.nextLine();
	    Client client2 = new Client(indirizzo,nPorta);
        client2.Connect();
	    server.accept();
	    client2.ack();
	    
	    System.out.printf("------------------------------------------------\n");
	    System.out.printf("Inserisci indirizzo IP per il terzo client\n");
	    indirizzo = s.nextLine();
	    System.out.printf("Inserisci numero di porta per il terzo client\n");
	    nPorta = s.nextLine();
	    Client client3 = new Client(indirizzo,nPorta);
	    client3.Connect();
	    server.accept();
	    client3.ack();
	    
	    System.out.printf("\n--Trasmissione Client 1--\n");
	    do{
	        temp = client1.write();
	        server.receive();
	    }while(temp == 1);
	    client1.CloseC();
	    server.closeS();
	    
	    System.out.printf("\n--Trasmissione Client 2--\n");
	    do{
	        temp = client2.write();
	        server.receive();
	    }while(temp == 1);
	    client2.CloseC();
	    server.closeS();
	    
	    System.out.printf("\n--Trasmissione Client 3--\n");
	    do{
	        temp = client3.write();
	        server.receive();
	    }while(temp == 1);
	    client3.CloseC();
	    server.closeS();
		
	}

}
