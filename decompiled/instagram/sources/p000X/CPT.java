package p000X;

import android.view.View;
import com.instagram.model.shopping.Product;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import java.util.ArrayList;

/* renamed from: X.CPT */
public final class CPT implements View.OnClickListener {
    public final /* synthetic */ Product A00;
    public final /* synthetic */ TaggingActivity A01;
    public final /* synthetic */ MediaSuggestedProductTag A02;
    public final /* synthetic */ TagsInteractiveLayout A03;
    public final /* synthetic */ ArrayList A04;
    public final /* synthetic */ ArrayList A05;

    public CPT(TaggingActivity taggingActivity, ArrayList arrayList, ArrayList arrayList2, TagsInteractiveLayout tagsInteractiveLayout, MediaSuggestedProductTag mediaSuggestedProductTag, Product product) {
        this.A01 = taggingActivity;
        this.A04 = arrayList;
        this.A05 = arrayList2;
        this.A03 = tagsInteractiveLayout;
        this.A02 = mediaSuggestedProductTag;
        this.A00 = product;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0Z0.A05(1451010939);
        if (this.A01.Ac7(this.A04.size(), this.A05.size())) {
            this.A01.Boc(this.A04.size(), this.A05.size());
        } else {
            this.A03.A05(this.A02.A00());
            TaggingActivity taggingActivity = this.A01;
            TagsInteractiveLayout tagsInteractiveLayout = this.A03;
            Product product = this.A00;
            if (product.A08()) {
                AnonymousClass8TO.A01(taggingActivity, AnonymousClass1L8.A00(taggingActivity), taggingActivity.A03, product.getId(), product.A02.A02, new CPU(taggingActivity, product, tagsInteractiveLayout));
            } else {
                TagsInteractiveLayout.A01(tagsInteractiveLayout, product, false);
                TaggingActivity.A0D(taggingActivity, product);
            }
        }
        AnonymousClass0Z0.A0C(318260771, A052);
    }
}
