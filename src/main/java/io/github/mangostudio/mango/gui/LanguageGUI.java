package io.github.mangostudio.mango.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class LanguageGUI {

    private JPanel contentPanel = new JPanel();
    private JPanel buttonPane = new JPanel();
    private JButton okButton = new JButton("OK");
    private JButton cancelButton = new JButton("Cancel");


    private JList list = new JList();


    // showCustomDialog

    public void showLanguageDialog(Frame owner, Component parentComponent) {

        final JDialog dialog = new JDialog(owner, "语言...", true);

        dialog.setSize(new Dimension(240, 240));
        dialog.setMinimumSize(new Dimension(240, 240));
        dialog.setLocationRelativeTo(parentComponent);


        dialog.getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        dialog.getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(new BorderLayout(0, 0));

        {
            JScrollPane scrollPane = new JScrollPane();
            contentPanel.add(scrollPane, BorderLayout.CENTER);
            {
                scrollPane.setViewportView(list);
                list.setListData(new String[]{"简体中文 (中国)", "English (US)", "English (UK)"});
                list.setSelectedIndex(0);
            }
        }


        dialog.getContentPane().add(contentPanel, BorderLayout.CENTER);
        {
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            dialog.getContentPane().add(buttonPane, BorderLayout.SOUTH);
            {
                okButton.setActionCommand("OK");
                buttonPane.add(okButton);
                dialog.getRootPane().setDefaultButton(okButton);
            }
            {
                cancelButton.setActionCommand("Cancel");
                buttonPane.add(cancelButton);
            }
        }

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });


        dialog.setVisible(true);
    }


}
