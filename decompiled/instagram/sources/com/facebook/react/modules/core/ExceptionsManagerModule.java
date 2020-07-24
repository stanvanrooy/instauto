package com.facebook.react.modules.core;

import android.util.JsonWriter;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;
import p000X.A0Y;
import p000X.A1N;
import p000X.A1e;
import p000X.A44;
import p000X.AnonymousClass0CH;
import p000X.AnonymousClass0CI;
import p000X.C227789r8;
import p000X.C228089rf;
import p000X.C23043A0y;
import p000X.C23047A1h;

@ReactModule(name = "ExceptionsManager")
public class ExceptionsManagerModule extends NativeExceptionsManagerSpec {
    public static final String NAME = "ExceptionsManager";
    public final C228089rf mDevSupportManager;

    public ExceptionsManagerModule(C228089rf r2) {
        super((A44) null);
        this.mDevSupportManager = r2;
    }

    public String getName() {
        return "ExceptionsManager";
    }

    public void reportFatalException(String str, A1e a1e, double d) {
        A1N a1n = new A1N();
        a1n.putString(DialogModule.KEY_MESSAGE, str);
        a1n.putArray("stack", a1e);
        a1n.putInt("id", (int) d);
        a1n.putBoolean("isFatal", true);
        reportException(a1n);
    }

    public void reportSoftException(String str, A1e a1e, double d) {
        A1N a1n = new A1N();
        a1n.putString(DialogModule.KEY_MESSAGE, str);
        a1n.putArray("stack", a1e);
        a1n.putInt("id", (int) d);
        a1n.putBoolean("isFatal", false);
        reportException(a1n);
    }

    public void reportException(C23043A0y a0y) {
        String str;
        A1e writableNativeArray;
        boolean z;
        if (a0y.hasKey(DialogModule.KEY_MESSAGE)) {
            str = a0y.getString(DialogModule.KEY_MESSAGE);
        } else {
            str = "";
        }
        if (a0y.hasKey("stack")) {
            writableNativeArray = a0y.getArray("stack");
        } else {
            writableNativeArray = new WritableNativeArray();
        }
        if (a0y.hasKey("id")) {
            a0y.getInt("id");
        }
        if (a0y.hasKey("isFatal")) {
            z = a0y.getBoolean("isFatal");
        } else {
            z = false;
        }
        if (!this.mDevSupportManager.AKB()) {
            String str2 = null;
            if (!(a0y == null || a0y.getType("extraData") == ReadableType.Null)) {
                try {
                    StringWriter stringWriter = new StringWriter();
                    JsonWriter jsonWriter = new JsonWriter(stringWriter);
                    C23047A1h.A02(jsonWriter, a0y.getDynamic("extraData"));
                    jsonWriter.close();
                    stringWriter.close();
                    str2 = stringWriter.toString();
                } catch (IOException unused) {
                }
            }
            if (!z) {
                AnonymousClass0CH.A06("ReactNative", A0Y.A00(str, writableNativeArray));
                if (str2 != null) {
                    AnonymousClass0CI r2 = AnonymousClass0CH.A00;
                    if (r2.isLoggable(3)) {
                        r2.mo917d("ReactNative", String.format((Locale) null, "extraData: %s", new Object[]{str2}));
                        return;
                    }
                    return;
                }
                return;
            }
            throw new C227789r8(A0Y.A00(str, writableNativeArray));
        } else if (a0y.getMap("extraData") != null && a0y.getMap("extraData").hasKey("suppressRedBox")) {
            a0y.getMap("extraData").getBoolean("suppressRedBox");
        }
    }

    public void dismissRedbox() {
    }

    public void updateExceptionMessage(String str, A1e a1e, double d) {
    }
}
