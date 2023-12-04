package TwoclsOneTbl;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class School {
    
    @Id
    @GeneratedValue
    private int id;
    private String name;
    
    private SchoolDetails sd;

    public School() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Embedded
    public SchoolDetails getSd() {
        return sd;
    }

    public void setSd(SchoolDetails sd) {
        this.sd = sd;
    }
}
