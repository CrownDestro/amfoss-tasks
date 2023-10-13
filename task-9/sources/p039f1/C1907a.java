package p039f1;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.core.graphics.C0529g;
import androidx.core.view.animation.C0645b;
import p053h1.C2007b;

/* renamed from: f1.a */
public class C1907a {
    /* renamed from: a */
    private static float m9090a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: b */
    private static String m9091b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* renamed from: c */
    private static TimeInterpolator m9092c(String str) {
        if (m9094e(str, "cubic-bezier")) {
            String[] split = m9091b(str, "cubic-bezier").split(",");
            if (split.length == 4) {
                return C0645b.m2795a(m9090a(split, 0), m9090a(split, 1), m9090a(split, 2), m9090a(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        } else if (m9094e(str, "path")) {
            return C0645b.m2796b(C0529g.m2420e(m9091b(str, "path")));
        } else {
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
    }

    /* renamed from: d */
    private static boolean m9093d(String str) {
        return m9094e(str, "cubic-bezier") || m9094e(str, "path");
    }

    /* renamed from: e */
    private static boolean m9094e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    /* renamed from: f */
    public static int m9095f(Context context, int i, int i2) {
        return C2007b.m9262c(context, i, i2);
    }

    /* renamed from: g */
    public static TimeInterpolator m9096g(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            return m9093d(valueOf) ? m9092c(valueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }
}
