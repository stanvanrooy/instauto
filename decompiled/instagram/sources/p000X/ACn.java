package p000X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.bridge.WritableNativeMap;

/* renamed from: X.ACn */
public final class ACn implements C26155BgZ {
    public final /* synthetic */ Bg0 A00;

    public ACn(Bg0 bg0) {
        this.A00 = bg0;
    }

    public final void Asg(int i, Throwable th, Bundle bundle) {
        this.A00.A00.reject(th);
    }

    public final void Ash(C26161Bgf bgf) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Bundle bundle = bgf.A00;
        if (bundle != null) {
            String string = bundle.getString("SIGNED_PTT");
            if (!TextUtils.isEmpty(string)) {
                writableNativeMap.putString("pttResult", string);
            }
        }
        this.A00.A00.resolve(writableNativeMap);
    }
}
