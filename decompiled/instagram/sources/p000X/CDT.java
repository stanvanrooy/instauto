package p000X;

import android.content.Context;
import android.view.View;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import com.instagram.react.views.maps.IgStaticMapViewManager;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.CDT */
public final class CDT implements View.OnClickListener {
    public final /* synthetic */ CD9 A00;

    public CDT(CD9 cd9) {
        this.A00 = cd9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if (r1.A03() == false) goto L_0x0029;
     */
    public final void onClick(View view) {
        boolean z;
        int i;
        List A04;
        List A042;
        List A043;
        double d;
        double d2;
        String str;
        int i2;
        C17850qu A03;
        C28351Lj r0;
        String str2;
        List list;
        List list2;
        List list3;
        double d3;
        double d4;
        int i3;
        int A05 = AnonymousClass0Z0.A05(1031252982);
        CD9 cd9 = this.A00;
        CCZ.A07(cd9.A0E, cd9.A0A, "done_button");
        C27452CDu cDu = this.A00.A0E.A08;
        if (!AnonymousClass1BX.A00(cDu.A03)) {
            z = true;
        }
        z = false;
        if (z) {
            CD9 cd92 = this.A00;
            boolean z2 = false;
            if (cd92.A0A == C27398CBr.EDIT_AUDIENCE) {
                z2 = true;
            }
            if (z2) {
                CD8 cd8 = cd92.A0B;
                CBY cby = new CBY(cd92);
                ImmutableList A01 = cd8.A04.A08.A01();
                List list4 = null;
                if (AnonymousClass0OX.A00(A01)) {
                    d3 = 0.0d;
                    d4 = 0.0d;
                    list2 = null;
                    list3 = null;
                    list = null;
                    str2 = null;
                    i3 = 0;
                } else if (CDX.A03(A01)) {
                    C27473CEp cEp = (C27473CEp) A01.get(0);
                    d3 = cEp.A00;
                    d4 = cEp.A01;
                    i3 = cEp.A02;
                    str2 = cEp.A05;
                    list2 = null;
                    list3 = null;
                    list = null;
                } else {
                    list2 = CDV.A04(A01, CFL.COUNTRY);
                    List A044 = CDV.A04(A01, CFL.REGION);
                    list3 = CDV.A04(A01, CFL.CITY);
                    list = CDV.A04(A01, CFL.ZIP);
                    d3 = 0.0d;
                    d4 = 0.0d;
                    str2 = null;
                    list4 = A044;
                    i3 = 0;
                }
                AnonymousClass0C1 r15 = cd8.A0D;
                CD3 cd3 = cd8.A04;
                String str3 = cd3.A0R;
                C27452CDu cDu2 = cd3.A08;
                String str4 = cDu2.A02;
                String str5 = cd3.A0X;
                String str6 = cDu2.A03;
                int i4 = cDu2.A01;
                int i5 = cDu2.A00;
                ImmutableList A002 = CDV.A00(cDu2);
                ImmutableList A012 = CDV.A01(cd8.A04.A08);
                List list5 = list;
                C15890nh r1 = new C15890nh(r15);
                r1.A09 = Constants.ONE;
                r1.A0C = "ads/promote/edit_audience/";
                r1.A0A("audience_id", str4);
                r1.A09("fb_auth_token", str3);
                r1.A09("fb_actor_id", str5);
                r1.A0A("address", str2);
                r1.A0A("audience_name", str6);
                r1.A06(C23653AWq.class, false);
                if (list2 != null) {
                    r1.A09("countries", new JSONArray(list2).toString());
                }
                if (list4 != null) {
                    r1.A09("region_keys", new JSONArray(list4).toString());
                }
                if (list3 != null) {
                    r1.A09("city_keys", new JSONArray(list3).toString());
                }
                if (list != null) {
                    r1.A09("zip_keys", new JSONArray(list5).toString());
                }
                if (!AnonymousClass0OX.A00(A012)) {
                    r1.A09("interest_ids", new JSONArray(A012).toString());
                }
                if (!(i5 == 0 || i4 == 0)) {
                    r1.A09("min_age", String.valueOf(i4));
                    r1.A09("max_age", String.valueOf(i5));
                }
                if (!(d4 == 0.0d || d3 == 0.0d)) {
                    r1.A09(IgStaticMapViewManager.LONGITUDE_KEY, String.valueOf(d4));
                    r1.A09(IgStaticMapViewManager.LATITUDE_KEY, String.valueOf(d3));
                }
                if (i3 != 0) {
                    r1.A09("radius", String.valueOf(i3));
                }
                if (!AnonymousClass0OX.A00(A002)) {
                    r1.A09("genders", new JSONArray(A002).toString());
                }
                A03 = r1.A03();
                A03.A00 = cby;
                r0 = cd8.A09;
            } else {
                CD8 cd82 = cd92.A0B;
                CD8 cd83 = cd82;
                CDP cdp = new CDP(cd92);
                ImmutableList A013 = cd82.A04.A08.A01();
                AnonymousClass0a4.A07(A013, "cannot create audience without a location");
                int i6 = 0;
                List list6 = null;
                if (cd83.A04.A08.A01().size() == 1 && ((C27473CEp) A013.get(0)).A03 == CFL.CUSTOM_LOCATION) {
                    C27473CEp cEp2 = (C27473CEp) A013.get(0);
                    d = cEp2.A00;
                    d2 = cEp2.A01;
                    i6 = cEp2.A02;
                    str = cEp2.A05;
                    i2 = i6;
                    A04 = null;
                    A042 = null;
                    A043 = null;
                } else {
                    A04 = CDV.A04(A013, CFL.COUNTRY);
                    List A045 = CDV.A04(A013, CFL.REGION);
                    A042 = CDV.A04(A013, CFL.CITY);
                    A043 = CDV.A04(A013, CFL.ZIP);
                    d = 0.0d;
                    d2 = 0.0d;
                    str = null;
                    list6 = A045;
                    i2 = 0;
                }
                CD8 cd84 = cd83;
                AnonymousClass0C1 r152 = cd84.A0D;
                CD3 cd32 = cd84.A04;
                String str7 = cd32.A0R;
                String str8 = cd32.A0X;
                String str9 = cd32.A0S;
                C27452CDu cDu3 = cd32.A08;
                String str10 = cDu3.A03;
                int i7 = cDu3.A01;
                int i8 = cDu3.A00;
                ImmutableList A003 = CDV.A00(cDu3);
                ImmutableList A014 = CDV.A01(cd83.A04.A08);
                List list7 = A043;
                C15890nh r12 = new C15890nh(r152);
                r12.A09 = Constants.ONE;
                r12.A0C = "ads/promote/create_audience/";
                r12.A09("fb_auth_token", str7);
                r12.A09("fb_actor_id", str8);
                r12.A09("ad_account_id", str9);
                r12.A0A("address", str);
                r12.A0A("audience_name", str10);
                r12.A06(C27466CEi.class, false);
                if (A04 != null) {
                    r12.A09("countries", new JSONArray(A04).toString());
                }
                if (list6 != null) {
                    r12.A09("region_keys", new JSONArray(list6).toString());
                }
                if (A042 != null) {
                    r12.A09("city_keys", new JSONArray(A042).toString());
                }
                if (A043 != null) {
                    r12.A09("zip_keys", new JSONArray(list7).toString());
                }
                if (!AnonymousClass0OX.A00(A014)) {
                    r12.A09("interest_ids", new JSONArray(A014).toString());
                }
                if (!(i8 == 0 || i7 == 0)) {
                    r12.A09("min_age", String.valueOf(i7));
                    r12.A09("max_age", String.valueOf(i8));
                }
                if (!(d2 == 0.0d || d == 0.0d)) {
                    r12.A09(IgStaticMapViewManager.LONGITUDE_KEY, String.valueOf(d2));
                    r12.A09(IgStaticMapViewManager.LATITUDE_KEY, String.valueOf(d));
                }
                if (i6 != 0) {
                    r12.A09("radius", String.valueOf(i2));
                }
                if (!AnonymousClass0OX.A00(A003)) {
                    r12.A09("genders", new JSONArray(A003).toString());
                }
                A03 = r12.A03();
                A03.A00 = cdp;
                r0 = cd83.A09;
            }
            r0.schedule(A03);
        } else {
            CD9 cd93 = this.A00;
            Context context = cd93.getContext();
            C27452CDu cDu4 = cd93.A0E.A08;
            if (AnonymousClass1BX.A00(cDu4.A03)) {
                i = C0003R.string.promote_create_audience_no_name_alert;
            } else {
                boolean A004 = AnonymousClass0OX.A00(cDu4.A01());
                i = -1;
                if (A004) {
                    i = C0003R.string.promote_create_audience_no_location_alert;
                }
            }
            AnonymousClass5F9.A03(context, cd93.getString(i), 0);
        }
        AnonymousClass0Z0.A0C(-1941859344, A05);
    }
}
