package io.github.mangostudio.mango;


import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoNatureGreenIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkMediumIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;

import javax.swing.*;


public class Start {

    // 客户端  // Client
    private static MangoModMakerClient MANGO_MOD_MAKER_CLIENT;

    public static void main(String[] args) {

        FlatGitHubIJTheme.setup();


        MANGO_MOD_MAKER_CLIENT = new MangoModMakerClient();
        MANGO_MOD_MAKER_CLIENT.CreateWindow("MangoModMaker", 540, 320);
        //-------------------------------------------------------------------------------
        MANGO_MOD_MAKER_CLIENT.setLanguage("zh_cn");
        MANGO_MOD_MAKER_CLIENT.init();
        MANGO_MOD_MAKER_CLIENT.UpdateLanguageInit();
    }
}
