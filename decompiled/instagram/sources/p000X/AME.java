package p000X;

import android.content.Context;
import android.os.SystemClock;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.Collections;
import java.util.List;

/* renamed from: X.AME */
public final class AME extends C17920r1 {
    public final /* synthetic */ AMH A00;

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0112, code lost:
        if (r2 > ((com.instagram.video.live.adapter.CommentsLinearLayoutManager) r6.A05.A00.A05.A0L).A1j()) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0115, code lost:
        if (r0 != false) goto L_0x0117;
     */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AMD amd;
        String num;
        boolean z;
        String string;
        int i;
        boolean z2;
        int indexOf;
        int A03 = AnonymousClass0Z0.A03(-267950940);
        C23438AMl aMl = (C23438AMl) obj;
        int A032 = AnonymousClass0Z0.A03(-1611828974);
        AMH amh = this.A00;
        if (!amh.A04) {
            AnonymousClass0Z0.A0A(635629234, A032);
        } else {
            amh.A01 = aMl.A02;
            int i2 = aMl.A00;
            amh.A00 = i2;
            AMF amf = amh.A06;
            int i3 = aMl.A01;
            List unmodifiableList = Collections.unmodifiableList(aMl.A03);
            AMD amd2 = amf.A0H;
            boolean z3 = false;
            if (i3 > 0) {
                z3 = true;
            }
            amd2.A0E(z3);
            if (i3 > 9) {
                amd = amf.A0H;
                num = "9+";
            } else {
                amd = amf.A0H;
                num = Integer.toString(i3);
            }
            TextView textView = amd.A0K.A05.A09;
            if (textView != null) {
                textView.setText(num);
            }
            AK9 ak9 = amf.A0G;
            if (ak9.A0C && !ak9.A02.A04()) {
                if (ak9.A04 == null) {
                    ak9.A04 = new C23427AMa(ak9.A0L, ak9.A07, new ANF(ak9));
                }
                C23427AMa aMa = ak9.A04;
                Context context = ak9.A0K.getContext();
                if (i2 < 1) {
                    C23346AIx aIx = aMa.A04;
                    AKZ akz = aIx.A01;
                    if (akz != null) {
                        aIx.A03(akz);
                    }
                    aIx.A01 = null;
                    aMa.A00 = 0;
                    aMa.A02 = null;
                } else {
                    if (SystemClock.elapsedRealtime() - aMa.A01 > C23427AMa.A06) {
                        int i4 = aMa.A00;
                        if (i2 < i4 || (i2 == i4 && AnonymousClass17M.A00(aMa.A02, unmodifiableList.get(0)))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            aMa.A00 = i2;
                            aMa.A02 = (C13300iJ) unmodifiableList.get(0);
                        }
                    } else {
                        z = true;
                    }
                    if (i2 > 1) {
                        int i5 = i2 - 1;
                        string = context.getResources().getQuantityString(C0003R.plurals.live_with_multiple_join_requests_received_comment, i5, new Object[]{((C13300iJ) unmodifiableList.get(0)).AZn(), Integer.valueOf(i5)});
                    } else {
                        string = context.getString(C0003R.string.live_with_join_request_received_comment, new Object[]{((C13300iJ) unmodifiableList.get(0)).AZn()});
                    }
                    C23346AIx aIx2 = aMa.A04;
                    AKZ akz2 = aIx2.A01;
                    if (akz2 == null || (indexOf = aIx2.A04.indexOf(akz2)) == -1) {
                        i = -1;
                    } else {
                        i = C23346AIx.A00(aIx2, indexOf);
                    }
                    if (aMa.A04.A01 != null) {
                        if (!z) {
                            if (i >= 0) {
                                z2 = true;
                            }
                            z2 = false;
                        }
                        C23346AIx aIx3 = aMa.A04;
                        AKZ akz3 = aIx3.A01;
                        akz3.A00 = unmodifiableList;
                        akz3.commentText = string;
                        int indexOf2 = aIx3.A04.indexOf(akz3);
                        if (indexOf2 != -1) {
                            aIx3.notifyItemChanged(C23346AIx.A00(aIx3, indexOf2));
                        }
                    }
                    aMa.A01 = SystemClock.elapsedRealtime();
                    AKZ akz4 = new AKZ(aMa.A03.A06, unmodifiableList, string);
                    C23346AIx aIx4 = aMa.A04;
                    AKZ akz5 = aIx4.A01;
                    if (akz5 != null) {
                        aIx4.A03(akz5);
                    }
                    aIx4.A02(akz4);
                    aIx4.A01 = akz4;
                    aMa.A05.A00.A0A();
                }
            }
            AnonymousClass0Z0.A0A(1871052986, A032);
        }
        AnonymousClass0Z0.A0A(2083284009, A03);
    }

    public AME(AMH amh) {
        this.A00 = amh;
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(-669097322);
        AMH amh = this.A00;
        if (amh.A04) {
            AnonymousClass0ZA.A09(amh.A03, new C23452AMz(this), AMH.A0A, 330853493);
        }
        AnonymousClass0Z0.A0A(-459154445, A03);
    }
}
