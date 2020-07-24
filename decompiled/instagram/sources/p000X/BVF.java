package p000X;

import android.app.Activity;
import android.view.View;
import com.instagram.video.live.p038ui.streaming.IgLiveWithInviteFragment;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.BVF */
public final class BVF implements View.OnClickListener {
    public final /* synthetic */ IgLiveWithInviteFragment A00;

    public BVF(IgLiveWithInviteFragment igLiveWithInviteFragment) {
        this.A00 = igLiveWithInviteFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-1967415079);
        IgLiveWithInviteFragment igLiveWithInviteFragment = this.A00;
        if (igLiveWithInviteFragment.A04 == Constants.ONE) {
            HashSet hashSet = new HashSet();
            for (C13300iJ id : Collections.unmodifiableSet(IgLiveWithInviteFragment.A00(igLiveWithInviteFragment).A0J)) {
                hashSet.add(id.getId());
            }
            if (!hashSet.isEmpty()) {
                C23300zv A002 = C23300zv.A00(this.A00.A02);
                Integer num = IgLiveWithInviteFragment.A00(this.A00).A03;
                Integer num2 = Constants.A0C;
                if (num == num2) {
                    num2 = Constants.A0Y;
                }
                A002.BXT(new AIZ(hashSet, num2));
            }
        }
        ((Activity) this.A00.getContext()).onBackPressed();
        AnonymousClass0Z0.A0C(730766432, A05);
    }
}
