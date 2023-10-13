package p059i1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import p119s0.C3096b;
import p161z0.C3622a;

/* renamed from: i1.b */
public class C2093b {

    /* renamed from: a */
    public static final boolean f7322a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private static final int[] f7323b = {16842919};

    /* renamed from: c */
    private static final int[] f7324c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f7325d = {16842908};

    /* renamed from: e */
    private static final int[] f7326e = {16843623};

    /* renamed from: f */
    private static final int[] f7327f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f7328g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f7329h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f7330i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f7331j = {16842913};

    /* renamed from: k */
    private static final int[] f7332k = {16842910, 16842919};

    /* renamed from: l */
    static final String f7333l = C2093b.class.getSimpleName();

    /* renamed from: i1.b$a */
    private static class C2094a {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public static Drawable m9621b(Context context, int i) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(C3622a.m16072f(context, C3096b.f10025f, ColorStateList.valueOf(0)), (Drawable) null, new InsetDrawable(gradientDrawable, i, i, i, i));
        }
    }

    private C2093b() {
    }

    /* renamed from: a */
    public static Drawable m9617a(Context context, int i) {
        return C2094a.m9621b(context, i);
    }

    /* renamed from: b */
    public static ColorStateList m9618b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f7332k, 0)) != 0) {
            Log.w(f7333l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: c */
    public static boolean m9619c(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
