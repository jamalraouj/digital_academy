package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User extends Person{
    private String email;
    private String password;
    private Boolean Status;

    public User(String email, String password, Boolean status) {
        this.email = email;
        this.password = password;
        Status = status;
    }
    public User(){}
    public User(long id, String name, String phone, Role role, String email, String password, Boolean status) {
        super(id, name, phone, role);
        this.email = email;
        this.password = password;
        Status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }
}
