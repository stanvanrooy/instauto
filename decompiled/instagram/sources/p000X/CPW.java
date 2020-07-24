package p000X;

import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.widget.TagsInteractiveLayout;

/* renamed from: X.CPW */
public final class CPW extends CNT {
    public final /* synthetic */ TaggingActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CPW(TaggingActivity taggingActivity) {
        super(taggingActivity);
        this.A00 = taggingActivity;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-1146642079);
        CNQ cnq = (CNQ) obj;
        int A032 = AnonymousClass0Z0.A03(-1171145416);
        if (this.A00.A0I.containsKey(cnq.A01)) {
            ((TagsInteractiveLayout) this.A00.A0I.get(cnq.A01)).AET();
        } else if (this.A00.A0J.contains(cnq.A01)) {
            this.A00.A06.AET();
        }
        AnonymousClass0Z0.A0A(-2062887911, A032);
        AnonymousClass0Z0.A0A(1288830306, A03);
    }
}
