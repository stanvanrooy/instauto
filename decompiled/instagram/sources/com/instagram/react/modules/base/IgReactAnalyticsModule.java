package com.instagram.react.modules.base;

import com.facebook.fbreact.specs.NativeAnalyticsSpec;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.module.annotations.ReactModule;
import p000X.A0j;
import p000X.A1e;
import p000X.A3D;
import p000X.A44;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0WN;
import p000X.C06170Oa;
import p000X.C06270Ok;
import p000X.C06590Pq;
import p000X.C13910jS;
import p000X.C23043A0y;

@ReactModule(name = "Analytics")
public class IgReactAnalyticsModule extends NativeAnalyticsSpec {
    public static final String MODULE_NAME = "Analytics";
    public final C06590Pq mSession;

    public String getName() {
        return MODULE_NAME;
    }

    public void logCounter(String str, double d) {
    }

    public IgReactAnalyticsModule(A44 a44, C06590Pq r2) {
        super(a44);
        this.mSession = r2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r3.equals("step_view_loaded") == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r3.equals("resend_blocked") == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r3.equals("next_blocked") == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r3.equals("resend_tapped") == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r3.equals("this_wasnt_me") == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r3.equals("this_was_me") == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r3.equals("dismiss") == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r3.equals("next_tapped") == false) goto L_0x0007;
     */
    private AnonymousClass0P4 getAnalyticsEvent(String str, String str2) {
        char c;
        C13910jS r1;
        switch (str.hashCode()) {
            case -1581452433:
                c = 6;
                break;
            case 656693737:
                c = 7;
                break;
            case 963638032:
                c = 5;
                break;
            case 1229418656:
                c = 2;
                break;
            case 1326426600:
                c = 4;
                break;
            case 1491939820:
                c = 0;
                break;
            case 1514698072:
                c = 3;
                break;
            case 1671672458:
                c = 1;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                r1 = C13910jS.CheckpointScreenLoaded;
                break;
            case 1:
                r1 = C13910jS.CheckpointDismiss;
                break;
            case 2:
                r1 = C13910jS.CheckpointNextBlocked;
                break;
            case 3:
                r1 = C13910jS.CheckpointNextTapped;
                break;
            case 4:
                r1 = C13910jS.CheckpointResendBlocked;
                break;
            case 5:
                r1 = C13910jS.CheckpointResendTapped;
                break;
            case 6:
                r1 = C13910jS.CheckpointThisWasMeTapped;
                break;
            case 7:
                r1 = C13910jS.CheckpointThisWasntMeTapped;
                break;
            default:
                return AnonymousClass0P4.A00(str, new A3D(this, str2));
        }
        return r1.A01(this.mSession).A00();
    }

    public static C06170Oa obtainExtraArray(A1e a1e) {
        C06170Oa A00 = C06170Oa.A00();
        for (int i = 0; i < a1e.size(); i++) {
            switch (a1e.getType(i).ordinal()) {
                case 0:
                    A00.A04("null");
                    break;
                case 1:
                    A00.A06(a1e.getBoolean(i));
                    break;
                case 2:
                    A00.A01(a1e.getDouble(i));
                    break;
                case 3:
                    A00.A04(a1e.getString(i));
                    break;
                case 4:
                    A00.A00.add(obtainExtraBundle(a1e.getMap(i)));
                    break;
                case 5:
                    A00.A00.add(obtainExtraArray(a1e.getArray(i)));
                    break;
                default:
                    throw new A0j("Unknown data type");
            }
        }
        return A00;
    }

    public static C06270Ok obtainExtraBundle(C23043A0y a0y) {
        ReadableMapKeySetIterator keySetIterator = a0y.keySetIterator();
        C06270Ok A00 = C06270Ok.A00();
        while (keySetIterator.Aby()) {
            String Aq1 = keySetIterator.Aq1();
            switch (a0y.getType(Aq1).ordinal()) {
                case 0:
                    A00.A09(Aq1, "null");
                    break;
                case 1:
                    A00.A05(Aq1, Boolean.valueOf(a0y.getBoolean(Aq1)));
                    break;
                case 2:
                    A00.A00.A03(Aq1, Double.valueOf(a0y.getDouble(Aq1)));
                    break;
                case 3:
                    A00.A09(Aq1, a0y.getString(Aq1));
                    break;
                case 4:
                    A00.A03(Aq1, obtainExtraBundle(a0y.getMap(Aq1)));
                    break;
                case 5:
                    A00.A04(Aq1, obtainExtraArray(a0y.getArray(Aq1)));
                    break;
                default:
                    throw new A0j("Unknown data type");
            }
        }
        return A00;
    }

    public static void setDataAsExtra(AnonymousClass0P4 r4, C23043A0y a0y) {
        ReadableMapKeySetIterator keySetIterator = a0y.keySetIterator();
        while (keySetIterator.Aby()) {
            String Aq1 = keySetIterator.Aq1();
            switch (a0y.getType(Aq1).ordinal()) {
                case 0:
                    r4.A0G(Aq1, "null");
                    break;
                case 1:
                    r4.A0A(Aq1, Boolean.valueOf(a0y.getBoolean(Aq1)));
                    break;
                case 2:
                    r4.A0C(Aq1, Double.valueOf(a0y.getDouble(Aq1)));
                    break;
                case 3:
                    r4.A0G(Aq1, a0y.getString(Aq1));
                    break;
                case 4:
                    r4.A08(Aq1, obtainExtraBundle(a0y.getMap(Aq1)));
                    break;
                case 5:
                    r4.A09(Aq1, obtainExtraArray(a0y.getArray(Aq1)));
                    break;
                default:
                    throw new A0j("Unknown data type");
            }
        }
    }

    public void logEvent(String str, C23043A0y a0y, String str2) {
        AnonymousClass0P4 analyticsEvent = getAnalyticsEvent(str, str2);
        setDataAsExtra(analyticsEvent, a0y);
        AnonymousClass0WN.A01(this.mSession).BcG(analyticsEvent);
    }

    public void logRealtimeEvent(String str, C23043A0y a0y, String str2) {
        AnonymousClass0P4 analyticsEvent = getAnalyticsEvent(str, str2);
        setDataAsExtra(analyticsEvent, a0y);
        AnonymousClass0WN.A01(this.mSession).BdB(analyticsEvent);
    }
}
