package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Actores;
import modelo.Peliculas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-13T12:06:43")
@StaticMetamodel(Reparto.class)
public class Reparto_ { 

    public static volatile SingularAttribute<Reparto, Integer> codigo;
    public static volatile SingularAttribute<Reparto, String> tipoPapel;
    public static volatile SingularAttribute<Reparto, Actores> cactor;
    public static volatile SingularAttribute<Reparto, Peliculas> cpelicula;

}