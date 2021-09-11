package io.github.mangostudio.mango.util;


import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class Language {

    public static final String EN_UK = "en_uk";
    public static final String EN_US = "en_us";
    public static final String ZH_CN = "zh_cn";
    public static String currentLang;


    private static final String[] LANGS_STR = {EN_US, ZH_CN, EN_UK};
    private static final Map<String, Map<String, String>> LANGS = new HashMap<>(2);

    static {
        for (String lang : LANGS_STR) {
            LANGS.put(lang, new HashMap<>());
        }
    }


    public static void init() {
        for (Map.Entry<String, Map<String, String>> entry : LANGS.entrySet()) {
            try (InputStream is = Objects.requireNonNull(
                    ClassLoader.getSystemResourceAsStream(
                            "assets/" + "light" + "/lang/" + entry.getKey() + ".lang"
                    ));
                 Reader r = new InputStreamReader(is, StandardCharsets.UTF_8)
            ) {
                Properties prop = new Properties();
                prop.load(r);
                putKv(entry.getKey(), prop);
            } catch (Throwable t) {
                //logger.catching(t);
                System.out.print(t);
            }
        }
    }

    private static void putKv(String lang, Properties prop) {
        for (Map.Entry<Object, Object> e : prop.entrySet()) {
            LANGS.get(lang).put(String.valueOf(e.getKey()), String.valueOf(e.getValue()));
        }
    }

    // set UnlocalizedName
    // setTranslationName

    public static String getTranslationName(String key) {
        return LANGS.get(currentLang).getOrDefault(key, key);
    }
}