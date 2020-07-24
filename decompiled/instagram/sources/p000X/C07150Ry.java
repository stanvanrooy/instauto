package p000X;

import android.content.Context;
import java.io.File;
import java.nio.channels.OverlappingFileLockException;
import java.util.HashMap;

/* renamed from: X.0Ry  reason: invalid class name and case insensitive filesystem */
public final class C07150Ry {
    public File A00;
    public final HashMap A01 = new HashMap();

    public final synchronized void A00(String str, AnonymousClass0P4 r8) {
        C46521zt r1;
        synchronized (this) {
            String A0O = AnonymousClass000.A0O(this.A00.getName(), "_", r8.A04, "_", str);
            r1 = (C46521zt) this.A01.get(A0O);
            if (r1 == null) {
                File file = new File(this.A00, A0O);
                if (!file.isDirectory() && !file.mkdir()) {
                    AnonymousClass0QD.A01("PerEventAnalyticsEventCounter", AnonymousClass000.A0J("Could not create event ", A0O, " counter directory"));
                    file = null;
                }
                if (file == null) {
                    r1 = null;
                } else {
                    r1 = new C46521zt(file);
                    this.A01.put(A0O, r1);
                }
            }
        }
        if (r1 != null) {
            try {
                long A012 = r1.A01();
                r8.A0E("e_counter_id", Integer.valueOf((int) (A012 >> 32)));
                r8.A0E("e_counter_sid", Integer.valueOf((int) (A012 & -1)));
                r8.A0G("e_counter_channel", str);
            } catch (OverlappingFileLockException e) {
                throw new RuntimeException(AnonymousClass000.A0E("Filename: ", AnonymousClass000.A0O(this.A00.getName(), "_", r8.A04, "_", str)), e);
            }
        }
    }

    public C07150Ry(Context context) {
        this.A00 = context.getDir("per_event_counter", 0);
    }
}
