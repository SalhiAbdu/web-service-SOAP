import jakarta.xml.ws.Endpoint;
import org.example.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish( "http://localhost:5599/", new BanqueService());
        System.out.println("Web service deployé sur l'addresse 0.0.0.0");

    }
}
