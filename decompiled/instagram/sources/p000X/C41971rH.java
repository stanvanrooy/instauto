package p000X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.rti.push.service.FbnsService;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.push.fbns.FbnsInitBroadcastReceiver;
import java.util.Random;

/* renamed from: X.1rH  reason: invalid class name and case insensitive filesystem */
public final class C41971rH implements C41981rI {
    public FbnsInitBroadcastReceiver A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final C08370Wt A05;
    public final AnonymousClass0Q6 A06 = new C42141rk(this);
    public final C41981rI A07;
    public final String A08;
    public final ConnectivityManager A09;

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fb, code lost:
        if ((!((java.lang.Boolean) p000X.C05680Ln.A0i.A00()).booleanValue()) == false) goto L_0x00fd;
     */
    public final void AdL(String str, boolean z) {
        boolean z2;
        boolean z3 = null;
        String str2 = str;
        this.A01 = str2;
        boolean z4 = z;
        this.A02 = z4;
        if (!this.A03) {
            BA0();
            return;
        }
        synchronized (this) {
            AnonymousClass0Q7.A03().A0B(this.A06);
            if (this.A00 == null && C42171rn.A00(this.A04)) {
                this.A00 = new FbnsInitBroadcastReceiver();
                IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                if (C42171rn.A01(this.A04)) {
                    intentFilter.addAction("android.intent.action.USER_PRESENT");
                }
                this.A04.registerReceiver(this.A00, intentFilter);
            }
        }
        A00(true);
        if (str != null) {
            Context context = this.A04;
            String A052 = C05860Mt.A02.A05(context);
            int i = 30;
            int i2 = 10000;
            if (z || !(!AnonymousClass0TT.A00(context).A02)) {
                i = 10000;
            } else {
                i2 = 30;
            }
            Integer valueOf = Integer.valueOf(i2);
            Bundle bundle = new Bundle();
            boolean z5 = false;
            if (i2 > 10000) {
                AnonymousClass0DB.A0K("FbnsClient", "Wrong analytics sampling rate: %d", Integer.valueOf(i));
                i = 1;
            }
            if (new Random().nextInt(10000) < i) {
                z5 = true;
            }
            C08400Ww.LOGGING_ANALYTICS_EVENTS_SAMPLE_RATE.A02(bundle, Integer.valueOf(i));
            C08400Ww.LOG_ANALYTICS_EVENTS.A02(bundle, Boolean.valueOf(z5));
            if (z) {
                C08400Ww.ANALYTIC_FB_UID.A02(bundle, str2);
            } else {
                C08400Ww.ANALYTIC_FB_UID.A02(bundle, "");
            }
            C08400Ww.ANALYTIC_UID.A02(bundle, A052);
            C08400Ww.ANALYTIC_IS_EMPLOYEE.A02(bundle, Boolean.valueOf(z4));
            C08400Ww.ANALYTIC_YEAR_CLASS.A02(bundle, -1);
            C08400Ww.LOGGING_HEALTH_STATS_SAMPLE_RATE.A02(bundle, valueOf);
            new C08290Wl(context).A01(new FbnsAIDLRequest(bundle, C08310Wn.SET_ANALYTICS_CONFIG.A00));
        }
        if (C06080Nr.A07(this.A04)) {
            z2 = true;
        }
        z2 = false;
        if (z2) {
            z3 = true;
        }
        AnonymousClass0VA r5 = new AnonymousClass0VA(z3, (Integer) null);
        C08370Wt r1 = this.A05;
        String ALb = r1.A01.ALb();
        if (ALb != null) {
            if (AnonymousClass0UP.A01(ALb)) {
                C08340Wq.A00(r1.A00);
            }
            Context context2 = r1.A00;
            if (ALb == null) {
                ALb = context2.getPackageName();
            }
            C08340Wq.A01(context2, FbnsService.A01(ALb), "init", ALb, "Orca.START", r5);
            return;
        }
        C08340Wq.A00(r1.A00);
    }

