package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.core.p008os.C0560k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.recyclerview.widget.e */
final class C1135e implements Runnable {

    /* renamed from: h */
    static final ThreadLocal<C1135e> f3997h = new ThreadLocal<>();

    /* renamed from: i */
    static Comparator<C1138c> f3998i = new C1136a();

    /* renamed from: d */
    ArrayList<RecyclerView> f3999d = new ArrayList<>();

    /* renamed from: e */
    long f4000e;

    /* renamed from: f */
    long f4001f;

    /* renamed from: g */
    private ArrayList<C1138c> f4002g = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    static class C1136a implements Comparator<C1138c> {
        C1136a() {
        }

        /* renamed from: a */
        public int compare(C1138c cVar, C1138c cVar2) {
            RecyclerView recyclerView = cVar.f4010d;
            if ((recyclerView == null) != (cVar2.f4010d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.f4007a;
            if (z != cVar2.f4007a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f4008b - cVar.f4008b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.f4009c - cVar2.f4009c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.e$b */
    static class C1137b implements RecyclerView.C1084o.C1087c {

        /* renamed from: a */
        int f4003a;

        /* renamed from: b */
        int f4004b;

        /* renamed from: c */
        int[] f4005c;

        /* renamed from: d */
        int f4006d;

        C1137b() {
        }

        /* renamed from: a */
        public void mo4428a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f4006d * 2;
                int[] iArr = this.f4005c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f4005c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f4005c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f4005c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f4006d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4681b() {
            int[] iArr = this.f4005c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4006d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4682c(RecyclerView recyclerView, boolean z) {
            this.f4006d = 0;
            int[] iArr = this.f4005c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C1084o oVar = recyclerView.f3695p;
            if (recyclerView.f3693o != null && oVar != null && oVar.mo4419x0()) {
                if (z) {
                    if (!recyclerView.f3677g.mo4602p()) {
                        oVar.mo3998q(recyclerView.f3693o.mo4274c(), this);
                    }
                } else if (!recyclerView.mo4122l0()) {
                    oVar.mo3997p(this.f4003a, this.f4004b, recyclerView.f3686k0, this);
                }
                int i = this.f4006d;
                if (i > oVar.f3790m) {
                    oVar.f3790m = i;
                    oVar.f3791n = z;
                    recyclerView.f3673e.mo4461K();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4683d(int i) {
            if (this.f4005c != null) {
                int i2 = this.f4006d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f4005c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4684e(int i, int i2) {
            this.f4003a = i;
            this.f4004b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    static class C1138c {

        /* renamed from: a */
        public boolean f4007a;

        /* renamed from: b */
        public int f4008b;

        /* renamed from: c */
        public int f4009c;

        /* renamed from: d */
        public RecyclerView f4010d;

        /* renamed from: e */
        public int f4011e;

        C1138c() {
        }

        /* renamed from: a */
        public void mo4685a() {
            this.f4007a = false;
            this.f4008b = 0;
            this.f4009c = 0;
            this.f4010d = null;
            this.f4011e = 0;
        }
    }

    C1135e() {
    }

    /* renamed from: b */
    private void m5580b() {
        C1138c cVar;
        int size = this.f3999d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f3999d.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f3684j0.mo4682c(recyclerView, false);
                i += recyclerView.f3684j0.f4006d;
            }
        }
        this.f4002g.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f3999d.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1137b bVar = recyclerView2.f3684j0;
                int abs = Math.abs(bVar.f4003a) + Math.abs(bVar.f4004b);
                for (int i5 = 0; i5 < bVar.f4006d * 2; i5 += 2) {
                    if (i3 >= this.f4002g.size()) {
                        cVar = new C1138c();
                        this.f4002g.add(cVar);
                    } else {
                        cVar = this.f4002g.get(i3);
                    }
                    int[] iArr = bVar.f4005c;
                    int i6 = iArr[i5 + 1];
                    cVar.f4007a = i6 <= abs;
                    cVar.f4008b = abs;
                    cVar.f4009c = i6;
                    cVar.f4010d = recyclerView2;
                    cVar.f4011e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f4002g, f3998i);
    }

    /* renamed from: c */
    private void m5581c(C1138c cVar, long j) {
        RecyclerView.C1070d0 i = m5585i(cVar.f4010d, cVar.f4011e, cVar.f4007a ? Long.MAX_VALUE : j);
        if (i != null && i.f3746b != null && i.mo4243s() && !i.mo4244t()) {
            m5584h((RecyclerView) i.f3746b.get(), j);
        }
    }

    /* renamed from: d */
    private void m5582d(long j) {
        int i = 0;
        while (i < this.f4002g.size()) {
            C1138c cVar = this.f4002g.get(i);
            if (cVar.f4010d != null) {
                m5581c(cVar, j);
                cVar.mo4685a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    static boolean m5583e(RecyclerView recyclerView, int i) {
        int j = recyclerView.f3679h.mo4619j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.C1070d0 f0 = RecyclerView.m4835f0(recyclerView.f3679h.mo4618i(i2));
            if (f0.f3747c == i && !f0.mo4244t()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m5584h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f3651G && recyclerView.f3679h.mo4619j() != 0) {
                recyclerView.mo4053T0();
            }
            C1137b bVar = recyclerView.f3684j0;
            bVar.mo4682c(recyclerView, true);
            if (bVar.f4006d != 0) {
                try {
                    C0560k.m2546a("RV Nested Prefetch");
                    recyclerView.f3686k0.mo4200f(recyclerView.f3693o);
                    for (int i = 0; i < bVar.f4006d * 2; i += 2) {
                        m5585i(recyclerView, bVar.f4005c[i], j);
                    }
                } finally {
                    C0560k.m2547b();
                }
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.C1070d0 m5585i(RecyclerView recyclerView, int i, long j) {
        if (m5583e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C1096v vVar = recyclerView.f3673e;
        try {
            recyclerView.mo4033F0();
            RecyclerView.C1070d0 I = vVar.mo4459I(i, false, j);
            if (I != null) {
                if (!I.mo4243s() || I.mo4244t()) {
                    vVar.mo4464a(I, false);
                } else {
                    vVar.mo4453B(I.f3745a);
                }
            }
            return I;
        } finally {
            recyclerView.mo4037H0(false);
        }
    }

    /* renamed from: a */
    public void mo4674a(RecyclerView recyclerView) {
        this.f3999d.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4675f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f4000e == 0) {
            this.f4000e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f3684j0.mo4684e(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4676g(long j) {
        m5580b();
        m5582d(j);
    }

    /* renamed from: j */
    public void mo4677j(RecyclerView recyclerView) {
        this.f3999d.remove(recyclerView);
    }

    public void run() {
        try {
            C0560k.m2546a("RV Prefetch");
            if (!this.f3999d.isEmpty()) {
                int size = this.f3999d.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f3999d.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo4676g(TimeUnit.MILLISECONDS.toNanos(j) + this.f4001f);
                    this.f4000e = 0;
                    C0560k.m2547b();
                }
            }
        } finally {
            this.f4000e = 0;
            C0560k.m2547b();
        }
    }
}
