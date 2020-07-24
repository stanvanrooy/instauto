package p000X;

import android.os.Process;
import com.facebook.common.dextricks.DexStore;
import com.facebook.proxygen.TraceFieldType;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.BTC */
public class BTC {
    public static String A05;
    public BTI A00;
    public BTH A01;
    public BTG A02;
    public AnonymousClass0JZ A03;
    public AnonymousClass0JU A04;

    public String A00() {
        boolean z = this instanceof BTD;
        return "mobile_memory_metrics";
    }

    public final void A01(int i) {
        String str;
        String str2;
        this.A03.A00 = AnonymousClass0P4.A01(A00(), (String) null);
        AnonymousClass0JZ r0 = this.A03;
        if (r0.A01.AfM(r0.A00)) {
            this.A02.Bcj(this.A01.AQG(), this.A03);
            this.A03.A00.A0A(TraceFieldType.IsForeground, Boolean.valueOf(!AnonymousClass0Q7.A03().A0H()));
            AnonymousClass0JZ r02 = this.A03;
            switch (i) {
                case 1:
                    str = "EVENT_FOREGROUND";
                    break;
                case 2:
                    str = "EVENT_BACKGROUND";
                    break;
                case 3:
                    str = "EVENT_PERIODIC";
                    break;
                case 4:
                    str = "EVENT_NAVIGATION";
                    break;
                case 5:
                    str = "EVENT_START_PERIODIC";
                    break;
                case 6:
                    str = "EVENT_STOP_PERIODIC";
                    break;
                default:
                    str = null;
                    break;
            }
            r02.A00.A0G("memory_event_type", str);
            AnonymousClass0JZ r4 = this.A03;
            synchronized (this) {
                str2 = A05;
                if (str2 == null) {
                    str2 = AnonymousClass000.A0J(Integer.toString(Process.myPid()), "_", Integer.toString(new Random().nextInt(DexStore.MS_IN_NS)));
                    A05 = str2;
                }
            }
            r4.A00.A0G("session_id", str2);
            AnonymousClass0JZ r03 = this.A03;
            r03.A01.BcG(r03.A00);
        }
    }

    public void A02(int i, Object obj, ScheduledExecutorService scheduledExecutorService) {
        ScheduledFuture scheduledFuture;
        if (!(this instanceof BTD)) {
            A01(i);
            return;
        }
        BTD btd = (BTD) this;
        if (i != 5) {
            if (i == 6 && (scheduledFuture = btd.A00) != null) {
                scheduledFuture.cancel(true);
                btd.A00 = null;
            }
        } else if (obj != null) {
            BTF btf = (BTF) obj;
            ScheduledFuture scheduledFuture2 = btd.A00;
            if (!(scheduledFuture2 == null || scheduledFuture2 == null)) {
                scheduledFuture2.cancel(true);
                btd.A00 = null;
            }
            btd.A00 = scheduledExecutorService.scheduleAtFixedRate(new BTE(btd), btf.A00, btf.A01, btf.A02);
        }
    }

    public boolean A03(int i, Object obj) {
        if (!(this instanceof BTD)) {
            if (!this.A00.Afg()) {
                return false;
            }
            if (i == 1 || i == 2) {
                return true;
            }
            return false;
        } else if (!((BTD) this).A00.Afg()) {
            return false;
        } else {
            if (i == 5 || i == 6) {
                return true;
            }
            return false;
        }
    }

    public BTC(BTH bth, BTG btg, AnonymousClass0JZ r3, AnonymousClass0JU r4, BTI bti) {
        this.A01 = bth;
        this.A02 = btg;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = bti;
    }
}
