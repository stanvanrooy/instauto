package com.instagram.save.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1PZ;
import p000X.AnonymousClass2TX;
import p000X.C13300iJ;
import p000X.C28691Ms;

public class SavedCollection extends C28691Ms implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(81);
    public AnonymousClass1NJ A00;
    public AnonymousClass2TX A01;
    public C13300iJ A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;
    public List A08;
    public List A09;
    public List A0A;

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A05, this.A00, this.A01, this.A09});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavedCollection)) {
            return false;
        }
        SavedCollection savedCollection = (SavedCollection) obj;
        if (!AnonymousClass17M.A00(this.A04, savedCollection.A04) || !AnonymousClass17M.A00(this.A05, savedCollection.A05) || !AnonymousClass17M.A00(this.A00, savedCollection.A00) || !AnonymousClass17M.A00(this.A01, savedCollection.A01) || !AnonymousClass17M.A00(this.A09, Collections.unmodifiableList(savedCollection.A09))) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01.A01);
        parcel.writeStringList(this.A08);
    }

    public final void A00(AnonymousClass1NJ r2) {
        this.A06 = r2.APo();
        this.A00 = r2;
    }

    public final void A01(AnonymousClass0C1 r6) {
        this.A00 = AnonymousClass1PZ.A00(r6).A02(this.A06);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : this.A08) {
            AnonymousClass1NJ A022 = AnonymousClass1PZ.A00(r6).A02(str);
            if (A022 != null) {
                arrayList.add(str);
                arrayList2.add(A022);
            }
        }
        this.A08 = arrayList;
        this.A09 = arrayList2;
    }

    public SavedCollection() {
        this.A03 = Constants.ZERO;
        this.A01 = AnonymousClass2TX.MEDIA;
        this.A09 = new ArrayList();
        this.A0A = new ArrayList();
        this.A08 = new ArrayList();
    }

    public SavedCollection(AnonymousClass2TX r2) {
        this.A03 = Constants.ZERO;
        this.A01 = AnonymousClass2TX.MEDIA;
        this.A09 = new ArrayList();
        this.A0A = new ArrayList();
        this.A08 = new ArrayList();
        String str = r2.A01;
        this.A04 = str;
        this.A05 = str;
        this.A01 = r2;
    }

    public SavedCollection(Parcel parcel) {
        this.A03 = Constants.ZERO;
        this.A01 = AnonymousClass2TX.MEDIA;
        this.A09 = new ArrayList();
        this.A0A = new ArrayList();
        this.A08 = new ArrayList();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A01 = AnonymousClass2TX.A00(parcel.readString());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.A08 = arrayList;
    }

    public SavedCollection(String str) {
        this.A03 = Constants.ZERO;
        this.A01 = AnonymousClass2TX.MEDIA;
        this.A09 = new ArrayList();
        this.A0A = new ArrayList();
        this.A08 = new ArrayList();
        this.A04 = null;
        this.A05 = str;
    }
}
