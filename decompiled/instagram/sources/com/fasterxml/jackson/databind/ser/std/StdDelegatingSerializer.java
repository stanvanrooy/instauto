package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import p000X.AnonymousClass000;
import p000X.C06;
import p000X.C0L;
import p000X.C27107By8;
import p000X.C27148BzD;
import p000X.C27224C3n;
import p000X.C35;
import p000X.C3b;
import p000X.C3m;

public final class StdDelegatingSerializer extends StdSerializer implements C35, C3b, C3m, C27224C3n {
    public final JsonSerializer A00;
    public final C27107By8 A01;
    public final C0L A02;

    public final JsonSerializer AAL(C06 c06, C27148BzD bzD) {
        JsonSerializer AAL;
        JsonSerializer jsonSerializer = this.A00;
        if (jsonSerializer == null) {
            C0L c0l = this.A02;
            if (c0l == null) {
                c0l = this.A01.ARO(c06.A05());
            }
            return A0D(this.A01, c0l, c06.A07(c0l, bzD));
        } else if (!(jsonSerializer instanceof C35) || (AAL = ((C35) jsonSerializer).AAL(c06, bzD)) == this.A00) {
            return this;
        } else {
            return A0D(this.A01, this.A02, AAL);
        }
    }

    public final void Bdm(C06 c06) {
        JsonSerializer jsonSerializer = this.A00;
        if (jsonSerializer != null && (jsonSerializer instanceof C3b)) {
            ((C3b) jsonSerializer).Bdm(c06);
        }
    }

    public StdDelegatingSerializer(C27107By8 by8, C0L c0l, JsonSerializer jsonSerializer) {
        super(c0l);
        this.A01 = by8;
        this.A02 = c0l;
        this.A00 = jsonSerializer;
    }

    public final StdDelegatingSerializer A0D(C27107By8 by8, C0L c0l, JsonSerializer jsonSerializer) {
        Class<?> cls = getClass();
        if (cls == StdDelegatingSerializer.class) {
            return new StdDelegatingSerializer(by8, c0l, jsonSerializer);
        }
        throw new IllegalStateException(AnonymousClass000.A0J("Sub-class ", cls.getName(), " must override 'withDelegate'"));
    }
}
