package p000X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1fW  reason: invalid class name and case insensitive filesystem */
public final class C34921fW {
    public C34931fX A00;
    public View A01;
    public LinearLayout A02;
    public C39941no A03;
    public AnonymousClass7N0 A04;
    public C65032sR A05;
    public C13300iJ A06;
    public ArrayList A07 = new ArrayList();
    public final C26571Ea A08;

    public static void A00(C34921fW r17, boolean z, List list) {
        C34921fW r2 = r17;
        if (r2.A04.A02 != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass7MO r0 = (AnonymousClass7MO) it.next();
                int i = r2.A04.A00;
                C152276f7 r1 = r0.A04;
                if (r1 != null && r1.A00 > 0) {
                    TextView textView = r0.A02;
                    textView.setTypeface(AnonymousClass0N0.A05(textView.getContext().getResources()));
                    TextView textView2 = r0.A02;
                    textView2.setTextSize(0, textView2.getContext().getResources().getDimension(C0003R.dimen.group_poll_answer_row_percentage_text_size));
                    float f = (float) i;
                    SpannableString spannableString = new SpannableString(C06360Ot.formatString("%d%%", Integer.valueOf(Math.round((((float) r0.A04.A00) / f) * 100.0f))));
                    spannableString.setSpan(new RelativeSizeSpan(0.67f), spannableString.length() - 1, spannableString.length(), 0);
                    r0.A02.setText(spannableString);
                    AnonymousClass7MN r4 = r0.A03;
                    r4.A00 = ((float) r0.A04.A00) / f;
                    AnonymousClass1E1.A0a(r0.A00, r4);
                    if (z) {
                        AnonymousClass7MN r7 = r0.A03;
                        r7.A09.A05(0.0d, true);
                        r7.A09.A03(1.0d);
                    }
                    if (z) {
                        r0.A02.measure(0, 0);
                        C476524w A002 = C476524w.A00(r0.A02, 0);
                        A002.A0N();
                        A002.A0L(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, (float) (r0.A02.getMeasuredWidth() >> 1));
                        A002.A0M(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, (float) (r0.A02.getMeasuredHeight() >> 1));
                        A002.A08 = 0;
                        A002.A0O();
                    }
                    ViewGroup viewGroup = (ViewGroup) r0.A01.inflate();
                    ImageView imageView = (ImageView) viewGroup.findViewById(C0003R.C0005id.group_poll_answer_row_facepile);
                    Context context = imageView.getContext();
                    ImmutableList A09 = ImmutableList.A09(r0.A04.A03);
                    imageView.getContext();
                    imageView.setImageDrawable(C39471my.A00(context, A09, context.getResources().getDimensionPixelSize(C0003R.dimen.group_poll_answer_row_facepile_height), false, Constants.ZERO, false, false, (Float) null));
                    if (z) {
                        imageView.measure(0, 0);
                        C476524w A003 = C476524w.A00(imageView, 0);
                        A003.A0N();
                        A003.A0L(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, (float) (imageView.getMeasuredWidth() >> 1));
                        A003.A0M(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, (float) (imageView.getMeasuredHeight() >> 1));
                        A003.A08 = 0;
                        A003.A0O();
                    }
                    if (r0.A04.A00 > 3) {
                        TextView textView3 = (TextView) viewGroup.findViewById(C0003R.C0005id.group_poll_answer_row_facepile_overflow);
                        C169507Mn.A00(textView3);
                        textView3.setText(C06360Ot.formatString("+%d", Integer.valueOf(r0.A04.A00 - 3)));
                        textView3.setVisibility(0);
                        if (z) {
                            textView3.measure(0, 0);
                            C476524w A004 = C476524w.A00(textView3, 0);
                            A004.A0N();
                            A004.A0L(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, (float) (textView3.getMeasuredWidth() >> 1));
                            A004.A0M(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, (float) (textView3.getMeasuredHeight() >> 1));
                            A004.A08 = 0;
                            A004.A0O();
                        }
                    }
                }
            }
        }
    }

    public final void A01() {
        ImmutableMap A012 = ImmutableMap.A01(this.A04.A06);
        LayoutInflater from = LayoutInflater.from(this.A02.getContext());
        this.A02.removeAllViews();
        this.A07.clear();
        for (int i = 0; i < A012.size(); i++) {
            int size = A012.size();
            int i2 = C0003R.layout.group_polls_answer_row;
            if (size > 4) {
                i2 = C0003R.layout.group_polls_small_answer_row;
            }
            View inflate = from.inflate(i2, this.A02, false);
            if (i == A012.size() - 1) {
                C06220Of.A0I(inflate, 0);
            }
            ArrayList arrayList = this.A07;
            C152276f7 r8 = (C152276f7) A012.get(Integer.toString(i));
            C34931fX r10 = this.A00;
            boolean z = false;
            if (A012.size() > 4) {
                z = true;
            }
            arrayList.add(new AnonymousClass7MO(inflate, r8, i, r10, z));
            this.A02.addView(inflate);
        }
        A00(this, false, this.A07);
    }

    public C34921fW(C26571Ea r2) {
        this.A08 = r2;
        this.A00 = new C34931fX(this);
    }
}
