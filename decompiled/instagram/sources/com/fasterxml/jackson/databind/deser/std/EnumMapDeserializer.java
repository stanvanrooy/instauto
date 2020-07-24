package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.EnumMap;
import p000X.C0L;
import p000X.C27105Bxz;
import p000X.C27106By5;
import p000X.C27123ByY;
import p000X.C27148BzD;

public final class EnumMapDeserializer extends StdDeserializer implements C27105Bxz {
    public JsonDeserializer A00;
    public JsonDeserializer A01;
    public final C0L A02;
    public final C27106By5 A03;
    public final Class A04;

    public EnumMapDeserializer(C0L c0l, JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, C27106By5 by5) {
        super(EnumMap.class);
        this.A02 = c0l;
        this.A04 = c0l.A04().A00;
        this.A00 = jsonDeserializer;
        this.A01 = jsonDeserializer2;
        this.A03 = by5;
    }

    public final JsonDeserializer AAK(C27123ByY byY, C27148BzD bzD) {
        JsonDeserializer jsonDeserializer = this.A00;
        if (jsonDeserializer == null) {
            jsonDeserializer = byY.A08(this.A02.A04(), bzD);
        }
        JsonDeserializer jsonDeserializer2 = this.A01;
        if (jsonDeserializer2 == null) {
            jsonDeserializer2 = byY.A08(this.A02.A03(), bzD);
        } else if (jsonDeserializer2 instanceof C27105Bxz) {
            jsonDeserializer2 = ((C27105Bxz) jsonDeserializer2).AAK(byY, bzD);
        }
        C27106By5 by5 = this.A03;
        C27106By5 by52 = by5;
        if (by5 != null) {
            by5 = by5.A03(bzD);
        }
        if (jsonDeserializer == this.A00 && jsonDeserializer2 == this.A01 && by5 == by52) {
            return this;
        }
        return new EnumMapDeserializer(this.A02, jsonDeserializer, jsonDeserializer2, by52);
    }
}
