/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans_package;

import java.util.Date;
import javax.ejb.Stateless;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import modelo.Peliculas;

/**
 *
 * @author Administrador
 */
@Stateless
public class beans {
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
 @PersistenceUnit
EntityManagerFactory emf;
public List findAll(){
 return
emf.createEntityManager().createNamedQuery ("Peliculas.findAll").getResultList();
}
public void addPelicula(String Titulo, Date Fecha, Double Presupuesto){
     Peliculas pelicula = new Peliculas();
     pelicula.setTitulo(Titulo);
     pelicula.setFecha(Fecha);
     pelicula.setPresupuesto(Presupuesto);
}
}

