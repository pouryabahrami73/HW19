/*
package ir.pb.domains;

import ir.pb.base.domians.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Prescription extends BaseEntity<Long> {
    @Column
    private Date issueDate;
    @Column
    private Date patientReferenceDate;
    @Column(nullable = false)
    private long code;
    @ManyToOne
    @JoinColumn(name = "fk_patient", nullable = false)
    private Patient patient;
    @ManyToMany
    @JoinTable(name = "prescription_drug",
            joinColumns = {@JoinColumn(name = "fk_prescription")},
            inverseJoinColumns = {@JoinColumn(name = "fk_drug")})
    private List<Drug> drugs = new ArrayList<>();

    public Prescription() {
    }

    public Prescription(long code, Patient patient) {
        this.code = code;
        this.patient = patient;
    }


    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getPatientReferenceDate() {
        return patientReferenceDate;
    }

    public void setPatientReferenceDate(Date patientReferenceDate) {
        this.patientReferenceDate = patientReferenceDate;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(Drug drug) {
        this.drugs.add(drug);
    }
}
*/
