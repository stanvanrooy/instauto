package p000X;

import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

/* renamed from: X.16o  reason: invalid class name and case insensitive filesystem */
public final class C249216o implements C11590fD {
    public final /* synthetic */ AnonymousClass0C1 A00;

    public C249216o(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        ReelStore reelStore = new ReelStore(this.A00);
        if (((Boolean) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.STORIES_MISSING_TRAY_FIX_LAUNCHER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass0C1 r0 = this.A00;
            ReelStore.A07(reelStore, new Reel(r0.A04(), new C249816v(r0.A06), true));
        }
        return reelStore;
    }
}
