package p000X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.CHR */
public final class CHR implements CHX {
    public final C25007Axz A00;
    public final CHV A01;
    public final Integer A02;
    public final Set A03 = new CopyOnWriteArraySet();
    public final AnonymousClass1L8 A04;
    public final C27538CHc A05;
    public final AnonymousClass0C1 A06;
    public final WeakReference A07;

    public final C27541CHg AVg() {
        return null;
    }

    public static void A00(CHR chr) {
        for (WeakReference weakReference : chr.A03) {
            C27539CHd cHd = (C27539CHd) weakReference.get();
            if (cHd == null) {
                chr.A03.remove(weakReference);
            } else {
                cHd.At5();
            }
        }
    }

    public static void A01(CHR chr) {
        Context context = (Context) chr.A07.get();
        if (context != null) {
            AnonymousClass5F9.A01(context, C0003R.string.error, 0);
        }
    }

    public static void A02(CHR chr) {
        chr.A06.A06.A1e = Integer.valueOf(chr.A01.A00.size());
        for (WeakReference weakReference : chr.A03) {
            C27539CHd cHd = (C27539CHd) weakReference.get();
            if (cHd == null) {
                chr.A03.remove(weakReference);
            } else {
                cHd.Aww();
            }
        }
    }

    public static void A03(CHR chr, int i) {
        for (WeakReference weakReference : chr.A03) {
            C27539CHd cHd = (C27539CHd) weakReference.get();
            if (cHd == null) {
                chr.A03.remove(weakReference);
            } else {
                cHd.B9C(i);
            }
        }
    }

    public static void A04(CHR chr, C17850qu r3) {
        Context context = (Context) chr.A07.get();
        if (context != null) {
            C28351Lj.A00(context, chr.A04, r3);
        }
    }

    public final void A05(C27539CHd cHd) {
        for (WeakReference weakReference : this.A03) {
            C27539CHd cHd2 = (C27539CHd) weakReference.get();
            if (cHd2 == null || cHd2 == cHd) {
                this.A03.remove(weakReference);
            }
        }
    }

    public final void BR4(AnonymousClass1ZK r12, C155936lE r13, boolean z, CI0 ci0, int i, String str) {
        List list;
        IgTextView igTextView;
        int i2;
        this.A05.BR3();
        Context context = (Context) this.A07.get();
        if (this.A05.A7l()) {
            C155936lE r9 = r13;
            C13300iJ r8 = r13.A02;
            List arrayList = new ArrayList();
            arrayList.add(r8.getId());
            boolean z2 = !this.A01.A00.contains(new C155936lE(r8, true));
            r13.A00 = z2;
            r13.A01 = true;
            int i3 = i;
            A03(this, i3);
            if (context != null) {
                if (z2) {
                    igTextView = ((C155896lA) r12).A05;
                    i2 = C0003R.string.added_to_close_friends_accessibility;
                } else {
                    igTextView = ((C155896lA) r12).A03;
                    i2 = C0003R.string.removed_from_close_friends_accessibility;
                }
                AnonymousClass2YN.A03(igTextView, context.getString(i2, new Object[]{r8.AZn()}));
            }
            C25007Axz axz = this.A00;
            Integer num = Constants.ONE;
            if (z2) {
                list = arrayList;
            } else {
                list = Collections.EMPTY_LIST;
            }
            if (z2) {
                arrayList = Collections.EMPTY_LIST;
            }
            C17850qu A022 = C25007Axz.A02(axz.A01, axz.A00, num, list, arrayList);
            A022.A00 = new CHS(this, z2, r8, r9, i3);
            A04(this, A022);
        } else if (context != null) {
            AnonymousClass5F9.A01(context, C0003R.string.close_friends_v2_add_or_remove_while_loading_error_toast, 0);
        }
    }

    public final void BR8(C13300iJ r6) {
        String str;
        this.A05.BR7();
        Context context = (Context) this.A07.get();
        if (context != null) {
            AnonymousClass0C1 r3 = this.A06;
            String id = r6.getId();
            if (1 - this.A02.intValue() != 0) {
                str = "CLOSE_FRIENDS_V2_SEARCH";
            } else {
                str = "CLOSE_FRIENDS_V2_LIST";
            }
            AnonymousClass1HD A022 = C18980sj.A00.A00().A02(C52902Qq.A01(r3, id, "favorites_home_user_row", str).A03());
            C52362Om r1 = new C52362Om((FragmentActivity) context, this.A06);
            r1.A0B = true;
            r1.A02 = A022;
            r1.A02();
        }
    }

    public CHR(Context context, AnonymousClass0C1 r4, AnonymousClass1L8 r5, Integer num, CHV chv, C27538CHc cHc) {
        this.A07 = new WeakReference(context);
        this.A06 = r4;
        this.A02 = num;
        this.A04 = r5;
        this.A01 = chv;
        this.A05 = cHc;
        this.A00 = new C25007Axz(r4, new CHY(this));
    }
}
