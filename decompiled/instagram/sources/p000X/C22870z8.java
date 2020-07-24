package p000X;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URI;
import java.net.URLEncoder;
import java.util.List;

/* renamed from: X.0z8  reason: invalid class name and case insensitive filesystem */
public final class C22870z8 extends AnonymousClass0O9 {
    public final /* synthetic */ C22860z7 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22870z8(C22860z7 r4) {
        super(128, 3, false, false);
        this.A00 = r4;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:11|12|13|14|15|(1:17)|18|19|28|26|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0092, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        p000X.AnonymousClass0QD.A01("viewtag_error", p000X.C06360Ot.A05("Failed to sent http request to: %s. %s", r5, r2));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0025 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f A[Catch:{ Exception -> 0x0092 }] */
    public final void run() {
        List<String> list;
        C22860z7 r1 = this.A00;
        synchronized (r1) {
            list = r1.A00;
            r1.A00 = null;
        }
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                URI.create(str);
                Uri parse = Uri.parse(str);
                Uri.Builder builder = new Uri.Builder();
                builder.scheme(parse.getScheme()).path(parse.getPath()).authority(parse.getAuthority());
                if (!TextUtils.isEmpty(parse.getEncodedQuery())) {
                    builder.query(URLEncoder.encode(parse.getEncodedQuery()));
                }
                str = builder.build().toString();
                AnonymousClass1BZ r12 = new AnonymousClass1BZ();
                r12.A01 = Constants.A0N;
                r12.A02 = str;
                AnonymousClass1C4 A002 = r12.A00();
                C255919l r13 = new C255919l();
                r13.A03 = C15920nk.Other;
                AnonymousClass1C8.A00().A01(new AnonymousClass1C3(A002, r13.A00()), (C44061vX) null).A00.close();
            }
            C36681iR.A00(',').A03(list);
        }
    }
}
