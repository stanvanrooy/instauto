package p000X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.C0003R;
import java.util.List;

/* renamed from: X.1li  reason: invalid class name and case insensitive filesystem */
public final class C38711li {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (r0 == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ff, code lost:
        p000X.C32191ak.A05(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0106, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0108, code lost:
        r9.A05.setText("");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010f, code lost:
        r0 = r12.A0B(r9.A0G);
        r9.A00 = r0;
        r9.A06 = r13;
        r13.A0D(r9, true, java.lang.Integer.valueOf(r0));
        r3 = r13.A04(r12.A0B(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012b, code lost:
        if (r13.A0i != false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012f, code lost:
        if (r13.A0v == false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0131, code lost:
        r3.A00 = p000X.Constants.ZERO;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0135, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013a, code lost:
        if (r12.AiO() != false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013f, code lost:
        if (r4 == p000X.Constants.ONE) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0141, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0142, code lost:
        r3.A03 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0146, code lost:
        if (p000X.Constants.A0Y != r4) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014a, code lost:
        if (r5.A00 != null) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014c, code lost:
        r5.A00 = (java.lang.Boolean) p000X.AnonymousClass0L6.A02(r5.A02, p000X.AnonymousClass0L7.UAS_ADS_LAUNCHER, "expanded_end_state_for_ads_indicator", false, (p000X.AnonymousClass04H) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0165, code lost:
        if (r5.A00.booleanValue() == false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0167, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0168, code lost:
        r3.A02 = r8;
        r9.A03.setOnClickListener(r11);
        r9.A0A();
        r9.A0B();
        p000X.C32191ak.A05(r9);
        r10.BZi(r12, r9.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017f, code lost:
        if (r4 != p000X.Constants.ONE) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0181, code lost:
        r3.A04 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0184, code lost:
        r9.A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0187, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0188, code lost:
        r6 = new android.text.SpannableStringBuilder();
        r6.append(r1);
        r6.setSpan(new p000X.C38311l4(), 0, r6.length(), 33);
        r9.A05.setText(r6);
        r9.A05.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(r9.A0D.getResources().getDimensionPixelSize(com.facebook.C0003R.dimen.media_tag_indicator_text_size), p000X.C25913Bc3.MAX_SIGNED_POWER_OF_TWO));
        r9.A01 = r9.A05.getMeasuredWidth();
     */
    public static void A00(AnonymousClass0C1 r8, C32191ak r9, C30411Ts r10, View.OnClickListener onClickListener, AnonymousClass1NJ r12, C36841ih r13) {
        int i;
        String str;
        int i2;
        AnonymousClass1VY A00 = AnonymousClass1VY.A00(r8);
        if (A00.A02(r12, r13) && !r12.A3Q) {
            C36841ih r2 = r9.A06;
            if (r2 != null) {
                r2.A0E(r9, true, Integer.valueOf(r9.A00));
                r9.A00 = -1;
                r9.A06 = null;
            }
            Integer A002 = C38721lj.A00(r12, r8);
            Context context = r9.A0D;
            r9.A07 = A002;
            int intValue = A002.intValue();
            switch (intValue) {
                case 1:
                    i = C0003R.C0004drawable.instagram_user_filled_24;
                    break;
                case 2:
                case 5:
                    i = C0003R.C0004drawable.instagram_shopping_filled_24;
                    break;
                case 3:
                    i = C0003R.C0004drawable.instagram_igtv_filled_24;
                    break;
                case 4:
                    List list = r12.A2Q;
                    if (list != null && !list.isEmpty()) {
                        AnonymousClass1UP r1 = (AnonymousClass1UP) r12.A2Q.get(0);
                        switch (r1.A00.ordinal()) {
                            case 1:
                                i = C0003R.C0004drawable.instagram_download_filled_12;
                                break;
                            case 2:
                                String str2 = r1.A06;
                                if (!"com.facebook.orca".equals(str2)) {
                                    boolean equals = "com.whatsapp".equals(str2);
                                    i = C0003R.C0004drawable.instagram_app_whatsapp_filled_12;
                                    break;
                                } else {
                                    i = C0003R.C0004drawable.instagram_app_messenger_filled_12;
                                    break;
                                }
                            case 3:
                                i = C0003R.C0004drawable.instagram_call_filled_12;
                                break;
                            case 4:
                                i = C0003R.C0004drawable.instagram_location_filled_12;
                                break;
                            case 6:
                                i = C0003R.C0004drawable.instagram_pencil_filled_12;
                                break;
                            case 7:
                                i = C0003R.C0004drawable.instagram_user_circle_filled_12;
                                break;
                            case 8:
                                i = C0003R.C0004drawable.instagram_direct_filled_12;
                                break;
                        }
                    }
                    i = C0003R.C0004drawable.instagram_link_filled_12;
                    break;
                case 6:
                    i = C0003R.C0004drawable.instagram_reels_filled_24;
                    break;
                default:
                    throw new IllegalStateException(AnonymousClass000.A0E("Unsupported type: ", C200168hY.A00(A002)));
            }
            Drawable A01 = C40811pI.A01(context, i, C0003R.color.white);
            C32191ak.A05(r9);
            r9.A04.setImageDrawable(A01);
            int i3 = C0003R.string.watch_igtv_video;
            if (intValue != 3) {
                i3 = 0;
            }
            int i4 = i3;
            C32191ak.A05(r9);
            if (i3 != 0) {
                View view = r9.A03;
                view.setContentDescription(view.getResources().getString(i4));
            }
            switch (intValue) {
                case 1:
                    str = "";
                    break;
                case 2:
                case 5:
                    i2 = C0003R.string.view_products_title_case;
                case 3:
                    i2 = C0003R.string.watch_igtv_video;
                case 4:
                    int AHt = r13.AHt();
                    if (r12.A1W()) {
                        str = r12.A0P(AHt).A22;
                    } else {
                        str = r12.A22;
                    }
                    if (TextUtils.isEmpty(str)) {
                        i2 = C0003R.string.learn_more;
                    }
                    break;
                case 6:
                    i2 = C0003R.string.watch_clips_video;
                    str = context.getString(i2);
                    break;
            }
        } else {
            r9.A08();
        }
    }
}
