package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p094o.C2841l;

/* renamed from: androidx.constraintlayout.widget.k */
public abstract class C0428k extends C0411b {

    /* renamed from: l */
    private boolean f2191l;

    /* renamed from: m */
    private boolean f2192m;

    public C0428k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo2166g(AttributeSet attributeSet) {
        super.mo2166g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0427j.f2011a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0427j.f2060h1) {
                    this.f2191l = true;
                } else if (index == C0427j.f2109o1) {
                    this.f2192m = true;
                }
            }
        }
    }

    /* renamed from: n */
    public void mo2168n(C2841l lVar, int i, int i2) {
    }

    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f2191l || this.f2192m) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i = 0; i < this.f1705e; i++) {
                View h = constraintLayout.mo2213h(this.f1704d[i]);
                if (h != null) {
                    if (this.f2191l) {
                        h.setVisibility(visibility);
                    }
                    if (this.f2192m && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        h.setTranslationZ(h.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo2242c();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo2242c();
    }
}
