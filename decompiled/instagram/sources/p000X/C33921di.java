package p000X;

import android.os.SystemClock;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1di  reason: invalid class name and case insensitive filesystem */
public final class C33921di implements AnonymousClass0Q6, C06570Po {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public AnonymousClass2M5 A04;
    public AnonymousClass2FD A05;
    public C58302fi A06;
    public C23648AWl A07;
    public AnonymousClass4Xg A08;
    public C58172fV A09;
    public C58212fZ A0A;
    public Long A0B = Long.valueOf(SystemClock.elapsedRealtime());
    public String A0C;
    public String A0D;
    public String A0E;
    public List A0F;
    public List A0G;
    public List A0H;
    public List A0I;
    public List A0J;
    public List A0K;
    public List A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final long A0U;
    public final C23300zv A0V;
    public final AnonymousClass0C1 A0W;
    public final HashSet A0X = new HashSet();
    public final Map A0Y = new HashMap();

    public final void A08(boolean z) {
        if (!this.A0T) {
            C17850qu A012 = C483327o.A01(this.A0W, (String) null, (String) null, false);
            A012.A00 = new AnonymousClass288(this, z, false);
            C12810hQ.A02(A012);
        }
    }

    public static C33921di A00(AnonymousClass0C1 r2) {
        return (C33921di) r2.AVA(C33921di.class, new C33931dj(r2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r0.A01 == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r0.A03 == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0086, code lost:
        if (r1 == false) goto L_0x0088;
     */
    private void A01(List list) {
        String str;
        List list2;
        boolean z;
        List list3;
        C55712bE r0;
        boolean z2;
        boolean z3;
        C55602b0 A002 = C55602b0.A00(this.A0W);
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C58252fd r7 = (C58252fd) it.next();
            C13300iJ A032 = r7.A03();
            if (A032 != null) {
                C55842bV r1 = r7.A03;
                if (!(r1 == null || (r0 = r1.A08) == null)) {
                    z2 = true;
                }
                z2 = false;
                if (!(r1 == null || (r0 = r1.A08) == null)) {
                    z3 = true;
                }
                z3 = false;
                A002.A0B(A032, z2, z3, (String) null);
            }
            String A0A2 = r7.A0A();
            C55842bV r02 = r7.A03;
            if (r02 != null) {
                str = r02.A0N;
            } else {
                str = null;
            }
            if (!(A0A2 == null || str == null)) {
                if (r02 != null) {
                    list2 = r02.A0X;
                } else {
                    list2 = null;
                }
                if (list2 != null && list2.size() > 1 && !hashSet.contains(A0A2)) {
                    C13300iJ A022 = C13510ie.A00(this.A0W).A02(A0A2);
                    if (A022 == null) {
                        A022 = new C13300iJ(A0A2);
                        A022.A2m = str;
                    }
                    ImageUrl A012 = r7.A01();
                    if (A012 != null) {
                        A022.A02 = A012;
                    }
                    C55842bV r72 = r7.A03;
                    if (!(r72 == null || (r0 = r72.A09) == null)) {
                        boolean z4 = r0.A00;
                        z = true;
                    }
                    z = false;
                    A022.A0O(z);
                    if (r72 != null) {
                        list3 = r72.A0X;
                    } else {
                        list3 = null;
                    }
                    List list4 = list3;
                    if (list3 != null && list4.contains(C55692bC.REMOVE_FOLLOWER)) {
                        A022.A0G(true);
                    }
                    C13510ie.A00(this.A0W).A01(A022, true);
                    hashSet.add(A0A2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r1 == false) goto L_0x004a;
     */
    private void A02(List list) {
        boolean z;
        C58282fg r0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C58252fd r3 = (C58252fd) it.next();
                if (this.A0Y.containsKey(r3.A06)) {
                    String AS8 = ((instagramComment) this.A0Y.get(r3.A06)).AS8();
                    C55842bV r02 = r3.A03;
                    AnonymousClass0a4.A06(r02);
                    r02.A0P = AS8;
                }
                if (r3.A04 == C58262fe.FOLLOW_REQUEST) {
                    C13300iJ A032 = r3.A03();
                    if (A032 != null) {
                        C55842bV r03 = r3.A03;
                        if (!(r03 == null || (r0 = r03.A08) == null)) {
                            boolean z2 = r0.A02;
                            z = true;
                        }
                        z = false;
                        A032.A0H(Boolean.valueOf(z));
                    } else {
                        AnonymousClass0QD.A01("NewsfeedYouStore", "The user object in the follow request story is null.");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r1 != false) goto L_0x002e;
     */
    public final void A04() {
        boolean z;
        if (((Boolean) AnonymousClass0L6.A02(this.A0W, AnonymousClass0L7.ACTIVITY_FEED_COOLDOWN_LAUNCHER, "cooldown_enbaled", false, (AnonymousClass04H) null)).booleanValue()) {
            boolean z2 = false;
            if (SystemClock.elapsedRealtime() - this.A0B.longValue() >= this.A0U) {
                z2 = true;
            }
            z = true;
        }
        z = false;
        if (!z) {
            A08(false);
        }
    }

    public final void A05() {
        C15890nh r2 = new C15890nh(this.A0W);
        r2.A09 = Constants.ONE;
        r2.A0C = "news/inbox_seen/";
        r2.A06(AnonymousClass1N4.class, false);
        C12810hQ.A02(r2.A03());
    }

    public final void A06(int i) {
        this.A02 = i;
        this.A0V.BXT(new C33561d7(i));
    }

    public final void A07(C58172fV r5) {
        List list;
        this.A0X.clear();
        boolean z = false;
        this.A0S = false;
        List list2 = r5.A0G;
        this.A0H = list2;
        this.A0F = r5.A0E;
        this.A0G = r5.A0F;
        this.A0I = r5.A0H;
        this.A0J = r5.A0I;
        C55732bG r0 = r5.A09;
        if (r0 != null) {
            C55752bI r02 = r0.A00;
            C55752bI r1 = r02;
            if (r02 != null) {
                this.A0M = r02.A01;
                this.A0L = r1.A00;
            }
        }
        A01(C05970Ne.A02(list2));
        A01(C05970Ne.A02(this.A0F));
        A01(C05970Ne.A02(this.A0G));
        A01(C05970Ne.A02(this.A0I));
        A01(C05970Ne.A02(this.A0J));
        A02(this.A0I);
        A02(this.A0J);
        C43411uN r03 = r5.A02;
        if (r03 == null || r03.A06()) {
            C58192fX r04 = r5.A07;
            if (r04 != null) {
                list = r04.A00;
            } else {
                list = null;
            }
        } else {
            list = r5.A02.A03();
        }
        this.A0K = list;
        this.A01 = r5.A00;
        this.A0P = r5.A0M;
        this.A0O = r5.A0L;
        this.A0N = r5.A0K;
        this.A06 = r5.A04;
        this.A07 = r5.A05;
        this.A0A = r5.A0A;
        AnonymousClass2FD r2 = r5.A03;
        if (r2 == null || r2.A07 != Constants.A0u) {
            this.A05 = null;
        } else {
            this.A05 = r2;
        }
        this.A0C = r5.A0B;
        this.A08 = r5.A06;
        this.A0E = r5.AQs();
        this.A0D = r5.A0C;
        C33921di A002 = A00(this.A0W);
        if (r5.A08 == null) {
            r5.A08 = new C58232fb();
        }
        A002.A06(r5.A08.A03);
        List list3 = this.A0F;
        if (list3 != null && !list3.isEmpty()) {
            z = true;
        }
        if (z) {
            this.A0R = true;
            this.A0V.BXT(new C33621dD());
        }
    }

    public C33921di(AnonymousClass0C1 r6) {
        this.A0W = r6;
        this.A0V = C23300zv.A00(r6);
        AnonymousClass0Q7.A03().A0B(this);
        this.A0U = TimeUnit.MINUTES.toMillis((long) ((Integer) AnonymousClass0L6.A03(r6, AnonymousClass0L7.ACTIVITY_FEED_COOLDOWN_LAUNCHER, "cooldown_period_in_mins", 0, (AnonymousClass04H) null)).intValue());
    }

    public static boolean A03(C33921di r4, List list, C28261La r6) {
        C58252fd r3;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                r3 = null;
                break;
            }
            r3 = (C58252fd) it.next();
            if (r6.apply(r3)) {
                it.remove();
                break;
            }
        }
        if (r3 == null) {
            return false;
        }
        r4.A0V.BXT(new C52492Pa(r3, false));
        return true;
    }

    public final void onAppBackgrounded() {
        AnonymousClass0Z0.A0A(1197801638, AnonymousClass0Z0.A03(-1330482412));
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0Z0.A03(1824794686);
        if (this.A0Q) {
            A04();
        } else {
            boolean z = false;
            if (SystemClock.elapsedRealtime() - this.A0B.longValue() >= this.A0U) {
                z = true;
            }
            if (z) {
                A08(false);
            }
        }
        AnonymousClass0Z0.A0A(-1526002093, A032);
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass0Q7.A03().A0D(this);
        this.A05 = null;
        List list = this.A0H;
        if (list != null) {
            list.clear();
        }
        List list2 = this.A0F;
        if (list2 != null) {
            list2.clear();
        }
        List list3 = this.A0G;
        if (list3 != null) {
            list3.clear();
        }
        List list4 = this.A0I;
        if (list4 != null) {
            list4.clear();
        }
        List list5 = this.A0J;
        if (list5 != null) {
            list5.clear();
        }
        List list6 = this.A0K;
        if (list6 != null) {
            list6.clear();
        }
        List list7 = this.A0L;
        if (list7 != null) {
            list7.clear();
        }
        List list8 = this.A0M;
        if (list8 != null) {
            list8.clear();
        }
        this.A01 = 0;
        this.A0P = false;
        this.A0O = false;
        this.A0N = false;
        this.A0C = null;
        this.A0E = null;
        this.A06 = null;
        this.A07 = null;
        this.A08 = null;
        this.A0A = null;
        this.A09 = null;
        this.A0V.BXT(new AnonymousClass2PZ(-1, false));
    }
}
