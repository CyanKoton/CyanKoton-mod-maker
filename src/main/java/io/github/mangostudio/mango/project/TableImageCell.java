package io.github.mangostudio.mango.project;


import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class TableImageCell extends DefaultTableCellRenderer {

    private static final long serialVersionUID = 1L;

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setIcon(null);
        setBorder(null);
        if (value instanceof ImageIcon) {
            setIcon((Icon) value);

        } else if (value instanceof String) setText((String) value);
        else setText("");
        return this;
    }
}
