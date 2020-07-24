package p000X;

import android.util.Patterns;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediatype.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import org.json.JSONArray;

/* renamed from: X.0tn  reason: invalid class name and case insensitive filesystem */
public final class C19630tn implements C19490tZ {
    public static final C05110Id A02 = new C19640to();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r2) {
        return AnonymousClass2n2.A00(this.A00, (C19610tl) r2);
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r21, C06270Ok r22, C73233Ja r23) {
        String str;
        C17850qu A03;
        C19610tl r6 = (C19610tl) r21;
        List A06 = r6.A06();
        boolean z = true;
        if (A06.size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) A06.get(0);
        String A05 = r6.A05();
        AnonymousClass2cE r5 = r6.A01;
        String str2 = r6.A03;
        AnonymousClass3LQ r1 = r6.A02;
        boolean z2 = r1.A03;
        String str3 = r1.A01;
        C99424Rp r0 = r6.A02;
        String str4 = null;
        if (r0 != null) {
            str = r0.A0A;
        } else {
            str = null;
        }
        if (r0 != null) {
            str4 = r0.A09;
        }
        DirectForwardingParams AM6 = r6.AM6();
        if (AM6 != null) {
            A03 = C99664Sn.A00(this.A01, directThreadKey, A05, str2, z2, str3, AM6, r1.A02);
        } else {
            AnonymousClass0C1 r02 = this.A01;
            boolean z3 = r1.A02;
            C15890nh r13 = new C15890nh(r02);
            r13.A09 = Constants.ONE;
            r13.A0C = C99664Sn.A01(C58022fB.LINK, (MediaType) null, false);
            r13.A06(AnonymousClass3K3.class, false);
            C99664Sn.A02(r13, directThreadKey, A05, str2, z2, str3, z3);
            r13.A09("link_text", r5.A01);
            String str5 = r5.A01;
            ArrayList arrayList = new ArrayList();
            Matcher matcher = Patterns.WEB_URL.matcher(str5);
            while (matcher.find()) {
                arrayList.add(matcher.group(0));
            }
            r13.A09("link_urls", new JSONArray(arrayList).toString());
            if (str != null) {
                r13.A09("replied_to_item_id", str);
            }
            if (str4 != null) {
                r13.A09("replied_to_client_context", str4);
            }
            A03 = r13.A03();
        }
        A03.A00 = new AnonymousClass4T3(this, this.A01, r23);
        C12810hQ.A02(A03);
        AnonymousClass3LX.A0C(r22, Constants.ZERO);
    }

    public C19630tn(AnonymousClass0C1 r1, C65882uZ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
