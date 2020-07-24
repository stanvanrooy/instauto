package p000X;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.module.annotations.ReactModule;

/* renamed from: X.A3X */
public final class A3X {
    public final String A00;
    public final AnonymousClass0IT A01;

    public static A3X A00(Class cls, AnonymousClass0IT r4) {
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            return new A3X(r4, reactModule.name());
        }
        AnonymousClass0CH.A07("ModuleSpec", AnonymousClass000.A0J("Could not find @ReactModule annotation on ", cls.getName(), ". So creating the module eagerly to get the name. Consider adding an annotation to make this Lazy"));
        return new A3X(r4, ((NativeModule) r4.get()).getName());
    }

    public A3X(AnonymousClass0IT r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }
}
