package model;

// Table columns
// Medicament_Name_Comercial
// Compound
// Contraindications
// Side_And_Adverse_Reactions
// Restrictions_On_Use_During_Pregnancy_And_Lactation
// Drug_And_Other_Interactions
// Protection_Legends
// General_Precautions
// Precautions_Regarding_Carcinogenesis_Mutagenesis_Teratogenesis_And_Fertility_Effects
// Manifestations_And_Management_Of_Overdose_And_Accidental_Ingestion

public class Medicamento {
    private int id;
    private String medicamentName;
    private String compound;
    private String contraindications;
    private String sideAndAdverseReactions;
    private String restrictionsOnUse;
    private String drugAndOtherInteractions;
    private String protectionLegends;
    private String generalPrecautions;
    private String precautionsRegardingCarcinogenesis;
    private String manifestationsAndManagementOfOverdose;

    public String getMedicamentName() {
        return medicamentName;
    }

    public void setMedicamentName(String medicamentName) {
        this.medicamentName = medicamentName;
    }

    public String getCompound() {
        return compound;
    }

    public void setCompound(String compound) {
        this.compound = compound;
    }

    public String getContraindications() {
        return contraindications;
    }

    public void setContraindications(String contraindications) {
        this.contraindications = contraindications;
    }

    public String getSideAndAdverseReactions() {
        return sideAndAdverseReactions;
    }

    public void setSideAndAdverseReactions(String sideAndAdverseReactions) {
        this.sideAndAdverseReactions = sideAndAdverseReactions;
    }

    public String getRestrictionsOnUse() {
        return restrictionsOnUse;
    }

    public void setRestrictionsOnUse(String restrictionsOnUse) {
        this.restrictionsOnUse = restrictionsOnUse;
    }

    public String getDrugAndOtherInteractions() {
        return drugAndOtherInteractions;
    }

    public void setDrugAndOtherInteractions(String drugAndOtherInteractions) {
        this.drugAndOtherInteractions = drugAndOtherInteractions;
    }

    public String getProtectionLegends() {
        return protectionLegends;
    }

    public void setProtectionLegends(String protectionLegends) {
        this.protectionLegends = protectionLegends;
    }

    public String getGeneralPrecautions() {
        return generalPrecautions;
    }

    public void setGeneralPrecautions(String generalPrecautions) {
        this.generalPrecautions = generalPrecautions;
    }

    public String getPrecautionsRegardingCarcinogenesis() {
        return precautionsRegardingCarcinogenesis;
    }

    public void setPrecautionsRegardingCarcinogenesis(String precautionsRegardingCarcinogenesis) {
        this.precautionsRegardingCarcinogenesis = precautionsRegardingCarcinogenesis;
    }

    public String getManifestationsAndManagementOfOverdose() {
        return manifestationsAndManagementOfOverdose;
    }

    public void setManifestationsAndManagementOfOverdose(String manifestationsAndManagementOfOverdose) {
        this.manifestationsAndManagementOfOverdose = manifestationsAndManagementOfOverdose;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
