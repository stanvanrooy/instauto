package com.fasterxml.jackson.databind.deser.std;

import java.util.Locale;

public final class JdkDeserializers$LocaleDeserializer extends FromStringDeserializer {
    public static final JdkDeserializers$LocaleDeserializer A00 = new JdkDeserializers$LocaleDeserializer();

    public JdkDeserializers$LocaleDeserializer() {
        super(Locale.class);
    }

    public static final Locale A00(String str) {
        int indexOf = str.indexOf(95);
        if (indexOf < 0) {
            return new Locale(str);
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        int indexOf2 = substring2.indexOf(95);
        if (indexOf2 < 0) {
            return new Locale(substring, substring2);
        }
        return new Locale(substring, substring2.substring(0, indexOf2), substring2.substring(indexOf2 + 1));
    }
}
