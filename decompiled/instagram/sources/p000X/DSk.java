package p000X;

import java.lang.reflect.Field;
import java.util.Locale;

/* 'enum' modifier removed */
/* renamed from: X.DSk */
public final class DSk extends DSj {
    public DSk() {
        super("LOWER_CASE_WITH_DOTS", 5);
    }

    public final String Brh(Field field) {
        return DSj.A01(field.getName(), ".").toLowerCase(Locale.ENGLISH);
    }
}
