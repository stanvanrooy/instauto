package p000X;

import com.instagram.model.mediatype.MediaType;
import java.util.List;

/* renamed from: X.1yw  reason: invalid class name and case insensitive filesystem */
public class C45981yw extends AnonymousClass1RY {
    public final AnonymousClass0C1 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006e, code lost:
        if (r3 != false) goto L_0x0070;
     */
    public final /* bridge */ /* synthetic */ C45951yt A00(Object obj) {
        C249616t r3;
        String str;
        boolean z;
        boolean z2;
        C58442fx r4 = (C58442fx) obj;
        AnonymousClass1NJ APe = r4.APe();
        if (r4.AZF() == Constants.A0C) {
            r3 = r4.AN8().A00;
        } else {
            r3 = APe;
        }
        C37671k2 r19 = null;
        if (C36901in.A0O(r3, this.A00)) {
            str = r4.AN8().A00.AYw();
            z = false;
            z2 = true;
        } else {
            if (C36901in.A0N(r3, this.A00)) {
                str = APe.A29;
                z = true;
            } else {
                if (APe.Afk()) {
                    str = APe.A1y;
                } else {
                    str = null;
                }
                z = false;
            }
            z2 = false;
        }
        String id = APe.getId();
        String APo = APe.APo();
        String id2 = APe.A0c(this.A00).getId();
        C13390iS r13 = APe.A0c(this.A00).A0M;
        C37171jE A0U = APe.A0U();
        boolean A1G = APe.A1G();
        long longValue = APe.A0k().longValue();
        MediaType APx = APe.APx();
        if (!APe.AiO()) {
            boolean z3 = false;
            if (APe.A0r == MediaType.AUDIO) {
                z3 = true;
            }
        }
        r19 = APe.A0e();
        return new C45951yt(id, false, z, z2, (String) null, APo, str, id2, r13, A0U, A1G, longValue, APx, r19, APe.A0m(), (List) null);
    }

    public C45981yw(AnonymousClass0C1 r1, C27371Ho r2, String str) {
        super(r2, str);
        this.A00 = r1;
    }
}
