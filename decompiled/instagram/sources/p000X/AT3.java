package p000X;

import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.AT3 */
public final class AT3 {
    public static final AT3 A03 = new AT3();
    public Messenger A00;
    public final ServiceConnection A01 = new AT5(this);
    public final LinkedBlockingDeque A02 = new LinkedBlockingDeque();

    public static void A01(AT3 at3, int i) {
        at3.A02.offer(Message.obtain((Handler) null, i));
        A00(at3);
    }

    public static void A00(AT3 at3) {
        int size = at3.A02.size();
        while (true) {
            int i = size - 1;
            if (size > 0) {
                try {
                    at3.A00.send((Message) at3.A02.peek());
                    at3.A02.remove();
                } catch (Exception unused) {
                }
                size = i;
            } else {
                return;
            }
        }
    }
}
