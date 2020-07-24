package p000X;

import java.lang.reflect.Field;
import java.util.Locale;

/* 'enum' modifier removed */
/* renamed from: X.DSl */
public final class DSl extends DSj {
    public DSl() {
        super("LOWER_CASE_WITH_UNDERSCORES", 3);
    }

    public final String Brh(Field field) {
        return DSj.A01(field.getName(), "_").toLowerCase(Locale.ENGLISH);
    }
}
