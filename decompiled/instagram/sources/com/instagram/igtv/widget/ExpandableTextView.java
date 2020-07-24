package com.instagram.igtv.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1PA;
import p000X.AnonymousClass1PB;
import p000X.C019000b;
import p000X.C06400Ox;
import p000X.C1666078s;
import p000X.C168727Im;
import p000X.C168737Io;
import p000X.C37811kG;
import p000X.C38931m5;
import p000X.C38941m6;
import p000X.C38961m8;

public class ExpandableTextView extends IgTextView {
    public int A00 = 2;
    public C1666078s A01;
    public final C168737Io A02 = new C168737Io();

    public void setTextLayoutHorizontalPadding(int i) {
        C168737Io r1 = this.A02;
        r1.A00 = i;
        r1.A01 = null;
    }

    public void setExpandableText(String str, AnonymousClass0C1 r11, AnonymousClass1NJ r12) {
        StringBuilder sb;
        setMovementMethod(LinkMovementMethod.getInstance());
        C168737Io r3 = this.A02;
        Context context = getContext();
        if (r3.A01 == null) {
            AnonymousClass1PA r4 = new AnonymousClass1PA();
            int A002 = C019000b.A00(context, C0003R.color.igds_primary_text);
            int A003 = C019000b.A00(context, C0003R.color.text_view_link_color);
            int A004 = C019000b.A00(context, C0003R.color.igds_primary_background);
            Resources resources = context.getResources();
            TextPaint textPaint = new TextPaint(1);
            textPaint.density = resources.getDisplayMetrics().density;
            textPaint.linkColor = A003;
            textPaint.bgColor = A004;
            textPaint.setTextSize(resources.getDimension(C0003R.dimen.font_medium));
            textPaint.setColor(A002);
            r4.A04 = textPaint;
            r4.A02 = context.getResources().getDisplayMetrics().widthPixels - (r3.A00 << 1);
            r3.A01 = r4.A00();
        }
        AnonymousClass1PB r8 = r3.A01;
        getContext();
        boolean A022 = C06400Ox.A02(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!A022) {
            sb = new StringBuilder();
        }
        sb.append(str);
        String string = getResources().getString(C0003R.string.expandable_ellipsis_more);
        if (A022) {
            string = AnonymousClass000.A0E("‏", string);
        }
        CharSequence A012 = C37811kG.A01(spannableStringBuilder, sb, string, this.A00, r8);
        if (A012.toString().equals(sb.toString())) {
            String sb2 = sb.toString();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append(sb2);
            spannableStringBuilder = new SpannableStringBuilder();
            C38931m5 r2 = new C38931m5(r11, spannableStringBuilder2);
            r2.A02(new C38941m6(r11, r12));
            r2.A01(new C38961m8(r11, r12, true));
            spannableStringBuilder.append(r2.A00());
        } else {
            C38931m5 r22 = new C38931m5(r11, new SpannableStringBuilder(A012.toString()));
            r22.A02(new C38941m6(r11, r12));
            r22.A01(new C38961m8(r11, r12, true));
            spannableStringBuilder.append(r22.A00());
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(string);
            spannableStringBuilder.setSpan(new C168727Im(this, C019000b.A00(context, C0003R.color.igds_secondary_text)), length, spannableStringBuilder.length(), 33);
        }
        setText(spannableStringBuilder);
    }

    public void setExpandListener(C1666078s r1) {
        this.A01 = r1;
    }

    public void setMaxLineCount(int i) {
        this.A00 = i;
    }

    public ExpandableTextView(Context context) {
        super(context);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
