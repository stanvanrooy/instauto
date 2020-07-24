package p000X;

import java.text.MessageFormat;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.BSQ */
public final class BSQ {
    public FutureTask A00 = null;
    public ScheduledExecutorService A01;
    public final BSV A02;
    public final Integer A03;

    public BSQ(ScheduledExecutorService scheduledExecutorService, Integer num, BSV bsv) {
        Object[] objArr;
        String str;
        this.A01 = scheduledExecutorService;
        this.A03 = num;
        this.A02 = bsv;
        if (bsv.A02 == null) {
            if (num == Constants.ZERO) {
                objArr = new Object[]{"xx"};
                str = "https://scontent.{0}.fbcdn.net/v/t39.8520-6/10000000_523892067942860_1999155963961119399_n.bin?oh=ad664fd447bb89d56efe0220b14b1c23&oe=9520106C";
            } else {
                objArr = new Object[]{"xx"};
                str = "https://video.{0}.fbcdn.net/upload-speed-test";
            }
            bsv.A02 = MessageFormat.format(str, objArr);
        }
        BSV bsv2 = this.A02;
        if (bsv2.A01 == null) {
            bsv2.A01 = "xx";
        }
    }
}
