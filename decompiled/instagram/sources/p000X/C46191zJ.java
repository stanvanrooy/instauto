package p000X;

import android.content.Context;
import com.instagram.model.reels.Reel;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1zJ  reason: invalid class name and case insensitive filesystem */
public final class C46191zJ implements C46201zK {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0RN A01;
    public final /* synthetic */ AnonymousClass1WD A02;
    public final /* synthetic */ AnonymousClass0C1 A03;

    public C46191zJ(AnonymousClass1WD r1, AnonymousClass0C1 r2, AnonymousClass0RN r3, Context context) {
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A00 = context;
    }

    public final void B4b(List list) {
        this.A02.notifyDataSetChanged();
        if (((Boolean) AnonymousClass0L6.A02(this.A03, AnonymousClass0L7.STORIES_IFU_LOADING_LATENCY, "should_loader_prefetch_preview_images", false, (AnonymousClass04H) null)).booleanValue()) {
            List<Reel> A05 = this.A02.A05(list);
            HashMap hashMap = new HashMap();
            for (Reel reel : A05) {
                hashMap.put(reel, Integer.valueOf(this.A02.Ad3(reel)));
            }
            Integer num = this.A02.A03;
            AnonymousClass0a4.A06(num);
            C46471zn.A01(A05, num.intValue(), this.A03, Constants.A0N, this.A01, hashMap, this.A00);
        }
    }
}
