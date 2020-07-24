package p000X;

import com.instagram.model.mediatype.MediaType;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.CA9 */
public final class CA9 implements C27371Ho, C24154Aj4 {
    public int A00;
    public C27334C9f A01;
    public AnonymousClass1NJ A02;
    public final C27330C9b A03;
    public final CAA A04;
    public final C24967AxA A05 = new C27336C9h(this);
    public final C52012Nb A06;
    public final AnonymousClass1RS A07;
    public final Map A08 = new HashMap();

    public static void A02(CA9 ca9, AnonymousClass1NJ r9, CAD cad, int i) {
        AnonymousClass1NJ r2 = r9;
        if (r9.APx() == MediaType.VIDEO && !r9.equals(ca9.A07.A0B())) {
            A03(ca9, "media_mismatch", true);
            CAD cad2 = cad;
            ca9.A07.A0J(r2, cad2, i, i, A00(ca9, r9).A02(), true, ca9);
            ca9.A00 = i;
        }
    }

    public static void A03(CA9 ca9, String str, boolean z) {
        if (ca9.A07.A0B() != null) {
            ca9.A07.A0M(str, z, true);
            ca9.A00 = -1;
        }
    }

    public final boolean Ago() {
        return false;
    }

    public final boolean Ahq() {
        return false;
    }

    public final String getModuleName() {
        return "promote_media_picker_thumbnail_preview";
    }

    public final void pause() {
        A03(this, AnonymousClass0C5.$const$string(80), true);
    }

    public static C36841ih A00(CA9 ca9, AnonymousClass1NJ r4) {
        C36841ih r2 = (C36841ih) ca9.A08.get(r4.APo());
        if (r2 != null) {
            return r2;
        }
        C36841ih r22 = new C36841ih(r4);
        ca9.A08.put(r4.APo(), r22);
        return r22;
    }

    public static void A01(CA9 ca9) {
        AnonymousClass1NJ r0;
        AnonymousClass1NJ r2;
        int A002 = ca9.A04.A00();
        if (A002 != -1) {
            CAA caa = ca9.A04;
            if (caa.A07.A05(caa.A00()) instanceof CA7) {
                r0 = ((CA7) caa.A07.A05(caa.A00())).A00;
            } else {
                r0 = null;
            }
            if (r0 != null) {
                CAA caa2 = ca9.A04;
                if (caa2.A07.A05(caa2.A00()) instanceof CA7) {
                    r2 = ((CA7) caa2.A07.A05(caa2.A00())).A00;
                } else {
                    r2 = null;
                }
                CAA caa3 = ca9.A04;
                AnonymousClass1ZK A0O = caa3.A04.A0O(caa3.A00());
                AnonymousClass11J.A00(A0O);
                A02(ca9, r2, (CAD) A0O, A002);
            }
        }
    }

    public final void destroy() {
        this.A07.A0E();
    }

    public CA9(AnonymousClass0C1 r4, C28341Li r5, CAA caa, C52012Nb r7) {
        this.A03 = new C27330C9b(r4, r5);
        this.A04 = caa;
        caa.A00 = this;
        AnonymousClass1RR r2 = new AnonymousClass1RR(caa.A04.getContext(), this, r4, (String) null);
        r2.A01 = true;
        r2.A00 = true;
        r2.A03 = true;
        r2.A06 = true;
        this.A07 = r2.A00();
        CAA caa2 = this.A04;
        CAB cab = caa2.A06;
        cab.A02 = r4;
        cab.A01 = this;
        cab.A00 = new CA8(caa2);
        caa2.A07.A06(new C68832zy());
        this.A06 = r7;
        r7.Bh8(new CAH(this));
        this.A00 = -1;
    }

    public final void Bdu() {
        A01(this);
    }
}
