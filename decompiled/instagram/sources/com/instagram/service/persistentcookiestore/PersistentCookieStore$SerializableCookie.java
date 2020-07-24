package com.instagram.service.persistentcookiestore;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import p000X.AnonymousClass1BQ;

public class PersistentCookieStore$SerializableCookie implements Serializable {
    public static final long serialVersionUID = 6374381828722046732L;
    public final transient AnonymousClass1BQ mCookieToSerialize;
    public transient AnonymousClass1BQ mDeserializedCookie;

    private void readObject(ObjectInputStream objectInputStream) {
        this.mDeserializedCookie = new AnonymousClass1BQ((String) objectInputStream.readObject(), (String) objectInputStream.readObject(), (String) objectInputStream.readObject(), (String) null, (Date) objectInputStream.readObject(), (String) objectInputStream.readObject(), (String) objectInputStream.readObject(), (int[]) null, objectInputStream.readBoolean(), false, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.mCookieToSerialize.A04);
        objectOutputStream.writeObject(this.mCookieToSerialize.A06);
        objectOutputStream.writeObject(this.mCookieToSerialize.A01);
        objectOutputStream.writeObject(this.mCookieToSerialize.A03);
        objectOutputStream.writeObject(this.mCookieToSerialize.A07);
        objectOutputStream.writeObject(this.mCookieToSerialize.A05);
        objectOutputStream.writeInt(this.mCookieToSerialize.A00);
        objectOutputStream.writeBoolean(this.mCookieToSerialize.A09);
    }

    public AnonymousClass1BQ getCookie() {
        AnonymousClass1BQ r1 = this.mCookieToSerialize;
        AnonymousClass1BQ r0 = this.mDeserializedCookie;
        if (r0 != null) {
            return r0;
        }
        return r1;
    }

    public PersistentCookieStore$SerializableCookie(AnonymousClass1BQ r1) {
        this.mCookieToSerialize = r1;
    }
}
