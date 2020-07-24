package p000X;

import android.content.Context;
import com.facebook.mediastreaming.opt.transport.SSLFactoryHolder;
import java.io.File;

/* renamed from: X.AW4 */
public final class AW4 extends SSLFactoryHolder {
    public static BM5 A00;

    public AW4(Context context) {
        File file = new File(context.getFilesDir(), "fbtlsx_fbvp.store");
        this.mHybridData = initHybridData(file.toString(), false, new AW6(this));
    }
}
