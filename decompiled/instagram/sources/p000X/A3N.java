package p000X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.queue.MessageQueueThread;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.A3N */
public class A3N extends ContextWrapper {
    public CatalystInstance A00;
    public C227799rA A01;
    public C227799rA A02;
    public MessageQueueThread A03;
    public MessageQueueThread A04;
    public MessageQueueThread A05;
    public Integer A06 = Constants.ZERO;
    public WeakReference A07;
    public LayoutInflater A08;
    public final CopyOnWriteArraySet A09 = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A0A = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A0B = new CopyOnWriteArraySet();
    public volatile boolean A0C = false;

    public boolean A09() {
        if (!(this instanceof C23053A3d)) {
            return false;
        }
        return ((C23053A3d) this).A00.A09();
    }

    public Activity A00() {
        if (this instanceof C23053A3d) {
            return ((C23053A3d) this).A00.A00();
        }
        WeakReference weakReference = this.A07;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public final JavaScriptModule A01(Class cls) {
        CatalystInstance catalystInstance = this.A00;
        if (catalystInstance != null) {
            return catalystInstance.getJSModule(cls);
        }
        if (this.A0C) {
            throw new IllegalStateException("Tried to access a JS module after the React instance was destroyed.");
        }
        throw new IllegalStateException("Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.");
    }

    public final NativeModule A02(Class cls) {
        String str;
        CatalystInstance catalystInstance = this.A00;
        if (catalystInstance != null) {
            return catalystInstance.getNativeModule(cls);
        }
        if (this.A0C) {
            str = "Trying to call native module after CatalystInstance has been destroyed!";
        } else {
            str = "Trying to call native module before CatalystInstance has been set!";
        }
        throw new IllegalStateException(str);
    }

    public final void A03() {
        this.A06 = Constants.ONE;
        ReactMarker.logMarker(A3L.ON_HOST_PAUSE_START);
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            try {
                ((A47) it.next()).onHostPause();
            } catch (RuntimeException e) {
                A08(e);
            }
        }
        ReactMarker.logMarker(A3L.ON_HOST_PAUSE_END);
    }

    public final void A04(Activity activity) {
        this.A06 = Constants.A0C;
        this.A07 = new WeakReference(activity);
        ReactMarker.logMarker(A3L.ON_HOST_RESUME_START);
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            try {
                ((A47) it.next()).onHostResume();
            } catch (RuntimeException e) {
                A08(e);
            }
        }
        ReactMarker.logMarker(A3L.ON_HOST_RESUME_END);
    }

    public final void A05(CatalystInstance catalystInstance) {
        if (catalystInstance == null) {
            throw new IllegalArgumentException("CatalystInstance cannot be null.");
        } else if (this.A00 == null) {
            if (this.A0C) {
                ReactSoftException.logSoftException("ReactContext", new IllegalStateException("Cannot initialize ReactContext after it has been destroyed."));
            }
            this.A00 = catalystInstance;
            A4U reactQueueConfiguration = catalystInstance.getReactQueueConfiguration();
            if (this.A05 == null && this.A04 == null && this.A03 == null) {
                this.A05 = reactQueueConfiguration.A02;
                this.A04 = reactQueueConfiguration.A01;
                this.A03 = reactQueueConfiguration.A00;
                return;
            }
            throw new IllegalStateException("Message queue threads already initialized");
        } else {
            throw new IllegalStateException("ReactContext has been already initialized");
        }
    }

    public void A06(A47 a47) {
        if (!(this instanceof C23053A3d)) {
            this.A0A.add(a47);
            if (A0A()) {
                switch (this.A06.intValue()) {
                    case 0:
                    case 1:
                        return;
                    case 2:
                        C23054A3g a3g = new C23054A3g(this, a47);
                        MessageQueueThread messageQueueThread = this.A05;
                        AnonymousClass0FY.A00(messageQueueThread);
                        messageQueueThread.runOnQueue(a3g);
                        return;
                    default:
                        throw new IllegalStateException("Unhandled lifecycle state.");
                }
            }
        } else {
            ((C23053A3d) this).A00.A06(a47);
        }
    }

    public void A07(A47 a47) {
        if (!(this instanceof C23053A3d)) {
            this.A0A.remove(a47);
        } else {
            ((C23053A3d) this).A00.A07(a47);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0.isDestroyed() != false) goto L_0x0010;
     */
    public final void A08(Exception exc) {
        boolean z;
        CatalystInstance catalystInstance = this.A00;
        boolean z2 = false;
        boolean z3 = false;
        if (catalystInstance != null) {
            z3 = true;
        }
        if (z3) {
            z = true;
        }
        z = false;
        C227799rA r0 = this.A02;
        if (r0 != null) {
            z2 = true;
        }
        if (!z || !z2) {
            StringBuilder sb = new StringBuilder("Unable to handle Exception - catalystInstanceVariableExists: ");
            sb.append(z3);
            sb.append(" - isCatalystInstanceAlive: ");
            sb.append(!z);
            sb.append(" - hasExceptionHandler: ");
            sb.append(z2);
            AnonymousClass0CH.A09("ReactNative", sb.toString(), exc);
            throw new IllegalStateException(exc);
        }
        r0.handleException(exc);
    }

    public final boolean A0A() {
        CatalystInstance catalystInstance = this.A00;
        if (catalystInstance == null || catalystInstance.isDestroyed()) {
            return false;
        }
        return true;
    }

    public final Object getSystemService(String str) {
        if (!AnonymousClass0C5.$const$string(101).equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.A08 == null) {
            this.A08 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.A08;
    }

    public A3N(Context context) {
        super(context);
    }
}
