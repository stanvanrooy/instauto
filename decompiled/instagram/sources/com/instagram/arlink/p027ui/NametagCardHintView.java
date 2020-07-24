package com.instagram.arlink.p027ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.p009ui.widget.nametag.UsernameTextView;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass7MB;
import p000X.AnonymousClass94I;
import p000X.C177237hZ;
import p000X.C62602o0;
import p000X.DCY;

/* renamed from: com.instagram.arlink.ui.NametagCardHintView */
public class NametagCardHintView extends FrameLayout {
    public DCY A00;
    public ShimmerFrameLayout A01;
    public UsernameTextView A02;
    public boolean A03;
    public Drawable A04;

    private void A00() {
        Context context = getContext();
        inflate(context, C0003R.layout.nametag_card_hint_layout, this);
        getContext();
        DCY A002 = AnonymousClass94I.A00(context, C0003R.raw.scanmarks);
        this.A00 = A002;
        if (A002 == null) {
            this.A04 = new AnonymousClass7MB();
        } else {
            C62602o0.A00("scanmarks");
        }
        this.A01 = (ShimmerFrameLayout) findViewById(C0003R.C0005id.shimmer_layout);
        UsernameTextView usernameTextView = (UsernameTextView) findViewById(C0003R.C0005id.username_hint_view);
        this.A02 = usernameTextView;
        getContext();
        usernameTextView.setName(context.getString(C0003R.string.username_placeholder), (String) null);
        this.A02.setTextColor(-1);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0Z0.A06(438397667);
        super.onSizeChanged(i, i2, i3, i4);
        DCY dcy = this.A00;
        if (dcy != null) {
            dcy.setBounds(0, 0, i, i2);
            setBackground(this.A00);
        } else {
            Drawable drawable = this.A04;
            if (drawable != null) {
                drawable.mutate().setAlpha(128);
                setBackground(this.A04);
            }
        }
        UsernameTextView usernameTextView = this.A02;
        float f = (float) i;
        int i5 = (int) (0.167f * f);
        float f2 = (float) i2;
        usernameTextView.A00.setBounds(0, 0, i5, i5);
        usernameTextView.setCompoundDrawables((Drawable) null, usernameTextView.A00, (Drawable) null, (Drawable) null);
        usernameTextView.setCompoundDrawablePadding((int) (0.067f * f2));
        this.A02.A02((f2 * 0.044f) - this.A02.getPaint().getFontMetrics().ascent, (int) (f * 0.967f));
        this.A02.post(new C177237hZ(this));
        AnonymousClass0Z0.A0D(-854731255, A06);
    }

    public NametagCardHintView(Context context) {
        super(context);
        A00();
    }

    public NametagCardHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public NametagCardHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
