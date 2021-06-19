package entities;

import entities.UserType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-18T02:49:07")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> img;
    public static volatile SingularAttribute<User, String> pass;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, Long> id;
    public static volatile SingularAttribute<User, UserType> userType;
    public static volatile SingularAttribute<User, Integer> status;

}