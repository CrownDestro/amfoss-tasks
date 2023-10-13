package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.res.C0502k;
import p052h0.C2000c;
import p052h0.C2001d;
import p052h0.C2004g;

public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: O */
    private final C1054a f3568O;

    /* renamed from: P */
    private CharSequence f3569P;

    /* renamed from: Q */
    private CharSequence f3570Q;

    /* renamed from: androidx.preference.SwitchPreferenceCompat$a */
    private class C1054a implements CompoundButton.OnCheckedChangeListener {
        C1054a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreferenceCompat.this.mo3873a(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreferenceCompat.this.mo3919G(z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2000c.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3568O = new C1054a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2004g.f7000U0, i, i2);
        mo3922J(C0502k.m2308o(obtainStyledAttributes, C2004g.f7019c1, C2004g.f7002V0));
        mo3921I(C0502k.m2308o(obtainStyledAttributes, C2004g.f7016b1, C2004g.f7004W0));
        mo3916M(C0502k.m2308o(obtainStyledAttributes, C2004g.f7025e1, C2004g.f7008Y0));
        mo3915L(C0502k.m2308o(obtainStyledAttributes, C2004g.f7022d1, C2004g.f7010Z0));
        mo3920H(C0502k.m2295b(obtainStyledAttributes, C2004g.f7013a1, C2004g.f7006X0, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: N */
    private void m4642N(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3572J);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f3569P);
            switchCompat.setTextOff(this.f3570Q);
            switchCompat.setOnCheckedChangeListener(this.f3568O);
        }
    }

    /* renamed from: O */
    private void m4643O(View view) {
        if (((AccessibilityManager) mo3875c().getSystemService("accessibility")).isEnabled()) {
            m4642N(view.findViewById(C2001d.switchWidget));
            mo3923K(view.findViewById(16908304));
        }
    }

    /* renamed from: L */
    public void mo3915L(CharSequence charSequence) {
        this.f3570Q = charSequence;
        mo3853r();
    }

    /* renamed from: M */
    public void mo3916M(CharSequence charSequence) {
        this.f3569P = charSequence;
        mo3853r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo3849y(View view) {
        super.mo3849y(view);
        m4643O(view);
    }
}
