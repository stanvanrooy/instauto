package p000X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.BAx */
public final class BAx {
    public static final BB0 A00;
    public static final BB0 A01 = new BB0("content://com.facebook.lite.provider.UserValuesProvider/user_values", new BB7(new String[]{"name", "value"}, "name='active_session_info'"), BAz.FACEBOOK_LITE, "com.facebook.lite", B91.A05);
    public static final BB0 A02;
    public static final BB0 A03 = new BB0("content://com.instagram.contentprovider.FamilyAppsUserValuesProvider", new BB7((String[]) null, (String) null), BAz.INSTAGRAM, "com.instagram.android", B91.A08);
    public static final Set A04 = Collections.unmodifiableSet(new BAy());

    static {
        BB7 bb7 = new BB7(new String[]{"name", "value"}, "name='active_session_info'");
        BAz bAz = BAz.A01;
        A02 = new BB0("content://com.facebook.katana.provider.FirstPartyUserValuesProvider/user_values", bb7, bAz, "com.facebook.katana", B91.A05);
        A00 = new BB0("content://com.facebook.wakizashi.provider.FirstPartyUserValuesProvider/user_values", new BB7(new String[]{"name", "value"}, "name='active_session_info'"), bAz, "com.facebook.wakizashi", B91.A01);
    }
}
