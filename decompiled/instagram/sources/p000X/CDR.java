package p000X;

import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;

/* renamed from: X.CDR */
public final class CDR extends C17920r1 {
    public final /* synthetic */ CDB A00;

    public CDR(CDB cdb) {
        this.A00 = cdb;
    }

    public final void onFail(C43791v5 r6) {
        String str;
        int A03 = AnonymousClass0Z0.A03(-285264780);
        Throwable th = r6.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        CCZ.A0C(this.A00.A04, C27398CBr.QUICK_PROMOTE_SAVE_SETTING, "audience_fetch", str);
        CDB.A01(this.A00, C0003R.string.quick_promote_audience_update_fail_text);
        AnonymousClass0Z0.A0A(1238483637, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(1780707770);
        super.onFinish();
        CDB.A03(this.A00, false);
        AnonymousClass0Z0.A0A(1737095137, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(-1788542646);
        super.onStart();
        CDB.A03(this.A00, true);
        AnonymousClass0Z0.A0A(-2116991335, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ImmutableList A01;
        ImmutableList A012;
        int A03 = AnonymousClass0Z0.A03(102727785);
        CFZ cfz = (CFZ) obj;
        int A032 = AnonymousClass0Z0.A03(-739831719);
        List list = cfz.A01;
        if (list != null) {
            A01 = ImmutableList.A09(list);
        } else {
            A01 = ImmutableList.A01();
        }
        if (A01 == null) {
            CCZ.A0C(this.A00.A04, C27398CBr.QUICK_PROMOTE_SAVE_SETTING, "audience_fetch", "");
            CDB.A01(this.A00, C0003R.string.quick_promote_audience_update_fail_text);
            AnonymousClass0Z0.A0A(-1006619232, A032);
        } else {
            CD3 cd3 = this.A00.A04;
            List list2 = cfz.A01;
            if (list2 != null) {
                A012 = ImmutableList.A09(list2);
            } else {
                A012 = ImmutableList.A01();
            }
            cd3.A0h = A012;
            CD3 cd32 = this.A00.A04;
            cd32.A0z = cfz.A02;
            for (CFW cfw : cd32.A0h) {
                if (CDV.A05(cfw)) {
                    Map map = this.A00.A04.A0l;
                    Integer num = cfw.A02;
                    AnonymousClass0a4.A06(num);
                    map.put(CGU.A00(num), cfw);
                } else {
                    Map map2 = this.A00.A04.A0l;
                    String str = cfw.A03;
                    AnonymousClass0a4.A06(str);
                    map2.put(str, cfw);
                }
            }
            CD3 cd33 = this.A00.A04;
            CCZ.A0F(cd33, C27398CBr.QUICK_PROMOTE_SAVE_SETTING, cd33.A0l.keySet());
            CDB cdb = this.A00;
            cdb.A06.A03(cdb.A04);
            AnonymousClass0Z0.A0A(-859089103, A032);
        }
        AnonymousClass0Z0.A0A(-1573227625, A03);
    }
}
