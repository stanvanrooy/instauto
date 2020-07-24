package p000X;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;

/* renamed from: X.B5E */
public final class B5E implements B5R {
    public final ComponentName A00;
    public final String A01;
    public final Messenger A02;

    public final void AiU(int i) {
        Messenger messenger = this.A02;
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.arg1 = i;
        Bundle bundle = new Bundle();
        bundle.putString(B5B.INTENT_PARAM_TAG, this.A01);
        bundle.putParcelable("component", this.A00);
        obtain.setData(bundle);
        messenger.send(obtain);
    }

    public B5E(Messenger messenger, String str, ComponentName componentName) {
        this.A02 = messenger;
        this.A01 = str;
        this.A00 = componentName;
    }
}
