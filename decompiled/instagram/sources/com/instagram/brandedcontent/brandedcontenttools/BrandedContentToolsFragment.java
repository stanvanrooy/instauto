package com.instagram.brandedcontent.brandedcontenttools;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass6OZ;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C143386Bl;
import p000X.C144886Hm;
import p000X.C16180oA;
import p000X.C27341Hl;
import p000X.C40811pI;

public final class BrandedContentToolsFragment extends C27341Hl implements AnonymousClass1HM {
    public Context A00;
    public View A01;
    public AnonymousClass0C1 A02;
    public String A03;
    public String A04;
    public View A05;

    public final String getModuleName() {
        return "branded_content_eligibility";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        r4.BlI(C0003R.string.branded_content_tools);
        AnonymousClass1AM r0 = this.mFragmentManager;
        if (r0 != null) {
            int A0I = r0.A0I();
            boolean z = false;
            if (A0I > 0) {
                z = true;
            }
            r4.Bo6(z);
        }
        r4.Bo0(true);
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(318310346);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        this.A04 = bundle2.getString("entry_point");
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(bundle2);
        this.A02 = A06;
        this.A00 = getContext();
        this.A03 = C16180oA.A00(A06).A04();
        AnonymousClass0Z0.A09(1019331329, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c7, code lost:
        if (r2 != 1) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f8, code lost:
        if (r2 != 1) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0129, code lost:
        if (r2 != 1) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0182, code lost:
        if (r3 != false) goto L_0x00fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0191  */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        String str;
        int i2;
        int i3;
        char c;
        int hashCode;
        int A022 = AnonymousClass0Z0.A02(-695949803);
        View inflate = layoutInflater.inflate(C0003R.layout.branded_content_tools_fragment, viewGroup, false);
        this.A01 = inflate;
        this.A05 = inflate.findViewById(C0003R.C0005id.loading_spinner);
        if (this.A03 != null) {
            LinearLayout linearLayout = (LinearLayout) this.A01.findViewById(C0003R.C0005id.branded_content_tools_container);
            Context context = this.A00;
            AnonymousClass0a4.A06(context);
            AnonymousClass0C1 r1 = this.A02;
            View inflate2 = LayoutInflater.from(context).inflate(C0003R.layout.branded_content_tools_item, (ViewGroup) this.A01, false);
            TextView textView = (TextView) inflate2.findViewById(C0003R.C0005id.branded_content_item_subtitle);
            TextView textView2 = (TextView) inflate2.findViewById(C0003R.C0005id.branded_content_tools_button);
            ImageView imageView = (ImageView) inflate2.findViewById(C0003R.C0005id.status_icon);
            boolean A0p = r1.A06.A0p();
            Integer A002 = C144886Hm.A00(this.A03, A0p);
            ((ImageView) inflate2.findViewById(C0003R.C0005id.icon)).setImageDrawable(C40811pI.A00(context, C0003R.C0004drawable.instagram_tag_down_outline_24, C0003R.attr.glyphColorPrimary));
            inflate2.setOnClickListener(new C143386Bl(this));
            ((TextView) inflate2.findViewById(C0003R.C0005id.branded_content_item_title)).setText(C0003R.string.branded_content_tag_title);
            String str2 = this.A03;
            boolean equals = "branded_content".equals("branded_content");
            if (equals && str2 != null) {
                char c2 = 65535;
                int hashCode2 = str2.hashCode();
                if (hashCode2 != -1708376637) {
                    if (hashCode2 != -688744127) {
                        if (hashCode2 == 100743639 && str2.equals("eligible")) {
                            c2 = 0;
                        }
                    } else if (str2.equals("eligible_pending_opt_in")) {
                        c2 = 1;
                    }
                } else if (str2.equals("not_eligible")) {
                    c2 = 2;
                }
                if (c2 != 0) {
                    i = C0003R.string.branded_content_tag_eligible_subtitle;
                } else {
                    i = C0003R.string.branded_content_tag_eligible_subtitle;
                    if (A0p) {
                        i = C0003R.string.branded_content_tag_can_use_subtitle;
                    }
                }
                textView.setText(i);
                str = this.A03;
                if (equals && str != null) {
                    c = 65535;
                    hashCode = str.hashCode();
                    if (hashCode == -1708376637) {
                        if (hashCode != -688744127) {
                            if (hashCode == 100743639 && str.equals("eligible")) {
                                c = 0;
                            }
                        } else if (str.equals("eligible_pending_opt_in")) {
                            c = 1;
                        }
                    } else if (str.equals("not_eligible")) {
                        c = 2;
                    }
                    if (c == 0) {
                        i2 = C0003R.string.branded_content_tag_eligible_get_access;
                    } else {
                        i2 = C0003R.string.branded_content_tag_eligible_get_access;
                    }
                }
                i2 = C0003R.string.branded_content_item_learn_more;
                textView2.setText(i2);
                String str3 = this.A03;
                if (equals && str3 != null) {
                    char c3 = 65535;
                    int hashCode3 = str3.hashCode();
                    if (hashCode3 != -1708376637) {
                        if (hashCode3 != -688744127) {
                            if (hashCode3 == 100743639 && str3.equals("eligible")) {
                                c3 = 0;
                            }
                        } else if (str3.equals("eligible_pending_opt_in")) {
                            c3 = 1;
                        }
                    } else if (str3.equals("not_eligible")) {
                        c3 = 2;
                    }
                    if (c3 != 0) {
                        i3 = C0003R.C0004drawable.instagram_chevron_right_outline_24;
                    } else {
                        i3 = C0003R.C0004drawable.instagram_chevron_right_outline_24;
                        if (A0p) {
                            i3 = C0003R.C0004drawable.instagram_circle_check_outline_24;
                        }
                    }
                    imageView.setImageDrawable(C40811pI.A00(context, i3, C0003R.attr.glyphColorPrimary));
                    if (A002 != null) {
                        imageView.setColorFilter(C019000b.A00(context, C144886Hm.A00(this.A03, A0p).intValue()));
                    }
                    linearLayout.addView(inflate2);
                    AnonymousClass6OZ.A09(this.A02, "ig_monetization_hub_product_eligibility_cell_rendered", this.A03, this.A04, this);
                }
                i3 = C0003R.C0004drawable.instagram_circle_x_outline_24;
                imageView.setImageDrawable(C40811pI.A00(context, i3, C0003R.attr.glyphColorPrimary));
                if (A002 != null) {
                }
                linearLayout.addView(inflate2);
                AnonymousClass6OZ.A09(this.A02, "ig_monetization_hub_product_eligibility_cell_rendered", this.A03, this.A04, this);
            }
            i = C0003R.string.branded_content_tag_not_eligible_subtitle;
            textView.setText(i);
            str = this.A03;
            c = 65535;
            hashCode = str.hashCode();
            if (hashCode == -1708376637) {
            }
            if (c == 0) {
            }
        }
        View view = this.A01;
        AnonymousClass0Z0.A09(-1599077447, A022);
        return view;
    }
}
