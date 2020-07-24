package p000X;

import android.app.Notification;
import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.11o  reason: invalid class name and case insensitive filesystem */
public final class C237211o implements AnonymousClass0C2 {
    public static C237211o A05;
    public static final C237311p[] A06 = {new C237411q(), new C237511r(), new C237611s(), new C237711t(), new C237811u(), new C237911v(), new C238011w(), new C238111x()};
    public final Context A00;
    public final AnonymousClass121 A01;
    public final AnonymousClass0C1 A02;
    public final Runnable A03 = new C238311z(this);
    public final Executor A04 = Executors.newSingleThreadExecutor();

    public static C237211o A00(AnonymousClass0C1 r2) {
        return (C237211o) r2.AVA(C237211o.class, new C238211y(r2));
    }

    public static boolean A02() {
        if (!((Boolean) C05640Lj.A01(AnonymousClass0L7.DIRECT_INBOX_MAS_ENTRYPOINT_BADGE_LAUNCHER, "in_app_badge_experiment", false)).booleanValue() || !((Boolean) C05640Lj.A00(AnonymousClass0L7.MUTIPLE_ACCOUNT_LAUNCHER_BADGE_CONFIG, "is_enabled", false)).booleanValue()) {
            return false;
        }
        return true;
    }

    public final void onUserSessionWillEnd(boolean z) {
        boolean z2 = false;
        if (C22000xg.A00 != null) {
            z2 = true;
        }
        if (z2) {
            C12670hC.A04(new C137155tA(this));
        }
    }

    public C237211o(Context context, AnonymousClass0C1 r5) {
        AnonymousClass120 r2 = new AnonymousClass120(this);
        this.A01 = r2;
        this.A00 = context;
        this.A02 = r5;
        if (r5 != null) {
            C22000xg r1 = C22000xg.A00;
            if (r1 != null) {
                r1.A02(r5, r2);
            }
        }
    }

    public static void A01(Context context, Notification notification, List list) {
        if (!list.isEmpty() && C134465ob.A00(context)) {
            C42891tQ r0 = ((C42861tN) list.get(list.size() - 1)).A00;
            int i = 0;
            if (r0 != null) {
                i = r0.A01 + 0 + r0.A00;
            }
            try {
                Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
                obj.getClass().getDeclaredMethod("setMessageCount", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(i)});
            } catch (Exception e) {
                AnonymousClass0QD.A05(C134465ob.class.getName(), "unexpected exception", e);
            }
        }
    }

    public final void onUserSessionStart(boolean z) {
        AnonymousClass0Z0.A0A(-1091221666, AnonymousClass0Z0.A03(-663084230));
    }
}
