package p000X;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: X.1ee  reason: invalid class name and case insensitive filesystem */
public class C34381ee extends Resources {
    public final Resources A00;

    public final XmlResourceParser getAnimation(int i) {
        return this.A00.getAnimation(i);
    }

    public final boolean getBoolean(int i) {
        return this.A00.getBoolean(i);
    }

    public final int getColor(int i) {
        return this.A00.getColor(i);
    }

    public final ColorStateList getColorStateList(int i) {
        return this.A00.getColorStateList(i);
    }

    public final Configuration getConfiguration() {
        return this.A00.getConfiguration();
    }

    public final float getDimension(int i) {
        return this.A00.getDimension(i);
    }

    public final int getDimensionPixelOffset(int i) {
        return this.A00.getDimensionPixelOffset(i);
    }

    public final int getDimensionPixelSize(int i) {
        return this.A00.getDimensionPixelSize(i);
    }

    public final DisplayMetrics getDisplayMetrics() {
        return this.A00.getDisplayMetrics();
    }

    public final float getFraction(int i, int i2, int i3) {
        return this.A00.getFraction(i, i2, i3);
    }

    public final int getIdentifier(String str, String str2, String str3) {
        return this.A00.getIdentifier(str, str2, str3);
    }

    public final int[] getIntArray(int i) {
        return this.A00.getIntArray(i);
    }

    public final int getInteger(int i) {
        return this.A00.getInteger(i);
    }

    public final XmlResourceParser getLayout(int i) {
        return this.A00.getLayout(i);
    }

    public final Movie getMovie(int i) {
        return this.A00.getMovie(i);
    }

    public final CharSequence getQuantityText(int i, int i2) {
        return this.A00.getQuantityText(i, i2);
    }

    public final String getResourceEntryName(int i) {
        return this.A00.getResourceEntryName(i);
    }

    public final String getResourceName(int i) {
        return this.A00.getResourceName(i);
    }

    public final String getResourcePackageName(int i) {
        return this.A00.getResourcePackageName(i);
    }

    public final String getResourceTypeName(int i) {
        return this.A00.getResourceTypeName(i);
    }

    public final String[] getStringArray(int i) {
        return this.A00.getStringArray(i);
    }

    public final CharSequence[] getTextArray(int i) {
        return this.A00.getTextArray(i);
    }

    public final void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.A00.getValueForDensity(i, i2, typedValue, z);
    }

    public final XmlResourceParser getXml(int i) {
        return this.A00.getXml(i);
    }

    public final TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.A00.obtainAttributes(attributeSet, iArr);
    }

    public final TypedArray obtainTypedArray(int i) {
        return this.A00.obtainTypedArray(i);
    }

    public final AssetFileDescriptor openRawResourceFd(int i) {
        return this.A00.openRawResourceFd(i);
    }

    public final void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.A00.parseBundleExtra(str, attributeSet, bundle);
    }

    public final void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.A00.parseBundleExtras(xmlResourceParser, bundle);
    }

    public C34381ee(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.A00 = resources;
    }

    public final void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.A00;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public Drawable getDrawable(int i) {
        return this.A00.getDrawable(i);
    }

    public final Drawable getDrawable(int i, Resources.Theme theme) {
        return this.A00.getDrawable(i, theme);
    }

    public final Drawable getDrawableForDensity(int i, int i2) {
        return this.A00.getDrawableForDensity(i, i2);
    }

    public final Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.A00.getDrawableForDensity(i, i2, theme);
    }

    public final String getQuantityString(int i, int i2) {
        return this.A00.getQuantityString(i, i2);
    }

    public final String getQuantityString(int i, int i2, Object... objArr) {
        return this.A00.getQuantityString(i, i2, objArr);
    }

    public final String getString(int i) {
        return this.A00.getString(i);
    }

    public final String getString(int i, Object... objArr) {
        return this.A00.getString(i, objArr);
    }

    public final CharSequence getText(int i) {
        return this.A00.getText(i);
    }

    public final CharSequence getText(int i, CharSequence charSequence) {
        return this.A00.getText(i, charSequence);
    }

    public final void getValue(int i, TypedValue typedValue, boolean z) {
        this.A00.getValue(i, typedValue, z);
    }

    public final void getValue(String str, TypedValue typedValue, boolean z) {
        this.A00.getValue(str, typedValue, z);
    }

    public final InputStream openRawResource(int i) {
        return this.A00.openRawResource(i);
    }

    public final InputStream openRawResource(int i, TypedValue typedValue) {
        return this.A00.openRawResource(i, typedValue);
    }
}
