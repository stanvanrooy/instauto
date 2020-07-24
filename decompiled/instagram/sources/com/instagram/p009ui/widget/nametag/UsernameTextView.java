package com.instagram.p009ui.widget.nametag;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Locale;
import p000X.AnonymousClass0N0;
import p000X.C019000b;

/* renamed from: com.instagram.ui.widget.nametag.UsernameTextView */
public class UsernameTextView extends TextView {
    public Drawable A00;
    public String A01;
    public String A02;

    private void A01(String str, String[] strArr, int i, int i2) {
        String str2;
        int lastIndexOf;
        boolean z;
        if (i != 0) {
            String str3 = str;
            if (!TextUtils.isEmpty(str3)) {
                int i3 = i2;
                StaticLayout staticLayout = new StaticLayout(str3, getPaint(), i3, Layout.Alignment.ALIGN_CENTER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, false);
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < staticLayout.getLineCount(); i4++) {
                    arrayList.add(str3.substring(staticLayout.getLineStart(i4), staticLayout.getLineEnd(i4)));
                }
                String[] strArr2 = strArr;
                if (arrayList.size() == 1) {
                    strArr[strArr2.length - i] = str;
                    return;
                }
                String str4 = (String) arrayList.get(0);
                int length = str4.length();
                int max = Math.max(str4.lastIndexOf(95), str4.lastIndexOf(46));
                if (max > 0) {
                    int i5 = max;
                    while (true) {
                        if (i5 >= 0) {
                            char charAt = str4.charAt(i5);
                            if (charAt != '_' && charAt != '.') {
                                z = false;
                                break;
                            }
                            i5--;
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        length = max + 1;
                        strArr[strArr2.length - i] = str3.substring(0, length);
                        A01(str3.substring(length), strArr2, i - 1, i3);
                    }
                }
                if (TextUtils.isEmpty(this.A02) || (lastIndexOf = str4.lastIndexOf(str2)) < 0) {
                    if (arrayList.size() == 2) {
                        length = Math.round(((float) str3.length()) / 2.0f);
                    }
                    strArr[strArr2.length - i] = str3.substring(0, length);
                    A01(str3.substring(length), strArr2, i - 1, i3);
                }
                length = lastIndexOf + (str2 = this.A02).length();
                strArr[strArr2.length - i] = str3.substring(0, length);
                A01(str3.substring(length), strArr2, i - 1, i3);
            }
        }
    }

    public final void A02(float f, int i) {
        String str = this.A01;
        StringBuilder sb = new StringBuilder((str.length() + 3) - 1);
        String[] strArr = new String[3];
        A01(str.toUpperCase(Locale.US), strArr, 3, i);
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            if (TextUtils.isEmpty(str2)) {
                break;
            }
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(str2);
        }
        setText(sb.toString());
        setLineSpacing(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        measure(View.MeasureSpec.makeMeasureSpec(i, Process.WAIT_RESULT_TIMEOUT), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setName(String str, String str2) {
        this.A01 = str;
        if (!TextUtils.isEmpty(str2)) {
            String trim = str2.trim();
            int indexOf = trim.indexOf(32);
            if (indexOf > 0) {
                this.A02 = trim.substring(0, indexOf);
            } else {
                this.A02 = trim;
            }
            this.A02 = this.A02.toUpperCase(Locale.US);
        }
    }

    private void A00() {
        Context context = getContext();
        this.A00 = C019000b.A03(context, C0003R.C0004drawable.nametag_card_glyph);
        getContext();
        setTextSize(0, (float) context.getResources().getDimensionPixelSize(C0003R.dimen.username_font_size));
        setTypeface(AnonymousClass0N0.A04(getResources()));
        setAllCaps(true);
        setIncludeFontPadding(false);
        setGravity(17);
        if (Build.VERSION.SDK_INT >= 21) {
            setLetterSpacing(0.03f);
        }
    }

    public UsernameTextView(Context context) {
        super(context);
        A00();
    }

    public UsernameTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public UsernameTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
