package p000X;

import android.content.Context;
import com.instagram.model.mediatype.MediaType;
import com.instagram.pendingmedia.model.PendingMedia;
import java.io.IOException;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;

/* renamed from: X.15a  reason: invalid class name and case insensitive filesystem */
public final class C245515a extends AnonymousClass15F {
    public static final C17120pi A01 = new C245615b();
    public String A00;

    public final int ASm() {
        return -1;
    }

    public final String getTypeName() {
        return "PendingMediaSSIMReportOperation";
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A00});
    }

    public final C106364iO BeC(C106264iC r13, C105884ha r14, C106204i6 r15, C106114hx r16) {
        String str;
        C243714i[] r1;
        String str2;
        C106264iC r7 = r13;
        PendingMedia A02 = new C107324jx(r7, r14, r15, MediaType.VIDEO, new C107304jv(this, r14)).A02();
        Context context = r13.A02;
        AnonymousClass0C1 r12 = r13.A04;
        try {
            new AnonymousClass8H8(context, r12, new C42531sV(context, r12), A02).A00();
            return C106364iO.A01((C105884ha) null);
        } catch (OutOfMemoryError unused) {
            C106174i3 r0 = r15.A00;
            if (C106174i3.A00(r0.A00, r0.A01, r15.A02) >= 5) {
                str2 = "Exceeded maximum OOM count";
                return new C106364iO(Constants.ZERO, C106364iO.A04(str2, (C105884ha) null), (Set) null, (String) null);
            }
            r1 = new C243714i[]{C243714i.BACKOFF};
            str = "Out of memory";
            return C106364iO.A02(str, r1);
        } catch (IOException e) {
            C106174i3 r02 = r15.A00;
            if (C106174i3.A00(r02.A00, r02.A01, r15.A02) >= 5) {
                str2 = AnonymousClass000.A0E("IOException exceeded max attempt count: ", e.getMessage());
                return new C106364iO(Constants.ZERO, C106364iO.A04(str2, (C105884ha) null), (Set) null, (String) null);
            }
            str = AnonymousClass000.A0E("IOException: ", e.getMessage());
            r1 = new C243714i[]{C243714i.BACKOFF, C243714i.NETWORK};
            return C106364iO.A02(str, r1);
        } catch (RuntimeException | JSONException e2) {
            return new C106364iO(Constants.ZERO, C106364iO.A04(C06360Ot.formatString("%s: %s", e2.getClass().getSimpleName(), e2.getMessage()), (C105884ha) null), (Set) null, (String) null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.A00, ((C245515a) obj).A00);
    }

    public C245515a() {
    }

    public C245515a(String str) {
        this.A00 = "reportSSIM";
    }
}
