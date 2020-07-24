package p000X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.CCK */
public final class CCK extends LinearLayout implements C27025Bwb {
    public static final int[] A03 = {16842912};
    public boolean A00;
    public boolean A01;
    public final Set A02 = new LinkedHashSet(1);

    public final void A3h(B0M b0m) {
        this.A02.add(b0m);
    }

    public final void BbD(B0M b0m) {
        this.A02.remove(b0m);
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, A03);
        }
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            refreshDrawableState();
            if (!this.A00) {
                this.A00 = true;
                for (B0M AvH : this.A02) {
                    AvH.AvH(this, this.A01);
                }
                this.A00 = false;
            }
        }
    }

    public CCK(Context context, boolean z) {
        super(context);
        int i;
        Context context2 = getContext();
        LayoutInflater.from(context2).inflate(C0003R.layout.promote_row_with_radio_button, this, true);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(16);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0003R.dimen.promote_list_row_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        if (z) {
            getContext();
            i = C0003R.attr.elevatedBackgroundDrawable;
        } else {
            getContext();
            i = C0003R.attr.backgroundDrawable;
        }
        setBackgroundResource(AnonymousClass1BA.A03(context2, i));
        setOnClickListener(new CCO(this));
    }

    public final void A00(boolean z) {
        TextView textView = (TextView) findViewById(C0003R.C0005id.action_label_text);
        if (!TextUtils.isEmpty(textView.getText())) {
            int i = 8;
            if (z) {
                i = 0;
            }
            textView.setVisibility(i);
        }
    }

    public final void A01(boolean z) {
        TextView textView = (TextView) findViewById(C0003R.C0005id.secondary_text);
        if (!TextUtils.isEmpty(textView.getText())) {
            int i = 8;
            if (z) {
                i = 0;
            }
            textView.setVisibility(i);
        }
    }

    public final boolean isChecked() {
        return this.A01;
    }

    public void setActionLabel(String str, View.OnClickListener onClickListener) {
        TextView textView = (TextView) findViewById(C0003R.C0005id.action_label_text);
        textView.setText(str);
        textView.setOnClickListener(onClickListener);
    }

    public void setImageView(String str, String str2) {
        ((IgImageView) findViewById(C0003R.C0005id.promote_row_image)).setUrl(str, str2);
    }

    public void setSubtitleContainerOnClickListener(View.OnClickListener onClickListener) {
        findViewById(C0003R.C0005id.subtitle_container).setOnClickListener(onClickListener);
    }

    public void setWarningText(String str) {
        ((TextView) findViewById(C0003R.C0005id.warning_text)).setText(str);
    }

    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A01);
        }
    }

    public void setPrimaryText(int i) {
        ((TextView) findViewById(C0003R.C0005id.primary_text)).setText(i);
    }

    public void setPrimaryText(String str) {
        ((TextView) findViewById(C0003R.C0005id.primary_text)).setText(str);
    }

    public void setSecondaryText(int i) {
        ((TextView) findViewById(C0003R.C0005id.secondary_text)).setText(i);
    }

    public void setSecondaryText(String str) {
        ((TextView) findViewById(C0003R.C0005id.secondary_text)).setText(str);
    }
}
