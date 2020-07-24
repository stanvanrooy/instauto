package p000X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.C0003R;
import com.facebook.smartcapture.clientsignals.ClientSignalsAccumulator;
import com.facebook.smartcapture.docauth.DocAuthManager;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import java.lang.ref.WeakReference;

/* renamed from: X.C4Q */
public final class C4Q implements C88163ry {
    public C27242C4l A00;
    public Integer A01;
    public boolean A02 = false;
    public final ClientSignalsAccumulator A03;
    public final DocAuthManager A04;
    public final DocumentType A05;
    public final IdCaptureConfig A06;
    public final C4K A07;
    public final BWP A08;
    public final C27235C4c A09;
    public final C27251C5d A0A = new C27251C5d(this);
    public final WeakReference A0B;
    public final WeakReference A0C;
    public final boolean A0D;
    public final boolean A0E;

    public static void A00(C4Q c4q) {
        C4X c4x = (C4X) c4q.A0C.get();
        if (c4x != null) {
            c4x.Bog(C0003R.string.scp_generic_error);
        }
        c4q.A02();
    }

    public static void A01(C4Q c4q, boolean z) {
        C27235C4c c4c;
        C4X c4x = (C4X) c4q.A0C.get();
        if (c4x != null) {
            c4q.A08.A00(C27250C5c.A00(c4q.A01), new String[0]);
            boolean z2 = true;
            switch (c4q.A01.intValue()) {
                case 1:
                    if (!c4q.A0E) {
                        c4x.Bka(0);
                    }
                    c4x.BkY(true);
                    c4q.A02 = false;
                    c4q.A04.mIsImageProcessingRunning = true;
                    break;
                case 2:
                    if (!c4q.A02) {
                        c4q.A02 = true;
                        SystemClock.elapsedRealtime();
                        break;
                    }
                    break;
                case 3:
                case 4:
                    c4q.A02 = false;
                    break;
                case 5:
                    c4x.Bka(0);
                    c4x.BkY(true);
                    c4q.A02 = false;
                    c4q.A04.mIsImageProcessingRunning = false;
                    break;
                case 7:
                case 8:
                    c4x.BQy();
                    c4x.BkY(false);
                    c4q.A02 = false;
                    c4q.A04.mIsImageProcessingRunning = false;
                    break;
            }
            c4q.A0B.get();
            DocumentType documentType = c4q.A05;
            if (!c4q.A0D) {
                c4x.BXU(new C4Z(c4q, documentType, z));
            }
            c4x.BtE(c4q.A01);
            if (c4q.A01 != Constants.A0u || (c4c = c4q.A09) == null || !c4c.A02) {
                z2 = false;
            }
            c4x.BkZ(z2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    public final void A02() {
        Integer num;
        boolean z = false;
        if (this.A06.A01() == C27238C4f.LOW_END) {
            z = true;
        }
        Integer num2 = this.A01;
        if (num2 == Constants.ZERO) {
            if (z) {
                num = Constants.A0j;
            }
            num = Constants.ONE;
        } else {
            Integer num3 = Constants.A0j;
            if ((num2 == num3 || num2 == Constants.A14) && z) {
                this.A01 = num3;
                this.A02 = false;
                if (this.A00 == C27242C4l.ID_FRONT_SIDE_FLASH) {
                    this.A00 = C27242C4l.ID_FRONT_SIDE;
                }
                A01(this, false);
            }
            num = Constants.ONE;
        }
        this.A01 = num;
        this.A02 = false;
        if (this.A00 == C27242C4l.ID_FRONT_SIDE_FLASH) {
        }
        A01(this, false);
    }

    public final void BEH(byte[] bArr, C88583se r5) {
        C29484Cyd.A00(new C4R(this, bArr, r5), C29484Cyd.A0D).A05(new C4V(this), C29484Cyd.A0B);
    }

    public C4Q(Context context, C4X c4x, IdCaptureConfig idCaptureConfig, C5Y c5y, DocumentType documentType, DocAuthManager docAuthManager, C4K c4k) {
        this.A0B = new WeakReference(context);
        this.A0C = new WeakReference(c4x);
        this.A06 = idCaptureConfig;
        this.A05 = documentType;
        this.A04 = docAuthManager;
        docAuthManager.mDelegate = new WeakReference(this);
        this.A07 = c4k;
        this.A08 = new BWP(c4k);
        this.A00 = C27242C4l.ID_FRONT_SIDE;
        this.A01 = Constants.ZERO;
        ClientSignalsAccumulator clientSignalsAccumulator = null;
        if (this.A06.A01().A00 >= C27238C4f.MID_END.A00) {
            this.A09 = new C27235C4c();
        }
        if (c5y != null) {
            this.A03 = c5y.isSignalCollectionEnabled() ? idCaptureConfig.A02 : clientSignalsAccumulator;
            this.A0D = c5y.isGenericDocumentCaptureEnabled();
            this.A0E = c5y.isFallbackToggleEnabled();
        }
    }

    public final void B2g(Exception exc) {
        A00(this);
    }
}
