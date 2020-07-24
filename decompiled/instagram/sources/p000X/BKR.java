package p000X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.vision.zzj;
import com.google.android.gms.internal.vision.zzk;

/* renamed from: X.BKR */
public abstract class BKR {
    public Object A00;
    public boolean A01 = false;
    public final Context A02;
    public final Object A03 = new Object();
    public final String A04;
    public final String A05;

    public Object A01(C25454BKz bKz, Context context) {
        zzj zzj;
        BKQ bkq = (BKQ) this;
        try {
            IBinder iBinder = (IBinder) bKz.A00.getClassLoader().loadClass("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator").newInstance();
            if (iBinder == null) {
                zzj = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                zzj = queryLocalInterface instanceof zzj ? (zzj) queryLocalInterface : new zzk(iBinder);
            }
            if (zzj != null) {
                return zzj.BvA(new ObjectWrapper(context), bkq.A00);
            }
            return null;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
            throw new BKS(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e);
        }
    }

    public BKR(Context context) {
        String $const$string = C193418Ps.$const$string(26);
        this.A02 = context;
        this.A04 = $const$string;
        StringBuilder sb = new StringBuilder(String.valueOf("com.google.android.gms.vision.dynamite").length() + 1 + String.valueOf("barcode").length());
        sb.append("com.google.android.gms.vision.dynamite");
        sb.append(".");
        sb.append("barcode");
        this.A05 = sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        android.util.Log.e(r5.A04, "Error creating remote native handle", r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[ExcHandler: RemoteException (r2v1 'e' android.os.RemoteException A[CUSTOM_DECLARE]), Splitter:B:13:0x0021] */
    public final Object A00() {
        synchronized (this.A03) {
            Object obj = this.A00;
            if (obj != null) {
                return obj;
            }
            C25454BKz bKz = null;
            bKz = C25454BKz.A01(this.A02, C25454BKz.A08, this.A05);
            try {
                bKz = C25454BKz.A01(this.A02, C25454BKz.A08, "com.google.android.gms.vision.dynamite");
            } catch (BKS e) {
                try {
                    Log.e(this.A04, "Error Loading module", e);
                } catch (RemoteException e2) {
                }
            }
            if (bKz != null) {
                this.A00 = A01(bKz, this.A02);
            }
            boolean z = this.A01;
            if (!z && this.A00 == null) {
                Log.w(this.A04, "Native handle not yet available. Reverting to no-op handle.");
                this.A01 = true;
            } else if (z && this.A00 != null) {
                Log.w(this.A04, "Native handle is now available.");
            }
            Object obj2 = this.A00;
            return obj2;
        }
    }
}
