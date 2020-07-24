package p000X;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0Vv  reason: invalid class name and case insensitive filesystem */
public final class C08150Vv {
    public static C07150Ry A00;
    public static AnonymousClass0OT A01;
    public static boolean A02;
    public static AnonymousClass0WC A03;
    public static AnonymousClass0VM A04;
    public static AnonymousClass0VK A05;
    public static final C07080Rr A06 = new C07080Rr();

    public static synchronized AnonymousClass0WC A00() {
        AnonymousClass0WC r0;
        synchronized (C08150Vv.class) {
            if (A03 == null) {
                A03 = new AnonymousClass0WC();
            }
            r0 = A03;
        }
        return r0;
    }

    public static synchronized AnonymousClass0VM A02(String str, File file, AnonymousClass0S4 r13, AnonymousClass0RY r14, AnonymousClass0RQ r15) {
        AnonymousClass0VM r0;
        synchronized (C08150Vv.class) {
            r0 = A04;
            if (r0 == null) {
                File file2 = file;
                String str2 = str;
                if (r15.A0J) {
                    A04 = new AnonymousClass0QC(new AnonymousClass0V9(str2, AnonymousClass000.A0J("567067343352427", "|", "f249176f09e26ce54212b472dbab8fa8"), new StringBuilder(), r15.A0D, r15.A0K), new AnonymousClass0RW(file2, r15), r13, r14, r15);
                } else {
                    A04 = new C06870Qu(str, file, r13, r14, r15);
                }
                r0 = A04;
            }
        }
        return r0;
    }

    public static AnonymousClass0VK A03(Context context, AnonymousClass0RQ r2) {
        if (r2.A0G && A05 == null) {
            try {
                A05 = new AnonymousClass0VK(context);
            } catch (IOException | IllegalStateException e) {
                AnonymousClass0QD.A09("BatchFileCounter", e);
            }
        }
        return A05;
    }

    public static C08030Vj A01(C07030Rm r7, C06590Pq r8, AnonymousClass0RQ r9, AnonymousClass0S4 r10, AnonymousClass0VW r11) {
        String A012 = C06630Pu.A01(r7.getContext());
        int A002 = C06630Pu.A00(r7.getContext());
        C06800Ql ARq = r7.ARq(r8);
        Context applicationContext = r7.getContext().getApplicationContext();
        AnonymousClass0RT r5 = new AnonymousClass0RT(A012, A002);
        AnonymousClass0RS r6 = new AnonymousClass0RS(applicationContext);
        AnonymousClass0RP r72 = new AnonymousClass0RP(ARq);
        AnonymousClass0VW r82 = r11;
        if (r9.A0J) {
            return new AnonymousClass0QS(r5, r6, r72, r82, r9, r10, A03(applicationContext, r9));
        }
        return new C06900Qx(r5, r6, r72, r82, r9, r10, A03(applicationContext, r9));
    }
}
