package p000X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AQN */
public class AQN {
    public ARQ A00;
    public ASB A01;
    public ATp A02;
    public WeakReference A03;
    public WeakReference A04;
    public WeakReference A05;
    public List A06 = new ArrayList();

    public final List A01(Class cls) {
        ArrayList arrayList = new ArrayList();
        WeakReference weakReference = this.A03;
        if (!(weakReference == null || this.A04 == null)) {
            Context context = (Context) weakReference.get();
            Intent intent = (Intent) this.A04.get();
            if (!(context == null || intent == null)) {
                for (AQU aqu : this.A06) {
                    if (cls.isInstance(aqu)) {
                        arrayList.add(aqu);
                    }
                }
            }
        }
        return arrayList;
    }

    public void A02() {
        WeakReference weakReference = this.A03;
        if (weakReference == null || this.A04 == null || this.A05 == null) {
            for (AQU destroy : this.A06) {
                destroy.destroy();
            }
        } else {
            Context context = (Context) weakReference.get();
            Intent intent = (Intent) this.A04.get();
            View view = (View) this.A05.get();
            if (context == null || intent == null || view == null || this.A01 == null || this.A02 == null) {
                for (AQU destroy2 : this.A06) {
                    destroy2.destroy();
                }
            } else {
                for (AQU B3L : this.A06) {
                    B3L.B3L(context, intent, view, this.A01, this.A02, this.A00);
                }
                return;
            }
        }
        this.A06.clear();
    }

    public void A03() {
        for (AQU destroy : this.A06) {
            destroy.destroy();
        }
        this.A06.clear();
        WeakReference weakReference = this.A03;
        if (weakReference != null) {
            weakReference.clear();
            this.A03 = null;
        }
        WeakReference weakReference2 = this.A04;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.A04 = null;
        }
        WeakReference weakReference3 = this.A05;
        if (weakReference3 != null) {
            weakReference3.clear();
            this.A05 = null;
        }
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
    }
}
