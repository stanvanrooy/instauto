package p000X;

import android.net.Uri;
import android.util.Log;
import com.facebook.video.heroplayer.ipc.PrefetchTaskQueueCompleteEvent;
import com.facebook.video.heroplayer.ipc.PrefetchTaskQueueExitEvent;
import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;
import java.util.List;

/* renamed from: X.D2P */
public class D2P implements C27228C3r {
    public final VideoPrefetchRequest A00;
    public final String A01;
    public final boolean A02;
    public final Integer A03;
    public final String A04;
    public final boolean A05;

    public void cancel() {
        if (this instanceof D2O) {
            D2O d2o = (D2O) this;
            d2o.A01.A07(d2o.A00);
        } else if (this instanceof D2Q) {
            D2Q d2q = (D2Q) this;
            d2q.A02.A07(d2q.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r5.A02 > 0) goto L_0x0034;
     */
    public void ACO() {
        D29 d29;
        boolean z;
        List list;
        D29 d292;
        if (this instanceof D2O) {
            D2O d2o = (D2O) this;
            if (d2o.A03.A1H && (d29 = d2o.A02) != null) {
                d29.A00(new PrefetchTaskQueueExitEvent(d2o.A00));
            }
            try {
                d2o.A01.A08(d2o.A00, d2o.A06, d2o.A00, d2o.A02, d2o.A04, d2o.A09, d2o.A07, d2o.A08, d2o.A05, d2o.A02);
            } catch (Exception e) {
                C40431oe.A05("VodUriPrefetchTask", e, "prefetch sync failed with exception", new Object[0]);
            }
        } else if (!(this instanceof D2Q)) {
            throw new UnsupportedOperationException("VodPrefetchTask is a base class. Please use more specific prefetch task");
        } else {
            D2Q d2q = (D2Q) this;
            if (d2q.A06.A1H && (d292 = d2q.A03) != null) {
                d292.A00(new PrefetchTaskQueueExitEvent(d2q.A00));
            }
            VideoPrefetchRequest videoPrefetchRequest = d2q.A00;
            int i = videoPrefetchRequest.A03;
            boolean z2 = false;
            if (i != 1) {
                z = false;
            }
            z = true;
            if (i == 2 || videoPrefetchRequest.A02 > 0) {
                z2 = true;
            }
            D2D d2d = d2q.A05;
            D29 d293 = d2q.A03;
            D2U d2u = d2q.A07;
            List list2 = null;
            if (z) {
                list = d2q.A04.A00;
            } else {
                list = null;
            }
            if (z2) {
                list2 = d2q.A04.A01;
            }
            d2d.A04(videoPrefetchRequest, d293, d2u, list, list2, d2q.A08, d2q.A00, d2q.A01);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D2P) || !toString().equals(obj.toString())) {
            return false;
        }
        return true;
    }

    public void onComplete() {
        D29 d29;
        D29 d292;
        if (this instanceof D2O) {
            D2O d2o = (D2O) this;
            if (d2o.A03.A1H && (d29 = d2o.A02) != null) {
                d29.A00(new PrefetchTaskQueueCompleteEvent(d2o.A00));
            }
        } else if (this instanceof D2Q) {
            D2Q d2q = (D2Q) this;
            if (d2q.A06.A1H && (d292 = d2q.A03) != null) {
                d292.A00(new PrefetchTaskQueueCompleteEvent(d2q.A00));
            }
        }
    }

    public final String toString() {
        StringBuilder sb;
        if (this.A05) {
            VideoPrefetchRequest videoPrefetchRequest = this.A00;
            if (videoPrefetchRequest != null) {
                long j = videoPrefetchRequest.A05;
                if (j != 0) {
                    sb = new StringBuilder();
                    sb.append(this.A04);
                    sb.append("_");
                    sb.append(j);
                }
            }
            return this.A04;
        }
        VideoPrefetchRequest videoPrefetchRequest2 = this.A00;
        if (videoPrefetchRequest2 == null) {
            Log.w("VodPrefetchTask", "Trying to lookup prefetch task with insufficient information");
            sb = new StringBuilder();
            sb.append(this.A04);
            sb.append("_track_-1");
        } else {
            Uri uri = videoPrefetchRequest2.A09.A03;
            if (uri == null) {
                sb = new StringBuilder();
                sb.append(this.A04);
                sb.append("_track_");
                sb.append(videoPrefetchRequest2.A03);
            } else if (videoPrefetchRequest2 == null || videoPrefetchRequest2.A05 == 0) {
                return uri.toString();
            } else {
                sb = new StringBuilder();
                sb.append(uri.toString());
                sb.append("_");
                sb.append(this.A00.A05);
            }
        }
        return sb.toString();
    }

    public D2P(VideoPrefetchRequest videoPrefetchRequest, String str, String str2, boolean z, Integer num, boolean z2) {
        this.A00 = videoPrefetchRequest;
        this.A04 = str;
        this.A01 = str2;
        this.A05 = z;
        this.A03 = num;
        this.A02 = z2;
    }

    public final Integer ASn() {
        return this.A03;
    }

    public final int hashCode() {
        return toString().hashCode();
    }
}
