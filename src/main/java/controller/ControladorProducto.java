package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.ConsultasProducto;
import model.Medicamento;
import view.ProductView;

public class ControladorProducto implements ActionListener {

    private final Medicamento medicamento;
    private final ConsultasProducto consultasProducto;
    private final ProductView view;

    public ControladorProducto(Medicamento medicamento, ConsultasProducto consultasProducto, ProductView view) {
        this.medicamento = medicamento;
        this.consultasProducto = consultasProducto;
        this.view = view;
        this.view.btnBuscar.addActionListener(this);
        this.view.btnEliminar.addActionListener(this);
        this.view.btnGuardar.addActionListener(this);
        this.view.btnLimpiar.addActionListener(this);
        this.view.btnModificar.addActionListener(this); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // get source events
        Object source = e.getSource();

        if (source == view.btnGuardar) {
            agregarMedicamento();
        }
        else if (source == view.btnEliminar) {

        }
        else if (source == view.btnBuscar) {
            buscarMedicamento();
        }
        else if (source == view.btnLimpiar) {
            limpiarCampos();
        }
        else if (source == view.btnModificar) {
            
        }

    }

    private void agregarMedicamento() {
        obtenerMedicamentoDesdeVista();
        if (consultasProducto.registrar(medicamento)) {
            JOptionPane.showMessageDialog(null, "Medicamento guardado");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }

    private void buscarMedicamento() {
        medicamento.setId(Integer.parseInt(view.txtId.getText()));
        if (consultasProducto.buscar(medicamento)) {
            llenarVistaDesdeMedicamento();
        }
        else {
            JOptionPane.showMessageDialog(null, "No se encontro el medicamento");
            
        }
    }

    private void obtenerMedicamentoDesdeVista() {
        medicamento.setMedicamentName(view.txtMedName.getText());
        medicamento.setCompound(view.txtCompound.getText());
        medicamento.setContraindications(view.txtContraindications.getText());
        medicamento.setSideAndAdverseReactions(view.txtSideAndAdverse.getText());
        medicamento.setRestrictionsOnUse(view.txtRestrictions.getText());
        medicamento.setDrugAndOtherInteractions(view.txtDrugAndOther.getText());
        medicamento.setProtectionLegends(view.txtProtectionLegends.getText());
        medicamento.setGeneralPrecautions(view.txtGeneralPrecautions.getText());
        medicamento.setPrecautionsRegardingCarcinogenesis(view.txtPrecautionsRegarding.getText());
        medicamento.setManifestationsAndManagementOfOverdose(view.txtManifestationsAndManagement.getText());

    }

    private void llenarVistaDesdeMedicamento() {
        view.txtId.setText(String.valueOf(medicamento.getId()));
        view.txtMedName.setText(medicamento.getMedicamentName());
        view.txtCompound.setText(medicamento.getCompound());
        view.txtContraindications.setText(medicamento.getContraindications());
        view.txtSideAndAdverse.setText(medicamento.getSideAndAdverseReactions());
        view.txtRestrictions.setText(medicamento.getRestrictionsOnUse());
        view.txtDrugAndOther.setText(medicamento.getDrugAndOtherInteractions());
        view.txtProtectionLegends.setText(medicamento.getProtectionLegends());
        view.txtGeneralPrecautions.setText(medicamento.getGeneralPrecautions());
        view.txtPrecautionsRegarding.setText(medicamento.getPrecautionsRegardingCarcinogenesis());
        view.txtManifestationsAndManagement.setText(medicamento.getManifestationsAndManagementOfOverdose());
    }

    private void limpiarCampos() {
        view.txtId.setText("");
        view.txtMedName.setText("");
        view.txtCompound.setText("");
        view.txtContraindications.setText("");
        view.txtSideAndAdverse.setText("");
        view.txtRestrictions.setText("");
        view.txtDrugAndOther.setText("");
        view.txtProtectionLegends.setText("");
        view.txtGeneralPrecautions.setText("");
        view.txtPrecautionsRegarding.setText("");
        view.txtManifestationsAndManagement.setText("");
    }

}
