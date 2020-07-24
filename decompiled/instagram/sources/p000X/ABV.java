package p000X;

import com.facebook.react.animated.NativeAnimatedModule;
import java.util.Queue;

/* renamed from: X.ABV */
public final class ABV implements A9U {
    public final /* synthetic */ NativeAnimatedModule A00;
    public final /* synthetic */ Queue A01;

    public ABV(NativeAnimatedModule nativeAnimatedModule, Queue queue) {
        this.A00 = nativeAnimatedModule;
        this.A01 = queue;
    }

    public final void ADa(A83 a83) {
        NativeAnimatedModule.getNodesManager(this.A00);
        NativeAnimatedModule.executeAllOperations(this.A00, this.A01);
    }
}
