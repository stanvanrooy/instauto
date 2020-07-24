package p000X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.C0003R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.notifications.impl.DirectNotificationActionReceiver;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0t0  reason: invalid class name and case insensitive filesystem */
public final class C19150t0 extends C19160t1 {
    public final Context A00;
    public final Uri A01;

    public final Object ABo(String str) {
        return C42861tN.A00(str, (String) null);
    }

    public final String AHw() {
        return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
    }

    public final boolean A5l(Object obj, Object obj2) {
        C42861tN r7 = (C42861tN) obj;
        C42861tN r8 = (C42861tN) obj2;
        if (!(r7 instanceof C42861tN) || !(r8 instanceof C42861tN)) {
            return false;
        }
        Uri parse = Uri.parse(r7.A06);
        Uri parse2 = Uri.parse(r8.A06);
        String queryParameter = parse.getQueryParameter("id");
        if (queryParameter == null) {
            queryParameter = parse.getQueryParameter("did");
        }
        String queryParameter2 = parse2.getQueryParameter("id");
        if (queryParameter2 == null) {
            queryParameter2 = parse2.getQueryParameter("did");
        }
        String A002 = C135385qE.A00(parse);
        String A003 = C135385qE.A00(parse2);
        if (queryParameter == null || A002 == null || !queryParameter.equals(queryParameter2) || !A002.equals(A003)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0119, code lost:
        if (p000X.AnonymousClass41I.A00(r7) == false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x011d, code lost:
        if (r8 != false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01a9, code lost:
        if (r8 == false) goto L_0x01ab;
     */
    public final C59722i7 A71(AnonymousClass0C1 r24, String str, List list, boolean z) {
        Notification notification;
        C66112uw ALW;
        String A02;
        boolean z2;
        boolean Afv;
        boolean z3;
        C23453ANa[] aNaArr;
        boolean z4;
        String AHw = AHw();
        String str2 = str;
        List list2 = list;
        AnonymousClass2O4 A03 = C59672hx.A03(this.A00, AHw, str2, list2);
        int A002 = C019000b.A00(this.A00, C0003R.color.blue_5);
        A03.A03(0);
        A03.A05 = A002;
        A03.A04(A002);
        A03.A07 = 1;
        A03.A09.vibrate = C49462Ci.A01;
        A03.A07(this.A01);
        AnonymousClass2O4.A01(A03, 8, z);
        C42861tN r1 = (C42861tN) list2.get(list2.size() - 1);
        AnonymousClass0C1 r5 = r24;
        if (r24 != null && TextUtils.equals(r5.A04(), r1.A08)) {
            Uri parse = Uri.parse(AnonymousClass000.A0E("ig://", r1.A06));
            if (!"ds".equals(parse.getQueryParameter("t"))) {
                String A003 = AnonymousClass3LJ.A00(str2);
                String str3 = r1.A0C;
                String queryParameter = parse.getQueryParameter("x");
                if (queryParameter == null) {
                    AnonymousClass0QD.A01("DirectThreadNotificationDelegate_like_messageId_not_found", "Can't send inline like since messageId wasn't provided");
                    Afv = false;
                } else {
                    C66112uw ALW2 = C19290tE.A00(r5).ALW(A003);
                    if (ALW2 != null) {
                        boolean A004 = AnonymousClass41I.A00(ALW2);
                        z2 = true;
                    }
                    z2 = false;
                    if (z2) {
                        Afv = false;
                    } else {
                        C58012fA AQ7 = C19290tE.A00(r5).AQ7(new DirectThreadKey(A003), queryParameter);
                        if (AQ7 == null) {
                            Afv = true;
                        } else {
                            Afv = C19070ss.A00.A00(AQ7.A0d).Afv(r5, AQ7);
                        }
                    }
                }
                if (Afv) {
                    A03.A0H.add(new AnonymousClass2i3(0, this.A00.getString(C0003R.string.direct_notification_action_like), PendingIntent.getBroadcast(this.A00, 64278, DirectNotificationActionReceiver.A00(this.A00, "direct_inline_like", r1.A08, A003, str2, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, str3, queryParameter, r1.A0A), 0)));
                }
                if (((Boolean) AnonymousClass0L6.A02(r5, AnonymousClass0L7.DIRECT_MARK_AS_READ_NOTIF_ACTION, "is_enabled", false, AnonymousClass0LY.A02)).booleanValue()) {
                    A03.A0H.add(new AnonymousClass2i3(0, this.A00.getString(C0003R.string.direct_notification_action_mark_as_read), PendingIntent.getBroadcast(this.A00, 64278, DirectNotificationActionReceiver.A00(this.A00, "direct_mark_as_read", r1.A08, A003, str2, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, str3, (String) null, (String) null), 0)));
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    C66112uw ALW3 = C19290tE.A00(r5).ALW(A003);
                    if (ALW3 != null) {
                        z4 = true;
                    }
                    z4 = false;
                    z3 = true;
                }
                z3 = false;
                if (z3) {
                    String string = this.A00.getString(C0003R.string.direct_notification_action_reply);
                    String str4 = r1.A08;
                    C19120sx r8 = C19120sx.A00;
                    AnonymousClass0a4.A07(r8, "Must call setInstance() first");
                    PendingIntent A005 = r8.A00(this.A00, r5, str4, A003, str2, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, 64278, str3);
                    Bundle bundle = new Bundle();
                    CharSequence A006 = AnonymousClass2O4.A00(string);
                    C23453ANa aNa = new C23453ANa(this.A00.getString(C0003R.string.direct_notification_action_reply), new Bundle(), new HashSet());
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aNa);
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C23453ANa aNa2 = (C23453ANa) it.next();
                        if (aNa2.A02()) {
                            arrayList2.add(aNa2);
                        } else {
                            arrayList3.add(aNa2);
                        }
                    }
                    C23453ANa[] aNaArr2 = null;
                    if (arrayList2.isEmpty()) {
                        aNaArr = null;
                    } else {
                        aNaArr = (C23453ANa[]) arrayList2.toArray(new C23453ANa[arrayList2.size()]);
                    }
                    if (!arrayList3.isEmpty()) {
                        aNaArr2 = (C23453ANa[]) arrayList3.toArray(new C23453ANa[arrayList3.size()]);
                    }
                    A03.A0H.add(new AnonymousClass2i3((IconCompat) null, A006, A005, bundle, aNaArr2, aNaArr));
                }
            }
        }
        if (!(r1.A0H != null || r24 == null || !r5.A04().equals(r1.A08) || (ALW = C19290tE.A00(r5).ALW(AnonymousClass3LJ.A00(str2))) == null || (A02 = AnonymousClass41K.A02(this.A00, r5, false, ALW)) == null)) {
            String str5 = r1.A0J;
            if (str5 == null) {
                str5 = "";
            }
            A03.A09(AnonymousClass000.A0E(str5, A02));
        }
        ImageUrl imageUrl = r1.A02;
        ImageUrl imageUrl2 = imageUrl;
        if (imageUrl != null) {
            AnonymousClass12C.A0c.A0G(C37261jN.A00(this.A00, imageUrl2));
        }
        if (list2.size() != 1) {
            Context context = this.A00;
            AnonymousClass2i6 r9 = new AnonymousClass2i6(A03);
            int size = list2.size();
            int i = size - 6;
            int max = Math.max(0, i);
            for (int i2 = max; i2 < size; i2++) {
                r9.A00.add(AnonymousClass2O4.A00(((C42861tN) list2.get(i2)).A09));
            }
            if (max > 0) {
                r9.A01 = AnonymousClass2O4.A00(context.getResources().getQuantityString(C0003R.plurals.direct_notification_summary_more_messages, i, new Object[]{Integer.valueOf(i)}));
                r9.A02 = true;
            }
            A03 = r9.A00;
            if (A03 == null) {
                notification = null;
                C237211o.A01(this.A00, notification, list2);
                return new C59722i7(notification, AHw, C59672hx.A04(list2, 6), r1.A06);
            }
        } else if (!(((C42861tN) list2.get(0)).A02 == null || r24 == null)) {
            Context context2 = this.A00;
            ImageUrl imageUrl3 = ((C42861tN) list2.get(0)).A02;
            AnonymousClass12C r12 = AnonymousClass12C.A0c;
            ImageUrl A007 = C37261jN.A00(context2, imageUrl3);
            A03.A06(AnonymousClass12C.A00(r12, A007.AZc(), false, false, (String) null, A007.AV6(), A007.ALI()));
        }
        notification = A03.A02();
        C237211o.A01(this.A00, notification, list2);
        return new C59722i7(notification, AHw, C59672hx.A04(list2, 6), r1.A06);
    }

    public final SharedPreferences AVy() {
        return C05750Lu.A00("direct_thread_notifications");
    }

    public final String BfS(Object obj) {
        return ((C42861tN) obj).A01();
    }

    public C19150t0(Context context, Uri uri) {
        this.A00 = context.getApplicationContext();
        this.A01 = uri;
    }
}
