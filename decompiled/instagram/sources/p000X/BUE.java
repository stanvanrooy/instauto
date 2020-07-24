package p000X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.BUE */
public abstract class BUE {
    public abstract boolean onStart(Context context, DND dnd);

    public static BUE getInstance(Context context) {
        try {
            return (BUE) Class.forName("com.instagram.contacts.ccu.impl.CCUServiceImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            AnonymousClass0QD.A06("CCUService", StringFormatUtil.formatStrLocaleSafe("Failed to initialize CCUService"), th);
            return null;
        }
    }
}
