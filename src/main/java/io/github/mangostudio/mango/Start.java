package io.github.mangostudio.mango;


import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;


public class Start {

    // 客户端  // Client
    private static MangoModMakerClient MANGO_MOD_MAKER_CLIENT;

    public static void main(String[] args) {

        FlatArcDarkOrangeIJTheme.setup();

        MANGO_MOD_MAKER_CLIENT = new MangoModMakerClient();
        MANGO_MOD_MAKER_CLIENT.CreateWindow("MangoModMaker", 540, 320);
        //-------------------------------------------------------------------------------
        MANGO_MOD_MAKER_CLIENT.setLanguage("zh_cn");
        MANGO_MOD_MAKER_CLIENT.UpdateLanguageInit();
        MANGO_MOD_MAKER_CLIENT.init();
    }
}
