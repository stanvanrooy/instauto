package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import p000X.C0b;
import p000X.C27105Bxz;
import p000X.C27106By5;
import p000X.C27123ByY;
import p000X.C27148BzD;

@JacksonStdImpl
public final class ObjectArrayDeserializer extends ContainerDeserializerBase implements C27105Bxz {
    public JsonDeserializer A00;
    public final C27106By5 A01;
    public final C0b A02;
    public final Class A03;
    public final boolean A04;

    public ObjectArrayDeserializer(C0b c0b, JsonDeserializer jsonDeserializer, C27106By5 by5) {
        super(Object[].class);
        this.A02 = c0b;
        Class<Object> cls = c0b.A03().A00;
        this.A03 = cls;
        this.A04 = cls == Object.class;
        this.A00 = jsonDeserializer;
        this.A01 = by5;
    }

    public final JsonDeserializer AAK(C27123ByY byY, C27148BzD bzD) {
        JsonDeserializer A012 = StdDeserializer.A01(byY, bzD, this.A00);
        if (A012 == null) {
            A012 = byY.A08(this.A02.A03(), bzD);
        } else if (A012 instanceof C27105Bxz) {
            A012 = ((C27105Bxz) A012).AAK(byY, bzD);
        }
        C27106By5 by5 = this.A01;
        C27106By5 by52 = by5;
        if (by5 != null) {
            by5 = by5.A03(bzD);
        }
        if (A012 == this.A00 && by5 == by52) {
            return this;
        }
        return new ObjectArrayDeserializer(this.A02, A012, by5);
    }
}
