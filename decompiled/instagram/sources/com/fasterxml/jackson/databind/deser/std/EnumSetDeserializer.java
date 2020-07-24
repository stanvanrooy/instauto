package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.EnumSet;
import p000X.C0L;
import p000X.C27105Bxz;
import p000X.C27123ByY;
import p000X.C27148BzD;

public final class EnumSetDeserializer extends StdDeserializer implements C27105Bxz {
    public JsonDeserializer A00;
    public final C0L A01;
    public final Class A02;

    public EnumSetDeserializer(C0L c0l, JsonDeserializer jsonDeserializer) {
        super(EnumSet.class);
        this.A01 = c0l;
        this.A02 = c0l.A00;
        this.A00 = jsonDeserializer;
    }

    public final JsonDeserializer AAK(C27123ByY byY, C27148BzD bzD) {
        JsonDeserializer jsonDeserializer = this.A00;
        if (jsonDeserializer == null) {
            jsonDeserializer = byY.A08(this.A01, bzD);
        } else if (jsonDeserializer instanceof C27105Bxz) {
            jsonDeserializer = ((C27105Bxz) jsonDeserializer).AAK(byY, bzD);
        }
        if (this.A00 == jsonDeserializer) {
            return this;
        }
        return new EnumSetDeserializer(this.A01, jsonDeserializer);
    }
}
