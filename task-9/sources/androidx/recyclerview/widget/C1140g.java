package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.g */
public class C1140g extends RecyclerView.C1101z {

    /* renamed from: i */
    protected final LinearInterpolator f4021i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f4022j = new DecelerateInterpolator();

    /* renamed from: k */
    protected PointF f4023k;

    /* renamed from: l */
    private final DisplayMetrics f4024l;

    /* renamed from: m */
    private boolean f4025m = false;

    /* renamed from: n */
    private float f4026n;

    /* renamed from: o */
    protected int f4027o = 0;

    /* renamed from: p */
    protected int f4028p = 0;

    public C1140g(Context context) {
        this.f4024l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    private float m5599A() {
        if (!this.f4025m) {
            this.f4026n = mo4694v(this.f4024l);
            this.f4025m = true;
        }
        return this.f4026n;
    }

    /* renamed from: y */
    private int m5600y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo4689B() {
        PointF pointF = this.f4023k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo4690C(RecyclerView.C1101z.C1102a aVar) {
        PointF a = mo4495a(mo4500f());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.mo4514b(mo4500f());
            mo4512r();
            return;
        }
        mo4503i(a);
        this.f4023k = a;
        this.f4027o = (int) (a.x * 10000.0f);
        this.f4028p = (int) (a.y * 10000.0f);
        aVar.mo4516d((int) (((float) this.f4027o) * 1.2f), (int) (((float) this.f4028p) * 1.2f), (int) (((float) mo4696x(10000)) * 1.2f), this.f4021i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo4506l(int i, int i2, RecyclerView.C1064a0 a0Var, RecyclerView.C1101z.C1102a aVar) {
        if (mo4497c() == 0) {
            mo4512r();
            return;
        }
        this.f4027o = m5600y(this.f4027o, i);
        int y = m5600y(this.f4028p, i2);
        this.f4028p = y;
        if (this.f4027o == 0 && y == 0) {
            mo4690C(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo4507m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo4508n() {
        this.f4028p = 0;
        this.f4027o = 0;
        this.f4023k = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo4509o(View view, RecyclerView.C1064a0 a0Var, RecyclerView.C1101z.C1102a aVar) {
        int t = mo4692t(view, mo4697z());
        int u = mo4693u(view, mo4689B());
        int w = mo4695w((int) Math.sqrt((double) ((t * t) + (u * u))));
        if (w > 0) {
            aVar.mo4516d(-t, -u, w, this.f4022j);
        }
    }

    /* renamed from: s */
    public int mo4691s(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: t */
    public int mo4692t(View view, int i) {
        RecyclerView.C1084o e = mo4499e();
        if (e == null || !e.mo3995l()) {
            return 0;
        }
        RecyclerView.C1089p pVar = (RecyclerView.C1089p) view.getLayoutParams();
        return mo4691s(e.mo4361R(view) - pVar.leftMargin, e.mo4366U(view) + pVar.rightMargin, e.mo4386g0(), e.mo4408r0() - e.mo4387h0(), i);
    }

    /* renamed from: u */
    public int mo4693u(View view, int i) {
        RecyclerView.C1084o e = mo4499e();
        if (e == null || !e.mo3996m()) {
            return 0;
        }
        RecyclerView.C1089p pVar = (RecyclerView.C1089p) view.getLayoutParams();
        return mo4691s(e.mo4367V(view) - pVar.topMargin, e.mo4357P(view) + pVar.bottomMargin, e.mo4393j0(), e.mo4369X() - e.mo4382e0(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public float mo4694v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo4695w(int i) {
        double x = (double) mo4696x(i);
        Double.isNaN(x);
        return (int) Math.ceil(x / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo4696x(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * m5599A()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo4697z() {
        PointF pointF = this.f4023k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
