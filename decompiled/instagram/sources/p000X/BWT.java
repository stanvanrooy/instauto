package p000X;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.BWT */
public final class BWT extends AnonymousClass1PH {
    public BVD A00;
    public String A01;
    public final List A02;

    public final void onBindViewHolder(AnonymousClass1ZK r10, int i) {
        Long l;
        String formatDateTime;
        String formatDateTime2;
        TextView textView;
        int i2;
        int i3 = r10.mItemViewType;
        if (i3 == 0) {
            BWX bwx = (BWX) r10;
            String str = this.A01;
            if (str == null) {
                bwx.A01.setText("");
                return;
            }
            String str2 = null;
            try {
                str2 = new JSONObject(str).toString(2);
            } catch (JSONException unused) {
            }
            TextView textView2 = bwx.A01;
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            textView2.setText(str);
        } else if (i3 == 1) {
            BWW bww = (BWW) r10;
            BVE bve = (BVE) this.A02.get(i - 1);
            Context context = bww.itemView.getContext();
            AnonymousClass2BW r8 = bve.A02;
            C49162Ba r3 = r8.A02;
            C49262Bl r6 = (C49262Bl) r3.A06.get(0);
            TextView textView3 = bww.A07;
            String str3 = r6.A08.A00;
            if (TextUtils.isEmpty(str3)) {
                str3 = "[Not set]";
            }
            textView3.setText(str3);
            TextView textView4 = bww.A03;
            String str4 = r3.A05;
            if (TextUtils.isEmpty(str4)) {
                str4 = "[Not set]";
            }
            textView4.setText(str4);
            bww.A05.setText(AnonymousClass000.A0G(bve.A01.A00.name(), " - Priority ", r8.A00));
            TextView textView5 = bww.A01;
            String str5 = r6.A04.A00;
            if (TextUtils.isEmpty(str5)) {
                str5 = "[Not set]";
            }
            textView5.setText(str5);
            TextView textView6 = bww.A06;
            C37731k8 r1 = bve.A01;
            C49162Ba r7 = bve.A02.A02;
            textView6.setText(AnonymousClass000.A03(AnonymousClass000.A0E("Surface requires triggers: ", Arrays.toString(r1.A01.toArray())), 10, AnonymousClass000.A0E("QP contains triggers: ", Arrays.toString(r7.A07.toArray()))));
            TextView textView7 = bww.A02;
            AnonymousClass2BY r0 = r8.A01;
            if (r0 != null) {
                l = r0.A01;
            } else {
                l = null;
            }
            if (l == null) {
                formatDateTime = "[Not set]";
            } else {
                formatDateTime = DateUtils.formatDateTime(context, TimeUnit.SECONDS.toMillis(l.longValue()), 17);
            }
            Long A002 = r8.A00();
            if (A002 == null) {
                formatDateTime2 = "[Not set]";
            } else {
                formatDateTime2 = DateUtils.formatDateTime(context, TimeUnit.SECONDS.toMillis(A002.longValue()), 17);
            }
            textView7.setText(AnonymousClass000.A0J(formatDateTime, " - ", formatDateTime2));
            AnonymousClass2C5 r2 = bve.A00;
            if (r2.A01) {
                bww.A04.setText("Quick Promotion is qualified");
                textView = bww.A04;
                i2 = C0003R.color.qp_promotion_info_text;
            } else {
                bww.A04.setText(r2.A00);
                textView = bww.A04;
                i2 = C0003R.color.qp_promotion_error_text;
            }
            textView.setTextColor(C019000b.A00(context, i2));
        } else {
            throw new IllegalArgumentException("Unsupported ViewHolder type");
        }
    }

    public BWT(List list, BVD bvd) {
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        arrayList.addAll(list);
        this.A00 = bvd;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0Z0.A03(-1510469678);
        int size = this.A02.size() + 1;
        AnonymousClass0Z0.A0A(-137882247, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int A03 = AnonymousClass0Z0.A03(1896721254);
        int i2 = 1;
        if (i == 0) {
            i2 = 0;
        }
        AnonymousClass0Z0.A0A(1976336368, A03);
        return i2;
    }

    public final AnonymousClass1ZK onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            BWX bwx = new BWX(from.inflate(C0003R.layout.quick_promotion_raw_text_item, viewGroup, false));
            bwx.A02.setOnClickListener(new BWV(this, bwx));
            bwx.A00.setOnClickListener(new BWU(this, bwx));
            return bwx;
        } else if (i == 1) {
            BWW bww = new BWW(from.inflate(C0003R.layout.quick_promotion_item, viewGroup, false));
            bww.A00.setOnClickListener(new C25706BWb(this, bww));
            return bww;
        } else {
            throw new IllegalArgumentException(AnonymousClass0C5.$const$string(316));
        }
    }
}
