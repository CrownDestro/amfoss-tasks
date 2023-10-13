package p053h1;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import p124t.C3141a;

/* renamed from: h1.g */
public class C2014g {
    /* renamed from: a */
    public static Typeface m9297a(Context context, Typeface typeface) {
        return m9298b(context.getResources().getConfiguration(), typeface);
    }

    /* renamed from: b */
    public static Typeface m9298b(Configuration configuration, Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, C3141a.m13987b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
