package p000X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.PendingRecipient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.ALW */
public final class ALW extends C17920r1 {
    public int A00;
    public final DirectShareTarget A01;
    public final C23401ALa A02;
    public final String A03;
    public final AnonymousClass0C1 A04;
    public final List A05;
    public final /* synthetic */ ALY A06;

    public ALW(ALY aly, AnonymousClass0C1 r6, String str, DirectShareTarget directShareTarget, C23401ALa aLa) {
        C13150hy.A02(r6, "userSession");
        C13150hy.A02(str, "callId");
        C13150hy.A02(directShareTarget, "target");
        C13150hy.A02(aLa, "rtcApi");
        this.A06 = aly;
        this.A04 = r6;
        this.A03 = str;
        this.A01 = directShareTarget;
        this.A02 = aLa;
        List<PendingRecipient> A052 = directShareTarget.A05();
        C13150hy.A01(A052, "target.selectedRecipients");
        ArrayList arrayList = new ArrayList(AnonymousClass10K.A00(A052, 10));
        for (PendingRecipient pendingRecipient : A052) {
            C13150hy.A01(pendingRecipient, "it");
            arrayList.add(pendingRecipient.getId());
        }
        this.A05 = arrayList;
    }

    public final void onFail(C43791v5 r16) {
        boolean z;
        Set set;
        C23404ALd aLd;
        int i;
        C28691Ms r3;
        int A032 = AnonymousClass0Z0.A03(-1041340439);
        C43791v5 r8 = r16;
        C13150hy.A02(r8, "optionalResponse");
        if (!C13150hy.A05(this.A03, this.A06.A04)) {
            i = -801939445;
        } else {
            if (this.A00 >= 5 || !r8.A03() || (((r3 = (C28691Ms) r8.A00) == null || r3.mStatusCode != 500) && (r3 == null || r3.mStatusCode != 409))) {
                z = false;
            } else {
                z = true;
            }
            String str = null;
            if (z) {
                C28691Ms r0 = (C28691Ms) r8.A00;
                C23401ALa aLa = this.A02;
                String str2 = this.A03;
                List A033 = this.A01.A03();
                C13150hy.A01(A033, "target.recipientIds");
                C17850qu A002 = aLa.A00(str2, A033);
                A002.A00 = this;
                this.A00++;
                C12810hQ.A04(A002, 256, 3, true, true, 1000);
            } else {
                if (!this.A06.A05.contains(this.A01)) {
                    ALY aly = this.A06;
                    Set A022 = ALT.A02(aly.A05, this.A01);
                    aly.A05 = A022;
                    aly.A00.accept(A022);
                }
                ALY aly2 = this.A06;
                Set set2 = aly2.A06;
                List list = this.A05;
                C13150hy.A02(set2, "$this$minus");
                C13150hy.A02(list, "elements");
                Collection A012 = AnonymousClass10K.A01(list, set2);
                if (A012.isEmpty()) {
                    set = AnonymousClass10N.A0E(set2);
                } else if (A012 instanceof Set) {
                    Set linkedHashSet = new LinkedHashSet();
                    for (Object next : set2) {
                        if (!A012.contains(next)) {
                            linkedHashSet.add(next);
                        }
                    }
                    set = linkedHashSet;
                } else {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(set2);
                    linkedHashSet2.removeAll(A012);
                    set = linkedHashSet2;
                }
                aly2.A06 = set;
                aly2.A02.accept(set);
                C28691Ms r02 = (C28691Ms) r8.A00;
                if (r02 != null) {
                    str = r02.getErrorMessage();
                }
                if (C13150hy.A05("Adding participants will exceed thread participants limit", str)) {
                    aLd = new C23404ALd(C23409ALi.ADD_FAILURE_MAX_PARTICIPANTS, System.currentTimeMillis(), new String[0]);
                } else {
                    C23409ALi aLi = C23409ALi.ADD_FAILURE;
                    long currentTimeMillis = System.currentTimeMillis();
                    List A052 = this.A01.A05();
                    C13150hy.A01(A052, "target.selectedRecipients");
                    aLd = new C23404ALd(aLi, currentTimeMillis, new String[]{AnonymousClass10N.A09(A052, (CharSequence) null, (CharSequence) null, (CharSequence) null, C169607Mx.A00, 31)});
                }
                this.A06.A03.accept(aLd);
            }
            i = -1483755742;
        }
        AnonymousClass0Z0.A0A(i, A032);
    }

    public final void onStart() {
        int i;
        int A032 = AnonymousClass0Z0.A03(-1188297077);
        if (!C13150hy.A05(this.A03, this.A06.A04)) {
            i = 1915239105;
        } else {
            if (this.A06.A05.contains(this.A01)) {
                ALY aly = this.A06;
                Set A012 = ALT.A01(aly.A05, this.A01);
                aly.A05 = A012;
                aly.A00.accept(A012);
            }
            ALY aly2 = this.A06;
            Set A002 = ALT.A00(aly2.A06, this.A05);
            aly2.A06 = A002;
            aly2.A02.accept(A002);
            i = 911905710;
        }
        AnonymousClass0Z0.A0A(i, A032);
    }
}
