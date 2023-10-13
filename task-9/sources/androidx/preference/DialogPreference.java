package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.res.C0502k;
import p052h0.C2000c;
import p052h0.C2004g;

public abstract class DialogPreference extends Preference {

    /* renamed from: J */
    private CharSequence f3484J;

    /* renamed from: K */
    private CharSequence f3485K;

    /* renamed from: L */
    private Drawable f3486L;

    /* renamed from: M */
    private CharSequence f3487M;

    /* renamed from: N */
    private CharSequence f3488N;

    /* renamed from: O */
    private int f3489O;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502k.m2294a(context, C2000c.dialogPreferenceStyle, 16842897));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2004g.f7032i, i, i2);
        String o = C0502k.m2308o(obtainStyledAttributes, C2004g.f7052s, C2004g.f7034j);
        this.f3484J = o;
        if (o == null) {
            this.f3484J = mo3886n();
        }
        this.f3485K = C0502k.m2308o(obtainStyledAttributes, C2004g.f7050r, C2004g.f7036k);
        this.f3486L = C0502k.m2296c(obtainStyledAttributes, C2004g.f7046p, C2004g.f7038l);
        this.f3487M = C0502k.m2308o(obtainStyledAttributes, C2004g.f7056u, C2004g.f7040m);
        this.f3488N = C0502k.m2308o(obtainStyledAttributes, C2004g.f7054t, C2004g.f7042n);
        this.f3489O = C0502k.m2307n(obtainStyledAttributes, C2004g.f7048q, C2004g.f7044o, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo3851t() {
        mo3884k();
        throw null;
    }
}
