package p030e;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p030e.C1754b;

/* renamed from: e.e */
public class C1761e extends C1754b {

    /* renamed from: p */
    private C1762a f6612p;

    /* renamed from: q */
    private boolean f6613q;

    /* renamed from: e.e$a */
    static class C1762a extends C1754b.C1758d {

        /* renamed from: J */
        int[][] f6614J;

        C1762a(C1762a aVar, C1761e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.f6614J = aVar.f6614J;
            } else {
                this.f6614J = new int[mo7399f()][];
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public int mo7454A(int[] iArr) {
            int[][] iArr2 = this.f6614J;
            int h = mo7402h();
            for (int i = 0; i < h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C1761e(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1761e(this, resources);
        }

        /* renamed from: o */
        public void mo7409o(int i, int i2) {
            super.mo7409o(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f6614J, 0, iArr, 0, i);
            this.f6614J = iArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo7347r() {
            int[][] iArr = this.f6614J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f6614J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f6614J = iArr2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public int mo7455z(int[] iArr, Drawable drawable) {
            int a = mo7394a(drawable);
            this.f6614J[a] = iArr;
            return a;
        }
    }

    C1761e(C1762a aVar) {
        if (aVar != null) {
            mo7327h(aVar);
        }
    }

    C1761e(C1762a aVar, Resources resources) {
        mo7327h(new C1762a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo7327h(C1754b.C1758d dVar) {
        super.mo7327h(dVar);
        if (dVar instanceof C1762a) {
            this.f6612p = (C1762a) dVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C1762a mo7326b() {
        return new C1762a(this.f6612p, this, (Resources) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] mo7453k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public Drawable mutate() {
        if (!this.f6613q && super.mutate() == this) {
            this.f6612p.mo7347r();
            this.f6613q = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.f6612p.mo7454A(iArr);
        if (A < 0) {
            A = this.f6612p.mo7454A(StateSet.WILD_CARD);
        }
        return mo7358g(A) || onStateChange;
    }
}
