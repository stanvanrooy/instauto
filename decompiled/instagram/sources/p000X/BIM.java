package p000X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.login.smartlock.impl.SmartLockPluginImpl;
import java.util.Set;

/* renamed from: X.BIM */
public final class BIM implements C138525vP {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ SmartLockPluginImpl A01;

    public BIM(SmartLockPluginImpl smartLockPluginImpl, FragmentActivity fragmentActivity) {
        this.A01 = smartLockPluginImpl;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ void Axj(Object obj) {
        C138325v5 r3 = (C138325v5) obj;
        this.A01.A02.put(this.A00, r3);
        Set<C138525vP> set = (Set) this.A01.A01.remove(this.A00);
        if (set != null) {
            for (C138525vP Axj : set) {
                Axj.Axj(r3);
            }
        }
    }
}
