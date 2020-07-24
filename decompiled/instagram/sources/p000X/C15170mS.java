package p000X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.IOException;

/* renamed from: X.0mS  reason: invalid class name and case insensitive filesystem */
public final class C15170mS implements C06560Pn {
    public final /* synthetic */ AnonymousClass0k0 A00;
    public final /* synthetic */ C15130mO A01;

    public final void As0(C06590Pq r1) {
    }

    public C15170mS(AnonymousClass0k0 r1, C15130mO r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Arz(C06590Pq r3) {
        try {
            this.A01.A01(r3);
        } catch (IOException e) {
            AnonymousClass0QD.A01("ig_cache_logger", StringFormatUtil.formatStrLocaleSafe("Could not report logs. %s", (Object) e.getLocalizedMessage()));
        }
    }
}
