package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.concurrent.atomic.AtomicReference;
import p000X.C0L;
import p000X.C27105Bxz;
import p000X.C27123ByY;
import p000X.C27148BzD;

public final class JdkDeserializers$AtomicReferenceDeserializer extends StdScalarDeserializer implements C27105Bxz {
    public final JsonDeserializer A00;
    public final C0L A01;

    public JdkDeserializers$AtomicReferenceDeserializer(C0L c0l, JsonDeserializer jsonDeserializer) {
        super(AtomicReference.class);
        this.A01 = c0l;
        this.A00 = jsonDeserializer;
    }

    public final JsonDeserializer AAK(C27123ByY byY, C27148BzD bzD) {
        if (this.A00 != null) {
            return this;
        }
        C0L c0l = this.A01;
        return new JdkDeserializers$AtomicReferenceDeserializer(c0l, byY.A08(c0l, bzD));
    }
}
