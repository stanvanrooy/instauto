package p000X;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.BCA */
public final class BCA extends Fragment implements BED {
    public static WeakHashMap A03 = new WeakHashMap();
    public int A00 = 0;
    public Bundle A01;
    public Map A02 = new C04450Ea();

    public final void A2k(String str, LifecycleCallback lifecycleCallback) {
        if (!this.A02.containsKey(str)) {
            this.A02.put(str, lifecycleCallback);
            if (this.A00 > 0) {
                AnonymousClass0ZA.A0E(new BCF(Looper.getMainLooper()), new BCD(this, lifecycleCallback, str), 222945348);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final LifecycleCallback AHd(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.A02.get(str));
    }

    public final Activity AP1() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback A04 : this.A02.values()) {
            A04.A04(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback A012 : this.A02.values()) {
            A012.A01(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.A00 = 1;
        this.A01 = bundle;
        for (Map.Entry entry : this.A02.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.A02(bundle2);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.A00 = 5;
        Iterator it = this.A02.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onResume() {
        super.onResume();
        this.A00 = 3;
        Iterator it = this.A02.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.A02.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).A03(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.A00 = 2;
        for (LifecycleCallback A05 : this.A02.values()) {
            A05.A05();
        }
    }

    public final void onStop() {
        super.onStop();
        this.A00 = 4;
        for (LifecycleCallback A06 : this.A02.values()) {
            A06.A06();
        }
    }
}
