package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.google.common.collect.RegularImmutableMap;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Dj  reason: invalid class name and case insensitive filesystem */
public final class C26461Dj {
    public static final Map A0T;
    public int A00 = 0;
    public int A01 = 0;
    public AnonymousClass1FW A02;
    public AnonymousClass1FW A03;
    public AnonymousClass1FW A04;
    public AnonymousClass1FW A05;
    public AnonymousClass1FW A06;
    public C26971Fz A07;
    public List A08;
    public boolean A09;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Context A0E;
    public final Handler A0F = new Handler();
    public final C11200ea A0G = new C26501Dq(this);
    public final C11200ea A0H = new C26471Dn(this);
    public final C11200ea A0I = new AnonymousClass1Dm(this);
    public final C11200ea A0J = new C26511Dr(this);
    public final C11200ea A0K = new C26491Dp(this);
    public final C11200ea A0L = new C26481Do(this);
    public final AnonymousClass0PD A0M;
    public final AnonymousClass1D0 A0N;
    public final C26531Dt A0O = new C26521Ds(this);
    public final AnonymousClass0C1 A0P;
    public final List A0Q = new ArrayList();
    public final Set A0R;
    public final AnonymousClass103 A0S;

    public final void A07() {
        this.A0A = false;
        if (!this.A0Q.isEmpty()) {
            this.A0Q.remove(0);
            AnonymousClass0ZA.A09(this.A0F, new C97804Km(this, (C97814Kn) this.A0Q.get(0)), 500, 262733122);
        }
    }

