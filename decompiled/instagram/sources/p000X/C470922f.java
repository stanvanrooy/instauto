package p000X;

import android.location.Location;
import com.instagram.location.impl.LocationPluginImpl;

/* renamed from: X.22f  reason: invalid class name and case insensitive filesystem */
public final class C470922f implements C471022g {
    public final /* synthetic */ C470422a A00;
    public final /* synthetic */ LocationPluginImpl A01;
    public final /* synthetic */ AnonymousClass22V A02;

    public C470922f(LocationPluginImpl locationPluginImpl, AnonymousClass22V r2, C470422a r3) {
        this.A01 = locationPluginImpl;
        this.A02 = r2;
        this.A00 = r3;
    }

    public final void B2d(AnonymousClass2Ew r2) {
        this.A02.B2g(r2);
        this.A00.A04();
    }

    public final void B9n(C44121vd r4) {
        this.A02.onLocationChanged(new Location(r4.A00));
    }
}
