package com.fbpay.hub.form.cell.text;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.fbpay.hub.form.cell.CellParams;
import com.fbpay.hub.form.cell.text.formatter.TextFormatter;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import p000X.Constants;
import p000X.AnonymousClass0a4;
import p000X.C26476BmE;
import p000X.C26537BnE;

public class TextCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(109);
    public final int A00;
    public final TextFormatter A01;
    public final ImmutableList A02;
    public final Integer A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        switch (this.A03.intValue()) {
            case 1:
                str = "ALPHA_NUMERIC_UPPERCASE";
                break;
            case 2:
                str = "NUMERICAL";
                break;
            case 3:
                str = "STRING";
                break;
            case 4:
                str = "STRING_UPPERCASE";
                break;
            case 5:
                str = "PHONE";
                break;
            case 6:
                str = "EMAIL";
                break;
            default:
                str = "ALPHA_NUMERIC";
                break;
        }
        parcel.writeString(str);
        parcel.writeList(this.A02);
        parcel.writeValue(this.A01);
    }

    public TextCellParams(C26476BmE bmE) {
        super((C26537BnE) bmE);
        this.A05 = bmE.A04;
        this.A00 = bmE.A00;
        this.A04 = null;
        this.A03 = bmE.A03;
        this.A02 = bmE.A02;
        this.A01 = bmE.A01;
    }

    public TextCellParams(Parcel parcel) {
        super(parcel);
        Integer num;
        this.A05 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A04 = parcel.readString();
        String readString = parcel.readString();
        AnonymousClass0a4.A06(readString);
        if (readString.equals("ALPHA_NUMERIC")) {
            num = Constants.ZERO;
        } else if (readString.equals("ALPHA_NUMERIC_UPPERCASE")) {
            num = Constants.ONE;
        } else if (readString.equals("NUMERICAL")) {
            num = Constants.A0C;
        } else if (readString.equals("STRING")) {
            num = Constants.A0N;
        } else if (readString.equals("STRING_UPPERCASE")) {
            num = Constants.A0Y;
        } else if (readString.equals("PHONE")) {
            num = Constants.A0j;
        } else if (readString.equals("EMAIL")) {
            num = Constants.A0u;
        } else {
            throw new IllegalArgumentException(readString);
        }
        AnonymousClass0a4.A06(num);
        this.A03 = num;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, TextValidatorParams.class.getClassLoader());
        this.A02 = ImmutableList.A09(arrayList);
        this.A01 = (TextFormatter) parcel.readValue(TextFormatter.class.getClassLoader());
    }
}
