package p000X;

import com.instagram.model.mediatype.MediaType;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.0te  reason: invalid class name and case insensitive filesystem */
public final class C19540te implements C05110Id {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r7.equals(com.facebook.catalyst.modules.netinfo.NetInfoModule.CONNECTION_TYPE_NONE) == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r7.equals("global_media") == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r7.equals("thread_id_or_none_for_perm_video") == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r7.equals("global") == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r7.equals("thread_id") == false) goto L_0x001b;
     */
    public final Object AF7(AnonymousClass0C1 r9) {
        char c;
        String str = (String) AnonymousClass0L6.A02(r9, AnonymousClass0L7.DIRECT_MUTATION_MANAGER_MEDIA_4, "media_queue", "thread_id_or_none_for_perm_video", (AnonymousClass04H) null);
        switch (str.hashCode()) {
            case -1562235024:
                c = 2;
                break;
            case -1243020381:
                c = 4;
                break;
            case -1205363492:
                c = 1;
                break;
            case -323071928:
                c = 3;
                break;
            case 3387192:
                c = 0;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return new AnonymousClass4SD();
        }
        if (c == 1) {
            AnonymousClass4SC r3 = new AnonymousClass4SC();
            HashMap hashMap = new HashMap();
            hashMap.put(MediaType.VIDEO, new AnonymousClass4SD());
            return new AnonymousClass4SB(r3, Collections.unmodifiableMap(hashMap));
        } else if (c == 2) {
            return new AnonymousClass4SC();
        } else {
            if (c == 3) {
                return new C17170pn("media");
            }
            if (c != 4) {
                AnonymousClass0QD.A02("DirectConfigureMessageQueueKeyProvider", AnonymousClass000.A0E("Invalid queue key config: ", str));
            }
            return new C17170pn("global");
        }
    }
}
