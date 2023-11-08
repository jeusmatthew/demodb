package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// Table
// CREATE TABLE"Medicaments"("ID"INTEGER,"Medicament_Name_Comercial"TEXT,"Compound"TEXT,"Contraindications"TEXT,"Side_And_Adverse_Reactions"TEXT,"Restrictions_On_Use_During_Pregnancy_And_Lactation"TEXT,"Drug_And_Other_Interactions"TEXT,"Protection_Legends"TEXT,"General_Precautions"TEXT,"Precautions_Regarding_Carcinogenesis_Mutagenesis_Teratogenesis_And_Fertility_Effects"TEXT,"Manifestations_And_Management_Of_Overdose_And_Accidental_Ingestion"TEXT,PRIMARY KEY("ID"))

public class ConsultasProducto {
    private Conexion conexion;

    public ConsultasProducto() {
        conexion = new Conexion();
    }

    public boolean registrar(Medicamento medicament) {

        // COPILOT GOOOOOOOD
        // tu q dices copilot?
        // si
        try (Connection con = conexion.getConexion();
                PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO Medicaments (Medicament_Name_Comercial, Compound, Contraindications, Side_And_Adverse_Reactions, Restrictions_On_Use_During_Pregnancy_And_Lactation, Drug_And_Other_Interactions, Protection_Legends, General_Precautions, Precautions_Regarding_Carcinogenesis_Mutagenesis_Teratogenesis_And_Fertility_Effects, Manifestations_And_Management_Of_Overdose_And_Accidental_Ingestion) VALUES (?,?,?,?,?,?,?,?,?,?)")) {
            ps.setString(1, medicament.getMedicamentName());
            ps.setString(2, medicament.getCompound());
            ps.setString(3, medicament.getContraindications());
            ps.setString(4, medicament.getSideAndAdverseReactions());
            ps.setString(5, medicament.getRestrictionsOnUse());
            ps.setString(6, medicament.getDrugAndOtherInteractions());
            ps.setString(7, medicament.getProtectionLegends());
            ps.setString(8, medicament.getGeneralPrecautions());
            ps.setString(9, medicament.getPrecautionsRegardingCarcinogenesis());
            ps.setString(10, medicament.getManifestationsAndManagementOfOverdose());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean buscar(Medicamento medicamento) {
        try (Connection con = conexion.getConexion();
        PreparedStatement ps = con.prepareStatement("SELECT * FROM Medicaments where id=?")) {
            ps.setInt(1, medicamento.getId());
            try(ResultSet rs = ps.executeQuery()){
                if(rs.next()){
                    medicamento.setId(Integer.parseInt(rs.getString("id")));
                    medicamento.setMedicamentName(rs.getString("Medicament_Name_Comercial"));
                    medicamento.setCompound(rs.getString("Compound"));
                    medicamento.setContraindications(rs.getString("Contraindications"));
                    medicamento.setSideAndAdverseReactions(rs.getString("Side_And_Adverse_Reactions"));
                    medicamento.setRestrictionsOnUse(rs.getString("Restrictions_On_Use_During_Pregnancy_And_Lactation"));
                    medicamento.setDrugAndOtherInteractions(rs.getString("Drug_And_Other_Interactions"));
                    medicamento.setProtectionLegends(rs.getString("Protection_Legends"));
                    medicamento.setGeneralPrecautions(rs.getString("General_Precautions"));
                    medicamento.setPrecautionsRegardingCarcinogenesis(rs.getString("Precautions_Regarding_Carcinogenesis_Mutagenesis_Teratogenesis_And_Fertility_Effects"));
                    medicamento.setManifestationsAndManagementOfOverdose(rs.getString("Manifestations_And_Management_Of_Overdose_And_Accidental_Ingestion"));
                    return true;                
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
