package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.res.C0502k;
import p052h0.C2000c;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502k.m2294a(context, C2000c.preferenceCategoryStyle, 16842892));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: D */
    public boolean mo3856D() {
        return !super.mo3888p();
    }

    /* renamed from: p */
    public boolean mo3888p() {
        return false;
    }
}
