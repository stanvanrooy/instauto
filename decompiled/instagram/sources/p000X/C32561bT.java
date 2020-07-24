package p000X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.p009ui.widget.expanding.ExpandingListView;
import java.util.HashMap;

/* renamed from: X.1bT  reason: invalid class name and case insensitive filesystem */
public final class C32561bT implements C32571bU {
    public ViewStub A00;
    public TextView A01;
    public CircularImageView A02;
    public Integer A03;
    public ViewGroup A04;
    public AnonymousClass1NJ A05;
    public C36841ih A06;
    public final C29001Of A07;
    public final AnonymousClass1VQ A08;
    public final AnonymousClass0C1 A09;
    public final boolean A0A;
    public final View A0B;
    public final ViewStub A0C;
    public final C32581bV A0D;

    public final void B3e() {
    }

    public final void A00() {
        C32581bV r1;
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) this.A0B.findViewById(C0003R.C0005id.feed_inline_composer_button_container);
        this.A04 = viewGroup2;
        this.A02 = (CircularImageView) viewGroup2.findViewById(C0003R.C0005id.feed_inline_composer_button_avatar);
        this.A01 = (TextView) this.A04.findViewById(C0003R.C0005id.feed_inline_composer_button_textview);
        this.A02.setUrl(this.A09.A06.ASv());
        ViewStub viewStub = (ViewStub) this.A04.findViewById(C0003R.C0005id.feed_inline_composer_emojis_stub);
        this.A00 = viewStub;
        if (viewStub != null) {
            r1 = this.A0D;
            if (r1.A01 == null) {
                viewGroup = (ViewGroup) viewStub.inflate();
            } else {
                return;
            }
        } else {
            r1 = this.A0D;
            viewGroup = this.A04;
        }
        r1.A01(viewGroup);
    }

    public final void B3f() {
        C36841ih r0 = this.A06;
        if (r0 != null && r0.A14) {
            if (this.A04 == null) {
                this.A0C.inflate();
                A00();
            }
            this.A04.setOnClickListener(new AnonymousClass2FM(this));
            this.A04.setVisibility(0);
            AnonymousClass1VU r2 = this.A08.A00;
            if (r2 != null) {
                r2.A00(this.A0D, new AnonymousClass2FN(this));
            } else {
                AnonymousClass0QD.A01("FeedInlineComposerButtonViewBinder", "FeedEmojiPickerController failed to initialize");
                this.A0D.A00();
            }
            if (!this.A0A && (this.A0B.getParent() instanceof ExpandingListView)) {
                ExpandingListView expandingListView = (ExpandingListView) this.A0B.getParent();
                if (this.A03 == null) {
                    View view = this.A0B;
                    view.measure(View.MeasureSpec.makeMeasureSpec(C06220Of.A09(view.getContext()), C25913Bc3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(0, 0));
                    this.A03 = Integer.valueOf(this.A0B.getMeasuredHeight());
                }
                View view2 = this.A0B;
                int intValue = this.A03.intValue();
                if (expandingListView.A01) {
                    int height = intValue - view2.getHeight();
                    HashMap hashMap = new HashMap();
                    int childCount = expandingListView.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = expandingListView.getChildAt(i);
                        if (childAt.getTop() >= view2.getTop()) {
                            childAt.setHasTransientState(true);
                            hashMap.put(childAt, new int[]{childAt.getTop(), childAt.getBottom()});
                        }
                    }
                    if (hashMap.containsKey(view2)) {
                        ViewTreeObserver viewTreeObserver = expandingListView.getViewTreeObserver();
                        viewTreeObserver.addOnPreDrawListener(new AnonymousClass2FP(expandingListView, viewTreeObserver, view2, hashMap, height));
                        view2.getLayoutParams().height = intValue;
                        view2.requestLayout();
                    }
                }
            }
        }
    }

    public final void B3g(float f) {
        C36841ih r0 = this.A06;
        if (r0 != null && r0.A14) {
            this.A04.setAlpha(f);
        }
    }

    public C32561bT(View view, AnonymousClass0C1 r5, C29001Of r6, AnonymousClass1VQ r7, boolean z) {
        this.A0B = view;
        this.A0C = (ViewStub) view.findViewById(C0003R.C0005id.feed_inline_composer_button_stub);
        this.A09 = r5;
        this.A07 = r6;
        this.A08 = r7;
        this.A0D = new C32581bV(view.getContext().getResources().getDimensionPixelSize(C0003R.dimen.row_feed_inline_emoji_picker_emoji_size));
        this.A0A = z;
    }
}
