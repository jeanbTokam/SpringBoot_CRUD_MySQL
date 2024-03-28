package SpringBBackend.SpringBootBackend.Entity;


import jakarta.persistence.*;


@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String firstName;

    private String lastName;

    private String emailId;

    public Employee(){

    }

    public Employee(String firstName, String lastName, String emailId){

        super();

        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }




}
