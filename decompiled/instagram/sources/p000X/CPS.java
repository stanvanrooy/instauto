package p000X;

import com.instagram.tagging.activity.MediaTaggingInfo;
import com.instagram.tagging.widget.TagsInteractiveLayout;

/* renamed from: X.CPS */
public final class CPS {
    public static void A00(CPX cpx, C27738CPh cPh, MediaTaggingInfo mediaTaggingInfo, AnonymousClass0C1 r9, C27736CPf cPf, C27754CPy cPy) {
        Integer num;
        cpx.A01.setUrl(mediaTaggingInfo.A02);
        cpx.A00.setAspectRatio(C160726tR.A00(mediaTaggingInfo));
        cpx.A02.removeAllViews();
        cpx.A02.setTags(mediaTaggingInfo.A07, mediaTaggingInfo.A09, mediaTaggingInfo.A0A, false, r9);
        TagsInteractiveLayout tagsInteractiveLayout = cpx.A02;
        tagsInteractiveLayout.A04 = cPf;
        tagsInteractiveLayout.A03 = cPy;
        tagsInteractiveLayout.setEditingTagType(cPh);
        if (!mediaTaggingInfo.A09.isEmpty()) {
            num = Constants.ZERO;
        } else if (!mediaTaggingInfo.A07.isEmpty()) {
            num = Constants.ONE;
        } else {
            num = Constants.A0C;
        }
        cpx.A00(num);
    }
}
