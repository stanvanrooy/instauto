package p000X;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.play.core.internal.C0115bj;
import com.google.android.play.core.internal.C0116bl;

/* renamed from: X.BFI */
public final /* synthetic */ class BFI implements BFk {
    public static final BFk A00 = new BFI();

    public final Object A28(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return queryLocalInterface instanceof C0116bl ? (C0116bl) queryLocalInterface : new C0115bj(iBinder);
    }
}
