package p000X;

import android.view.View;
import com.google.common.collect.ImmutableList;
import com.instagram.tagging.activity.MediaTaggingInfo;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer;
import com.instagram.tagging.widget.TagsInteractiveLayout;

/* renamed from: X.CPQ */
public final class CPQ implements View.OnClickListener {
    public final /* synthetic */ TaggingActivity A00;
    public final /* synthetic */ MediaSuggestedProductTag A01;
    public final /* synthetic */ TagsInteractiveLayout A02;

    public CPQ(TaggingActivity taggingActivity, TagsInteractiveLayout tagsInteractiveLayout, MediaSuggestedProductTag mediaSuggestedProductTag) {
        this.A00 = taggingActivity;
        this.A02 = tagsInteractiveLayout;
        this.A01 = mediaSuggestedProductTag;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-1208086716);
        this.A02.A06(this.A01);
        TaggingActivity taggingActivity = this.A00;
        MediaSuggestedProductTag mediaSuggestedProductTag = this.A01;
        C160696tO.A04(taggingActivity.A03, taggingActivity, taggingActivity.A09, ((MediaTaggingInfo) taggingActivity.A0A.get(taggingActivity.A00)).A05, !TaggingActivity.A0G(taggingActivity), taggingActivity.A00, "remove", true, mediaSuggestedProductTag.A02().getId(), (String) null, 0, Float.valueOf(((MediaSuggestedProductTagProductItemContainer) ImmutableList.A09(mediaSuggestedProductTag.A01).get(0)).A00), mediaSuggestedProductTag.A00());
        AnonymousClass0Z0.A0C(513215318, A05);
    }
}
