package p000X;

import java.lang.reflect.Constructor;

/* renamed from: X.BDf */
public final class BDf extends C18690sG implements AnonymousClass2GT {
    public final /* synthetic */ Constructor A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BDf(Constructor constructor) {
        super(1);
        this.A00 = constructor;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        Throwable th = (Throwable) obj;
        try {
            Object newInstance = this.A00.newInstance(new Object[]{th});
            if (newInstance != null) {
                obj2 = (Throwable) newInstance;
                if (obj2 instanceof C50652Hd) {
                    obj2 = null;
                }
                return (Throwable) obj2;
            }
            throw new C183227s6("null cannot be cast to non-null type kotlin.Throwable");
        } catch (Throwable th2) {
            obj2 = AnonymousClass2I2.A00(th2);
        }
    }
}
