package p011b1;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0515a;
import java.util.Arrays;

/* renamed from: b1.a */
public final class C1252a {
    /* renamed from: a */
    public static Drawable m6079a(Drawable drawable, Drawable drawable2) {
        int i;
        int i2;
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        if (drawable2.getIntrinsicWidth() == -1 || drawable2.getIntrinsicHeight() == -1) {
            i2 = drawable.getIntrinsicWidth();
            i = drawable.getIntrinsicHeight();
        } else if (drawable2.getIntrinsicWidth() > drawable.getIntrinsicWidth() || drawable2.getIntrinsicHeight() > drawable.getIntrinsicHeight()) {
            float intrinsicWidth = ((float) drawable2.getIntrinsicWidth()) / ((float) drawable2.getIntrinsicHeight());
            if (intrinsicWidth >= ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight())) {
                int intrinsicWidth2 = drawable.getIntrinsicWidth();
                int i3 = (int) (((float) intrinsicWidth2) / intrinsicWidth);
                i2 = intrinsicWidth2;
                i = i3;
            } else {
                i = drawable.getIntrinsicHeight();
                i2 = (int) (intrinsicWidth * ((float) i));
            }
        } else {
            i2 = drawable2.getIntrinsicWidth();
            i = drawable2.getIntrinsicHeight();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            layerDrawable.setLayerSize(1, i2, i);
            layerDrawable.setLayerGravity(1, 17);
        } else {
            int intrinsicWidth3 = (drawable.getIntrinsicWidth() - i2) / 2;
            int intrinsicHeight = (drawable.getIntrinsicHeight() - i) / 2;
            layerDrawable.setLayerInset(1, intrinsicWidth3, intrinsicHeight, intrinsicWidth3, intrinsicHeight);
        }
        return layerDrawable;
    }

    /* renamed from: b */
    public static Drawable m6080b(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return m6081c(drawable, colorStateList, mode, Build.VERSION.SDK_INT < 23);
    }

    /* renamed from: c */
    private static Drawable m6081c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = C0515a.m2377r(drawable).mutate();
            if (mode != null) {
                C0515a.m2375p(drawable, mode);
            }
        } else if (z) {
            drawable.mutate();
        }
        return drawable;
    }

    /* renamed from: d */
    public static int[] m6082d(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == 16842912) {
                return iArr;
            }
            if (iArr[i] == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    /* renamed from: e */
    public static void m6083e(Outline outline, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
        } else if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (i >= 21 && path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    /* renamed from: f */
    public static PorterDuffColorFilter m6084f(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
