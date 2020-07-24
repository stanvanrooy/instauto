package p000X;

import android.widget.Toast;
import com.facebook.react.modules.toast.ToastModule;

/* renamed from: X.A8w */
public final class A8w implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ToastModule A02;
    public final /* synthetic */ String A03;

    public A8w(ToastModule toastModule, String str, int i, int i2) {
        this.A02 = toastModule;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void run() {
        Toast makeText = Toast.makeText(this.A02.getReactApplicationContext(), this.A03, this.A00);
        makeText.setGravity(this.A01, 0, 0);
        makeText.show();
    }
}
