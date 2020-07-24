package p000X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.1sy  reason: invalid class name and case insensitive filesystem */
public final class C42621sy {
    public AnonymousClass0C1 A00;
    public Map A01;
    public String A02;
    public final C11200ea A03;
    public final C42641t0 A04 = new C42631sz(this);

    public final void A00(String str) {
        if (((Boolean) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.LAUNCHER_NAVIGATION_BASE_MEDIA_CANCELLATION, "cancel_video", false, (AnonymousClass04H) null)).booleanValue()) {
            C40291oQ A002 = C40291oQ.A00();
            synchronized (A002) {
                A002.A02(str, false);
            }
        }
        if (((Boolean) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.LAUNCHER_NAVIGATION_CANCELLATION_VIDEO_PREFETCH_FIX, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass1F6 A003 = AnonymousClass1F6.A00(this.A00);
            C30931Vt A004 = A003.A07.A00(C30951Vw.A00(str));
            if (A004 != null) {
                Iterator it = A004.A03().iterator();
                while (it.hasNext()) {
                    AnonymousClass1F6.A01((C37461jh) it.next());
                }
            }
        }
        AnonymousClass0C1 r3 = this.A00;
        AnonymousClass0L7 r2 = AnonymousClass0L7.LAUNCHER_NAVIGATION_BASE_MEDIA_CANCELLATION;
        if (((Boolean) AnonymousClass0L6.A02(r3, r2, "cancel_image", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass12C r7 = AnonymousClass12C.A0c;
            boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(this.A00, r2, "cancel_image_offscreen_only", false, (AnonymousClass04H) null)).booleanValue();
            if (str != null) {
                synchronized (r7.A0E) {
                    HashMap hashMap = new HashMap();
                    for (AnonymousClass1GP r32 : r7.A0G.values()) {
                        if (booleanValue) {
                            boolean z = false;
                            if (r32.A02 > 0) {
                                z = true;
                            }
                            if (z) {
                            }
                        }
                        for (AnonymousClass1GK r1 : r32.A0I) {
                            if (str.equals(r1.A08)) {
                                List list = (List) hashMap.get(r32);
                                if (list == null) {
                                    list = new LinkedList();
                                    hashMap.put(r32, list);
                                }
                                list.add(r1);
                            }
                        }
                    }
                    for (AnonymousClass1GP r22 : hashMap.keySet()) {
                        for (AnonymousClass1GK A032 : (List) hashMap.get(r22)) {
                            AnonymousClass1GP.A03(r22, A032);
                        }
                    }
                }
            }
        }
        if (((Boolean) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.LAUNCHER_NAVIGATION_BASE_MEDIA_CANCELLATION, "clear_warmup_pool", false, (AnonymousClass04H) null)).booleanValue()) {
            C39731nP.A0W.A07();
        }
    }

    public void onNavigation(AnonymousClass1FF r4, C42641t0 r5, String str) {
        String str2 = r4.A02;
        if (str2 != null && !str2.equals(r4.A01)) {
            String str3 = this.A02;
            if (str3 == null || (str != null && !str.equals(str3))) {
                this.A02 = str;
                return;
            }
            Stack stack = (Stack) this.A01.get(str);
            if (stack == null) {
                stack = new Stack();
                this.A01.put(str, stack);
            }
            if (stack.isEmpty() || !((AnonymousClass1FF) stack.peek()).A02.equals(r4.A01)) {
                stack.push(r4);
                return;
            }
            stack.pop();
            r5.Brj(r4.A02);
        }
    }

    public C42621sy(AnonymousClass0C1 r4) {
        C42651t1 r2 = new C42651t1(this);
        this.A03 = r2;
        this.A00 = r4;
        this.A01 = new HashMap();
        C11130eT.A01.A02(AnonymousClass1FF.class, r2);
    }
}
