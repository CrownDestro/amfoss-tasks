package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
public class C1146j extends C1152n {

    /* renamed from: d */
    private C1143i f4033d;

    /* renamed from: e */
    private C1143i f4034e;

    /* renamed from: androidx.recyclerview.widget.j$a */
    class C1147a extends C1140g {
        C1147a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo4509o(View view, RecyclerView.C1064a0 a0Var, RecyclerView.C1101z.C1102a aVar) {
            C1146j jVar = C1146j.this;
            int[] c = jVar.mo4717c(jVar.f4041a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int w = mo4695w(Math.max(Math.abs(i), Math.abs(i2)));
            if (w > 0) {
                aVar.mo4516d(i, i2, w, this.f4022j);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo4694v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public int mo4696x(int i) {
            return Math.min(100, super.mo4696x(i));
        }
    }

    /* renamed from: l */
    private int m5669l(RecyclerView.C1084o oVar, View view, C1143i iVar) {
        return (iVar.mo4704g(view) + (iVar.mo4702e(view) / 2)) - (iVar.mo4710m() + (iVar.mo4711n() / 2));
    }

    /* renamed from: m */
    private View m5670m(RecyclerView.C1084o oVar, C1143i iVar) {
        int K = oVar.mo4350K();
        View view = null;
        if (K == 0) {
            return null;
        }
        int m = iVar.mo4710m() + (iVar.mo4711n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < K; i2++) {
            View J = oVar.mo4348J(i2);
            int abs = Math.abs((iVar.mo4704g(J) + (iVar.mo4702e(J) / 2)) - m);
            if (abs < i) {
                view = J;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: n */
    private C1143i m5671n(RecyclerView.C1084o oVar) {
        C1143i iVar = this.f4034e;
        if (iVar == null || iVar.f4030a != oVar) {
            this.f4034e = C1143i.m5622a(oVar);
        }
        return this.f4034e;
    }

    /* renamed from: o */
    private C1143i m5672o(RecyclerView.C1084o oVar) {
        if (oVar.mo3996m()) {
            return m5673p(oVar);
        }
        if (oVar.mo3995l()) {
            return m5671n(oVar);
        }
        return null;
    }

    /* renamed from: p */
    private C1143i m5673p(RecyclerView.C1084o oVar) {
        C1143i iVar = this.f4033d;
        if (iVar == null || iVar.f4030a != oVar) {
            this.f4033d = C1143i.m5624c(oVar);
        }
        return this.f4033d;
    }

    /* renamed from: q */
    private boolean m5674q(RecyclerView.C1084o oVar, int i, int i2) {
        return oVar.mo3995l() ? i > 0 : i2 > 0;
    }

    /* renamed from: r */
    private boolean m5675r(RecyclerView.C1084o oVar) {
        PointF b;
        int Z = oVar.mo4372Z();
        if (!(oVar instanceof RecyclerView.C1101z.C1103b) || (b = ((RecyclerView.C1101z.C1103b) oVar).mo3986b(Z - 1)) == null) {
            return false;
        }
        return b.x < 0.0f || b.y < 0.0f;
    }

    /* renamed from: c */
    public int[] mo4717c(RecyclerView.C1084o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.mo3995l()) {
            iArr[0] = m5669l(oVar, view, m5671n(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.mo3996m()) {
            iArr[1] = m5669l(oVar, view, m5673p(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C1140g mo4718e(RecyclerView.C1084o oVar) {
        if (!(oVar instanceof RecyclerView.C1101z.C1103b)) {
            return null;
        }
        return new C1147a(this.f4041a.getContext());
    }

    /* renamed from: g */
    public View mo4719g(RecyclerView.C1084o oVar) {
        C1143i n;
        if (oVar.mo3996m()) {
            n = m5673p(oVar);
        } else if (!oVar.mo3995l()) {
            return null;
        } else {
            n = m5671n(oVar);
        }
        return m5670m(oVar, n);
    }

    /* renamed from: h */
    public int mo4720h(RecyclerView.C1084o oVar, int i, int i2) {
        C1143i o;
        int Z = oVar.mo4372Z();
        if (Z == 0 || (o = m5672o(oVar)) == null) {
            return -1;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int K = oVar.mo4350K();
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < K; i5++) {
            View J = oVar.mo4348J(i5);
            if (J != null) {
                int l = m5669l(oVar, J, o);
                if (l <= 0 && l > i3) {
                    view2 = J;
                    i3 = l;
                }
                if (l >= 0 && l < i4) {
                    view = J;
                    i4 = l;
                }
            }
        }
        boolean q = m5674q(oVar, i, i2);
        if (q && view != null) {
            return oVar.mo4396k0(view);
        }
        if (!q && view2 != null) {
            return oVar.mo4396k0(view2);
        }
        if (q) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int k0 = oVar.mo4396k0(view) + (m5675r(oVar) == q ? -1 : 1);
        if (k0 < 0 || k0 >= Z) {
            return -1;
        }
        return k0;
    }
}
