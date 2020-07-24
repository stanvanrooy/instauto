package p000X;

import android.os.Bundle;
import android.webkit.CookieSyncManager;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import java.io.File;
import java.io.IOException;

/* renamed from: X.ASM */
public abstract class ASM {
    public final /* synthetic */ ATL A00;

    public void A00(BrowserLiteCallback browserLiteCallback) {
        BrowserLiteCallback browserLiteCallback2 = browserLiteCallback;
        if (this instanceof C23576ARx) {
            C23576ARx aRx = (C23576ARx) this;
            browserLiteCallback2.BDZ(aRx.A02, aRx.A01);
        } else if (this instanceof AQW) {
            AQW aqw = (AQW) this;
            String str = aqw.A04;
            Bundle bundle = aqw.A03;
            Bundle bundle2 = bundle;
            BrowserLiteCallback browserLiteCallback3 = browserLiteCallback2;
            browserLiteCallback3.BDc(str, bundle2, aqw.A01, aqw.A02);
        } else if (this instanceof C23571ARr) {
            C23571ARr aRr = (C23571ARr) this;
            browserLiteCallback2.BDl(aRr.A03, aRr.A02, aRr.A01);
        } else if (this instanceof C23530AQa) {
            C23530AQa aQa = (C23530AQa) this;
            long[] jArr = aQa.A03;
            if (jArr.length > 0) {
                browserLiteCallback2.Bcm(jArr);
            }
            browserLiteCallback2.BE2(aQa.A01, aQa.A02);
        } else if (this instanceof AQZ) {
            AQZ aqz = (AQZ) this;
            browserLiteCallback2.BJz(aqz.A02, aqz.A01);
        } else if (this instanceof AQY) {
            AQY aqy = (AQY) this;
            browserLiteCallback2.AyW(aqy.A02, aqy.A01);
        } else if (this instanceof C23572ARs) {
            browserLiteCallback2.B3J(((C23572ARs) this).A01);
        } else if (this instanceof AS2) {
            browserLiteCallback2.BMU();
        } else if (this instanceof AS9) {
            AS9 as9 = (AS9) this;
            browserLiteCallback2.A6u(as9.A02, as9.A03, as9.A01);
        } else if (this instanceof C23543AQn) {
            browserLiteCallback2.B4w();
        } else if (this instanceof AS1) {
            AS1 as1 = (AS1) this;
            browserLiteCallback2.B6p(as1.A01, as1.A02);
        } else if (this instanceof AQX) {
            CookieSyncManager.createInstance(((AQX) this).A01);
            try {
                C23629AUr.A00().flush();
            } catch (Exception unused) {
            }
            browserLiteCallback2.Br9();
        } else if (this instanceof C23575ARw) {
            C23575ARw aRw = (C23575ARw) this;
            browserLiteCallback2.B8Y(aRw.A01, aRw.A02);
        } else if (this instanceof C23574ARv) {
            C23574ARv aRv = (C23574ARv) this;
            browserLiteCallback2.BTq(aRv.A02, aRv.A01);
        } else if (this instanceof AQV) {
            AQV aqv = (AQV) this;
            browserLiteCallback2.B33(aqv.A03, aqv.A02, aqv.A04, aqv.A01);
        } else if (this instanceof AS0) {
            browserLiteCallback2.Bcm(((AS0) this).A01);
        } else if (!(this instanceof C23573ARu)) {
            ARU aru = (ARU) this;
            String str2 = aru.A08;
            long j = aru.A05;
            long j2 = aru.A06;
            long j3 = aru.A02;
            long j4 = aru.A04;
            long j5 = aru.A03;
            long j6 = j5;
            long j7 = j4;
            long j8 = j3;
            long j9 = j2;
            String str3 = str2;
            long j10 = j;
            browserLiteCallback2.Alz(str3, j10, j9, j8, j7, j6, aru.A01, false, aru.A0E, aru.A0D, aru.A0A, aru.A0C, aru.A09, aru.A0B);
        } else {
            C23573ARu aRu = (C23573ARu) this;
            browserLiteCallback2.B6s(aRu.A02, aRu.A01);
        }
    }

    public ASM(ATL atl) {
        this.A00 = atl;
    }

    public void A01(Exception exc) {
        if (!(this instanceof ARU)) {
            ATK.A00("BrowserLiteCallbacker", "Callbacker exception %s", exc.getMessage());
            return;
        }
        try {
            new File(((ARU) this).A07.getFilesDir(), "browser_ipc_failed").createNewFile();
        } catch (IOException unused) {
        }
    }
}
