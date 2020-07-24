package p000X;

import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.16x  reason: invalid class name and case insensitive filesystem */
public final class C250016x implements C06570Po {
    public final AnonymousClass0C1 A00;
    public final AnonymousClass170 A01;
    public final HashMap A02 = new HashMap();
    public final C250216z[] A03 = {C250216z.STORY, C250216z.REPLAY};
    public final String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r2 == p000X.C38051ke.A0B) goto L_0x0046;
     */
    public static synchronized void A03(C250016x r5, Reel reel) {
        boolean z;
        synchronized (r5) {
            C250216z A002 = A00(reel);
            C250216z r1 = C250216z.REPLAY;
            if (A002 == r1 && r5.A02.containsKey(r1)) {
                AnonymousClass170 r2 = r5.A01;
                List A003 = reel.A0D.A00();
                synchronized (r2) {
                    try {
                        r2.A03.keySet().removeAll(A003);
                        AnonymousClass170.A00(r2);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                Iterator it = reel.A0D.A07.iterator();
                while (it.hasNext()) {
                    C38051ke r22 = ((C38031kc) it.next()).A08;
                    if (r22 != C38051ke.POST_LIVE_POSTING_INITIATED) {
                        z = false;
                    }
                    z = true;
                    if (z) {
                        it.remove();
                    }
                }
                AnonymousClass170 r4 = r5.A01;
                synchronized (r4) {
                    try {
                        for (String str : r4.A03.keySet()) {
                            boolean z2 = false;
                            if (!reel.A0D.A00().contains(str)) {
                                z2 = true;
                            }
                            AnonymousClass0a4.A0A(z2);
                            reel.A0D.A07.add(r4.A03.get(str));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                reel.A0Q(r5.A00, reel.A0D);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = p000X.C250216z.A02;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004c */
    public final synchronized Reel A04(Reel reel) {
        C250216z r1;
        Reel reel2;
        C250216z A002 = A00(reel);
        C250216z r2 = C250216z.STORY;
        if (A002 == r2) {
            A06(reel);
        }
        String string = C16180oA.A00(this.A00).A00.getString("last_posted_reel_item_type", (String) null);
        if (string == null) {
            r1 = C250216z.STORY;
        } else {
            r1 = C250216z.valueOf(string);
        }
        Reel reel3 = (Reel) this.A02.get(r1);
        Object obj = this.A02.get(r2);
        AnonymousClass0a4.A06(obj);
        Reel reel4 = (Reel) obj;
        reel2 = (Reel) this.A02.get(C250216z.REPLAY);
        if (reel3 == null || reel3.A0l(this.A00) || reel2 == null || reel2.A0m(this.A00) != reel4.A0m(this.A00)) {
            if (reel2 == null || reel2.A0l(this.A00) || reel2.A0m(this.A00)) {
                if (reel4.A0l(this.A00) || reel4.A0m(this.A00)) {
                    C250216z[] r4 = this.A03;
                    int length = r4.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            reel3 = null;
                            break;
                        }
                        reel3 = (Reel) this.A02.get(r4[i]);
                        if (reel3 != null && !reel3.A0l(this.A00) && !reel3.A0a()) {
                            break;
                        }
                        i++;
                    }
                    if (reel3 == null) {
                        reel3 = reel4;
                    }
                } else {
                    reel2 = reel4;
                }
            }
        }
        reel2 = reel3;
        return reel2;
    }

    public final synchronized List A05() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C250216z r2 : this.A03) {
            if (this.A02.containsKey(r2) && !((Reel) this.A02.get(r2)).A0l(this.A00)) {
                arrayList.add(this.A02.get(r2));
            }
        }
        return arrayList;
    }

    public final synchronized void A06(Reel reel) {
        C250216z A002;
        boolean z;
        if (reel.A0G() == Constants.ONE && !reel.A0V() && !reel.A0a() && (A002 = A00(reel)) != null && this.A00.A06.equals(reel.A0M.AZf())) {
            this.A02.put(A002, reel);
            AnonymousClass170 r1 = this.A01;
            synchronized (r1) {
                z = !r1.A03.isEmpty();
            }
            if (z) {
                A02();
            }
            A03(this, reel);
            if (A002 != C250216z.STORY && reel.A0l(this.A00)) {
                this.A02.remove(A002);
            }
        }
    }

    public final synchronized void A07(String str, String str2, long j, C38051ke r11) {
        C38031kc r2;
        AnonymousClass170 r5 = this.A01;
        synchronized (r5) {
            HashMap hashMap = r5.A03;
            Long valueOf = Long.valueOf(j);
            synchronized (r5) {
                r2 = new C38031kc();
                r2.A0I = str;
                r2.A0P = str2;
                r2.A08 = r11;
                r2.A05 = valueOf.longValue();
                r2.A0C = r5.A01.A06;
            }
            hashMap.put(str, r2);
            AnonymousClass170.A00(r5);
        }
        A02();
        A03(this, (Reel) this.A02.get(C250216z.REPLAY));
    }

    public final synchronized void onUserSessionWillEnd(boolean z) {
        this.A02.clear();
    }

    public static C250016x A01(AnonymousClass0C1 r2) {
        return (C250016x) r2.AVA(C250016x.class, new C250116y(r2));
    }

    private void A02() {
        HashMap hashMap = this.A02;
        C250216z r6 = C250216z.REPLAY;
        if (!hashMap.containsKey(r6)) {
            this.A02.put(r6, ReelStore.A02(this.A00).A0E(new AnonymousClass26H(this.A04, this.A00.A06, new ArrayList())));
        }
    }

    public C250016x(AnonymousClass0C1 r5) {
        this.A00 = r5;
        this.A01 = (AnonymousClass170) r5.AVA(AnonymousClass170.class, new AnonymousClass171(r5));
        this.A04 = String.format("{temp_fallback_replay_reel:%s}", new Object[]{r5.A04()});
    }

    public static C250216z A00(Reel reel) {
        if (reel.A0X()) {
            return C250216z.REPLAY;
        }
        if (!reel.A0W()) {
            return C250216z.STORY;
        }
        return null;
    }
}
