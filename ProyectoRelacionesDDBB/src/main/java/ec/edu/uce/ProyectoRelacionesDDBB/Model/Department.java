package ec.edu.uce.ProyectoRelacionesDDBB.Model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(mappedBy = "department")
    private AdministrativeStaff administrativeStaff;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<Course> courses = new HashSet<>();

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public Department(String name, Set<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public Department(Long id, String name, Set<Course> courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
        course.setDepartment(this);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
        course.setDepartment(null);
    }

    public AdministrativeStaff getAdministrativeStaff() {
        return administrativeStaff;
    }

    public void setAdministrativeStaff(AdministrativeStaff administrativeStaff) {
        this.administrativeStaff = administrativeStaff;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", administrativeStaff=" + administrativeStaff +
                ", courses=" + courses +
                '}';
    }
}
