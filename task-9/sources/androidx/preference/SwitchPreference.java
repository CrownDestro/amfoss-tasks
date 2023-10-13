package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.core.content.res.C0502k;
import p052h0.C2000c;
import p052h0.C2004g;

public class SwitchPreference extends TwoStatePreference {

    /* renamed from: O */
    private final C1053a f3564O;

    /* renamed from: P */
    private CharSequence f3565P;

    /* renamed from: Q */
    private CharSequence f3566Q;

    /* renamed from: androidx.preference.SwitchPreference$a */
    private class C1053a implements CompoundButton.OnCheckedChangeListener {
        C1053a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreference.this.mo3873a(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreference.this.mo3919G(z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502k.m2294a(context, C2000c.switchPreferenceStyle, 16843629));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3564O = new C1053a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2004g.f6978J0, i, i2);
        mo3922J(C0502k.m2308o(obtainStyledAttributes, C2004g.f6994R0, C2004g.f6980K0));
        mo3921I(C0502k.m2308o(obtainStyledAttributes, C2004g.f6992Q0, C2004g.f6982L0));
        mo3913M(C0502k.m2308o(obtainStyledAttributes, C2004g.f6998T0, C2004g.f6986N0));
        mo3912L(C0502k.m2308o(obtainStyledAttributes, C2004g.f6996S0, C2004g.f6988O0));
        mo3920H(C0502k.m2295b(obtainStyledAttributes, C2004g.f6990P0, C2004g.f6984M0, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: N */
    private void m4637N(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3572J);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.f3565P);
            switchR.setTextOff(this.f3566Q);
            switchR.setOnCheckedChangeListener(this.f3564O);
        }
    }

    /* renamed from: O */
    private void m4638O(View view) {
        if (((AccessibilityManager) mo3875c().getSystemService("accessibility")).isEnabled()) {
            m4637N(view.findViewById(16908352));
            mo3923K(view.findViewById(16908304));
        }
    }

    /* renamed from: L */
    public void mo3912L(CharSequence charSequence) {
        this.f3566Q = charSequence;
        mo3853r();
    }

    /* renamed from: M */
    public void mo3913M(CharSequence charSequence) {
        this.f3565P = charSequence;
        mo3853r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo3849y(View view) {
        super.mo3849y(view);
        m4638O(view);
    }
}
