package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f */
class C1139f {

    /* renamed from: a */
    boolean f4012a = true;

    /* renamed from: b */
    int f4013b;

    /* renamed from: c */
    int f4014c;

    /* renamed from: d */
    int f4015d;

    /* renamed from: e */
    int f4016e;

    /* renamed from: f */
    int f4017f = 0;

    /* renamed from: g */
    int f4018g = 0;

    /* renamed from: h */
    boolean f4019h;

    /* renamed from: i */
    boolean f4020i;

    C1139f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4686a(RecyclerView.C1064a0 a0Var) {
        int i = this.f4014c;
        return i >= 0 && i < a0Var.mo4196b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo4687b(RecyclerView.C1096v vVar) {
        View o = vVar.mo4477o(this.f4014c);
        this.f4014c += this.f4015d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4013b + ", mCurrentPosition=" + this.f4014c + ", mItemDirection=" + this.f4015d + ", mLayoutDirection=" + this.f4016e + ", mStartLine=" + this.f4017f + ", mEndLine=" + this.f4018g + '}';
    }
}
