package p000X;

import com.google.common.collect.ImmutableList;
import com.instagram.react.views.maps.IgStaticMapViewManager;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.CDU */
public final class CDU implements AnonymousClass0PF {
    public final /* synthetic */ CDW A00;

    public CDU(CDW cdw) {
        this.A00 = cdw;
    }

    public final /* bridge */ /* synthetic */ void AzE(Object obj) {
        String str;
        List list;
        List list2;
        List list3;
        List list4;
        double d;
        double d2;
        int i;
        C27493CFj cFj = (C27493CFj) obj;
        CDW cdw = this.A00;
        C27493CFj cFj2 = cdw.A00;
        if (cFj2 == C27493CFj.A01 || !cFj2.equals(cFj)) {
            cdw.A00 = cFj;
            C27452CDu cDu = cFj.A00;
            cdw.A08.A00();
            CD8 cd8 = cdw.A04;
            int i2 = cDu.A01;
            int i3 = cDu.A00;
            ImmutableList A002 = cDu.A00();
            ImmutableList A01 = cDu.A01();
            ImmutableList A02 = cDu.A02();
            C17740qj r1 = cdw.A07;
            C27435CDd cDd = new C27435CDd(cdw, cDu);
            ArrayList arrayList = new ArrayList();
            C17750qk r16 = null;
            if (!AnonymousClass0OX.A00(A002)) {
                C239512q A0I = A002.iterator();
                while (A0I.hasNext()) {
                    arrayList.add(((C27485CFb) A0I.next()).A00);
                }
            } else {
                arrayList = null;
            }
            if (AnonymousClass0OX.A00(A01)) {
                list = null;
                list2 = null;
                list3 = null;
                list4 = null;
                str = null;
                d = 0.0d;
                d2 = 0.0d;
                i = 0;
            } else if (A01.size() == 1 && ((C27473CEp) A01.get(0)).A03 == CFL.CUSTOM_LOCATION) {
                C27473CEp cEp = (C27473CEp) A01.get(0);
                d = cEp.A00;
                d2 = cEp.A01;
                i = cEp.A02;
                str = cEp.A05;
                list = null;
                list2 = null;
                list3 = null;
                list4 = null;
            } else {
                list = CDV.A04(A01, CFL.COUNTRY);
                list2 = CDV.A04(A01, CFL.REGION);
                list3 = CDV.A04(A01, CFL.CITY);
                list4 = CDV.A04(A01, CFL.ZIP);
                str = null;
                d = 0.0d;
                d2 = 0.0d;
                i = 0;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!AnonymousClass0OX.A00(A02)) {
                C239512q A0I2 = A02.iterator();
                while (A0I2.hasNext()) {
                    arrayList2.add(((CG9) A0I2.next()).A00);
                }
            } else {
                arrayList2 = null;
            }
            if (r1 != null) {
                r16 = r1.A00;
            }
            AnonymousClass0C1 r0 = cd8.A0D;
            CD3 cd3 = cd8.A04;
            String str2 = cd3.A0S;
            C15890nh r2 = new C15890nh(r0);
            r2.A09 = Constants.ONE;
            r2.A0C = "ads/promote/audience_potential_reach/";
            r2.A09("fb_auth_token", cd3.A0R);
            r2.A09("ad_account_id", str2);
            r2.A09("min_age", String.valueOf(i2));
            r2.A09("max_age", String.valueOf(i3));
            r2.A0A("address", str);
            r2.A06(C25994Bdo.class, false);
            if (arrayList != null) {
                r2.A09("genders", new JSONArray(arrayList).toString());
            }
            if (list != null) {
                r2.A09("countries", new JSONArray(list).toString());
            }
            if (list2 != null) {
                r2.A09("region_keys", new JSONArray(list2).toString());
            }
            if (list3 != null) {
                r2.A09("city_keys", new JSONArray(list3).toString());
            }
            if (list4 != null) {
                r2.A09("zip_keys", new JSONArray(list4).toString());
            }
            if (arrayList2 != null) {
                r2.A09("interest_ids", new JSONArray(arrayList2).toString());
            }
            if (!(d2 == 0.0d || d == 0.0d)) {
                r2.A09(IgStaticMapViewManager.LONGITUDE_KEY, String.valueOf(d2));
                r2.A09(IgStaticMapViewManager.LATITUDE_KEY, String.valueOf(d));
            }
            if (i != 0) {
                r2.A09("radius", String.valueOf(i));
            }
            if (r16 != null) {
                r2.A04 = r16;
            }
            C17850qu A03 = r2.A03();
            A03.A00 = cDd;
            cd8.A09.schedule(A03);
        }
    }
}
