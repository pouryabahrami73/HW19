/*
package ir.pb.domains;

import ir.pb.base.domians.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Patient extends BaseEntity<Long> {

    @Column(nullable = false)
    private String firstName;
    @Column
    private String lastName;
    @Column(nullable = false)
    private String gender;
    */
/*@ManyToMany
    @JoinTable(name = "patient_drug",
            joinColumns = {@JoinColumn(name = "fk_patient")},
            inverseJoinColumns = {@JoinColumn(name = "fk_drug")})
    private List<Drug> drugs;*//*

    @OneToMany(mappedBy = "patient")
    private List<Prescription> prescriptions;

    public Patient() {
    }

    public Patient(String firstName, String gender) {
        this.firstName = firstName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }
}
*/
