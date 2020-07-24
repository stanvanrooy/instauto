package com.fbpay.hub.form.cell;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.fbpay.hub.form.cell.address.AddressCellParams;
import com.fbpay.hub.form.cell.creditcard.CreditCardCellParams;
import com.fbpay.hub.form.cell.label.LabelCellParams;
import com.fbpay.hub.form.cell.text.TextCellParams;
import com.fbpay.hub.form.cell.text.TextValidatorParams;
import com.fbpay.hub.form.cell.toggle.SwitchCellParams;
import p000X.AnonymousClass267;
import p000X.BVO;
import p000X.Bk2;
import p000X.C181197oQ;
import p000X.C239512q;
import p000X.C25466BMa;
import p000X.C26460Blr;
import p000X.C26461Bls;
import p000X.C26463Blx;
import p000X.C26464Bly;
import p000X.C26483BmL;
import p000X.C26487BmP;
import p000X.C26509Bmm;
import p000X.C26537BnE;
import p000X.C26582Bnz;

public abstract class CellParams implements Parcelable {
    public Bk2 A00;
    public final float A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public C26582Bnz A00(Context context, ViewGroup.LayoutParams layoutParams) {
        if (this instanceof SwitchCellParams) {
            C26483BmL bmL = new C26483BmL(context);
            bmL.setLayoutParams(layoutParams);
            return bmL;
        } else if (this instanceof TextCellParams) {
            C26464Bly bly = new C26464Bly(context);
            bly.setLayoutParams(layoutParams);
            return bly;
        } else if (!(this instanceof LabelCellParams)) {
            boolean z = this instanceof CreditCardCellParams;
            C26487BmP bmP = new C26487BmP(context);
            bmP.setLayoutParams(layoutParams);
            return bmP;
        } else {
            BVO bvo = new BVO(context);
            bvo.setLayoutParams(layoutParams);
            return bvo;
        }
    }

    public Bk2 A01() {
        if (this instanceof SwitchCellParams) {
            SwitchCellParams switchCellParams = (SwitchCellParams) this;
            return new C26509Bmm(switchCellParams.A02, switchCellParams.A04, switchCellParams.A03, switchCellParams.A01, switchCellParams.A00);
        } else if (this instanceof TextCellParams) {
            TextCellParams textCellParams = (TextCellParams) this;
            AnonymousClass267 r5 = new AnonymousClass267();
            C239512q A0I = textCellParams.A02.iterator();
            while (A0I.hasNext()) {
                TextValidatorParams textValidatorParams = (TextValidatorParams) A0I.next();
                r5.A08(C181197oQ.A00(textValidatorParams.A01, textValidatorParams.A03, textValidatorParams.A02, textValidatorParams.A00));
            }
            return new C26463Blx(textCellParams.A02, textCellParams.A04, textCellParams.A03, textCellParams.A05, textCellParams.A00, textCellParams.A04, textCellParams.A03, r5.A06(), textCellParams.A01);
        } else if (this instanceof LabelCellParams) {
            LabelCellParams labelCellParams = (LabelCellParams) this;
            return new C25466BMa(labelCellParams.A02, labelCellParams.A04, labelCellParams.A03, labelCellParams.A02, labelCellParams.A00, labelCellParams.A01);
        } else if (!(this instanceof CreditCardCellParams)) {
            AddressCellParams addressCellParams = (AddressCellParams) this;
            return new C26460Blr(addressCellParams.A02, addressCellParams.A04, addressCellParams.A03, addressCellParams.A01, addressCellParams.A06, addressCellParams.A02, addressCellParams.A03, addressCellParams.A04, addressCellParams.A05, addressCellParams.A00);
        } else {
            CreditCardCellParams creditCardCellParams = (CreditCardCellParams) this;
            return new C26461Bls(creditCardCellParams.A02, creditCardCellParams.A04, creditCardCellParams.A03, creditCardCellParams.A01, creditCardCellParams.A00);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeFloat(this.A01);
    }

    public CellParams(C26537BnE bnE) {
        this.A02 = bnE.A03;
        this.A04 = bnE.A02;
        this.A03 = bnE.A01;
        this.A01 = bnE.A00;
    }

    public CellParams(Parcel parcel) {
        this.A02 = parcel.readInt();
        boolean z = true;
        this.A04 = parcel.readByte() != 0;
        this.A03 = parcel.readByte() == 0 ? false : z;
        this.A01 = parcel.readFloat();
    }
}
