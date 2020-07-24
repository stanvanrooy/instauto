package p000X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.instagram.user.model.MicroUser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.02j  reason: invalid class name and case insensitive filesystem */
public final class C024402j implements AnonymousClass0J6, AnonymousClass0J5 {
    public final AnonymousClass0J9 A00;
    public final AnonymousClass0CM A01;
    public final C12860hV A02;
    public final AnonymousClass0J7 A03;

    public final C13300iJ A01(String str) {
        for (C13300iJ r1 : this.A00.A01.keySet()) {
            if (r1.getId().equals(str)) {
                return r1;
            }
        }
        return null;
    }

    public final List A02() {
        return this.A00.A01((C13300iJ) null);
    }

    public final List A03(C13300iJ r2) {
        return this.A00.A01(r2);
    }

    public final List A04(String str) {
        ArrayList arrayList = new ArrayList();
        for (C13300iJ r1 : this.A00.A01.keySet()) {
            if (str == null || !str.equals(r1.getId())) {
                arrayList.add(r1.getId());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final void A05(Context context, AnonymousClass0C1 r9, C13300iJ r10) {
        if (((Boolean) AnonymousClass0L6.A02(r9, AnonymousClass0L7.LAUNCHER_FORCE_SWITCH_ON_DIALOG, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C11130eT.A00().BXT(new C05140Ig(r10.getId(), r9.A03().AZn(), (Runnable) new C05280Ix(this, context, r9, r10)));
        } else {
            this.A01.A00(context, r9);
            A00(this, context, r9, r10);
            C11130eT.A00().BXT(new C05140Ig(r10.getId(), r9.A03().AZn(), (Runnable) null));
        }
        C90413vs A002 = C90413vs.A00(AnonymousClass0QT.A00(r9, (AnonymousClass0RN) null));
        A002.A0C("force_logout");
        A002.A0E(r10.getId());
        A002.A0D(r9.A04());
        A002.A01();
    }

    public final void A06(Context context, AnonymousClass0C1 r10, C13300iJ r11, String str, Intent intent) {
        AnonymousClass00B r5 = AnonymousClass00B.A01;
        C13300iJ r6 = r11;
        String str2 = str;
        AnonymousClass0C1 r4 = r10;
        if (r5 != null) {
            r5.markerStart(31784965);
            C12670hC.A04(new C05290Iy(this, r4, r5, r6, str2));
        }
        if (intent != null) {
            intent.putExtra("EXTRA_SWITCHED_FROM_USER", r10.A03().AZn());
        }
        C90413vs A002 = C90413vs.A00(AnonymousClass0QT.A00(r10, (AnonymousClass0RN) null));
        A002.A0C(str);
        A002.A0E(r11.getId());
        A002.A0D(r10.A04());
        A002.A01();
        C49922Ee.A00(r10);
        A00(this, context, r10, r11);
        if (((Boolean) AnonymousClass0L6.A02(r10, AnonymousClass0L7.SYNCHRONOUS_ACCOUNT_SWITCH, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C11130eT A003 = C11130eT.A00();
            C11150eV.A00(A003.A00, new C05140Ig(r11.getId(), intent, str));
            return;
        }
        C11130eT.A00().BXT(new C05140Ig(r11.getId(), intent, str));
    }

    public final void A07(C13300iJ r4) {
        if (this.A00.A01.containsKey(r4)) {
            AnonymousClass0J9 r2 = this.A00;
            AnonymousClass0a4.A0A(r2.A01.containsKey(r4));
            Map map = r2.A01;
            map.put(r4, map.get(r4));
            AnonymousClass0J9.A00(r2);
        }
    }

    public final boolean A08() {
        if (this.A00.A01.size() <= 1) {
            return false;
        }
        return true;
    }

    public final List APG() {
        List<C13300iJ> A012 = this.A00.A01((C13300iJ) null);
        ArrayList arrayList = new ArrayList();
        for (C13300iJ microUser : A012) {
            arrayList.add(new MicroUser(microUser));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final int APH() {
        return this.A00.A01.size();
    }

    public final Set API() {
        HashSet hashSet = new HashSet();
        for (C13300iJ id : this.A00.A01.keySet()) {
            hashSet.add(id.getId());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public final boolean Ady(String str) {
        for (C13300iJ id : this.A00.A01((C13300iJ) null)) {
            if (id.getId().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public C024402j(AnonymousClass0J9 r1, AnonymousClass0CM r2, AnonymousClass0J7 r3, C12860hV r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A02 = r4;
    }

    public static void A00(C024402j r2, Context context, AnonymousClass0C1 r4, C13300iJ r5) {
        C11130eT.A00().BXT(new C05120Ie());
        r2.A03.A01(context, r4, r5, AnonymousClass0J1.A04(r2));
    }

    public final boolean A09(Activity activity, AnonymousClass0C1 r4) {
        if (!AnonymousClass5EG.A01(r4)) {
            this.A02.A00(activity);
            return false;
        } else if (C16860pH.A00(activity, r4)) {
            return true;
        } else {
            this.A02.A01(r4, activity, false);
            return false;
        }
    }

    public final boolean A0A(Context context, AnonymousClass0C1 r6, C13300iJ r7) {
        if (!C16860pH.A00(context, r6)) {
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_account_switch_blocked", (AnonymousClass0RN) null);
            Iterator it = new ArrayList(C16860pH.A00).iterator();
            while (it.hasNext()) {
                ((C16850pG) it.next()).Aql(context, r6, A002);
            }
            AnonymousClass0WN.A01(r6).BcG(A002);
            this.A02.A01(r6, context, false);
            return false;
        } else if (!r7.getId().equals(r6.A03().getId())) {
            return true;
        } else {
            AnonymousClass0QD.A03("MultipleAccountUtil_duplicateAccountSwitch", "Tried to switch to same user twice", 1);
            return false;
        }
    }
}
