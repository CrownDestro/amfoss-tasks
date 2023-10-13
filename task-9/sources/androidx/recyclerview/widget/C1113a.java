package androidx.recyclerview.widget;

import androidx.core.util.C0609e;
import androidx.core.util.C0610f;
import androidx.recyclerview.widget.C1141h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.a */
class C1113a implements C1141h.C1142a {

    /* renamed from: a */
    private C0609e<C1115b> f3893a;

    /* renamed from: b */
    final ArrayList<C1115b> f3894b;

    /* renamed from: c */
    final ArrayList<C1115b> f3895c;

    /* renamed from: d */
    final C1114a f3896d;

    /* renamed from: e */
    Runnable f3897e;

    /* renamed from: f */
    final boolean f3898f;

    /* renamed from: g */
    final C1141h f3899g;

    /* renamed from: h */
    private int f3900h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    interface C1114a {
        /* renamed from: a */
        void mo4263a(int i, int i2);

        /* renamed from: b */
        void mo4264b(C1115b bVar);

        /* renamed from: c */
        RecyclerView.C1070d0 mo4265c(int i);

        /* renamed from: d */
        void mo4266d(int i, int i2);

        /* renamed from: e */
        void mo4267e(int i, int i2);

        /* renamed from: f */
        void mo4268f(C1115b bVar);

        /* renamed from: g */
        void mo4269g(int i, int i2);

        /* renamed from: h */
        void mo4270h(int i, int i2, Object obj);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    static class C1115b {

        /* renamed from: a */
        int f3901a;

        /* renamed from: b */
        int f3902b;

        /* renamed from: c */
        Object f3903c;

        /* renamed from: d */
        int f3904d;

        C1115b(int i, int i2, int i3, Object obj) {
            this.f3901a = i;
            this.f3902b = i2;
            this.f3904d = i3;
            this.f3903c = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo4607a() {
            int i = this.f3901a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1115b bVar = (C1115b) obj;
            int i = this.f3901a;
            if (i != bVar.f3901a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f3904d - this.f3902b) == 1 && this.f3904d == bVar.f3902b && this.f3902b == bVar.f3904d) {
                return true;
            }
            if (this.f3904d != bVar.f3904d || this.f3902b != bVar.f3902b) {
                return false;
            }
            Object obj2 = this.f3903c;
            Object obj3 = bVar.f3903c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3901a * 31) + this.f3902b) * 31) + this.f3904d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo4607a() + ",s:" + this.f3902b + "c:" + this.f3904d + ",p:" + this.f3903c + "]";
        }
    }

    C1113a(C1114a aVar) {
        this(aVar, false);
    }

    C1113a(C1114a aVar, boolean z) {
        this.f3893a = new C0610f(30);
        this.f3894b = new ArrayList<>();
        this.f3895c = new ArrayList<>();
        this.f3900h = 0;
        this.f3896d = aVar;
        this.f3898f = z;
        this.f3899g = new C1141h(this);
    }

    /* renamed from: c */
    private void m5466c(C1115b bVar) {
        m5472r(bVar);
    }

    /* renamed from: d */
    private void m5467d(C1115b bVar) {
        m5472r(bVar);
    }

    /* renamed from: f */
    private void m5468f(C1115b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f3902b;
        int i2 = bVar.f3904d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f3896d.mo4265c(i3) != null || m5470h(i3)) {
                if (c2 == 0) {
                    m5471k(mo4594b(2, i, i4, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m5472r(mo4594b(2, i, i4, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f3904d) {
            mo4593a(bVar);
            bVar = mo4594b(2, i, i4, (Object) null);
        }
        if (c2 == 0) {
            m5471k(bVar);
        } else {
            m5472r(bVar);
        }
    }

    /* renamed from: g */
    private void m5469g(C1115b bVar) {
        int i = bVar.f3902b;
        int i2 = bVar.f3904d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f3896d.mo4265c(i) != null || m5470h(i)) {
                if (c == 0) {
                    m5471k(mo4594b(4, i3, i4, bVar.f3903c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m5472r(mo4594b(4, i3, i4, bVar.f3903c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f3904d) {
            Object obj = bVar.f3903c;
            mo4593a(bVar);
            bVar = mo4594b(4, i3, i4, obj);
        }
        if (c == 0) {
            m5471k(bVar);
        } else {
            m5472r(bVar);
        }
    }

    /* renamed from: h */
    private boolean m5470h(int i) {
        int size = this.f3895c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1115b bVar = this.f3895c.get(i2);
            int i3 = bVar.f3901a;
            if (i3 == 8) {
                if (mo4600n(bVar.f3904d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f3902b;
                int i5 = bVar.f3904d + i4;
                while (i4 < i5) {
                    if (mo4600n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m5471k(C1115b bVar) {
        int i;
        int i2 = bVar.f3901a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int v = m5473v(bVar.f3902b, i2);
        int i3 = bVar.f3902b;
        int i4 = bVar.f3901a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f3904d; i6++) {
            int v2 = m5473v(bVar.f3902b + (i * i6), bVar.f3901a);
            int i7 = bVar.f3901a;
            if (i7 == 2 ? v2 == v : i7 == 4 && v2 == v + 1) {
                i5++;
            } else {
                C1115b b = mo4594b(i7, v, i5, bVar.f3903c);
                mo4598l(b, i3);
                mo4593a(b);
                if (bVar.f3901a == 4) {
                    i3 += i5;
                }
                v = v2;
                i5 = 1;
            }
        }
        Object obj = bVar.f3903c;
        mo4593a(bVar);
        if (i5 > 0) {
            C1115b b2 = mo4594b(bVar.f3901a, v, i5, obj);
            mo4598l(b2, i3);
            mo4593a(b2);
        }
    }

    /* renamed from: r */
    private void m5472r(C1115b bVar) {
        this.f3895c.add(bVar);
        int i = bVar.f3901a;
        if (i == 1) {
            this.f3896d.mo4269g(bVar.f3902b, bVar.f3904d);
        } else if (i == 2) {
            this.f3896d.mo4267e(bVar.f3902b, bVar.f3904d);
        } else if (i == 4) {
            this.f3896d.mo4270h(bVar.f3902b, bVar.f3904d, bVar.f3903c);
        } else if (i == 8) {
            this.f3896d.mo4263a(bVar.f3902b, bVar.f3904d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: v */
    private int m5473v(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f3895c.size() - 1; size >= 0; size--) {
            C1115b bVar = this.f3895c.get(size);
            int i9 = bVar.f3901a;
            if (i9 == 8) {
                int i10 = bVar.f3902b;
                int i11 = bVar.f3904d;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.f3902b = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            bVar.f3902b = i10 - 1;
                            i6 = i11 - 1;
                        }
                        bVar.f3904d = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    bVar.f3904d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    bVar.f3902b = i7;
                    i--;
                }
            } else {
                int i12 = bVar.f3902b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.f3902b = i3;
                } else if (i9 == 1) {
                    i -= bVar.f3904d;
                } else if (i9 == 2) {
                    i += bVar.f3904d;
                }
            }
        }
        for (int size2 = this.f3895c.size() - 1; size2 >= 0; size2--) {
            C1115b bVar2 = this.f3895c.get(size2);
            if (bVar2.f3901a == 8) {
                int i13 = bVar2.f3904d;
                if (i13 != bVar2.f3902b && i13 >= 0) {
                }
            } else if (bVar2.f3904d > 0) {
            }
            this.f3895c.remove(size2);
            mo4593a(bVar2);
        }
        return i;
    }

    /* renamed from: a */
    public void mo4593a(C1115b bVar) {
        if (!this.f3898f) {
            bVar.f3903c = null;
            this.f3893a.mo2663a(bVar);
        }
    }

    /* renamed from: b */
    public C1115b mo4594b(int i, int i2, int i3, Object obj) {
        C1115b b = this.f3893a.mo2664b();
        if (b == null) {
            return new C1115b(i, i2, i3, obj);
        }
        b.f3901a = i;
        b.f3902b = i2;
        b.f3904d = i3;
        b.f3903c = obj;
        return b;
    }

    /* renamed from: e */
    public int mo4595e(int i) {
        int size = this.f3894b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1115b bVar = this.f3894b.get(i2);
            int i3 = bVar.f3901a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f3902b;
                    if (i4 <= i) {
                        int i5 = bVar.f3904d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f3902b;
                    if (i6 == i) {
                        i = bVar.f3904d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f3904d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f3902b <= i) {
                i += bVar.f3904d;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo4596i() {
        int size = this.f3895c.size();
        for (int i = 0; i < size; i++) {
            this.f3896d.mo4264b(this.f3895c.get(i));
        }
        mo4605t(this.f3895c);
        this.f3900h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4597j() {
        mo4596i();
        int size = this.f3894b.size();
        for (int i = 0; i < size; i++) {
            C1115b bVar = this.f3894b.get(i);
            int i2 = bVar.f3901a;
            if (i2 == 1) {
                this.f3896d.mo4264b(bVar);
                this.f3896d.mo4269g(bVar.f3902b, bVar.f3904d);
            } else if (i2 == 2) {
                this.f3896d.mo4264b(bVar);
                this.f3896d.mo4266d(bVar.f3902b, bVar.f3904d);
            } else if (i2 == 4) {
                this.f3896d.mo4264b(bVar);
                this.f3896d.mo4270h(bVar.f3902b, bVar.f3904d, bVar.f3903c);
            } else if (i2 == 8) {
                this.f3896d.mo4264b(bVar);
                this.f3896d.mo4263a(bVar.f3902b, bVar.f3904d);
            }
            Runnable runnable = this.f3897e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo4605t(this.f3894b);
        this.f3900h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4598l(C1115b bVar, int i) {
        this.f3896d.mo4268f(bVar);
        int i2 = bVar.f3901a;
        if (i2 == 2) {
            this.f3896d.mo4266d(i, bVar.f3904d);
        } else if (i2 == 4) {
            this.f3896d.mo4270h(i, bVar.f3904d, bVar.f3903c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo4599m(int i) {
        return mo4600n(i, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo4600n(int i, int i2) {
        int size = this.f3895c.size();
        while (i2 < size) {
            C1115b bVar = this.f3895c.get(i2);
            int i3 = bVar.f3901a;
            if (i3 == 8) {
                int i4 = bVar.f3902b;
                if (i4 == i) {
                    i = bVar.f3904d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f3904d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f3902b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f3904d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f3904d;
                }
            }
            i2++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo4601o(int i) {
        return (i & this.f3900h) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo4602p() {
        return this.f3894b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo4603q() {
        return !this.f3895c.isEmpty() && !this.f3894b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4604s() {
        this.f3899g.mo4698b(this.f3894b);
        int size = this.f3894b.size();
        for (int i = 0; i < size; i++) {
            C1115b bVar = this.f3894b.get(i);
            int i2 = bVar.f3901a;
            if (i2 == 1) {
                m5466c(bVar);
            } else if (i2 == 2) {
                m5468f(bVar);
            } else if (i2 == 4) {
                m5469g(bVar);
            } else if (i2 == 8) {
                m5467d(bVar);
            }
            Runnable runnable = this.f3897e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3894b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4605t(List<C1115b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo4593a(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo4606u() {
        mo4605t(this.f3894b);
        mo4605t(this.f3895c);
        this.f3900h = 0;
    }
}
