package org.example;

import jakarta.jws.*;


import java.util.Date;
import java.util.List;

@WebService( serviceName = "BanqueWS")

public class BanqueService {
    @WebMethod(operationName= "Convert")
    public double conversion(@WebParam(name="montant") double mt){
        return  mt*11;
    }

    @WebMethod(operationName= "Voir_compte")
    public Compte getCompte(@WebParam(name="code")int code){
        return  new Compte(code, Math.random()*34345, new Date());
    }
    @WebMethod(operationName= "Liste_des_comptes")
    public List<Compte> listeComptes(){
        return  List.of(
                new Compte(1, Math.random()*34345, new Date()),
                new Compte(2, Math.random()*34345, new Date()),
                new Compte(3, Math.random()*34345, new Date())
        );
    }
}
