package p000X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: X.13f  reason: invalid class name and case insensitive filesystem */
public final class C240813f implements C19340tK, C17690qe, C06570Po {
    public static final SimpleDateFormat A02 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    public final int A00;
    public final List A01;

    public final String ALl() {
        return "direct_mutation_manager";
    }

    public final String ALm() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    public final void B1d(C17090pf r1) {
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static synchronized C240813f A00(AnonymousClass0C1 r4) {
        C240813f r2;
        Class<C240813f> cls = C240813f.class;
        synchronized (cls) {
            r2 = (C240813f) r4.AV9(cls);
            if (r2 == null) {
                int i = 50;
                if (C14090jk.A01(r4)) {
                    i = 200;
                }
                r2 = new C240813f(i);
                r4.BYi(cls, r2);
            }
        }
        return r2;
    }

    public static void A01(C240813f r3, C241013h r4) {
        synchronized (r3.A01) {
            if (r3.A01.size() >= r3.A00) {
                r3.A01.remove(0);
            }
            r3.A01.add(r4);
        }
    }

    public final String AIl(Context context) {
        ArrayList<C241013h> arrayList;
        StringWriter stringWriter = new StringWriter();
        synchronized (this.A01) {
            arrayList = new ArrayList<>(this.A01);
        }
        for (C241013h r3 : arrayList) {
            stringWriter.append(A02.format(new Date(r3.A00))).append(' ').append(r3.A06);
            if (r3.A05 != null) {
                stringWriter.append(" delayMillis=").append(Long.toString(r3.A05.longValue()));
            }
            if (r3.A09 != null) {
                stringWriter.append(" reason=").append(r3.A09);
            }
            if (r3.A07 != null) {
                stringWriter.append(" mutationId=").append(r3.A07);
            }
            if (r3.A0A != null) {
                stringWriter.append(" mutationType=").append(r3.A0A);
            }
            if (r3.A03 != null) {
                stringWriter.append(" isValid=").append(Boolean.toString(r3.A03.booleanValue()));
            }
            if (r3.A08 != null) {
                stringWriter.append(" queueKey=").append(r3.A08);
            }
            if (r3.A02 != null) {
                stringWriter.append(" isRetry=").append(Boolean.toString(r3.A02.booleanValue()));
            }
            if (r3.A04 != null) {
                stringWriter.append(" shouldRetry=").append(Boolean.toString(r3.A04.booleanValue()));
            }
            if (r3.A01 != null) {
                stringWriter.append(" sendError=").append(r3.A01.toString());
            }
            stringWriter.append(10);
        }
        return stringWriter.toString();
    }

    public final void Auc(C17090pf r3) {
        C240913g r1 = new C240913g("cancel");
        r1.A00(r3);
        A01(this, new C241013h(r1));
    }

    public final void Axy(C17090pf r3) {
        C240913g r1 = new C240913g("confirm");
        r1.A00(r3);
        A01(this, new C241013h(r1));
    }

    public final void B0J(C17090pf r3, boolean z, String str) {
        C240913g r1 = new C240913g("dispatch");
        r1.A00(r3);
        r1.A02 = Boolean.valueOf(z);
        r1.A07 = str;
        A01(this, new C241013h(r1));
    }

    public final void BCM(C17090pf r3, boolean z, C06270Ok r5) {
        C240913g r1 = new C240913g("executing");
        r1.A00(r3);
        r1.A01 = Boolean.valueOf(z);
        A01(this, new C241013h(r1));
    }

    public final void BCN(C17090pf r3, boolean z, AnonymousClass4R2 r5, C06270Ok r6) {
        C240913g r1 = new C240913g("failed");
        r1.A00(r3);
        r1.A03 = Boolean.valueOf(z);
        r1.A00 = r5;
        A01(this, new C241013h(r1));
    }

    public final void BCR(C17090pf r3, C06270Ok r4) {
        C240913g r1 = new C240913g("success");
        r1.A00(r3);
        A01(this, new C241013h(r1));
    }

    public final void BK4(C17090pf r3, boolean z, String str) {
        C240913g r1 = new C240913g("retry");
        r1.A00(r3);
        r1.A02 = Boolean.valueOf(z);
        r1.A07 = str;
        A01(this, new C241013h(r1));
    }

    public C240813f(int i) {
        this.A00 = i;
        this.A01 = new ArrayList(i);
        A01(this, new C241013h(new C240913g("initialize")));
    }
}
