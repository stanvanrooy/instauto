package p000X;

import com.facebook.common.payments.paymentmethods.model.CreditCard;
import com.facebook.common.payments.paymentmethods.model.NewCreditCard;
import com.facebook.common.payments.paymentmethods.model.NewPayPal;
import com.facebook.common.payments.paymentmethods.model.PayPalBillingAgreement;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.payments.checkout.model.CheckoutScreenEntity;
import com.instagram.payments.checkout.model.CheckoutScreenPaymentCredentials;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.DGR */
public final class DGR implements C28044CaS {
    public final /* synthetic */ C223729kF A00;

    public DGR(C223729kF r1) {
        this.A00 = r1;
    }

    public final void BPv(C28049CaX caX) {
        DGb dGb = caX.A00.A00;
        AnonymousClass0a4.A06(dGb);
        AnonymousClass0a4.A06(dGb.A01);
        AnonymousClass0a4.A06(dGb.A00);
        List<DGe> list = dGb.A02;
        ArrayList arrayList = new ArrayList();
        for (DGe dGe : list) {
            Integer num = dGe.A0C;
            AnonymousClass0a4.A06(num);
            switch (num.intValue()) {
                case 2:
                    DGX dgx = new DGX();
                    dgx.A04 = dGe.A0X;
                    dgx.A03 = dGe.A0L;
                    dgx.A02 = dGe.A0K;
                    dgx.A01 = dGe.A0G;
                    dgx.A00 = dGe.A0F;
                    arrayList.add(new CheckoutScreenEntity(dgx));
                    break;
                case C120125Dh.VIEW_TYPE_BADGE:
                    C29255Cug cug = new C29255Cug();
                    List<DGY> list2 = dGe.A0O;
                    ArrayList arrayList2 = new ArrayList();
                    for (DGY dgy : list2) {
                        CHG chg = dgy.A00;
                        AnonymousClass0a4.A06(chg);
                        C26669BpT bpT = chg.A01;
                        AnonymousClass0a4.A06(bpT);
                        switch (bpT.ordinal()) {
                            case 1:
                                String str = chg.A07;
                                AnonymousClass0a4.A06(str);
                                Integer num2 = chg.A03;
                                AnonymousClass0a4.A06(num2);
                                String str2 = chg.A05;
                                AnonymousClass0a4.A06(str2);
                                String str3 = chg.A06;
                                AnonymousClass0a4.A06(str3);
                                String str4 = chg.A08;
                                AnonymousClass0a4.A06(str4);
                                DGV dgv = new DGV();
                                dgv.A05 = C27456CDy.A01(num2);
                                dgv.A01 = str2;
                                dgv.A02 = str3;
                                dgv.A03 = str;
                                dgv.A04 = str4;
                                dgv.A00 = C228449tR.A00(chg.A0D);
                                String str5 = chg.A0A;
                                if (str5 != null) {
                                    dgv.A06 = str5;
                                }
                                AnonymousClass0a4.A07(dgv.A03, "Id cannot be null in CreditCard");
                                AnonymousClass0a4.A07(dgv.A01, "Expiry Month cannot be null in CreditCard");
                                AnonymousClass0a4.A07(dgv.A02, "Expiry year cannot be null in CreditCard");
                                AnonymousClass0a4.A07(dgv.A04, "Last four cannot be null in CreditCard");
                                AnonymousClass0a4.A07(dgv.A05, "PaymentCardType four cannot be null in CreditCard");
                                arrayList2.add(new DGa(new CreditCard(dgv)));
                                break;
                            case 2:
                                String str6 = chg.A07;
                                AnonymousClass0a4.A06(str6);
                                String str7 = chg.A04;
                                AnonymousClass0a4.A06(str7);
                                Integer num3 = chg.A02;
                                AnonymousClass0a4.A06(num3);
                                DGW dgw = new DGW(str6, str7);
                                dgw.A00 = CHJ.A00(num3);
                                String str8 = chg.A0A;
                                if (str8 != null) {
                                    dgw.A01 = str8;
                                }
                                arrayList2.add(new DGa(new PayPalBillingAgreement(dgw)));
                                break;
                            case C120125Dh.VIEW_TYPE_BRANDING:
                                C229829yi r2 = new C229829yi();
                                r2.A03 = new HashSet(C228449tR.A01(chg.A0E));
                                r2.A02 = C228449tR.A01(chg.A0F);
                                r2.A00 = C228449tR.A00(chg.A0D);
                                String str9 = chg.A0A;
                                if (str9 != null) {
                                    r2.A01 = str9;
                                }
                                arrayList2.add(new DGa(new NewCreditCard(r2)));
                                break;
                            case C120125Dh.NUM_VIEW_TYPES:
                                String str10 = chg.A0A;
                                AnonymousClass0a4.A06(str10);
                                String str11 = chg.A0C;
                                AnonymousClass0a4.A06(str11);
                                String str12 = chg.A09;
                                AnonymousClass0a4.A06(str12);
                                arrayList2.add(new DGa(new NewPayPal(str10, str11, str12)));
                                break;
                            default:
                                new IllegalArgumentException(StringFormatUtil.formatStrLocaleSafe("Payment Method is not supported", (Object) bpT));
                                break;
                        }
                    }
                    cug.A00 = arrayList2;
                    cug.A01 = dGe.A0X;
                    arrayList.add(new CheckoutScreenPaymentCredentials(cug));
                    break;
            }
        }
        AnonymousClass0a4.A06(dGb.A00);
    }

    public final void B41(C28047CaV caV) {
    }
}
