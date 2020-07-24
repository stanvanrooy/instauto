package p000X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.List;

/* renamed from: X.1Ry  reason: invalid class name and case insensitive filesystem */
public final class C29961Ry implements C29971Rz {
    public final AnonymousClass1PL A00;
    public final Activity A01;
    public final C29971Rz A02;
    public final AnonymousClass1S0 A03;
    public final AnonymousClass0C1 A04;

    public final void BTG(AnonymousClass1NJ r11, int i, int i2, int i3, C06270Ok r15) {
        ExtendedImageUrl extendedImageUrl;
        int height;
        int width;
        AnonymousClass1NJ r5 = r11;
        if (r11.A0T() != null) {
            extendedImageUrl = r11.A0S(this.A01);
        } else {
            extendedImageUrl = null;
        }
        C29971Rz r4 = this.A02;
        if (extendedImageUrl == null) {
            height = 0;
        } else {
            height = extendedImageUrl.getHeight();
        }
        if (extendedImageUrl == null) {
            width = 0;
        } else {
            width = extendedImageUrl.getWidth();
        }
        r4.BTG(r5, i, height, width, r15);
        C36841ih APu = this.A00.APu(r11);
        if (r11.A1W() && APu.AHt() == 0 && C43261u6.A00()) {
            C05760Lv r42 = C05760Lv.A01;
            r42.A00.edit().putInt("carousel_nux_impressions", r42.A00.getInt("carousel_nux_impressions", 0) + 1).apply();
        }
        C36841ih APu2 = this.A00.APu(r11);
        AnonymousClass0C1 r2 = this.A04;
        ((C39321mi) r2.AVA(C39321mi.class, new C39341ml(r2))).A01.containsKey(r11.A0u());
        if (r11.A1W()) {
            APu2.A09(this.A01);
        }
        String str = r11.A2E;
        if (str != null && C16170o9.A00()) {
            C16170o9.A00.A01(this.A01, this.A04, str);
        }
    }

    public final void BVv(Bundle bundle) {
    }

    public final void Ajs(AnonymousClass1NJ r8, AnonymousClass1NJ r9, AnonymousClass1NJ r10, int i, int i2, int i3) {
        this.A02.Ajs(r8, r9, r10, i, i2, i3);
    }

    public final void Ar3(int i, int i2, Intent intent) {
        this.A02.Ar3(i, i2, intent);
    }

    public final void AyU() {
        this.A02.AyU();
    }

    public final void Ayk(View view) {
        this.A02.Ayk(view);
    }

    public final void Azd() {
        this.A02.Azd();
    }

    public final void Azh() {
        this.A02.Azh();
    }

    public final void B8F(AnonymousClass1NJ r2) {
        this.A02.B8F(r2);
    }

    public final void B8Q(AnonymousClass1NJ r2, int i) {
        this.A02.B8Q(r2, i);
    }

    public final void B8S(AnonymousClass1NJ r2, View view, double d) {
        this.A02.B8S(r2, view, d);
    }

    public final void BE0() {
        this.A02.BE0();
    }

    public final void BJx() {
        this.A02.BJx();
    }

    public final void BKp(Bundle bundle) {
        this.A02.BKp(bundle);
    }

    public final void BP6() {
        this.A02.BP6();
    }

    public final void BTE(AnonymousClass1NJ r5) {
        this.A02.BTE(r5);
        AnonymousClass0C1 r2 = this.A04;
        C39321mi r3 = (C39321mi) r2.AVA(C39321mi.class, new C39341ml(r2));
        String A0u = r5.A0u();
        List list = (List) r3.A01.remove(A0u);
        if (list != null && !list.isEmpty()) {
            r3.A02.remove(A0u);
            RealtimeClientManager.getInstance(r3.A00).graphqlUnsubscribeCommand(list);
        }
    }

    public final void BTF(AnonymousClass1NJ r2, String str, double d) {
        this.A02.BTF(r2, str, d);
    }

    public final void BVf(View view, Bundle bundle) {
        this.A02.BVf(view, bundle);
    }

    public final void onStart() {
        this.A02.onStart();
    }

    public C29961Ry(Activity activity, AnonymousClass0C1 r9, C27371Ho r10, AnonymousClass1PL r11, AnonymousClass1LO r12, C29941Rw r13) {
        this.A04 = r9;
        this.A00 = r11;
        AnonymousClass1S0 r1 = new AnonymousClass1S0(r10, r9, r13);
        this.A03 = r1;
        Activity activity2 = activity;
        this.A02 = new AnonymousClass1S2(r1, (Context) activity2, r9, r10, r11, r12);
        this.A01 = activity;
    }
}
