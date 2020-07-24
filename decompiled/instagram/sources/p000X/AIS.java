package p000X;

import android.util.Property;
import android.view.View;

/* renamed from: X.AIS */
public final class AIS extends Property {
    public AIS(Class cls) {
        super(cls, "translationAlpha");
    }

    public final Object get(Object obj) {
        return Float.valueOf(C28837CnX.A02.A00((View) obj));
    }

    public final void set(Object obj, Object obj2) {
        float floatValue = ((Float) obj2).floatValue();
        C28837CnX.A02.A03((View) obj, floatValue);
    }
}
