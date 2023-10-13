package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.b */
class C1116b {

    /* renamed from: a */
    final C1118b f3905a;

    /* renamed from: b */
    final C1117a f3906b = new C1117a();

    /* renamed from: c */
    final List<View> f3907c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.b$a */
    static class C1117a {

        /* renamed from: a */
        long f3908a = 0;

        /* renamed from: b */
        C1117a f3909b;

        C1117a() {
        }

        /* renamed from: c */
        private void m5517c() {
            if (this.f3909b == null) {
                this.f3909b = new C1117a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4629a(int i) {
            if (i >= 64) {
                C1117a aVar = this.f3909b;
                if (aVar != null) {
                    aVar.mo4629a(i - 64);
                    return;
                }
                return;
            }
            this.f3908a &= (1 << i) ^ -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4630b(int i) {
            C1117a aVar = this.f3909b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f3908a) : Long.bitCount(this.f3908a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f3908a & ((1 << i) - 1)) : aVar.mo4630b(i - 64) + Long.bitCount(this.f3908a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4631d(int i) {
            if (i < 64) {
                return (this.f3908a & (1 << i)) != 0;
            }
            m5517c();
            return this.f3909b.mo4631d(i - 64);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4632e(int i, boolean z) {
            if (i >= 64) {
                m5517c();
                this.f3909b.mo4632e(i - 64, z);
                return;
            }
            long j = this.f3908a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f3908a = ((j & (j2 ^ -1)) << 1) | (j & j2);
            if (z) {
                mo4635h(i);
            } else {
                mo4629a(i);
            }
            if (z2 || this.f3909b != null) {
                m5517c();
                this.f3909b.mo4632e(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo4633f(int i) {
            if (i >= 64) {
                m5517c();
                return this.f3909b.mo4633f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f3908a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (j ^ -1);
            this.f3908a = j3;
            long j4 = j - 1;
            this.f3908a = (j3 & j4) | Long.rotateRight((j4 ^ -1) & j3, 1);
            C1117a aVar = this.f3909b;
            if (aVar != null) {
                if (aVar.mo4631d(0)) {
                    mo4635h(63);
                }
                this.f3909b.mo4633f(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4634g() {
            this.f3908a = 0;
            C1117a aVar = this.f3909b;
            if (aVar != null) {
                aVar.mo4634g();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4635h(int i) {
            if (i >= 64) {
                m5517c();
                this.f3909b.mo4635h(i - 64);
                return;
            }
            this.f3908a |= 1 << i;
        }

        public String toString() {
            if (this.f3909b == null) {
                return Long.toBinaryString(this.f3908a);
            }
            return this.f3909b.toString() + "xx" + Long.toBinaryString(this.f3908a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    interface C1118b {
        /* renamed from: a */
        View mo4252a(int i);

        /* renamed from: b */
        void mo4253b(View view);

        /* renamed from: c */
        void mo4254c(int i);

        /* renamed from: d */
        void mo4255d();

        /* renamed from: e */
        RecyclerView.C1070d0 mo4256e(View view);

        /* renamed from: f */
        void mo4257f(int i);

        /* renamed from: g */
        void mo4258g(View view);

        /* renamed from: h */
        void mo4259h(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: i */
        void mo4260i(View view, int i);

        /* renamed from: j */
        int mo4261j(View view);

        /* renamed from: k */
        int mo4262k();
    }

    C1116b(C1118b bVar) {
        this.f3905a = bVar;
    }

    /* renamed from: h */
    private int m5497h(int i) {
        if (i < 0) {
            return -1;
        }
        int k = this.f3905a.mo4262k();
        int i2 = i;
        while (i2 < k) {
            int b = i - (i2 - this.f3906b.mo4630b(i2));
            if (b == 0) {
                while (this.f3906b.mo4631d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m5498l(View view) {
        this.f3907c.add(view);
        this.f3905a.mo4253b(view);
    }

    /* renamed from: t */
    private boolean m5499t(View view) {
        if (!this.f3907c.remove(view)) {
            return false;
        }
        this.f3905a.mo4258g(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4611a(View view, int i, boolean z) {
        int k = i < 0 ? this.f3905a.mo4262k() : m5497h(i);
        this.f3906b.mo4632e(k, z);
        if (z) {
            m5498l(view);
        }
        this.f3905a.mo4260i(view, k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4612b(View view, boolean z) {
        mo4611a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4613c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int k = i < 0 ? this.f3905a.mo4262k() : m5497h(i);
        this.f3906b.mo4632e(k, z);
        if (z) {
            m5498l(view);
        }
        this.f3905a.mo4259h(view, k, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4614d(int i) {
        int h = m5497h(i);
        this.f3906b.mo4633f(h);
        this.f3905a.mo4257f(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View mo4615e(int i) {
        int size = this.f3907c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f3907c.get(i2);
            RecyclerView.C1070d0 e = this.f3905a.mo4256e(view);
            if (e.mo4237m() == i && !e.mo4244t() && !e.mo4247v()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public View mo4616f(int i) {
        return this.f3905a.mo4252a(m5497h(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo4617g() {
        return this.f3905a.mo4262k() - this.f3907c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public View mo4618i(int i) {
        return this.f3905a.mo4252a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo4619j() {
        return this.f3905a.mo4262k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4620k(View view) {
        int j = this.f3905a.mo4261j(view);
        if (j >= 0) {
            this.f3906b.mo4635h(j);
            m5498l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo4621m(View view) {
        int j = this.f3905a.mo4261j(view);
        if (j != -1 && !this.f3906b.mo4631d(j)) {
            return j - this.f3906b.mo4630b(j);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo4622n(View view) {
        return this.f3907c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4623o() {
        this.f3906b.mo4634g();
        for (int size = this.f3907c.size() - 1; size >= 0; size--) {
            this.f3905a.mo4258g(this.f3907c.get(size));
            this.f3907c.remove(size);
        }
        this.f3905a.mo4255d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4624p(View view) {
        int j = this.f3905a.mo4261j(view);
        if (j >= 0) {
            if (this.f3906b.mo4633f(j)) {
                m5499t(view);
            }
            this.f3905a.mo4254c(j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4625q(int i) {
        int h = m5497h(i);
        View a = this.f3905a.mo4252a(h);
        if (a != null) {
            if (this.f3906b.mo4633f(h)) {
                m5499t(a);
            }
            this.f3905a.mo4254c(h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo4626r(View view) {
        int j = this.f3905a.mo4261j(view);
        if (j == -1) {
            m5499t(view);
            return true;
        } else if (!this.f3906b.mo4631d(j)) {
            return false;
        } else {
            this.f3906b.mo4633f(j);
            m5499t(view);
            this.f3905a.mo4254c(j);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4627s(View view) {
        int j = this.f3905a.mo4261j(view);
        if (j < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f3906b.mo4631d(j)) {
            this.f3906b.mo4629a(j);
            m5499t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f3906b.toString() + ", hidden list:" + this.f3907c.size();
    }
}
