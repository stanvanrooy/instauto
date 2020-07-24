package p000X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgRadioButton;
import com.instagram.common.p004ui.base.IgSimpleImageView;
import com.instagram.igds.components.switchbutton.IgSwitch;
import java.util.List;

/* renamed from: X.CDD */
public final class CDD extends AnonymousClass1PH {
    public C27481CEx A00;
    public List A01;
    public FragmentActivity A02;
    public C27480CEw A03;
    public CD3 A04;
    public CDA A05;
    public AnonymousClass0C1 A06;

    public CDD(C27480CEw cEw, CD3 cd3, CDA cda, FragmentActivity fragmentActivity) {
        this.A03 = cEw;
        this.A04 = cd3;
        this.A05 = cda;
        this.A06 = cd3.A0Q;
        this.A02 = fragmentActivity;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0Z0.A03(-88832865);
        int size = this.A01.size() + 3;
        AnonymousClass0Z0.A0A(227340020, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A032 = AnonymousClass0Z0.A03(739279242);
        if (i == 0) {
            i2 = 0;
            i3 = -624708197;
        } else if (i == 1) {
            AnonymousClass0Z0.A0A(2046383470, A032);
            return 1;
        } else {
            i2 = 3;
            i3 = 740999044;
            if (i <= this.A01.size() + 1) {
                i2 = 2;
                i3 = 516912417;
            }
        }
        AnonymousClass0Z0.A0A(i3, A032);
        return i2;
    }

    public final void onBindViewHolder(AnonymousClass1ZK r14, int i) {
        int i2;
        String A012;
        String A022;
        TextUtils.TruncateAt truncateAt;
        CGP cgp;
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            boolean z = true;
            if (itemViewType == 1) {
                CFB cfb = (CFB) r14;
                if (cfb.A06.A0z) {
                    cfb.A04.setVisibility(0);
                    cfb.A01.setVisibility(0);
                    ((TextView) cfb.A04.findViewById(C0003R.C0005id.primary_text)).setText(C0003R.string.promote_special_requirement_switch_button_title);
                    TextView textView = (TextView) cfb.A04.findViewById(C0003R.C0005id.secondary_text);
                    textView.setText(C0003R.string.promote_special_requirement_switch_button_subtitle);
                    textView.setVisibility(0);
                    IgSwitch igSwitch = (IgSwitch) cfb.A04.findViewById(C0003R.C0005id.promote_row_switch);
                    cfb.A08 = igSwitch;
                    igSwitch.setToggleListener(new CFC(cfb));
                    cfb.A02.setOnClickListener(new C27505CFv(cfb));
                    View view = cfb.A02;
                    if (!(view == null || cfb.A08 == null)) {
                        if (cfb.A06.A0O == null) {
                            view.setVisibility(8);
                            cfb.A08.setChecked(false);
                        } else {
                            view.setVisibility(0);
                            cfb.A08.setChecked(true);
                            ((TextView) cfb.A02.findViewById(C0003R.C0005id.promote_row_with_down_primary_text)).setText(cfb.A06.A0O.A00);
                        }
                    }
                }
                if (cfb.A06.A0y) {
                    cfb.A03.setVisibility(cfb.A02.getVisibility());
                    cfb.A01.setVisibility(0);
                    cfb.A00.setVisibility(0);
                    cfb.A00.findViewById(C0003R.C0005id.primary_text).setVisibility(8);
                    TextView textView2 = (TextView) cfb.A00.findViewById(C0003R.C0005id.secondary_text);
                    TextView textView3 = (TextView) cfb.A00.findViewById(C0003R.C0005id.action_label_text);
                    String string = cfb.A05.getResources().getString(C0003R.string.quick_promote_political_ad_link_text);
                    textView2.setText(cfb.A05.getResources().getString(C0003R.string.quick_promote_political_ad_subtitle_text));
                    textView2.setVisibility(0);
                    textView3.setText(string);
                    textView3.setVisibility(0);
                    FragmentActivity fragmentActivity = cfb.A05;
                    AnonymousClass4XV.A01(textView3, string, string, new AnonymousClass4H7(cfb, C019000b.A00(fragmentActivity, AnonymousClass1BA.A03(fragmentActivity, C0003R.attr.textColorRegularLink))));
                    ((IgSwitch) cfb.A00.findViewById(C0003R.C0005id.promote_row_switch)).setToggleListener(new CGA(cfb));
                }
            } else if (itemViewType == 2) {
                if (i != 2) {
                    z = false;
                }
                C27459CEb cEb = (C27459CEb) r14;
                C27481CEx cEx = (C27481CEx) this.A01.get(i - 2);
                cEb.A0C = z;
                TextView textView4 = (TextView) cEb.A05.findViewById(C0003R.C0005id.primary_text);
                IgRadioButton igRadioButton = (IgRadioButton) cEb.A05.findViewById(C0003R.C0005id.select_radio);
                String str = cEx.A06;
                if (str.equals("")) {
                    str = cEb.A04.getContext().getString(C0003R.string.quick_promote_default_setting_name);
                }
                textView4.setText(str);
                int i3 = 8;
                if (cEx.A08) {
                    View view2 = cEb.A07;
                    if (!cEb.A0C) {
                        i3 = 0;
                    }
                    view2.setVisibility(i3);
                    cEb.A01.setVisibility(0);
                    CD3 cd3 = cEb.A09;
                    cd3.A0E = cEx;
                    cEb.A0A.A07(cd3, cEx);
                    cEb.A06.setVisibility(0);
                    textView4.setTypeface((Typeface) null, 1);
                    igRadioButton.setChecked(true);
                } else {
                    cEb.A07.setVisibility(8);
                    cEb.A01.setVisibility(8);
                    cEb.A06.setVisibility(8);
                    textView4.setTypeface((Typeface) null, 0);
                    igRadioButton.setChecked(false);
                }
                cEb.A05.setOnClickListener(new CEV(cEb, cEx));
                cEb.A05.setOnLongClickListener(new CEW(cEb, cEx));
                TextView textView5 = (TextView) cEb.A03.findViewById(C0003R.C0005id.secondary_text);
                ((TextView) cEb.A03.findViewById(C0003R.C0005id.primary_text)).setText(C0003R.string.quick_promote_setting_destination_primary_text);
                StringBuilder sb = new StringBuilder();
                Context context = cEb.A04.getContext();
                switch (cEx.A03.ordinal()) {
                    case 0:
                        i2 = C0003R.string.quick_promote_setting_destination_profile_text;
                        break;
                    case 1:
                        i2 = C0003R.string.quick_promote_setting_destination_direct_messages_text;
                        break;
                    default:
                        i2 = C0003R.string.quick_promote_setting_destination_website_text;
                        break;
                }
                sb.append(context.getString(i2));
                CCf cCf = cEx.A03;
                if (CCf.A00(cCf).ordinal() != 1) {
                    sb.append(" | ");
                    A012 = "@".concat(cEb.A0B.A06.AZn());
                } else {
                    sb.append(" | ");
                    String str2 = cEx.A07;
                    if (!AnonymousClass1BX.A00(str2)) {
                        sb.append(str2);
                        sb.append(" | ");
                    }
                    A012 = CCf.A01(cEb.A04.getContext(), cCf);
                }
                sb.append(A012);
                textView5.setText(sb.toString());
                cEb.A03.setOnClickListener(new C27476CEs(cEb));
                TextView textView6 = (TextView) cEb.A00.findViewById(C0003R.C0005id.primary_text);
                TextView textView7 = (TextView) cEb.A00.findViewById(C0003R.C0005id.secondary_text);
                IgSimpleImageView igSimpleImageView = (IgSimpleImageView) cEb.A00.findViewById(C0003R.C0005id.quick_promote_error_icon);
                int i4 = 0;
                if (CDV.A06(cEx)) {
                    i4 = 8;
                }
                igSimpleImageView.setVisibility(i4);
                textView6.setText(C0003R.string.quick_promote_setting_audience_primary_text);
                StringBuilder sb2 = new StringBuilder();
                CFW cfw = cEx.A02;
                sb2.append(cfw.A05);
                sb2.append(" | ");
                if (!CDV.A05(cfw) || ((Boolean) AnonymousClass0L6.A02(cEb.A0B, AnonymousClass0L7.PROMOTE_BETTER_TARGETING, "is_automatic_description_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    Context context2 = cEb.A04.getContext();
                    CFW cfw2 = cEx.A02;
                    sb2.append(context2.getString(C0003R.string.promote_audience_age, new Object[]{Integer.valueOf(cfw2.A01), Integer.valueOf(cfw2.A00)}));
                    sb2.append(" | ");
                    A022 = CDV.A02(cEb.A04.getContext(), cEx.A02);
                } else {
                    A022 = cEb.A04.getContext().getString(C0003R.string.promote_automatic_audience_subtitle);
                }
                sb2.append(A022);
                textView7.setText(sb2.toString());
                int i5 = 1;
                if (cEb.A09.A0O != null) {
                    i5 = Integer.MAX_VALUE;
                }
                textView7.setMaxLines(i5);
                if (cEb.A09.A0O != null) {
                    truncateAt = null;
                } else {
                    truncateAt = TextUtils.TruncateAt.END;
                }
                textView7.setEllipsize(truncateAt);
                cEb.A00.setOnClickListener(new C27464CEg(cEb));
                TextView textView8 = (TextView) cEb.A02.findViewById(C0003R.C0005id.primary_text);
                TextView textView9 = (TextView) cEb.A02.findViewById(C0003R.C0005id.secondary_text);
                IgSimpleImageView igSimpleImageView2 = (IgSimpleImageView) cEb.A02.findViewById(C0003R.C0005id.quick_promote_error_icon);
                int i6 = 0;
                if (cEb.A09.A05()) {
                    i6 = 8;
                }
                igSimpleImageView2.setVisibility(i6);
                textView8.setText(C0003R.string.quick_promote_setting_budget_and_duration_primary_text);
                StringBuilder sb3 = new StringBuilder();
                int i7 = cEx.A00 * cEx.A01;
                Context context3 = cEb.A04.getContext();
                CD3 cd32 = cEb.A09;
                sb3.append(context3.getString(C0003R.string.quick_promote_budget_duration_details_text, new Object[]{CCH.A00((double) i7, cd32.A01, cd32.A0f, 0), CCH.A01(cEb.A04.getContext(), cEx.A01)}));
                CD3 cd33 = cEb.A09;
                CG4 cg4 = cd33.A0K;
                if (!(cg4 == null || (cgp = cg4.A02) == null)) {
                    sb3.append(" | ");
                    sb3.append(cgp.A02);
                    sb3.append(" ".concat(cd33.A0f.toString()));
                }
                textView9.setText(sb3.toString());
                cEb.A02.setOnClickListener(new C27477CEt(cEb));
            } else if (itemViewType == 3) {
                C27488CFe cFe = (C27488CFe) r14;
                ((TextView) cFe.A00.findViewById(C0003R.C0005id.primary_text)).setText(C0003R.string.quick_promote_create_setting_primary_text);
                ((TextView) cFe.A00.findViewById(C0003R.C0005id.secondary_text)).setText(C0003R.string.quick_promote_create_setting_secondary_text);
                cFe.A00.setOnClickListener(new C27457CDz(cFe));
            }
        } else {
            C27486CFc cFc = (C27486CFc) r14;
            C27481CEx cEx2 = this.A00;
            cFc.A01.setText(C0003R.string.quick_promote_preview_image_description);
            cFc.A02.setUrl(cFc.A00.A0P, "promote_saved_settings");
            cFc.A02.setOnClickListener(new CDN(cFc, cEx2));
        }
    }

    public final AnonymousClass1ZK onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new C27486CFc(from.inflate(C0003R.layout.quick_promote_setting_preview_image_item_view, viewGroup, false), this.A04, this.A03);
        }
        if (i == 1) {
            return new CFB(from.inflate(C0003R.layout.quick_promote_regulation_switch_item_view, viewGroup, false), this.A04, this.A05, this.A06, this.A02, this.A03);
        }
        if (i != 2) {
            return new C27488CFe(from.inflate(C0003R.layout.quick_promote_create_setting_item_view, viewGroup, false), this.A04, this.A05, this.A06, this.A02);
        }
        return new C27459CEb(from.inflate(C0003R.layout.quick_promote_setting_item_view, viewGroup, false), this.A03, this.A04, this.A05, this.A02);
    }
}
