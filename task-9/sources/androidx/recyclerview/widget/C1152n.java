package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.n */
public abstract class C1152n extends RecyclerView.C1091r {

    /* renamed from: a */
    RecyclerView f4041a;

    /* renamed from: b */
    private Scroller f4042b;

    /* renamed from: c */
    private final RecyclerView.C1093t f4043c = new C1153a();

    /* renamed from: androidx.recyclerview.widget.n$a */
    class C1153a extends RecyclerView.C1093t {

        /* renamed from: a */
        boolean f4044a = false;

        C1153a() {
        }

        /* renamed from: a */
        public void mo4439a(RecyclerView recyclerView, int i) {
            super.mo4439a(recyclerView, i);
            if (i == 0 && this.f4044a) {
                this.f4044a = false;
                C1152n.this.mo4743k();
            }
        }

        /* renamed from: b */
        public void mo4440b(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f4044a = true;
            }
        }
    }

    /* renamed from: f */
    private void m5727f() {
        this.f4041a.mo4058X0(this.f4043c);
        this.f4041a.setOnFlingListener((RecyclerView.C1091r) null);
    }

    /* renamed from: i */
    private void m5728i() {
        if (this.f4041a.getOnFlingListener() == null) {
            this.f4041a.mo4119k(this.f4043c);
            this.f4041a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: j */
    private boolean m5729j(RecyclerView.C1084o oVar, int i, int i2) {
        RecyclerView.C1101z d;
        int h;
        if (!(oVar instanceof RecyclerView.C1101z.C1103b) || (d = mo4742d(oVar)) == null || (h = mo4720h(oVar, i, i2)) == -1) {
            return false;
        }
        d.mo4510p(h);
        oVar.mo4353M1(d);
        return true;
    }

    /* renamed from: a */
    public boolean mo4435a(int i, int i2) {
        RecyclerView.C1084o layoutManager = this.f4041a.getLayoutManager();
        if (layoutManager == null || this.f4041a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f4041a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m5729j(layoutManager, i, i2);
    }

    /* renamed from: b */
    public void mo4741b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4041a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m5727f();
            }
            this.f4041a = recyclerView;
            if (recyclerView != null) {
                m5728i();
                this.f4042b = new Scroller(this.f4041a.getContext(), new DecelerateInterpolator());
                mo4743k();
            }
        }
    }

    /* renamed from: c */
    public abstract int[] mo4717c(RecyclerView.C1084o oVar, View view);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public RecyclerView.C1101z mo4742d(RecyclerView.C1084o oVar) {
        return mo4718e(oVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: e */
    public abstract C1140g mo4718e(RecyclerView.C1084o oVar);

    /* renamed from: g */
    public abstract View mo4719g(RecyclerView.C1084o oVar);

    /* renamed from: h */
    public abstract int mo4720h(RecyclerView.C1084o oVar, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4743k() {
        RecyclerView.C1084o layoutManager;
        View g;
        RecyclerView recyclerView = this.f4041a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (g = mo4719g(layoutManager)) != null) {
            int[] c = mo4717c(layoutManager, g);
            if (c[0] != 0 || c[1] != 0) {
                this.f4041a.mo4120k1(c[0], c[1]);
            }
        }
    }
}
