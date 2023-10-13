package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.i */
public abstract class C1143i {

    /* renamed from: a */
    protected final RecyclerView.C1084o f4030a;

    /* renamed from: b */
    private int f4031b;

    /* renamed from: c */
    final Rect f4032c;

    /* renamed from: androidx.recyclerview.widget.i$a */
    static class C1144a extends C1143i {
        C1144a(RecyclerView.C1084o oVar) {
            super(oVar, (C1144a) null);
        }

        /* renamed from: d */
        public int mo4701d(View view) {
            return this.f4030a.mo4366U(view) + ((RecyclerView.C1089p) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: e */
        public int mo4702e(View view) {
            RecyclerView.C1089p pVar = (RecyclerView.C1089p) view.getLayoutParams();
            return this.f4030a.mo4364T(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: f */
        public int mo4703f(View view) {
            RecyclerView.C1089p pVar = (RecyclerView.C1089p) view.getLayoutParams();
            return this.f4030a.mo4363S(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: g */
        public int mo4704g(View view) {
            return this.f4030a.mo4361R(view) - ((RecyclerView.C1089p) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: h */
        public int mo4705h() {
            return this.f4030a.mo4408r0();
        }

        /* renamed from: i */
        public int mo4706i() {
            return this.f4030a.mo4408r0() - this.f4030a.mo4387h0();
        }

        /* renamed from: j */
        public int mo4707j() {
            return this.f4030a.mo4387h0();
        }

        /* renamed from: k */
        public int mo4708k() {
            return this.f4030a.mo4410s0();
        }

        /* renamed from: l */
        public int mo4709l() {
            return this.f4030a.mo4370Y();
        }

        /* renamed from: m */
        public int mo4710m() {
            return this.f4030a.mo4386g0();
        }

        /* renamed from: n */
        public int mo4711n() {
            return (this.f4030a.mo4408r0() - this.f4030a.mo4386g0()) - this.f4030a.mo4387h0();
        }

        /* renamed from: p */
        public int mo4713p(View view) {
            this.f4030a.mo4406q0(view, true, this.f4032c);
            return this.f4032c.right;
        }

        /* renamed from: q */
        public int mo4714q(View view) {
            this.f4030a.mo4406q0(view, true, this.f4032c);
            return this.f4032c.left;
        }

        /* renamed from: r */
        public void mo4715r(int i) {
            this.f4030a.mo4339F0(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    static class C1145b extends C1143i {
        C1145b(RecyclerView.C1084o oVar) {
            super(oVar, (C1144a) null);
        }

        /* renamed from: d */
        public int mo4701d(View view) {
            return this.f4030a.mo4357P(view) + ((RecyclerView.C1089p) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: e */
        public int mo4702e(View view) {
            RecyclerView.C1089p pVar = (RecyclerView.C1089p) view.getLayoutParams();
            return this.f4030a.mo4363S(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: f */
        public int mo4703f(View view) {
            RecyclerView.C1089p pVar = (RecyclerView.C1089p) view.getLayoutParams();
            return this.f4030a.mo4364T(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: g */
        public int mo4704g(View view) {
            return this.f4030a.mo4367V(view) - ((RecyclerView.C1089p) view.getLayoutParams()).topMargin;
        }

        /* renamed from: h */
        public int mo4705h() {
            return this.f4030a.mo4369X();
        }

        /* renamed from: i */
        public int mo4706i() {
            return this.f4030a.mo4369X() - this.f4030a.mo4382e0();
        }

        /* renamed from: j */
        public int mo4707j() {
            return this.f4030a.mo4382e0();
        }

        /* renamed from: k */
        public int mo4708k() {
            return this.f4030a.mo4370Y();
        }

        /* renamed from: l */
        public int mo4709l() {
            return this.f4030a.mo4410s0();
        }

        /* renamed from: m */
        public int mo4710m() {
            return this.f4030a.mo4393j0();
        }

        /* renamed from: n */
        public int mo4711n() {
            return (this.f4030a.mo4369X() - this.f4030a.mo4393j0()) - this.f4030a.mo4382e0();
        }

        /* renamed from: p */
        public int mo4713p(View view) {
            this.f4030a.mo4406q0(view, true, this.f4032c);
            return this.f4032c.bottom;
        }

        /* renamed from: q */
        public int mo4714q(View view) {
            this.f4030a.mo4406q0(view, true, this.f4032c);
            return this.f4032c.top;
        }

        /* renamed from: r */
        public void mo4715r(int i) {
            this.f4030a.mo4340G0(i);
        }
    }

    private C1143i(RecyclerView.C1084o oVar) {
        this.f4031b = Integer.MIN_VALUE;
        this.f4032c = new Rect();
        this.f4030a = oVar;
    }

    /* synthetic */ C1143i(RecyclerView.C1084o oVar, C1144a aVar) {
        this(oVar);
    }

    /* renamed from: a */
    public static C1143i m5622a(RecyclerView.C1084o oVar) {
        return new C1144a(oVar);
    }

    /* renamed from: b */
    public static C1143i m5623b(RecyclerView.C1084o oVar, int i) {
        if (i == 0) {
            return m5622a(oVar);
        }
        if (i == 1) {
            return m5624c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static C1143i m5624c(RecyclerView.C1084o oVar) {
        return new C1145b(oVar);
    }

    /* renamed from: d */
    public abstract int mo4701d(View view);

    /* renamed from: e */
    public abstract int mo4702e(View view);

    /* renamed from: f */
    public abstract int mo4703f(View view);

    /* renamed from: g */
    public abstract int mo4704g(View view);

    /* renamed from: h */
    public abstract int mo4705h();

    /* renamed from: i */
    public abstract int mo4706i();

    /* renamed from: j */
    public abstract int mo4707j();

    /* renamed from: k */
    public abstract int mo4708k();

    /* renamed from: l */
    public abstract int mo4709l();

    /* renamed from: m */
    public abstract int mo4710m();

    /* renamed from: n */
    public abstract int mo4711n();

    /* renamed from: o */
    public int mo4712o() {
        if (Integer.MIN_VALUE == this.f4031b) {
            return 0;
        }
        return mo4711n() - this.f4031b;
    }

    /* renamed from: p */
    public abstract int mo4713p(View view);

    /* renamed from: q */
    public abstract int mo4714q(View view);

    /* renamed from: r */
    public abstract void mo4715r(int i);

    /* renamed from: s */
    public void mo4716s() {
        this.f4031b = mo4711n();
    }
}
