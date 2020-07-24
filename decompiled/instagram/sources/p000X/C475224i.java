package p000X;

import android.content.ContentValues;
import com.instagram.feed.media.Media__JsonHelper;
import com.instagram.reels.persistence.UserReelMediasStore;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.24i  reason: invalid class name and case insensitive filesystem */
public final class C475224i extends AnonymousClass0O9 {
    public final /* synthetic */ AnonymousClass0C1 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C475224i(AnonymousClass0C1 r2, String str, List list) {
        super(337);
        this.A00 = r2;
        this.A01 = str;
        this.A02 = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00af */
    public final void run() {
        UserReelMediasStore A012 = UserReelMediasStore.A01(this.A00);
        String str = this.A01;
        List list = this.A02;
        try {
            list.size();
            AnonymousClass16T Aap = A012.A02.Aap();
            Aap.A6P();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("reel_id", str);
                contentValues.put("stored_time", Long.valueOf(System.currentTimeMillis()));
                C476124s r9 = new C476124s(new ArrayList(list));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C13460iZ A05 = C12890hY.A00.A05(new OutputStreamWriter(byteArrayOutputStream));
                A05.A0T();
                if (r9.A00 != null) {
                    A05.A0d("medias");
                    A05.A0S();
                    Iterator it = r9.A00.iterator();
                    while (it.hasNext()) {
                        AnonymousClass1NJ r0 = (AnonymousClass1NJ) it.next();
                        if (r0 != null) {
                            Media__JsonHelper.A01(A05, r0);
                        }
                    }
                    A05.A0P();
                }
                A05.A0Q();
                A05.close();
                contentValues.put("data", byteArrayOutputStream.toByteArray());
                Aap.Adh("user_reel_medias", 5, contentValues);
                Aap.BlP();
                A012.A04.add(str);
                if (A012.A04.size() > (A012.A00 << 1)) {
                    A012.A04.size();
                    UserReelMediasStore.A04(A012);
                }
                Aap.ADF();
            } catch (Throwable th) {
                Aap.ADF();
                throw th;
            }
        } catch (Exception e) {
            AnonymousClass0DB.A0G("com.instagram.reels.persistence.UserReelMediasStore", "Failed to store user reel into sqlite", e);
            AnonymousClass0QD.A02("com.instagram.reels.persistence.UserReelMediasStore", "Failed to store user reel into sqlite");
        }
    }
}
