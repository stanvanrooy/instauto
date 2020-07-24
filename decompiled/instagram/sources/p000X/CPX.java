package p000X;

import android.view.View;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CPX */
public final class CPX extends C7O {
    public MediaFrameLayout A00;
    public IgImageView A01;
    public TagsInteractiveLayout A02;

    public final void A01(List list) {
        TagsInteractiveLayout tagsInteractiveLayout = this.A02;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tagsInteractiveLayout.removeView(tagsInteractiveLayout.findViewWithTag((MediaSuggestedProductTag) it.next()));
        }
        tagsInteractiveLayout.A05.clear();
        tagsInteractiveLayout.A04.BQr();
    }

    public CPX(View view) {
        super(view);
        this.A00 = (MediaFrameLayout) view.findViewById(C0003R.C0005id.image_container);
        this.A01 = (IgImageView) view.findViewById(C0003R.C0005id.tag_image_view);
        this.A02 = (TagsInteractiveLayout) view.findViewById(C0003R.C0005id.combined_tagging_layout);
    }
}
