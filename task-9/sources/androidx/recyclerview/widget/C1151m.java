package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.m */
public abstract class C1151m extends RecyclerView.C1078l {

    /* renamed from: g */
    boolean f4040g = true;

    /* renamed from: A */
    public final void mo4725A(RecyclerView.C1070d0 d0Var) {
        mo4733I(d0Var);
        mo4303h(d0Var);
    }

    /* renamed from: B */
    public final void mo4726B(RecyclerView.C1070d0 d0Var) {
        mo4734J(d0Var);
    }

    /* renamed from: C */
    public final void mo4727C(RecyclerView.C1070d0 d0Var, boolean z) {
        mo4735K(d0Var, z);
        mo4303h(d0Var);
    }

    /* renamed from: D */
    public final void mo4728D(RecyclerView.C1070d0 d0Var, boolean z) {
        mo4736L(d0Var, z);
    }

    /* renamed from: E */
    public final void mo4729E(RecyclerView.C1070d0 d0Var) {
        mo4737M(d0Var);
        mo4303h(d0Var);
    }

    /* renamed from: F */
    public final void mo4730F(RecyclerView.C1070d0 d0Var) {
        mo4738N(d0Var);
    }

    /* renamed from: G */
    public final void mo4731G(RecyclerView.C1070d0 d0Var) {
        mo4739O(d0Var);
        mo4303h(d0Var);
    }

    /* renamed from: H */
    public final void mo4732H(RecyclerView.C1070d0 d0Var) {
        mo4740P(d0Var);
    }

    /* renamed from: I */
    public void mo4733I(RecyclerView.C1070d0 d0Var) {
    }

    /* renamed from: J */
    public void mo4734J(RecyclerView.C1070d0 d0Var) {
    }

    /* renamed from: K */
    public void mo4735K(RecyclerView.C1070d0 d0Var, boolean z) {
    }

    /* renamed from: L */
    public void mo4736L(RecyclerView.C1070d0 d0Var, boolean z) {
    }

    /* renamed from: M */
    public void mo4737M(RecyclerView.C1070d0 d0Var) {
    }

    /* renamed from: N */
    public void mo4738N(RecyclerView.C1070d0 d0Var) {
    }

    /* renamed from: O */
    public void mo4739O(RecyclerView.C1070d0 d0Var) {
    }

    /* renamed from: P */
    public void mo4740P(RecyclerView.C1070d0 d0Var) {
    }

    /* renamed from: a */
    public boolean mo4297a(RecyclerView.C1070d0 d0Var, RecyclerView.C1078l.C1081c cVar, RecyclerView.C1078l.C1081c cVar2) {
        int i;
        int i2;
        if (cVar == null || ((i = cVar.f3773a) == (i2 = cVar2.f3773a) && cVar.f3774b == cVar2.f3774b)) {
            return mo4642w(d0Var);
        }
        return mo4644y(d0Var, i, cVar.f3774b, i2, cVar2.f3774b);
    }

    /* renamed from: b */
    public boolean mo4298b(RecyclerView.C1070d0 d0Var, RecyclerView.C1070d0 d0Var2, RecyclerView.C1078l.C1081c cVar, RecyclerView.C1078l.C1081c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f3773a;
        int i4 = cVar.f3774b;
        if (d0Var2.mo4223J()) {
            int i5 = cVar.f3773a;
            i = cVar.f3774b;
            i2 = i5;
        } else {
            i2 = cVar2.f3773a;
            i = cVar2.f3774b;
        }
        return mo4643x(d0Var, d0Var2, i3, i4, i2, i);
    }

    /* renamed from: c */
    public boolean mo4299c(RecyclerView.C1070d0 d0Var, RecyclerView.C1078l.C1081c cVar, RecyclerView.C1078l.C1081c cVar2) {
        int i = cVar.f3773a;
        int i2 = cVar.f3774b;
        View view = d0Var.f3745a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3773a;
        int top = cVar2 == null ? view.getTop() : cVar2.f3774b;
        if (d0Var.mo4247v() || (i == left && i2 == top)) {
            return mo4645z(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo4644y(d0Var, i, i2, left, top);
    }

    /* renamed from: d */
    public boolean mo4300d(RecyclerView.C1070d0 d0Var, RecyclerView.C1078l.C1081c cVar, RecyclerView.C1078l.C1081c cVar2) {
        int i = cVar.f3773a;
        int i2 = cVar2.f3773a;
        if (i == i2 && cVar.f3774b == cVar2.f3774b) {
            mo4729E(d0Var);
            return false;
        }
        return mo4644y(d0Var, i, cVar.f3774b, i2, cVar2.f3774b);
    }

    /* renamed from: f */
    public boolean mo4301f(RecyclerView.C1070d0 d0Var) {
        return !this.f4040g || d0Var.mo4244t();
    }

    /* renamed from: w */
    public abstract boolean mo4642w(RecyclerView.C1070d0 d0Var);

    /* renamed from: x */
    public abstract boolean mo4643x(RecyclerView.C1070d0 d0Var, RecyclerView.C1070d0 d0Var2, int i, int i2, int i3, int i4);

    /* renamed from: y */
    public abstract boolean mo4644y(RecyclerView.C1070d0 d0Var, int i, int i2, int i3, int i4);

    /* renamed from: z */
    public abstract boolean mo4645z(RecyclerView.C1070d0 d0Var);
}
