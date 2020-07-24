package p000X;

import com.facebook.react.animated.EventAnimationDriver;
import com.facebook.react.animated.NativeAnimatedModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AB6 */
public final class AB6 implements C23183ABl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NativeAnimatedModule A01;
    public final /* synthetic */ C23043A0y A02;
    public final /* synthetic */ String A03;

    public AB6(NativeAnimatedModule nativeAnimatedModule, int i, String str, C23043A0y a0y) {
        this.A01 = nativeAnimatedModule;
        this.A00 = i;
        this.A03 = str;
        this.A02 = a0y;
    }

    public final void ADZ(AB3 ab3) {
        int i = this.A00;
        String str = this.A03;
        C23043A0y a0y = this.A02;
        int i2 = a0y.getInt("animatedValueTag");
        ABX abx = (ABX) ab3.A03.get(i2);
        if (abx == null) {
            throw new A0k(AnonymousClass000.A06("Animated node with tag ", i2, " does not exists"));
        } else if (abx instanceof ABP) {
            A1e array = a0y.getArray("nativeEventPath");
            ArrayList arrayList = new ArrayList(array.size());
            for (int i3 = 0; i3 < array.size(); i3++) {
                arrayList.add(array.getString(i3));
            }
            EventAnimationDriver eventAnimationDriver = new EventAnimationDriver(arrayList, (ABP) abx);
            String A002 = AnonymousClass000.A00(i, str);
            if (ab3.A07.containsKey(A002)) {
                ((List) ab3.A07.get(A002)).add(eventAnimationDriver);
                return;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(eventAnimationDriver);
            ab3.A07.put(A002, arrayList2);
        } else {
            throw new A0k(AnonymousClass000.A0E("Animated node connected to event should beof type ", ABP.class.getName()));
        }
    }
}
