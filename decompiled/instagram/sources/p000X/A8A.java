package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.A8A */
public final class A8A {
    public static final Map A00 = new HashMap();
    public static final Map A01 = new HashMap();

    public static Object A00(Class cls) {
        String name = cls.getName();
        try {
            return Class.forName(AnonymousClass000.A0E(name, "$$PropsSetter")).newInstance();
        } catch (ClassNotFoundException unused) {
            AnonymousClass0CH.A07("ViewManagerPropertyUpdater", "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(AnonymousClass000.A0E("Unable to instantiate methods getter for ", name), e);
        }
    }
}
