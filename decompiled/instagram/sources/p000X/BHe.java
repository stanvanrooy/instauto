package p000X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.BHe */
public final class BHe extends C54202Wh {
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            try {
                ((C25388BHf) pair.first).BJo((C138515vO) pair.second);
            } catch (RuntimeException e) {
                throw e;
            }
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i);
            Log.wtf("BasePendingResult", sb.toString(), new Exception());
        } else {
            ((BasePendingResult) message.obj).A0A(Status.A09);
        }
    }

    public BHe() {
        super(Looper.getMainLooper());
    }

    public BHe(Looper looper) {
        super(looper);
    }
}
