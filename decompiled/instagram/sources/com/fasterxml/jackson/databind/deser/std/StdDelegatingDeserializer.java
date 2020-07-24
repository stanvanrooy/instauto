package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import p000X.AnonymousClass000;
import p000X.C0L;
import p000X.C27105Bxz;
import p000X.C27107By8;
import p000X.C27108By9;
import p000X.C27123ByY;
import p000X.C27148BzD;

public final class StdDelegatingDeserializer extends StdDeserializer implements C27105Bxz, C27108By9 {
    public final JsonDeserializer A00;
    public final C27107By8 A01;
    public final C0L A02;

    public final JsonDeserializer AAK(C27123ByY byY, C27148BzD bzD) {
        JsonDeserializer AAK;
        JsonDeserializer jsonDeserializer = this.A00;
        if (jsonDeserializer == null) {
            C27107By8 by8 = this.A01;
            C0L ANn = by8.ANn(byY.A05());
            return A0L(by8, ANn, byY.A08(ANn, bzD));
        } else if (!(jsonDeserializer instanceof C27105Bxz) || (AAK = ((C27105Bxz) jsonDeserializer).AAK(byY, bzD)) == this.A00) {
            return this;
        } else {
            return A0L(this.A01, this.A02, AAK);
        }
    }

    public final void Bdl(C27123ByY byY) {
        JsonDeserializer jsonDeserializer = this.A00;
        if (jsonDeserializer != null && (jsonDeserializer instanceof C27108By9)) {
            ((C27108By9) jsonDeserializer).Bdl(byY);
        }
    }

    public StdDelegatingDeserializer(C27107By8 by8, C0L c0l, JsonDeserializer jsonDeserializer) {
        super(c0l);
        this.A01 = by8;
        this.A02 = c0l;
        this.A00 = jsonDeserializer;
    }

    public final StdDelegatingDeserializer A0L(C27107By8 by8, C0L c0l, JsonDeserializer jsonDeserializer) {
        Class<?> cls = getClass();
        if (cls == StdDelegatingDeserializer.class) {
            return new StdDelegatingDeserializer(by8, c0l, jsonDeserializer);
        }
        throw new IllegalStateException(AnonymousClass000.A0J("Sub-class ", cls.getName(), " must override 'withDelegate'"));
    }
}
