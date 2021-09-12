package io.github.mangostudio.mango.gui;

import io.github.mangostudio.mango.MangoModMakerClient;
import io.github.mangostudio.mango.util.Language;

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
                list.setListData(new String[]{"简体中文 (中国)", "日本語", "文言（華夏）", "English (US)", "English (UK)"});
                list.setSelectedIndex(MangoModMakerClient.LanguageInt);
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
                MangoModMakerClient.LanguageInt = list.getSelectedIndex();
                list.setSelectedIndex(MangoModMakerClient.LanguageInt);


                if (list.getSelectedValue() == "简体中文 (中国)") {
                    Language.init();
                    Language.currentLang = "zh_cn";
                    MangoModMakerClient.UpdateLanguageInit();
                } else if (list.getSelectedValue() == "English (US)") {
                    Language.init();
                    Language.currentLang = "en_us";
                    MangoModMakerClient.UpdateLanguageInit();
                } else if (list.getSelectedValue() == "English (UK)") {
                    Language.init();
                    Language.currentLang = "en_uk";
                    MangoModMakerClient.UpdateLanguageInit();
                } else if (list.getSelectedValue() == "日本語") {
                    Language.init();
                    Language.currentLang = "ja_jp";
                    MangoModMakerClient.UpdateLanguageInit();
                } else if (list.getSelectedValue() == "文言（華夏）") {
                    Language.init();
                    // 文言（華夏）
                    Language.currentLang = "lzh";
                    MangoModMakerClient.UpdateLanguageInit();
                }


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
