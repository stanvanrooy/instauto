package p000X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.C0003R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.resources.downloadable.impl.LanguagePackLoader;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0kH  reason: invalid class name and case insensitive filesystem */
public final class C14330kH {
    public static C14330kH A0A;
    public C14440kc A00;
    public final Context A01;
    public final Resources A02;
    public final C14320kG A03;
    public final C11720fR A04;
    public final C11670fM A05;
    public final AtomicReference A06 = new AtomicReference();
    public final AtomicReference A07 = new AtomicReference();
    public volatile boolean A08 = false;
    public volatile boolean A09 = true;

    public static C15040mE A00(C14330kH r3, int i) {
        String str;
        if (!r3.A08) {
            boolean z = false;
            if (i == C0003R.string.common_google_play_services_unknown_issue) {
                z = true;
            }
            if (!z) {
                try {
                    str = r3.A02.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    str = AnonymousClass000.A0E("ID #0x", Integer.toHexString(i));
                }
                AnonymousClass0QD.A02("string_resources_delegate", StringFormatUtil.formatStrLocaleSafe("StringResourcesDelegate used before initialized: resource %s requested", str));
            }
        }
        if (!r3.A09) {
            return null;
        }
        C15040mE r0 = (C15040mE) r3.A06.get();
        if (r0 != null) {
            return r0;
        }
        C11720fR r2 = r3.A04;
        if (r2.A00) {
            return null;
        }
        C89513uM r1 = new C89513uM(r2.A01.A02("fbresources_not_available"));
        if (!r1.A0B()) {
            return null;
        }
        r1.A01();
        r2.A00 = true;
        return null;
    }

    public final CharSequence A01(int i) {
        String A012;
        if ((-65536 & i) == C0003R.string.APPIRATER_CANCEL_BUTTON) {
            Integer num = 0;
            C15040mE A002 = A00(this, i);
            if (!(A002 == null || (A012 = A002.A01(i, num.intValue())) == null)) {
                return A012;
            }
        }
        return this.A02.getString(i);
    }

    public final Locale A02() {
        Locale locale = (Locale) this.A07.get();
        if (locale == null) {
            return this.A05.A00();
        }
        return locale;
    }

    public final void A04() {
        Locale A002 = this.A05.A00();
        if (this.A08 && !A002.equals(this.A07.getAndSet(A002))) {
            this.A06.set((Object) null);
            A03();
        }
    }

    public C14330kH(Context context, Resources resources, C11670fM r5, C11720fR r6, C14320kG r7) {
        this.A01 = context;
        this.A02 = resources;
        this.A05 = r5;
        this.A04 = r6;
        this.A03 = r7;
        synchronized (r5) {
            r5.A00.add(this);
        }
        this.A07.set(this.A05.A00());
        A03();
        this.A08 = true;
    }

    public final void A03() {
        this.A09 = this.A03.A00(A02());
        boolean A002 = this.A03.A00(A02());
        if (A002 && this.A06.get() == null) {
            synchronized (this) {
                synchronized (this) {
                    C14440kc r0 = this.A00;
                    if (r0 == null || r0.isDone()) {
                        this.A00 = new C14440kc();
                    }
                }
                String locale = A02().toString();
                C05700Lp.A00().ADc(new LanguagePackLoader(this.A01, locale, new C14550ky(this, locale)));
            }
        } else if (!A002 && this.A06.get() != null) {
            this.A06.set((Object) null);
        }
    }
}
