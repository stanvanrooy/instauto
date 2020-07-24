package p000X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1zF  reason: invalid class name and case insensitive filesystem */
public final class C46171zF extends C29121Or {
    public C30281Tf A00;
    public AnonymousClass1Z3 A01;
    public AnonymousClass0C1 A02;

    public final /* bridge */ /* synthetic */ void A72(C29491Qc r3, Object obj, Object obj2) {
        C36331hs r4 = (C36331hs) obj;
        C36841ih r5 = (C36841ih) obj2;
        this.A00.BY4(r4, r5);
        this.A01.A72(r3, r4.APe(), r5);
    }

    public final int ANH(int i, Object obj, Object obj2) {
        if (obj instanceof C36331hs) {
            obj = ((C36331hs) obj).APe();
        }
        return this.A01.ANH(i, obj, obj2);
    }

    public final int AaQ(int i, Object obj, Object obj2) {
        if (obj instanceof C36331hs) {
            obj = ((C36331hs) obj).APe();
        }
        return this.A01.AaQ(i, obj, obj2);
    }

    public final int getViewTypeCount() {
        return this.A01.getViewTypeCount();
    }

    public C46171zF(AnonymousClass0C1 r1, AnonymousClass1Z3 r2) {
        this.A02 = r1;
        this.A01 = r2;
    }

    public final void A6f(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0Z0.A03(499277286);
        if (obj instanceof C36331hs) {
            C36331hs r6 = (C36331hs) obj;
            AnonymousClass11C.A00(this.A02).A02(r6);
            this.A01.A6f(i, view, r6.APe(), obj2);
        } else {
            this.A01.A6f(i, view, obj, obj2);
        }
        AnonymousClass0Z0.A0A(-1223525217, A03);
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0Z0.A03(443264290);
        View ABB = this.A01.ABB(i, viewGroup);
        AnonymousClass0Z0.A0A(856323295, A03);
        return ABB;
    }
}
