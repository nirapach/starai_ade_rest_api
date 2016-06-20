package com.starai.ade.model;

public class NonFDAADELevelStats {

    private String drugName;
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



    public String getPubmedAbstract() {
        return pubmedAbstract;
    }

    public void setPubmedAbstract(String pubmedAbstract) {
        this.pubmedAbstract = pubmedAbstract;
    }

    @Override
    public String toString() {
        return "NonFDAADELevelStats{" +
                "drugName='" + drugName + '\'' +
                ", adverseEvent='" + adverseEvent + '\'' +
                ", pubmedAbstract='" + pubmedAbstract + '\'' +
                '}';
    }
}
