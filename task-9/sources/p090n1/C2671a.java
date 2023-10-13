package p090n1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0287d0;
import p053h1.C2007b;
import p053h1.C2008c;
import p096o1.C2844a;
import p119s0.C3096b;
import p119s0.C3105k;

/* renamed from: n1.a */
public class C2671a extends C0287d0 {
    public C2671a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C2671a(Context context, AttributeSet attributeSet, int i) {
        super(C2844a.m12911c(context, attributeSet, i, 0), attributeSet, i);
        m12186u(attributeSet, i, 0);
    }

    /* renamed from: r */
    private void m12183r(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C3105k.f10360q3);
        int v = m12187v(getContext(), obtainStyledAttributes, C3105k.f10376s3, C3105k.f10384t3);
        obtainStyledAttributes.recycle();
        if (v >= 0) {
            setLineHeight(v);
        }
    }

    /* renamed from: s */
    private static boolean m12184s(Context context) {
        return C2007b.m9261b(context, C3096b.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: t */
    private static int m12185t(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C3105k.f10392u3, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C3105k.f10400v3, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: u */
    private void m12186u(AttributeSet attributeSet, int i, int i2) {
        int t;
        Context context = getContext();
        if (m12184s(context)) {
            Resources.Theme theme = context.getTheme();
            if (!m12188w(context, theme, attributeSet, i, i2) && (t = m12185t(theme, attributeSet, i, i2)) != -1) {
                m12183r(theme, t);
            }
        }
    }

    /* renamed from: v */
    private static int m12187v(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C2008c.m9268c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: w */
    private static boolean m12188w(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C3105k.f10392u3, i, i2);
        int v = m12187v(context, obtainStyledAttributes, C3105k.f10408w3, C3105k.f10416x3);
        obtainStyledAttributes.recycle();
        return v != -1;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m12184s(context)) {
            m12183r(context.getTheme(), i);
        }
    }
}
