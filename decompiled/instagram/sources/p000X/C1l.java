package p000X;

import java.lang.annotation.Annotation;
import java.util.HashMap;

/* renamed from: X.C1l */
public final class C1l implements C27225C3o {
    public HashMap A00;

    public final void A00(Annotation annotation) {
        HashMap hashMap = this.A00;
        if (hashMap == null || !hashMap.containsKey(annotation.annotationType())) {
            if (this.A00 == null) {
                this.A00 = new HashMap();
            }
            this.A00.put(annotation.annotationType(), annotation);
        }
    }

    public final String toString() {
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            return "[null]";
        }
        return hashMap.toString();
    }

    public C1l() {
    }

    public C1l(HashMap hashMap) {
        this.A00 = hashMap;
    }
}
