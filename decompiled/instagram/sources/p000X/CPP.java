package p000X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.C0003R;
import com.instagram.model.mediatype.MediaType;
import com.instagram.tagging.activity.MediaTaggingInfo;
import java.util.ArrayList;

/* renamed from: X.CPP */
public final class CPP extends BaseAdapter {
    public C27738CPh A00;
    public final AnonymousClass0C1 A01;
    public final CQ0 A02;
    public final C27754CPy A03;
    public final C27736CPf A04;
    public final ArrayList A05;

    public final int getViewTypeCount() {
        return 2;
    }

    public final int getCount() {
        return this.A05.size();
    }

    public final Object getItem(int i) {
        return this.A05.get(i);
    }

    public final long getItemId(int i) {
        return Long.parseLong(((MediaTaggingInfo) this.A05.get(i)).A05);
    }

    public final int getItemViewType(int i) {
        if (((MediaTaggingInfo) this.A05.get(i)).A03 == MediaType.VIDEO) {
            return 1;
        }
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.layout_tag_video, viewGroup, false);
                    view.setTag(new C27743CPn(view));
                }
                throw new UnsupportedOperationException(AnonymousClass0C5.$const$string(23));
            }
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.layout_tagging_photo, viewGroup, false);
            view.setTag(new CPX(view));
        }
        int itemViewType2 = getItemViewType(i);
        if (itemViewType2 != 0) {
            if (itemViewType2 == 1) {
                C27743CPn cPn = (C27743CPn) view.getTag();
                MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) this.A05.get(i);
                CQ0 cq0 = this.A02;
                cPn.A01.setUrl(mediaTaggingInfo.A02);
                cPn.A00.setAspectRatio(C160726tR.A00(mediaTaggingInfo));
                cPn.A00.setOnClickListener(new C27747CPr(cq0));
                return view;
            }
            throw new UnsupportedOperationException(AnonymousClass0C5.$const$string(23));
        }
        AnonymousClass0C1 r4 = this.A01;
        C27736CPf cPf = this.A04;
        AnonymousClass0a4.A06(cPf);
        CPS.A00((CPX) view.getTag(), this.A00, (MediaTaggingInfo) this.A05.get(i), r4, cPf, this.A03);
        return view;
    }

    public CPP(ArrayList arrayList, AnonymousClass0C1 r2, C27736CPf cPf, C27754CPy cPy, CQ0 cq0) {
        this.A05 = arrayList;
        this.A01 = r2;
        this.A04 = cPf;
        this.A03 = cPy;
        this.A02 = cq0;
    }
}
