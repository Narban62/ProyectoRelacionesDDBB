package ec.edu.uce.ProyectoRelacionesDDBB.Model;

import jakarta.persistence.*;

@Entity
public class AdministrativeStaff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String position;

    @OneToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public AdministrativeStaff() {
    }

    public AdministrativeStaff(String email, String name, String position) {
        this.email = email;
        this.name = name;
        this.position = position;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;

    }

    @Override
    public String toString() {
        return "AdministrativeStaff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", department=" + department +
                '}';
    }
}
