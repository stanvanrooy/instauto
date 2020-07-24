package p000X;

import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductTag;
import com.instagram.tagging.activity.MediaTaggingInfo;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CPN */
public final class CPN extends CNT {
    public final /* synthetic */ TaggingActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CPN(TaggingActivity taggingActivity) {
        super(taggingActivity);
        this.A00 = taggingActivity;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0Z0.A03(2051050522);
        CNR cnr = (CNR) obj;
        int A032 = AnonymousClass0Z0.A03(-2125090758);
        TaggingActivity taggingActivity = this.A00;
        String str = cnr.A01;
        Product product = cnr.A00;
        if (taggingActivity.A0I.containsKey(str)) {
            if (!product.A02.A02.equals(taggingActivity.A03.A04())) {
                if (!TaggingActivity.A0G(taggingActivity)) {
                    Iterator it = taggingActivity.A0A.iterator();
                    while (it.hasNext()) {
                        MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) it.next();
                        int indexOf = taggingActivity.A0A.indexOf(mediaTaggingInfo);
                        if (TaggingActivity.A0H(taggingActivity, indexOf)) {
                            ((CPX) taggingActivity.A01.A0B(indexOf).getTag()).A01(mediaTaggingInfo.A0A);
                        }
                    }
                } else if (TaggingActivity.A0H(taggingActivity, 0)) {
                    taggingActivity.A05.A01(((MediaTaggingInfo) taggingActivity.A0A.get(0)).A0A);
                }
            }
            TagsInteractiveLayout.A01((TagsInteractiveLayout) taggingActivity.A0I.get(str), product, true);
        } else if (taggingActivity.A0J.contains(str)) {
            CPR cpr = taggingActivity.A06;
            String AJQ = cpr.A01.AJQ();
            List list = (List) cpr.A03.get(AJQ);
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((ProductTag) it2.next()).A03().equals(product.getId())) {
                            cpr.AET();
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                list = new ArrayList();
                cpr.A03.put(AJQ, list);
            }
            list.add(new ProductTag(product));
            cpr.AET();
        }
        TaggingActivity.A0D(taggingActivity, product);
        AnonymousClass0Z0.A0A(148715860, A032);
        AnonymousClass0Z0.A0A(-849722760, A03);
    }
}
