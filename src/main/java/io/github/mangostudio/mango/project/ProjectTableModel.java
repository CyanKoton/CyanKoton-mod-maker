package io.github.mangostudio.mango.project;


import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.List;

public class ProjectTableModel extends AbstractTableModel {

    private static final long serialVersionUID = 1L;

    private List<Project> aps;

    public ProjectTableModel(List<Project> aps) {
        this.aps = aps;
    }

    public int getColumnCount() {
        return 2;
    }

    public int getRowCount() {
        return aps.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Object res = "";
        Project ap = aps.get(rowIndex);
        ImageIcon ii = new ImageIcon(ap.getProjectLogo());
        ii.setImage(ii.getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
        switch (columnIndex) {
            case 0:
                res = ii;
                break;
            case 1:
                res = ap.getProjectName();
                break;
            default:
                break;
        }
        return res;
    }
}