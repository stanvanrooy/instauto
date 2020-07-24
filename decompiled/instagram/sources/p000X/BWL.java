package p000X;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.BWL */
public final class BWL implements C194388Tu {
    public final Context A00;

    public final String AiW() {
        return "sm";
    }

    public final Map BYM() {
        ApplicationInfo applicationInfo;
        if (Build.VERSION.SDK_INT >= 26) {
            HashMap hashMap = new HashMap();
            StorageStatsManager storageStatsManager = (StorageStatsManager) this.A00.getSystemService(StorageStatsManager.class);
            if (!(storageStatsManager == null || (applicationInfo = this.A00.getApplicationInfo()) == null)) {
                try {
                    StorageStats queryStatsForUid = storageStatsManager.queryStatsForUid(applicationInfo.storageUuid, applicationInfo.uid);
                    hashMap.put("ustats", new BWN(this, queryStatsForUid.getAppBytes(), queryStatsForUid.getDataBytes(), queryStatsForUid.getCacheBytes()));
                } catch (IOException unused) {
                }
                return hashMap;
            }
        }
        return null;
    }

    public BWL(Context context) {
        this.A00 = context;
    }
}
