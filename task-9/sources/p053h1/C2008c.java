package p053h1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;

/* renamed from: h1.c */
public class C2008c {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = p023d.C1729a.m8625a(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m9266a(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = p023d.C1729a.m8625a(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p053h1.C2008c.m9266a(android.content.Context, android.content.res.TypedArray, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = p023d.C1729a.m8625a(r1, (r0 = r2.mo1459n(r3, 0)));
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m9267b(android.content.Context r1, androidx.appcompat.widget.C0263a1 r2, int r3) {
        /*
            boolean r0 = r2.mo1464s(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.mo1459n(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = p023d.C1729a.m8625a(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.mo1448c(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p053h1.C2008c.m9267b(android.content.Context, androidx.appcompat.widget.a1, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static int m9268c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = p023d.C1729a.m8626b(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable m9269d(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = p023d.C1729a.m8626b(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p053h1.C2008c.m9269d(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: e */
    static int m9270e(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: f */
    public static C2009d m9271f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new C2009d(context, resourceId);
    }

    /* renamed from: g */
    public static boolean m9272g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: h */
    public static boolean m9273h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
