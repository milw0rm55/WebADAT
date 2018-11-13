package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Reparto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-13T12:24:10")
@StaticMetamodel(Peliculas.class)
public class Peliculas_ { 

    public static volatile SingularAttribute<Peliculas, Date> fecha;
    public static volatile SingularAttribute<Peliculas, Integer> codigo;
    public static volatile SingularAttribute<Peliculas, Double> presupuesto;
    public static volatile CollectionAttribute<Peliculas, Reparto> repartoCollection;
    public static volatile SingularAttribute<Peliculas, String> titulo;

}