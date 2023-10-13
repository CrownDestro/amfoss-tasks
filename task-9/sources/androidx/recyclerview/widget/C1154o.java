package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.o */
class C1154o {

    /* renamed from: a */
    final C1156b f4046a;

    /* renamed from: b */
    C1155a f4047b = new C1155a();

    /* renamed from: androidx.recyclerview.widget.o$a */
    static class C1155a {

        /* renamed from: a */
        int f4048a = 0;

        /* renamed from: b */
        int f4049b;

        /* renamed from: c */
        int f4050c;

        /* renamed from: d */
        int f4051d;

        /* renamed from: e */
        int f4052e;

        C1155a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4746a(int i) {
            this.f4048a = i | this.f4048a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4747b() {
            int i = this.f4048a;
            if ((i & 7) != 0 && (i & (mo4748c(this.f4051d, this.f4049b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f4048a;
            if ((i2 & 112) != 0 && (i2 & (mo4748c(this.f4051d, this.f4050c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f4048a;
            if ((i3 & 1792) != 0 && (i3 & (mo4748c(this.f4052e, this.f4049b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f4048a;
            return (i4 & 28672) == 0 || (i4 & (mo4748c(this.f4052e, this.f4050c) << 12)) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo4748c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4749d() {
            this.f4048a = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4750e(int i, int i2, int i3, int i4) {
            this.f4049b = i;
            this.f4050c = i2;
            this.f4051d = i3;
            this.f4052e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$b */
    interface C1156b {
        /* renamed from: a */
        View mo4423a(int i);

        /* renamed from: b */
        int mo4424b();

        /* renamed from: c */
        int mo4425c();

        /* renamed from: d */
        int mo4426d(View view);

        /* renamed from: e */
        int mo4427e(View view);
    }

    C1154o(C1156b bVar) {
        this.f4046a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4744a(int i, int i2, int i3, int i4) {
        int c = this.f4046a.mo4425c();
        int b = this.f4046a.mo4424b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a = this.f4046a.mo4423a(i);
            this.f4047b.mo4750e(c, b, this.f4046a.mo4427e(a), this.f4046a.mo4426d(a));
            if (i3 != 0) {
                this.f4047b.mo4749d();
                this.f4047b.mo4746a(i3);
                if (this.f4047b.mo4747b()) {
                    return a;
                }
            }
            if (i4 != 0) {
                this.f4047b.mo4749d();
                this.f4047b.mo4746a(i4);
                if (this.f4047b.mo4747b()) {
                    view = a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4745b(View view, int i) {
        this.f4047b.mo4750e(this.f4046a.mo4425c(), this.f4046a.mo4424b(), this.f4046a.mo4427e(view), this.f4046a.mo4426d(view));
        if (i == 0) {
            return false;
        }
        this.f4047b.mo4749d();
        this.f4047b.mo4746a(i);
        return this.f4047b.mo4747b();
    }
}