    public final void BA0() {
        A00(false);
        C08370Wt r5 = this.A05;
        String ALb = r5.A01.ALb();
        if (ALb != null) {
            Context context = r5.A00;
            String A012 = FbnsService.A01(ALb);
            String str = ALb;
            if (ALb == null) {
                str = context.getPackageName();
            }
            if (A012 == null) {
                A012 = FbnsService.A01(str);
            }
            Intent intent = new Intent("com.facebook.rti.fbns.intent.UNREGISTER");
            intent.setComponent(new ComponentName(str, A012));
            intent.putExtra("pkg_name", context.getPackageName());
            new AnonymousClass0UR(context).A03(intent);
        }
        C08340Wq.A00(r5.A00);
        C11000eG A002 = new C10960eC(r5.A00).A00(Constants.A03).A00();
        A002.A00.clear();
        A002.A00.apply();
        Context context2 = this.A04;
        Bundle bundle = new Bundle();
        C08400Ww.ANALYTIC_FB_UID.A02(bundle, (Object) null);
        C08400Ww.ANALYTIC_IS_EMPLOYEE.A02(bundle, false);
        new C08290Wl(context2).A01(new FbnsAIDLRequest(bundle, C08310Wn.SET_ANALYTICS_CONFIG.A00));
    }

    public C41971rH(Context context, C41981rI r4) {
        this.A04 = context;
        this.A08 = "567067343352427";
        this.A07 = r4;
        this.A09 = (ConnectivityManager) context.getSystemService("connectivity");
        this.A05 = new C08370Wt(context, new C42151rl(this));
        this.A03 = C42161rm.A00(this.A04);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0031 */
    private void A00(boolean z) {
        Class<FbnsInitBroadcastReceiver> cls = FbnsInitBroadcastReceiver.class;
        ComponentName componentName = new ComponentName(this.A04, cls);
        PackageManager packageManager = this.A04.getPackageManager();
        cls.getCanonicalName();
        int i = 2;
        if (z) {
            i = 1;
        }
        packageManager.setComponentEnabledSetting(componentName, i, 1);
        if (!z) {
            synchronized (this) {
                AnonymousClass0Q7.A03().A0D(this.A06);
                FbnsInitBroadcastReceiver fbnsInitBroadcastReceiver = this.A00;
                if (fbnsInitBroadcastReceiver != null) {
                    try {
                        this.A04.unregisterReceiver(fbnsInitBroadcastReceiver);
                    } catch (IllegalArgumentException ) {
                        this.A00 = null;
                    } catch (Throwable th) {
                        this.A00 = null;
                        throw th;
                    }
                    this.A00 = null;
                }
            }
            return;
        }
        return;
    }

    public final PushChannelType ATL() {
        if (this.A03) {
            return PushChannelType.FBNS;
        }
        C41981rI r0 = this.A07;
        if (r0 != null) {
            return r0.ATL();
        }
        return PushChannelType.NONE;
    }

    public final void AqO(B5P b5p) {
        C41981rI r0 = this.A07;
        if (r0 != null) {
            r0.AqO(b5p);
        } else if (b5p != null) {
            b5p.A00.B8Z(false);
        }
    }

    public final void BZU() {
        boolean A002 = C42161rm.A00(this.A04);
        if (this.A03 != A002) {
            this.A03 = A002;
            AdL(this.A01, this.A02);
        }
        if (this.A03) {
            C08370Wt r2 = this.A05;
            String str = this.A08;
            String ALb = r2.A01.ALb();
            if (ALb != null) {
                Context context = r2.A00;
                if (ALb == null) {
                    ALb = context.getPackageName();
                }
                String A012 = FbnsService.A01(ALb);
                AnonymousClass0UR r4 = new AnonymousClass0UR(context);
                String str2 = ALb;
                if (!TextUtils.isEmpty(str)) {
                    if (ALb == null) {
                        str2 = context.getPackageName();
                    }
                    if (context.getPackageName().equals(str2)) {
                        C08340Wq.A02(context, true, A012);
                    }
                    Intent intent = new Intent("com.facebook.rti.fbns.intent.REGISTER");
                    intent.setComponent(new ComponentName(str2, A012));
                    intent.putExtra("pkg_name", context.getPackageName());
                    intent.putExtra("appid", str);
                    r4.A03(intent);
                } else {
                    throw new IllegalArgumentException("Missing appId");
                }
            }
        }
        C41981rI r0 = this.A07;
        if (r0 != null) {
            r0.BZU();
        }
    }
}
