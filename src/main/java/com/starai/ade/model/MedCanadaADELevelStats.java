package com.starai.ade.model;

public class MedCanadaADELevelStats {

    private String drugName;
    private String drugIndication;
    private String adverseEvent;
    private String pubmedAbstract;

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getAdverseEvent() {
        return adverseEvent;
    }

    public void setAdverseEvent(String adverseEvent) {
        this.adverseEvent = adverseEvent;
    }

    public String getDrugIndication() {
        return drugIndication;
    }

    public void setDrugIndication(String drugIndication) {
        this.drugIndication = drugIndication;
    }

    public String getPubmedAbstract() {
        return pubmedAbstract;
    }

    public void setPubmedAbstract(String pubmedAbstract) {
        this.pubmedAbstract = pubmedAbstract;
    }

    @Override
    public String toString() {
        return "FDAADELevelStats{" +
                "drugName='" + drugName + '\'' +
                ", drugIndication='" + drugIndication + '\'' +
                ", adverseEvent='" + adverseEvent + '\'' +
                ", pubmedAbstract='" + pubmedAbstract + '\'' +
                '}';
    }
}
