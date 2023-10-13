package p053h1;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: h1.b */
public class C2007b {
    /* renamed from: a */
    public static TypedValue m9260a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m9261b(Context context, int i, boolean z) {
        TypedValue a = m9260a(context, i);
        return (a == null || a.type != 18) ? z : a.data != 0;
    }

    /* renamed from: c */
    public static int m9262c(Context context, int i, int i2) {
        TypedValue a = m9260a(context, i);
        return (a == null || a.type != 16) ? i2 : a.data;
    }

    /* renamed from: d */
    public static int m9263d(Context context, int i, String str) {
        return m9264e(context, i, str).data;
    }

    /* renamed from: e */
    public static TypedValue m9264e(Context context, int i, String str) {
        TypedValue a = m9260a(context, i);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: f */
    public static TypedValue m9265f(View view, int i) {
        return m9264e(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
