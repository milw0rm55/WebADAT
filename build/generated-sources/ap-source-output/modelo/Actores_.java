package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Reparto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-13T12:24:10")
@StaticMetamodel(Actores.class)
public class Actores_ { 

    public static volatile SingularAttribute<Actores, Integer> codigo;
    public static volatile CollectionAttribute<Actores, Reparto> repartoCollection;
    public static volatile SingularAttribute<Actores, Date> fnacimiento;
    public static volatile SingularAttribute<Actores, String> nombre;
    public static volatile SingularAttribute<Actores, String> nacionalidad;

}