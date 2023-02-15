/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitario;

import java.awt.Component;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author AD
 */
public class PrecoRender extends DefaultTableCellRenderer {

    NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {

        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (value instanceof BigDecimal) {

            this.setText(nf.format((BigDecimal) value));

        }
        return this;
    }
}