    static {
        Object[] objArr = new Object[8];
        Integer valueOf = Integer.valueOf(C0003R.C0004drawable.notification_comment_icon);
        C14370kL.A01(valueOf, "comments");
        objArr[0] = valueOf;
        objArr[1] = "comments";
        Integer valueOf2 = Integer.valueOf(C0003R.C0004drawable.notification_like_icon);
        C14370kL.A01(valueOf2, RealtimeProtocol.DIRECT_V2_REACTION_LIKES);
        objArr[2] = valueOf2;
        objArr[3] = RealtimeProtocol.DIRECT_V2_REACTION_LIKES;
        Integer valueOf3 = Integer.valueOf(C0003R.C0004drawable.notification_people_icon);
        String r2 = AnonymousClass108.FOLLOW_REQUESTS.toString();
        if (6 > 8) {
            objArr = Arrays.copyOf(objArr, C14360kK.A01(8, 6));
        }
        C14370kL.A01(valueOf3, r2);
        objArr[4] = valueOf3;
        objArr[5] = r2;
        Integer valueOf4 = Integer.valueOf(C0003R.C0004drawable.notification_story_mention_icon);
        int length = objArr.length;
        if (8 > length) {
            objArr = Arrays.copyOf(objArr, C14360kK.A01(length, 8));
        }
        C14370kL.A01(valueOf4, "story_mentions");
        objArr[6] = valueOf4;
        objArr[7] = "story_mentions";
        Integer valueOf5 = Integer.valueOf(C0003R.C0004drawable.notification_tag_icon);
        String r22 = AnonymousClass108.PHOTOS_OF_YOU.toString();
        int length2 = objArr.length;
        if (10 > length2) {
            objArr = Arrays.copyOf(objArr, C14360kK.A01(length2, 10));
        }
        C14370kL.A01(valueOf5, r22);
        objArr[8] = valueOf5;
        objArr[9] = r22;
        Integer valueOf6 = Integer.valueOf(C0003R.C0004drawable.instagram_shopping_filled_16);
        int length3 = objArr.length;
        if (12 > length3) {
            objArr = Arrays.copyOf(objArr, C14360kK.A01(length3, 12));
        }
        C14370kL.A01(valueOf6, "shopping_notifications");
        objArr[10] = valueOf6;
        objArr[11] = "shopping_notifications";
        A0T = RegularImmutableMap.A00(6, objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (r3.A09 == false) goto L_0x003d;
     */
    public static void A00(C26461Dj r3) {
        if (((Boolean) C05640Lj.A00(AnonymousClass0L7.BACKGROUND_BADGE_FETCH_KILLSWITCH, "is_enabled", false)).booleanValue()) {
            if (r3.A09) {
                if (r3.A0D) {
                    return;
                }
            }
            r3.A0C = true;
            return;
        }
        C17850qu A002 = C234510l.A00(r3.A0P, C05860Mt.A02.A05(r3.A0E));
        A002.A00 = new C54322Wv(r3.A0P);
        C12810hQ.A02(A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (p000X.C16180oA.A00(r1).A00.getBoolean("shopping_has_tapped_orders_navbar_icon", false) != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (p000X.C16180oA.A00(r6.A0P).A00.getBoolean("has_used_shopping_bag", false) == false) goto L_0x0048;
     */
    public static void A01(C26461Dj r6) {
        boolean z;
        boolean z2;
        boolean booleanValue;
        if (r6.A05 != null) {
            AnonymousClass0C1 r1 = r6.A0P;
            boolean z3 = true;
            int i = 0;
            if (r1 != null) {
                Boolean bool = r1.A06.A0r;
                if (bool == null) {
                    booleanValue = false;
                } else {
                    booleanValue = bool.booleanValue();
                }
                if (booleanValue) {
                    z = true;
                }
            }
            z = false;
            AnonymousClass0C1 r0 = r6.A0P;
            if (r0 != null && !C16180oA.A00(r0).A00.getBoolean("has_tapped_on_shopping_bag_menu_option", false)) {
                z2 = true;
            }
            z2 = false;
            boolean A002 = C33631dE.A00(r6.A0P);
            if (r6.A01 <= 0 && !z && !z2 && !A002) {
                z3 = false;
            }
            r6.A0D = z3;
            View view = r6.A05.A03;
            if (!z3) {
                i = 8;
            }
            view.setVisibility(i);
            A06(r6, AnonymousClass1DU.PROFILE, "impression");
        }
    }

    public static void A02(C26461Dj r4, int i) {
        AnonymousClass1FW r3;
        if (r4.A0P != null && (r3 = r4.A04) != null && !r4.A0B) {
            AnonymousClass1D0 r2 = r4.A0N;
            AnonymousClass1AM A052 = ((FragmentActivity) r2.AJG()).A05();
            if (!r2.Aew(r3.A05) || A052.A0I() == 0) {
                r3.A01(i);
            }
            C16880pJ.A00(r4.A0P).A01 = true;
        }
    }

    public static void A03(C26461Dj r7, int i, AnonymousClass1FW r9, AnonymousClass1RF r10, boolean z, long j) {
        View view = r9.A04;
        AnonymousClass0a4.A06(view);
        C105014gB r3 = new C105014gB(r7, i, view, z, r10);
        if (j == 0) {
            view.post(r3);
        } else {
            view.postDelayed(r3, j);
        }
    }

    public static void A04(C26461Dj r2, AnonymousClass1FW r3, List list, int i) {
        if (r2.A0N.AXg() != 0) {
            return;
        }
        if (!r2.A0A) {
            C31221Wz AGw = r2.A0N.AGw();
            if (AGw == null || !AGw.A0Q()) {
                A05(r2, r3, list, i);
            } else {
                AGw.A07(new AnonymousClass4N4(r2, r3, list, i));
            }
        } else {
            r2.A0Q.add(new C97814Kn(r3, list, i));
        }
    }

    public static void A05(C26461Dj r5, AnonymousClass1FW r6, List list, int i) {
        AnonymousClass0ZA.A07(r5.A0F, (Object) null);
        View view = r6.A02;
        if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
            AnonymousClass0ZA.A09(r5.A0F, new C97774Kj(r5, r6, list, i), 100, 2014906842);
            return;
        }
        r5.A0A = true;
        if (r5.A04 != null) {
            r5.A08 = list;
            A06(r5, AnonymousClass1DU.NEWS, "impression");
            r5.A04.A02(new C59832ir(list), i, new C59842is(r5));
        }
    }

    public static void A06(C26461Dj r8, AnonymousClass1DU r9, String str) {
        AnonymousClass108 r7;
        if (r8.A0S != null && !r8.A0N.Aew(r9)) {
            int i = 0;
            AnonymousClass1G3 r4 = AnonymousClass1G3.DOT;
            HashMap hashMap = null;
            if (AnonymousClass1DU.NEWS == r9) {
                i = r8.A00;
                r7 = AnonymousClass108.ACTIVITY_FEED;
                if (r8.A0A) {
                    r4 = AnonymousClass1G3.TOAST;
                    List<C59822iq> list = r8.A08;
                    if (list != null) {
                        hashMap = new HashMap();
                        for (C59822iq r2 : list) {
                            hashMap.put(A0T.get(Integer.valueOf(r2.A01)), Integer.toString(r2.A00));
                        }
                    }
                }
            } else if (AnonymousClass1DU.PROFILE == r9) {
                i = r8.A0D;
                r7 = AnonymousClass108.PROFILE;
            } else {
                r7 = null;
            }
            if (r7 != null) {
                AnonymousClass10J r22 = new AnonymousClass10J(r7, i);
                if (str.equals("impression")) {
                    r8.A0S.A04(r22, AnonymousClass1G4.BOTTOM_NAVIGATION_BAR, r4, hashMap);
                } else if (str.equals("click")) {
                    r8.A0S.A03(r22, AnonymousClass1G4.BOTTOM_NAVIGATION_BAR, r4, hashMap);
                }
            }
        }
    }

    public final void A08() {
        int A002 = C22000xg.A00.A00(this.A0P);
        AnonymousClass1FW r0 = this.A02;
        if (r0 == null) {
            return;
        }
        if (A002 > 0) {
            r0.A01(A002);
            return;
        }
        r0.A03.setVisibility(8);
        this.A02.A00();
    }

    public C26461Dj(Context context, AnonymousClass1D0 r7, AnonymousClass0C1 r8) {
        this.A0E = context;
        this.A0N = r7;
        this.A0P = r8;
        if (r8 != null) {
            this.A0S = C23320zx.A00(r8).A01();
        }
        this.A0M = new AnonymousClass0PD(new Handler(Looper.getMainLooper()), new C26541Du(this), 2000);
        this.A0R = new HashSet();
    }
}
