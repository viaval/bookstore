package entity;

import entity.Book;
import entity.Shopper;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-22T02:05:23")
@StaticMetamodel(History.class)
public class History_ { 

    public static volatile SingularAttribute<History, Date> date;
    public static volatile SingularAttribute<History, Shopper> shopper;
    public static volatile SingularAttribute<History, Book> book;
    public static volatile SingularAttribute<History, Integer> count;
    public static volatile SingularAttribute<History, Long> id;

}