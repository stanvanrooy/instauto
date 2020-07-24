package p000X;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AAY */
public final class AAY extends WebView {
    public AAZ A00;
    public final C23150AAa A01 = new C23150AAa(this);

    public final void A00() {
        getSecureSettings().A00.setMixedContentMode(0);
    }

    public AAI getSecureSettings() {
        return new AAI(getSettings());
    }

    public AAY(Context context) {
        super(context);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(C23153AAd.A00);
        this.A00 = new AAZ(arrayList2, arrayList, new C23156AAg());
        getSecureSettings().A00();
    }

    public final C23150AAa getSecureJsBridgeAuth() {
        return this.A01;
    }

    public final AAZ getUriHandler() {
        return this.A00;
    }

    public final void loadUrl(String str) {
        loadUrl(str, (Map) null);
    }

    public final void loadUrl(String str, Map map) {
        String authority;
        Integer num;
        AAZ aaz = this.A00;
        Context context = getContext();
        Uri A012 = C08480Xf.A01(str, aaz.A00, false);
        if (A012 == null) {
            aaz.A00.Bbw("WebViewUriHandler", "Uri cannot be parsed so we block it.", (Throwable) null);
            num = Constants.A0C;
        } else {
            Iterator it = aaz.A02.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C23154AAe) it.next()).launch(A012, context)) {
                        num = Constants.ONE;
                        break;
                    }
                } else {
                    Uri A013 = C08480Xf.A01(str, aaz.A00, false);
                    if (A013 == null) {
                        aaz.A00.Bbw("WebViewUriHandler", "Uri cannot be parsed so we block it.", (Throwable) null);
                    } else {
                        for (C23151AAb A002 : aaz.A01) {
                            if (A002.A00(A013)) {
                                num = Constants.ZERO;
                                break;
                            }
                        }
                        AnonymousClass0XP r2 = aaz.A00;
                        if (AnonymousClass000.A0E("Uri is blocked, scheme: ", A013.getScheme()) != null) {
                            authority = A013.getScheme();
                        } else {
                            authority = AnonymousClass000.A0E("cannot parse , authority: ", A013.getAuthority()) != null ? A013.getAuthority() : "cannot parse";
                        }
                        r2.Bbw("WebViewUriHandler", authority, (Throwable) null);
                    }
                    num = Constants.A0C;
                }
            }
        }
        if (num.intValue() == 0) {
            super.loadUrl(str, map);
        }
    }
}
