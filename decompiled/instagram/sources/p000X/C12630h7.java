package p000X;

import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.facebook.common.dextricks.DexStore;
import com.facebook.react.modules.dialog.DialogModule;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: X.0h7  reason: invalid class name and case insensitive filesystem */
public final class C12630h7 {
    public Intent A00;
    public boolean A01;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f4  */
    public final Intent A00() {
        Intent intent;
        Message message;
        String str;
        StringBuilder sb;
        String message2;
        MessageQueue messageQueue;
        if (!this.A01) {
            Intent intent2 = null;
            try {
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 23) {
                    messageQueue = Looper.getMainLooper().getQueue();
                } else {
                    Field declaredField = mainLooper.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    messageQueue = (MessageQueue) declaredField.get(mainLooper);
                }
                Field declaredField2 = messageQueue.getClass().getDeclaredField("mMessages");
                declaredField2.setAccessible(true);
                message = (Message) declaredField2.get(messageQueue);
                try {
                    Object obj = message.obj;
                    if (Build.VERSION.SDK_INT >= 28) {
                        Class<?> cls = obj.getClass();
                        String canonicalName = cls.getCanonicalName();
                        if (canonicalName.equals("android.app.servertransaction.ClientTransaction")) {
                            Field declaredField3 = cls.getDeclaredField("mActivityCallbacks");
                            declaredField3.setAccessible(true);
                            List list = (List) declaredField3.get(obj);
                            Field declaredField4 = list.get(0).getClass().getDeclaredField("mIntent");
                            declaredField4.setAccessible(true);
                            intent2 = (Intent) declaredField4.get(list.get(0));
                        } else if (canonicalName.equals("android.app.ActivityThread.ReceiverData")) {
                            Field declaredField5 = cls.getDeclaredField("intent");
                            declaredField5.setAccessible(true);
                            intent2 = (Intent) declaredField5.get(obj);
                        }
                        intent = intent2;
                    } else {
                        Field declaredField6 = obj.getClass().getDeclaredField("intent");
                        declaredField6.setAccessible(true);
                        intent = (Intent) declaredField6.get(message.obj);
                    }
                } catch (Exception e) {
                    e = e;
                    if (message == null) {
                        Object obj2 = message.obj;
                        if (obj2 != null) {
                            sb = new StringBuilder("message obj");
                            message2 = obj2.getClass().getCanonicalName();
                        } else {
                            sb = new StringBuilder(DialogModule.KEY_MESSAGE);
                            message2 = message.toString();
                        }
                        sb.append(message2);
                        str = sb.toString();
                    } else {
                        str = "";
                    }
                    AnonymousClass0QD.A08("ColdStartIntentFetch", AnonymousClass000.A0E("failed to get app start intent via reflection.", str), e, DexStore.MS_IN_NS);
                    intent = null;
                    this.A00 = intent;
                    this.A01 = true;
                    return this.A00;
                }
            } catch (Exception e2) {
                e = e2;
                message = null;
                if (message == null) {
                }
                AnonymousClass0QD.A08("ColdStartIntentFetch", AnonymousClass000.A0E("failed to get app start intent via reflection.", str), e, DexStore.MS_IN_NS);
                intent = null;
                this.A00 = intent;
                this.A01 = true;
                return this.A00;
            }
            this.A00 = intent;
            this.A01 = true;
        }
        return this.A00;
    }
}
