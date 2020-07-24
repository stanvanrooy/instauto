package com.instagram.p009ui.widget.textview;

import android.content.Context;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.instagram.common.accessibility.AccessibleTextView;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;

/* renamed from: com.instagram.ui.widget.textview.CommentTextView */
public class CommentTextView extends AccessibleTextView {
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int i2;
        int i3;
        int A05 = AnonymousClass0Z0.A05(-1953878172);
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - getTotalPaddingLeft();
            int totalPaddingTop = y - getTotalPaddingTop();
            int scrollX = totalPaddingLeft + getScrollX();
            Layout layout = getLayout();
            int lineForVertical = layout.getLineForVertical(totalPaddingTop + getScrollY());
            if (getTag() != null && (getTag() instanceof String)) {
                AnonymousClass0QD.A00().BYg("comment_id", (String) getTag());
            }
            try {
                i2 = layout.getOffsetForHorizontal(lineForVertical, (float) scrollX);
            } catch (ArrayIndexOutOfBoundsException e) {
                AnonymousClass0QD.A01("IgSpannableTouchHelper HorizontalMeasurementProvider crash....", e.getMessage());
                i2 = -1;
            }
            if (i2 == -1) {
                i3 = 2089807832;
            } else if (getText() == null || !(getText() instanceof Spannable) || ((ClickableSpan[]) ((Spannable) getText()).getSpans(i2, i2, ClickableSpan.class)).length == 0) {
                i3 = -184921541;
            } else {
                z = super.onTouchEvent(motionEvent);
                i = -192586435;
            }
            AnonymousClass0Z0.A0C(i3, A05);
            return false;
        }
        z = super.onTouchEvent(motionEvent);
        i = -23519700;
        AnonymousClass0Z0.A0C(i, A05);
        return z;
    }

    public CommentTextView(Context context) {
        super(context);
    }

    public CommentTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CommentTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
