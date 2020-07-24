package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import java.text.NumberFormat;

/* renamed from: X.B3T */
public final class B3T extends RelativeLayout {
    public Paint A00;
    public Paint A01;
    public TextView A02 = ((TextView) findViewById(C0003R.C0005id.percent));
    public TextView A03 = ((TextView) findViewById(C0003R.C0005id.response));
    public B3K A04;
    public int A05;

    public B3T(Context context) {
        super(context, (AttributeSet) null);
        View.inflate(context, C0003R.layout.result_row_view, this);
        Resources resources = context.getResources();
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setColor(C019000b.A00(context, C0003R.color.grey_1));
        this.A00.setStrokeWidth((float) resources.getDimensionPixelSize(C0003R.dimen.result_bar_width));
        Paint paint2 = new Paint();
        this.A01 = paint2;
        paint2.setColor(C019000b.A00(context, C0003R.color.result_bar_active_color));
        this.A01.setStrokeWidth((float) resources.getDimensionPixelSize(C0003R.dimen.result_bar_width));
    }

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas);
        canvas2.drawLine((float) getLeftBound(), (float) getPositionLineY(), (float) (getLeftBound() + getBarFullWidthPx()), (float) getPositionLineY(), this.A00);
        canvas2.drawLine((float) getLeftBound(), (float) getPositionLineY(), (float) (getLeftBound() + getResultBarEndPositionX()), (float) getPositionLineY(), this.A01);
    }

    private String getPercentageRounded() {
        return NumberFormat.getPercentInstance().format((double) (((float) this.A04.A00) / ((float) this.A05)));
    }

    private int getPositionLineY() {
        return this.A03.getBottom() + getResources().getDimensionPixelSize(C0003R.dimen.response_text_row_horizontal_offset);
    }

    private int getResponders() {
        return this.A04.A00;
    }

    public void setAnswer(B3K b3k) {
        this.A04 = b3k;
        this.A03.setText(b3k.A01);
    }

    public void setTotalQuestionResponders(int i) {
        this.A05 = i;
        this.A02.setText(getPercentageRounded());
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A02.getLayoutParams();
        layoutParams.addRule(8, this.A03.getId());
        this.A02.setLayoutParams(layoutParams);
    }

    private int getBarFullWidthPx() {
        return getWidth() - (getLeftBound() << 1);
    }

    private int getLeftBound() {
        return getResources().getDimensionPixelSize(C0003R.dimen.result_bar_horizontal_offset_padding);
    }

    private int getResultBarEndPositionX() {
        return Math.round((((float) getBarFullWidthPx()) * ((float) this.A04.A00)) / ((float) this.A05));
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0Z0.A06(-144233644);
        super.onSizeChanged(i, i2, i3, i4);
        setMinimumHeight(i2 + getResources().getDimensionPixelSize(C0003R.dimen.result_bar_height));
        AnonymousClass0Z0.A0D(1542421653, A06);
    }
}
