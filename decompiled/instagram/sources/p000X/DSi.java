package p000X;

import java.lang.reflect.Field;
import java.util.Locale;

/* 'enum' modifier removed */
/* renamed from: X.DSi */
public final class DSi extends DSj {
    public DSi() {
        super("LOWER_CASE_WITH_DASHES", 4);
    }

    public final String Brh(Field field) {
        return DSj.A01(field.getName(), "-").toLowerCase(Locale.ENGLISH);
    }
}
