package p000X;

import android.content.Context;
import android.util.Pair;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.Logger;
import com.facebook.proxygen.TraceFieldType;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0eS  reason: invalid class name and case insensitive filesystem */
public final class C11120eS extends AnonymousClass06D {
    public final Context A00;

    public static void A00(int i, String str, String str2) {
        int writeStandardEntry = Logger.writeStandardEntry(0, 7, 52, 0, 0, i, 0, 0);
        if (str != null) {
            writeStandardEntry = Logger.writeBytesEntry(0, 1, 56, writeStandardEntry, str);
        }
        Logger.writeBytesEntry(0, 1, 57, writeStandardEntry, str2);
    }

    public final void BSF(int i, int i2, int i3, int i4) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    public final void BSI(TraceContext traceContext) {
        C30801DkW dkW;
        String str;
        String str2;
        Pair A02 = AnonymousClass0NT.A02(this.A00);
        A00(8126485, TraceFieldType.NetworkType, (String) A02.first);
        A00(8126486, "network_subtype", (String) A02.second);
        try {
            File file = new File(this.A00.getFilesDir(), "mobilelab_test_info");
            if (!file.exists() || !file.canRead()) {
                AnonymousClass0DB.A0K("MobileLabTestInfo", "File %s does not exist or can not be read", file.getPath());
                dkW = new C30801DkW((String) null);
                str = dkW.A00;
                if (str == null) {
                    A00(8126489, "PERF_TEST_INFO", str);
                    return;
                }
                return;
            }
            try {
                str2 = new C2099093k(new C2098693g(file), C206048ru.A05).A01();
            } catch (IOException e) {
                AnonymousClass0DB.A0M("MobileLabTestInfo", e, "Failed to read mobile lab test info.");
                str2 = "{}";
            }
            dkW = new C30801DkW(str2);
            str = dkW.A00;
            if (str == null) {
            }
        } catch (SecurityException e2) {
            AnonymousClass0DB.A0M("MobileLabTestInfo", e2, "Failed to check file existance.");
            dkW = new C30801DkW((String) null);
        }
    }

    public C11120eS(Context context) {
        this.A00 = context;
    }
}
