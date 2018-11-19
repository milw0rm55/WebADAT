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
import static modelo.Peliculas_.titulo;

/**
 *
 * @author Administrador
 */
@Stateless
public class Beans {
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
 @PersistenceUnit
EntityManagerFactory emf;
public List findAll(){
 return
emf.createEntityManager().createNamedQuery ("Peliculas.findAll").getResultList();
}
public void addPelicula(Peliculas pelicula){
     emf.createEntityManager().persist(pelicula);
    
    }
public List SearchByTitulo(String titulo){
    return emf.createEntityManager().createNamedQuery("Peliculas.findByTitulo").setParameter("titulo", titulo).getResultList();
}
public void removePelicula(Integer id){
        EntityManager em = emf.createEntityManager();

        Peliculas pelicula = em.find(Peliculas.class, id);

        em.remove(pelicula);
}

public void updatePelicula(Integer id, String titulo, Date fecha, Double presupuesto ) {
    
       EntityManager em = emf.createEntityManager();
       Peliculas pelicula = em.find(Peliculas.class, id);
       em.refresh(pelicula);

    }
    
}


