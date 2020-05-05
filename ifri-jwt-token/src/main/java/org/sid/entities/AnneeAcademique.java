package org.sid.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AnneeAcademique {

    @Id
    private String anneeId;
    private Integer anneeEncours;

    @OneToMany(mappedBy = "anneeAcademique")
    private List<Ue> ues = new ArrayList<Ue>();

    public AnneeAcademique() {
    }

    public AnneeAcademique(String anneeId, Integer anneeEncours) {
        this.anneeId = anneeId;
        this.anneeEncours = anneeEncours;
    }

    public String getAnneeId() {
        return anneeId;
    }

    public void setAnneeId(String anneeId) {
        this.anneeId = anneeId;
    }

    public Integer getAnneeEncours() {
        return anneeEncours;
    }

    public void setAnneeEncours(Integer anneeEncours) {
        this.anneeEncours = anneeEncours;
    }

    @JsonIgnore
    public List<Ue> getUes() {
        return ues;
    }

    public void setUes(List<Ue> ues) {
        this.ues = ues;
    }
}
