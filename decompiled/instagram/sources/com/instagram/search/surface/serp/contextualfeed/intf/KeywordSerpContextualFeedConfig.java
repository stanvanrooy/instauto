package com.instagram.search.surface.serp.contextualfeed.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.model.keyword.Keyword;
import p000X.AnonymousClass11J;
import p000X.C221149fs;

public class KeywordSerpContextualFeedConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(455);
    public final SectionPagination A00;
    public final Keyword A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
    }

    public KeywordSerpContextualFeedConfig(C221149fs r2) {
        String str = r2.A03;
        AnonymousClass11J.A00(str);
        this.A03 = str;
        SectionPagination sectionPagination = r2.A00;
        AnonymousClass11J.A00(sectionPagination);
        this.A00 = sectionPagination;
        Keyword keyword = r2.A01;
        AnonymousClass11J.A00(keyword);
        this.A01 = keyword;
        this.A02 = r2.A02;
    }

    public KeywordSerpContextualFeedConfig(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A00 = (SectionPagination) parcel.readParcelable(SectionPagination.class.getClassLoader());
        this.A01 = (Keyword) parcel.readParcelable(Keyword.class.getClassLoader());
        this.A02 = parcel.readString();
    }
}
