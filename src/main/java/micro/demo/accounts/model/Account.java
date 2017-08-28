package micro.demo.accounts.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

//stored in h2 database

@Entity
@Table(name="T_ACCOUNT")
public class Account implements Serializable{

}
