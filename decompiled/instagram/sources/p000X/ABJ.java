package p000X;

import com.facebook.react.animated.EventAnimationDriver;
import com.facebook.react.animated.NativeAnimatedModule;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.ABJ */
public final class ABJ implements C23183ABl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ NativeAnimatedModule A02;
    public final /* synthetic */ String A03;

    public ABJ(NativeAnimatedModule nativeAnimatedModule, int i, String str, int i2) {
        this.A02 = nativeAnimatedModule;
        this.A01 = i;
        this.A03 = str;
        this.A00 = i2;
    }

    public final void ADZ(AB3 ab3) {
        int i = this.A01;
        String str = this.A03;
        int i2 = this.A00;
        String A002 = AnonymousClass000.A00(i, str);
        if (ab3.A07.containsKey(A002)) {
            List list = (List) ab3.A07.get(A002);
            if (list.size() == 1) {
                ab3.A07.remove(AnonymousClass000.A00(i, str));
                return;
            }
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (((EventAnimationDriver) listIterator.next()).mValueNode.A02 == i2) {
                    listIterator.remove();
                    return;
                }
            }
        }
    }
}
