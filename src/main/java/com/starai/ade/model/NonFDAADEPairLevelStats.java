package com.starai.ade.model;

public class NonFDAADEPairLevelStats {

    private String drugNameOne;
    private String drugNameTwo;
    private String adverseEvent;
    private String pubmedAbstract;

    public String getDrugNameOne() {
        return drugNameOne;
    }

    public void setDrugNameOne(String drugNameOne) {
        this.drugNameOne = drugNameOne;
    }

    public String getDrugNameTwo() {
        return drugNameTwo;
    }

    public void setDrugNameTwo(String drugNameTwo) {
        this.drugNameTwo = drugNameTwo;
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
        return "NonFDAADEPairLevelStats{" +
                "drugNameOne='" + drugNameOne + '\'' +
                ", drugNameTwo='" + drugNameTwo + '\'' +
                ", adverseEvent='" + adverseEvent + '\'' +
                ", pubmedAbstract='" + pubmedAbstract + '\'' +
                '}';
    }
}

