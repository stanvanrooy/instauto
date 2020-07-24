package p000X;

import com.facebook.cameracore.mediapipeline.asyncscripting.AsyncScriptingService;
import com.facebook.cameracore.mediapipeline.asyncscripting.IScriptingClient;
import com.facebook.cameracore.mediapipeline.asyncscripting.JsVm;
import java.util.concurrent.Callable;

/* renamed from: X.B74 */
public final class B74 implements Callable {
    public final /* synthetic */ AsyncScriptingService A00;
    public final /* synthetic */ IScriptingClient A01;

    public B74(AsyncScriptingService asyncScriptingService, IScriptingClient iScriptingClient) {
        this.A00 = asyncScriptingService;
        this.A01 = iScriptingClient;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return new JsVm(this.A01);
    }
}
