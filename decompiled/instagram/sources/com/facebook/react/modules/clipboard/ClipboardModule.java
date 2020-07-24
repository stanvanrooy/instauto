package com.facebook.react.modules.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import p000X.C2102594w;

@ReactModule(name = "Clipboard")
public class ClipboardModule extends ContextBaseJavaModule {
    public static final String NAME = "Clipboard";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void setString(String str) {
        getClipboardService().setPrimaryClip(ClipData.newPlainText((CharSequence) null, str));
    }

    private ClipboardManager getClipboardService() {
        return (ClipboardManager) this.mContext.getSystemService("clipboard");
    }

    public ClipboardModule(Context context) {
        super(context);
    }

    @ReactMethod
    public void getString(C2102594w r5) {
        try {
            ClipboardManager clipboardService = getClipboardService();
            ClipData primaryClip = clipboardService.getPrimaryClip();
            if (primaryClip != null) {
                if (primaryClip.getItemCount() >= 1) {
                    ClipData.Item itemAt = clipboardService.getPrimaryClip().getItemAt(0);
                    r5.resolve("" + itemAt.getText());
                    return;
                }
            }
            r5.resolve("");
        } catch (Exception e) {
            r5.reject((Throwable) e);
        }
    }
}
