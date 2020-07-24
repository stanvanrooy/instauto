package p000X;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: X.BWQ */
public final class BWQ implements ListAdapter {
    public final DataSetObservable A00 = new DataSetObservable();
    public final Comparator A01 = new BWR(this);
    public final List A02 = new ArrayList();
    public final Context A03;

    public final boolean areAllItemsEnabled() {
        return true;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        BWS bws;
        if (view == null) {
            view = LayoutInflater.from(this.A03).inflate(C0003R.layout.quick_promotion_slot_item, viewGroup, false);
            bws = new BWS();
            bws.A02 = (TextView) view.findViewById(C0003R.C0005id.qp_slot_item_header);
            bws.A00 = (TextView) view.findViewById(C0003R.C0005id.qp_slot_item_message);
            bws.A01 = (TextView) view.findViewById(C0003R.C0005id.qp_qualified_promotion_count);
            view.setTag(bws);
        } else {
            bws = (BWS) view.getTag();
        }
        C25632BSq bSq = (C25632BSq) getItem(i);
        if (bSq != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Map map = bSq.A03;
            int i2 = 0;
            for (Map.Entry entry : bSq.A02.entrySet()) {
                QuickPromotionSurface quickPromotionSurface = ((C37731k8) entry.getKey()).A00;
                StringBuilder sb = new StringBuilder("\n");
                String lowerCase = quickPromotionSurface.name().toLowerCase();
                sb.append(lowerCase);
                sb.append("\n");
                SpannableString spannableString = new SpannableString(AnonymousClass000.A0J("\n", lowerCase, "\n"));
                spannableString.setSpan(new C38311l4(), 0, sb.length(), 0);
                spannableStringBuilder.append(spannableString);
                List<AnonymousClass2BW> list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    spannableStringBuilder.append("No QPs\n");
                } else {
                    for (AnonymousClass2BW r2 : list) {
                        C49162Ba r8 = r2.A02;
                        if (r8 == null) {
                            AnonymousClass0DB.A0D("QuickPromotionDebugSlotItemAdapter", "Should not happen: Edge contains no node!");
                            spannableStringBuilder.append("No node for edge ").append(r2.toString());
                        } else {
                            spannableStringBuilder.append("\"").append(((C49262Bl) r8.A06.get(0)).A08.A00).append("\" ");
                            Object obj = map.get(r2.A02.A05);
                            AnonymousClass11J.A00(obj);
                            AnonymousClass2C5 r22 = (AnonymousClass2C5) obj;
                            if (r22.A01) {
                                spannableStringBuilder.append(" is qualified.\n");
                                i2++;
                            } else {
                                spannableStringBuilder.append("is not qualified: ").append(r22.A00).append(".\n");
                            }
                        }
                    }
                }
            }
            bws.A02.setText(bSq.A00.name().replace('_', ' '));
            bws.A01.setText(String.format("%d qualified promotion(s)", new Object[]{Integer.valueOf(i2)}));
            bws.A00.setText(spannableStringBuilder);
            return view;
        }
        throw new RuntimeException(AnonymousClass000.A05("Failed to get an item at position ", i));
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final int getCount() {
        return this.A02.size();
    }

    public final Object getItem(int i) {
        if (this.A02.size() > i) {
            return (C25632BSq) this.A02.get(i);
        }
        return null;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.A00.registerObserver(dataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.A00.unregisterObserver(dataSetObserver);
    }

    public BWQ(Context context) {
        this.A03 = context;
    }

    public final long getItemId(int i) {
        C25632BSq bSq = (C25632BSq) getItem(i);
        if (bSq != null) {
            return (long) bSq.A00.ordinal();
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (getCount() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled(int i) {
        if (getItem(i) != null) {
            return true;
        }
        return false;
    }
}
