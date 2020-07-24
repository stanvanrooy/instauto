package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.A7Z */
public final class A7Z {
    public static Interpolator A00(Context context, int i) {
        Resources.NotFoundException notFoundException;
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        XmlResourceParser xmlResourceParser = null;
        if (i == 17563663) {
            try {
                return new AnonymousClass990();
            } catch (XmlPullParserException e) {
                notFoundException = new Resources.NotFoundException(AnonymousClass000.A0E("Can't load animation resource ID #0x", Integer.toHexString(i)));
                notFoundException.initCause(e);
            } catch (IOException e2) {
                notFoundException = new Resources.NotFoundException(AnonymousClass000.A0E("Can't load animation resource ID #0x", Integer.toHexString(i)));
                notFoundException.initCause(e2);
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        } else if (i == 17563661) {
            return new AnonymousClass991();
        } else {
            if (i == 17563662) {
                return new C54602Yc();
            }
            XmlResourceParser animation = context.getResources().getAnimation(i);
            int depth = animation.getDepth();
            Interpolator interpolator = null;
            while (true) {
                int next = animation.next();
                if ((next != 3 || animation.getDepth() > depth) && next != 1) {
                    if (next == 2) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(animation);
                        String name = animation.getName();
                        if (name.equals("linearInterpolator")) {
                            interpolator = new LinearInterpolator();
                        } else if (name.equals("accelerateInterpolator")) {
                            interpolator = new AccelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("decelerateInterpolator")) {
                            interpolator = new DecelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("accelerateDecelerateInterpolator")) {
                            interpolator = new AccelerateDecelerateInterpolator();
                        } else if (name.equals("cycleInterpolator")) {
                            interpolator = new CycleInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateInterpolator")) {
                            interpolator = new AnticipateInterpolator(context, asAttributeSet);
                        } else if (name.equals("overshootInterpolator")) {
                            interpolator = new OvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateOvershootInterpolator")) {
                            interpolator = new AnticipateOvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("bounceInterpolator")) {
                            interpolator = new BounceInterpolator();
                        } else if (name.equals("pathInterpolator")) {
                            interpolator = new A7Y(context, asAttributeSet, animation);
                        } else {
                            throw new RuntimeException(AnonymousClass000.A0E("Unknown interpolator name: ", animation.getName()));
                        }
                    }
                }
            }
            if (animation != null) {
                animation.close();
            }
            return interpolator;
        }
        throw notFoundException;
    }
}
