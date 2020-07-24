package p000X;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.zzm;

/* renamed from: X.B4i */
public final class B4i extends ClassLoader {
    public final Class loadClass(String str, boolean z) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z);
        }
        FirebaseInstanceId.A03();
        return zzm.class;
    }
}
