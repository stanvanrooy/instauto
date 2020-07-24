package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0hF  reason: invalid class name and case insensitive filesystem */
public final class C12700hF extends C12710hG implements C12720hH {
    public static C12700hF A03;
    public Map A00;
    public final QuickPerformanceLogger A01;
    public final SharedPreferences A02;

    public final C56812d6 A00(AnonymousClass2B5 r3) {
        C92803zk r0 = (C92803zk) this.A00.get(r3.A00());
        if (r0 != null) {
            return (C56812d6) r0.get();
        }
        return super.A00(r3);
    }

    public C12700hF(Context context, QuickPerformanceLogger quickPerformanceLogger) {
        this.A01 = quickPerformanceLogger;
        SharedPreferences sharedPreferences = context.getSharedPreferences("ig_cask_metadata_store", 0);
        this.A02 = sharedPreferences;
        HashMap hashMap = new HashMap();
        hashMap.put("eviction", AnonymousClass8AL.A00(new C12730hI(this, context, sharedPreferences)));
        hashMap.put("master_slave", AnonymousClass8AL.A00(new C12740hJ(this, context)));
        hashMap.put("stale_removal", AnonymousClass8AL.A00(new C12750hK(context, sharedPreferences)));
        this.A00 = hashMap;
        this.A00 = new C12760hL(context);
        this.A01 = new C12770hM(this);
    }

    public final void A01(AnonymousClass2BC r3, AnonymousClass2B5 r4) {
        super.A01(r3, r4);
        if ((r4 instanceof AnonymousClass2BD) && ((AnonymousClass2BD) r4).A01) {
            AnonymousClass0CH.A08("IgCask", "Cannot pass a logged in UserScopeConfig in IgCask just yet");
        }
    }
}
