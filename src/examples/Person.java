package examples;

import java.io.Serializable;

/**
 * Created by Romina.Tornello on 3/16/2015.
 */
public class Person implements Serializable {
    private String name;

    private transient String email;

    public String getName() {
        return name;
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Person[name="+name+", email="+email+"]";
    }

}
