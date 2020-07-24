package p000X;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.AEL */
public abstract class AEL extends BaseAdapter implements C179967mJ, Filterable {
    public int A00;
    public Context A01;
    public Cursor A02 = null;
    public DataSetObserver A03;
    public AEN A04;
    public boolean A05 = true;
    public boolean A06 = false;
    public C179957mI A07;

    public AEL(Context context) {
        this.A01 = context;
        this.A00 = -1;
        this.A04 = new AEN(this);
        this.A03 = new AEO(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v5, types: [android.graphics.drawable.Drawable$ConstantState] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    public void A03(View view, Context context, Cursor cursor) {
        Drawable drawable;
        String str;
        AEK aek = (AEK) this;
        AEP aep = (AEP) view.getTag();
        int i = aek.A00;
        Cursor cursor2 = cursor;
        int i2 = i != -1 ? cursor2.getInt(i) : 0;
        if (aep.A03 != null) {
            String A012 = AEK.A01(cursor2, aek.A04);
            TextView textView = aep.A03;
            textView.setText(A012);
            if (TextUtils.isEmpty(A012)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        if (aep.A04 != null) {
            String A013 = AEK.A01(cursor2, aek.A06);
            if (A013 != null) {
                if (aek.A07 == null) {
                    TypedValue typedValue = new TypedValue();
                    aek.A01.getTheme().resolveAttribute(C0003R.attr.textColorSearchUrl, typedValue, true);
                    aek.A07 = aek.A01.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(A013);
                spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, aek.A07, (ColorStateList) null), 0, A013.length(), 33);
                str = spannableString;
            } else {
                str = AEK.A01(cursor2, aek.A05);
            }
            if (TextUtils.isEmpty(str)) {
                TextView textView2 = aep.A03;
                if (textView2 != null) {
                    textView2.setSingleLine(false);
                    aep.A03.setMaxLines(2);
                }
            } else {
                TextView textView3 = aep.A03;
                if (textView3 != null) {
                    textView3.setSingleLine(true);
                    aep.A03.setMaxLines(1);
                }
            }
            TextView textView4 = aep.A04;
            textView4.setText(str);
            if (TextUtils.isEmpty(str)) {
                textView4.setVisibility(8);
            } else {
                textView4.setVisibility(0);
            }
        }
        ImageView imageView = aep.A00;
        if (imageView != null) {
            int i3 = aek.A01;
            if (i3 == -1) {
                drawable = null;
            } else {
                Drawable A002 = AEK.A00(aek, cursor2.getString(i3));
                drawable = A002;
                if (A002 == null) {
                    ComponentName searchActivity = aek.A08.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    drawable = null;
                    if (aek.A0B.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) aek.A0B.get(flattenToShortString);
                        if (constantState != null) {
                            drawable = constantState.newDrawable(aek.A09.getResources());
                        }
                    } else {
                        PackageManager packageManager = aek.A01.getPackageManager();
                        Drawable drawable2 = null;
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable3 = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable3 == null) {
                                    Log.w("SuggestionsAdapter", AnonymousClass000.A0A("Invalid icon resource ", iconResource, " for ", searchActivity.flattenToShortString()));
                                } else {
                                    drawable2 = drawable3;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.w("SuggestionsAdapter", e.toString());
                        }
                        if (drawable2 != null) {
                            drawable = drawable2.getConstantState();
                        }
                        aek.A0B.put(flattenToShortString, drawable);
                        drawable = drawable2;
                    }
                    if (drawable == null) {
                        drawable = aek.A01.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawable);
            if (drawable == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawable.setVisible(false, false);
                drawable.setVisible(true, false);
            }
        }
        ImageView imageView2 = aep.A01;
        if (imageView2 != null) {
            int i4 = aek.A02;
            Drawable A003 = i4 == -1 ? null : AEK.A00(aek, cursor2.getString(i4));
            Drawable drawable4 = A003;
            imageView2.setImageDrawable(A003);
            if (A003 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                drawable4.setVisible(false, false);
                drawable4.setVisible(true, false);
            }
        }
        int i5 = aek.A03;
        if (i5 == 2 || (i5 == 1 && (i2 & 1) != 0)) {
            aep.A02.setVisibility(0);
            aep.A02.setTag(aep.A03.getText());
            aep.A02.setOnClickListener(aek);
            return;
        }
        aep.A02.setVisibility(8);
    }

    public abstract View A04(Context context, Cursor cursor, ViewGroup viewGroup);

    public boolean hasStableIds() {
        return true;
    }

    public View A02(Context context, Cursor cursor, ViewGroup viewGroup) {
        if (!(this instanceof AEM)) {
            return A04(context, cursor, viewGroup);
        }
        AEM aem = (AEM) this;
        return aem.A01.inflate(aem.A00, viewGroup, false);
    }

    public void A8H(Cursor cursor) {
        Cursor cursor2 = this.A02;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                AEN aen = this.A04;
                if (aen != null) {
                    cursor2.unregisterContentObserver(aen);
                }
                DataSetObserver dataSetObserver = this.A03;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.A02 = cursor;
            if (cursor != null) {
                AEN aen2 = this.A04;
                if (aen2 != null) {
                    cursor.registerContentObserver(aen2);
                }
                DataSetObserver dataSetObserver2 = this.A03;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.A00 = cursor.getColumnIndexOrThrow("_id");
                this.A06 = true;
                AnonymousClass0Z1.A00(this, 561553197);
            } else {
                this.A00 = -1;
                this.A06 = false;
                AnonymousClass0Z1.A01(this, 1995949606);
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public CharSequence A9s(Cursor cursor) {
        String A012;
        String A013;
        if (this instanceof AEK) {
            AEK aek = (AEK) this;
            if (cursor != null) {
                String A014 = AEK.A01(cursor, cursor.getColumnIndex("suggest_intent_query"));
                if (A014 != null) {
                    return A014;
                }
                if (aek.A08.shouldRewriteQueryFromData() && (A013 = AEK.A01(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
                    return A013;
                }
                if (!aek.A08.shouldRewriteQueryFromText() || (A012 = AEK.A01(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
                    return null;
                }
                return A012;
            }
            return null;
        } else if (cursor == null) {
            return "";
        } else {
            return cursor.toString();
        }
    }

    public Cursor BeI(CharSequence charSequence) {
        String charSequence2;
        Cursor cursor;
        String suggestAuthority;
        if (!(this instanceof AEK)) {
            return this.A02;
        }
        AEK aek = (AEK) this;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (aek.A0A.getVisibility() == 0 && aek.A0A.getWindowVisibility() == 0) {
            try {
                SearchableInfo searchableInfo = aek.A08;
                String[] strArr = null;
                if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
                    cursor = null;
                } else {
                    Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
                    String suggestPath = searchableInfo.getSuggestPath();
                    if (suggestPath != null) {
                        fragment.appendEncodedPath(suggestPath);
                    }
                    fragment.appendPath("search_suggest_query");
                    String suggestSelection = searchableInfo.getSuggestSelection();
                    if (suggestSelection != null) {
                        strArr = new String[]{charSequence2};
                    } else {
                        fragment.appendPath(charSequence2);
                    }
                    fragment.appendQueryParameter("limit", String.valueOf(50));
                    cursor = aek.A01.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr, (String) null);
                }
                if (cursor != null) {
                    cursor.getCount();
                    return cursor;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    public final int getCount() {
        Cursor cursor;
        if (!this.A06 || (cursor = this.A02) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.A06) {
            return null;
        }
        this.A02.moveToPosition(i);
        if (view == null) {
            view = A02(this.A01, this.A02, viewGroup);
        }
        A03(view, this.A01, this.A02);
        return view;
    }

    public final Filter getFilter() {
        if (this.A07 == null) {
            this.A07 = new C179957mI(this);
        }
        return this.A07;
    }

    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.A06 || (cursor = this.A02) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.A02;
    }

    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.A06 || (cursor = this.A02) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.A02.getLong(this.A00);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.A06) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.A02.moveToPosition(i)) {
            if (view == null) {
                view = A04(this.A01, this.A02, viewGroup);
            }
            A03(view, this.A01, this.A02);
            return view;
        } else {
            throw new IllegalStateException(AnonymousClass000.A05("couldn't move cursor to position ", i));
        }
    }

    public final Cursor AJh() {
        return this.A02;
    }
}
