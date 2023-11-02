package io.iru.student.management.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;
    @Size(min = 2,message = "Minimum 2 chars name required")
    private String name;
    private String div;
    private String email;

    private long phoneNo;
    @Past(message = "DoB Should be past date")
    private LocalDate dob;

    public Student() {
    }

    public Student(int id, String name, String div, String email, long phoneNo, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.div = div;
        this.email = email;
        this.phoneNo = phoneNo;
        this.dob = dob;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
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

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", div='" + div + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo=" + phoneNo +
                ", dob=" + dob +
                '}';
    }
}
