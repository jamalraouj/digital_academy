package Entity;

import jakarta.persistence.*;

//@Entity
//@Inheritance(strategy=InheritanceType.JOINED)
//@Table(name="users")
//@MappedSuperclass
//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@Table(name="users" )
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String phone;
    private String email;
    private String password;
    private Boolean Status;
    @Enumerated(EnumType.STRING)
    private Role role;

    public User() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Role getRole() {
        return role;
    }

    public User(long id, String name, String phone, String email, String password, Boolean status, Role role) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
        Status = status;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", Status=" + Status +
                ", role=" + role +
                '}';
    }
}
