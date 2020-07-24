package p000X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.p013ar.core.C0127m;
import com.google.p045a.p047b.p048a.p049a.p050a.C0110d;

/* renamed from: X.B82 */
public final class B82 implements Runnable {
    public final /* synthetic */ B85 A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ B80 A02;

    public B82(B80 b80, Context context, B85 b85) {
        this.A02 = b80;
        this.A01 = context;
        this.A00 = b85;
    }

    public final void run() {
        Parcel A002;
        int A03;
        try {
            C0110d dVar = this.A02.A01;
            String str = this.A01.getApplicationInfo().packageName;
            Bundle bundle = new Bundle();
            bundle.putCharSequence("package.name", "com.google.ar.core");
            C0127m mVar = new C0127m(this);
            int A032 = AnonymousClass0Z0.A03(1214887057);
            A002 = dVar.A00();
            A002.writeString(str);
            A002.writeInt(1);
            bundle.writeToParcel(A002, 0);
            C25213B7y.A00(A002, mVar);
            A03 = AnonymousClass0Z0.A03(396088689);
            dVar.A00.transact(2, A002, (Parcel) null, 1);
            A002.recycle();
            AnonymousClass0Z0.A0A(727487549, A03);
            AnonymousClass0Z0.A0A(-1883704180, A032);
        } catch (RemoteException e) {
            Log.e("ARCore-InstallService", "requestInfo threw", e);
            this.A00.A00(C30179DUa.A06);
        } catch (Throwable th) {
            A002.recycle();
            AnonymousClass0Z0.A0A(-825143439, A03);
            throw th;
        }
    }
}
