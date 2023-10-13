package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.core.content.res.C0502k;
import p052h0.C2000c;
import p052h0.C2004g;

public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: O */
    private final C1040a f3482O;

    /* renamed from: androidx.preference.CheckBoxPreference$a */
    private class C1040a implements CompoundButton.OnCheckedChangeListener {
        C1040a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!CheckBoxPreference.this.mo3873a(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                CheckBoxPreference.this.mo3919G(z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502k.m2294a(context, C2000c.checkBoxPreferenceStyle, 16842895));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3482O = new C1040a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2004g.f7014b, i, i2);
        mo3922J(C0502k.m2308o(obtainStyledAttributes, C2004g.f7030h, C2004g.f7017c));
        mo3921I(C0502k.m2308o(obtainStyledAttributes, C2004g.f7028g, C2004g.f7020d));
        mo3920H(C0502k.m2295b(obtainStyledAttributes, C2004g.f7026f, C2004g.f7023e, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: L */
    private void m4562L(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3572J);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f3482O);
        }
    }

    /* renamed from: M */
    private void m4563M(View view) {
        if (((AccessibilityManager) mo3875c().getSystemService("accessibility")).isEnabled()) {
            m4562L(view.findViewById(16908289));
            mo3923K(view.findViewById(16908304));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo3849y(View view) {
        super.mo3849y(view);
        m4563M(view);
    }
}
