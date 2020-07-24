package p000X;

import java.lang.reflect.Field;

/* 'enum' modifier removed */
/* renamed from: X.DSm */
public final class DSm extends DSj {
    public DSm() {
        super("UPPER_CAMEL_CASE_WITH_SPACES", 2);
    }

    public final String Brh(Field field) {
        return DSj.A00(DSj.A01(field.getName(), " "));
    }
}
