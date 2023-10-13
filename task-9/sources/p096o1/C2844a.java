package p096o1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.C0155d;
import p119s0.C3096b;

/* renamed from: o1.a */
public class C2844a {

    /* renamed from: a */
    private static final int[] f9362a = {16842752, C3096b.theme};

    /* renamed from: b */
    private static final int[] f9363b = {C3096b.materialThemeOverlay};

    /* renamed from: a */
    private static int m12909a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9362a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: b */
    private static int m12910b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9363b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m12911c(Context context, AttributeSet attributeSet, int i, int i2) {
        int b = m12910b(context, attributeSet, i, i2);
        boolean z = (context instanceof C0155d) && ((C0155d) context).mo478c() == b;
        if (b == 0 || z) {
            return context;
        }
        C0155d dVar = new C0155d(context, b);
        int a = m12909a(context, attributeSet);
        if (a != 0) {
            dVar.getTheme().applyStyle(a, true);
        }
        return dVar;
    }
}
