package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.e */
public class C0421e extends ViewGroup {

    /* renamed from: d */
    C0415d f1828d;

    /* renamed from: androidx.constraintlayout.widget.e$a */
    public static class C0422a extends ConstraintLayout.C0405b {

        /* renamed from: A0 */
        public float f1829A0;

        /* renamed from: B0 */
        public float f1830B0;

        /* renamed from: p0 */
        public float f1831p0;

        /* renamed from: q0 */
        public boolean f1832q0;

        /* renamed from: r0 */
        public float f1833r0;

        /* renamed from: s0 */
        public float f1834s0;

        /* renamed from: t0 */
        public float f1835t0;

        /* renamed from: u0 */
        public float f1836u0;

        /* renamed from: v0 */
        public float f1837v0;

        /* renamed from: w0 */
        public float f1838w0;

        /* renamed from: x0 */
        public float f1839x0;

        /* renamed from: y0 */
        public float f1840y0;

        /* renamed from: z0 */
        public float f1841z0;

        public C0422a(int i, int i2) {
            super(i, i2);
            this.f1831p0 = 1.0f;
            this.f1832q0 = false;
            this.f1833r0 = 0.0f;
            this.f1834s0 = 0.0f;
            this.f1835t0 = 0.0f;
            this.f1836u0 = 0.0f;
            this.f1837v0 = 1.0f;
            this.f1838w0 = 1.0f;
            this.f1839x0 = 0.0f;
            this.f1840y0 = 0.0f;
            this.f1841z0 = 0.0f;
            this.f1829A0 = 0.0f;
            this.f1830B0 = 0.0f;
        }

        public C0422a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1831p0 = 1.0f;
            this.f1832q0 = false;
            this.f1833r0 = 0.0f;
            this.f1834s0 = 0.0f;
            this.f1835t0 = 0.0f;
            this.f1836u0 = 0.0f;
            this.f1837v0 = 1.0f;
            this.f1838w0 = 1.0f;
            this.f1839x0 = 0.0f;
            this.f1840y0 = 0.0f;
            this.f1841z0 = 0.0f;
            this.f1829A0 = 0.0f;
            this.f1830B0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0427j.f1934N2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0427j.f1940O2) {
                    this.f1831p0 = obtainStyledAttributes.getFloat(index, this.f1831p0);
                } else if (index == C0427j.f2006Z2) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f1833r0 = obtainStyledAttributes.getFloat(index, this.f1833r0);
                        this.f1832q0 = true;
                    }
                } else if (index == C0427j.f1988W2) {
                    this.f1835t0 = obtainStyledAttributes.getFloat(index, this.f1835t0);
                } else if (index == C0427j.f1994X2) {
                    this.f1836u0 = obtainStyledAttributes.getFloat(index, this.f1836u0);
                } else if (index == C0427j.f1982V2) {
                    this.f1834s0 = obtainStyledAttributes.getFloat(index, this.f1834s0);
                } else if (index == C0427j.f1970T2) {
                    this.f1837v0 = obtainStyledAttributes.getFloat(index, this.f1837v0);
                } else if (index == C0427j.f1976U2) {
                    this.f1838w0 = obtainStyledAttributes.getFloat(index, this.f1838w0);
                } else if (index == C0427j.f1946P2) {
                    this.f1839x0 = obtainStyledAttributes.getFloat(index, this.f1839x0);
                } else if (index == C0427j.f1952Q2) {
                    this.f1840y0 = obtainStyledAttributes.getFloat(index, this.f1840y0);
                } else if (index == C0427j.f1958R2) {
                    this.f1841z0 = obtainStyledAttributes.getFloat(index, this.f1841z0);
                } else if (index == C0427j.f1964S2) {
                    this.f1829A0 = obtainStyledAttributes.getFloat(index, this.f1829A0);
                } else if (index == C0427j.f2000Y2 && Build.VERSION.SDK_INT >= 21) {
                    this.f1830B0 = obtainStyledAttributes.getFloat(index, this.f1830B0);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0422a generateDefaultLayoutParams() {
        return new C0422a(-2, -2);
    }

    /* renamed from: b */
    public C0422a generateLayoutParams(AttributeSet attributeSet) {
        return new C0422a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0405b(layoutParams);
    }

    public C0415d getConstraintSet() {
        if (this.f1828d == null) {
            this.f1828d = new C0415d();
        }
        this.f1828d.mo2260g(this);
        return this.f1828d;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
