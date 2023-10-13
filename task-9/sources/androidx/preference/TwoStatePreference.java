package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public abstract class TwoStatePreference extends Preference {

    /* renamed from: J */
    protected boolean f3572J;

    /* renamed from: K */
    private CharSequence f3573K;

    /* renamed from: L */
    private CharSequence f3574L;

    /* renamed from: M */
    private boolean f3575M;

    /* renamed from: N */
    private boolean f3576N;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: D */
    public boolean mo3856D() {
        return (this.f3576N ? this.f3572J : !this.f3572J) || super.mo3856D();
    }

    /* renamed from: F */
    public boolean mo3918F() {
        return this.f3572J;
    }

    /* renamed from: G */
    public void mo3919G(boolean z) {
        boolean z2 = this.f3572J != z;
        if (z2 || !this.f3575M) {
            this.f3572J = z;
            this.f3575M = true;
            mo3895z(z);
            if (z2) {
                mo3890s(mo3856D());
                mo3853r();
            }
        }
    }

    /* renamed from: H */
    public void mo3920H(boolean z) {
        this.f3576N = z;
    }

    /* renamed from: I */
    public void mo3921I(CharSequence charSequence) {
        this.f3574L = charSequence;
        if (!mo3918F()) {
            mo3853r();
        }
    }

    /* renamed from: J */
    public void mo3922J(CharSequence charSequence) {
        this.f3573K = charSequence;
        if (mo3918F()) {
            mo3853r();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3923K(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.f3572J
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.CharSequence r1 = r4.f3573K
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x001c
            java.lang.CharSequence r0 = r4.f3573K
        L_0x0017:
            r5.setText(r0)
            r0 = 0
            goto L_0x002b
        L_0x001c:
            boolean r1 = r4.f3572J
            if (r1 != 0) goto L_0x002b
            java.lang.CharSequence r1 = r4.f3574L
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x002b
            java.lang.CharSequence r0 = r4.f3574L
            goto L_0x0017
        L_0x002b:
            if (r0 == 0) goto L_0x003b
            java.lang.CharSequence r1 = r4.mo3867l()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x003b
            r5.setText(r1)
            r0 = 0
        L_0x003b:
            r1 = 8
            if (r0 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r2 = 8
        L_0x0042:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L_0x004b
            r5.setVisibility(r2)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.mo3923K(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo3851t() {
        super.mo3851t();
        boolean z = !mo3918F();
        if (mo3873a(Boolean.valueOf(z))) {
            mo3919G(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo3858v(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }
}
