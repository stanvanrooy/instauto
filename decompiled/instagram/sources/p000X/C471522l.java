package p000X;

import com.instagram.location.impl.LocationPluginImpl;
import java.lang.ref.WeakReference;

/* renamed from: X.22l  reason: invalid class name and case insensitive filesystem */
public final class C471522l implements Runnable {
    public final /* synthetic */ C470422a A00;
    public final /* synthetic */ LocationPluginImpl A01;
    public final /* synthetic */ WeakReference A02;

    public C471522l(LocationPluginImpl locationPluginImpl, WeakReference weakReference, C470422a r3) {
        this.A01 = locationPluginImpl;
        this.A02 = weakReference;
        this.A00 = r3;
    }

    public final void run() {
        AnonymousClass0Q7 A03 = AnonymousClass0Q7.A03();
        A03.A03.add(new C471722n(this));
    }
}
