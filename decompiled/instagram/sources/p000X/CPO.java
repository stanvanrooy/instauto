package p000X;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.model.mediatype.MediaType;
import java.util.List;

/* renamed from: X.CPO */
public final class CPO {
    public ImageView A00;
    public ListView A01;
    public C151686e7 A02;
    public C27738CPh A03;
    public final Activity A04;
    public final View A05;
    public final ViewStub A06;
    public final ViewStub A07;
    public final ViewStub A08;
    public final TextView A09;
    public final TextView A0A;
    public final AnonymousClass0C1 A0B;
    public final C27746CPq A0C;
    public final boolean A0D;
    public final TextView A0E;

    public static void A00(CPO cpo) {
        if (cpo.A03 != C27738CPh.PRODUCT || cpo.A0C.AXF() <= 0) {
            cpo.A0A.setVisibility(8);
        } else {
            cpo.A0A.setVisibility(0);
        }
    }

    public static void A01(CPO cpo, MediaType mediaType, C27738CPh cPh, int i) {
        int i2;
        List list;
        List list2;
        MediaType mediaType2 = MediaType.VIDEO;
        if (mediaType != mediaType2 || i <= 0) {
            if (mediaType == mediaType2) {
                if (cpo.A00 == null) {
                    cpo.A00 = (ImageView) cpo.A06.inflate();
                    cpo.A00.setColorFilter(C26771Ff.A00(C019000b.A00(cpo.A04, C0003R.color.grey_5)));
                }
                cpo.A00.setVisibility(0);
            } else {
                ImageView imageView = cpo.A00;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            TextView textView = cpo.A09;
            if (mediaType == mediaType2) {
                C27738CPh cPh2 = cpo.A03;
                C27738CPh cPh3 = C27738CPh.PEOPLE;
                i2 = C0003R.string.product_tagging_tap_to_add_video;
                if (cPh2 == cPh3) {
                    i2 = C0003R.string.video_tagging_tap_to_add;
                }
            } else {
                C27738CPh cPh4 = cpo.A03;
                C27738CPh cPh5 = C27738CPh.PEOPLE;
                i2 = C0003R.string.product_tagging_tap_to_add_photo;
                if (cPh4 == cPh5) {
                    i2 = C0003R.string.people_tagging_tap_to_add;
                }
            }
            textView.setText(i2);
            cpo.A02(true, i);
            ListView listView = cpo.A01;
            if (listView != null) {
                listView.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView2 = cpo.A00;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        cpo.A02(false, i);
        if (cpo.A01 != null) {
            switch (cPh.ordinal()) {
                case 0:
                    C151686e7 r1 = cpo.A02;
                    boolean Ac8 = true ^ cpo.A0C.Ac8();
                    if (r1.A00 != Ac8) {
                        r1.A00 = Ac8;
                    }
                    C151686e7 r2 = cpo.A02;
                    list = C160726tR.A01(cpo.A0B, cpo.A0C.ARl());
                    r2.A03.clear();
                    r2.A02.clear();
                    list2 = r2.A03;
                    break;
                case 1:
                    C151686e7 r12 = cpo.A02;
                    boolean Ac82 = true ^ cpo.A0C.Ac8();
                    if (r12.A00 != Ac82) {
                        r12.A00 = Ac82;
                    }
                    C151686e7 r22 = cpo.A02;
                    list = cpo.A0C.ASs();
                    r22.A02.clear();
                    r22.A03.clear();
                    list2 = r22.A02;
                    break;
                default:
                    cpo.A02.A00();
                    cpo.A01.setVisibility(0);
            }
            list2.addAll(list);
            cpo.A01.setAdapter(cpo.A02);
            cpo.A02.A00();
            cpo.A01.setVisibility(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r0 != false) goto L_0x0020;
     */
    public final void A02(boolean z, int i) {
        int i2 = 8;
        if (z) {
            if (C06220Of.A0g(this.A04)) {
                boolean z2 = true;
                if ((this.A04.getResources().getConfiguration().screenLayout & 15) != 1) {
                    z2 = false;
                }
            }
            this.A05.setVisibility(0);
            TextView textView = this.A0E;
            if (i > 0) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            A00(this);
        }
        this.A05.setVisibility(8);
        A00(this);
    }

    public CPO(Activity activity, AnonymousClass0RN r9, C27746CPq cPq, int i, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3, boolean z, boolean z2, CPR cpr, AnonymousClass0C1 r23, C27738CPh cPh) {
        this.A04 = activity;
        AnonymousClass0C1 r2 = r23;
        this.A0B = r2;
        this.A0C = cPq;
        this.A05 = view;
        this.A09 = textView;
        this.A0E = textView2;
        this.A0A = textView4;
        this.A06 = viewStub;
        this.A08 = viewStub2;
        this.A07 = viewStub3;
        this.A03 = cPh;
        this.A02 = new C151686e7(activity, r2, r9, true, cpr, false);
        this.A05.setOnClickListener(new C27744CPo(this));
        textView3.setVisibility(z ? 0 : 8);
        this.A0A.setOnClickListener(new C27741CPk(this));
        A02(true, i);
        this.A08.setOnInflateListener(new C25822BaW(this, r9));
        this.A0D = z2;
        if (z2) {
            this.A08.setVisibility(this.A03 == C27738CPh.PRODUCT ? 0 : 8);
        }
    }
}
