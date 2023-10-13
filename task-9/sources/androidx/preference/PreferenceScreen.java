package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.res.C0502k;
import p052h0.C2000c;

public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: S */
    private boolean f3549S = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0502k.m2294a(context, C2000c.preferenceScreenStyle, 16842891));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo3851t() {
        if (mo3879f() == null && mo3878e() == null && mo3901G() != 0) {
            mo3884k();
            throw null;
        }
    }
}
