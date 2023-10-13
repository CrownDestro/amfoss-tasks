package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.C0624d;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.C1084o implements RecyclerView.C1101z.C1103b {

    /* renamed from: A */
    boolean f3837A = false;

    /* renamed from: B */
    private BitSet f3838B;

    /* renamed from: C */
    int f3839C = -1;

    /* renamed from: D */
    int f3840D = Integer.MIN_VALUE;

    /* renamed from: E */
    C1107d f3841E = new C1107d();

    /* renamed from: F */
    private int f3842F = 2;

    /* renamed from: G */
    private boolean f3843G;

    /* renamed from: H */
    private boolean f3844H;

    /* renamed from: I */
    private C1110e f3845I;

    /* renamed from: J */
    private int f3846J;

    /* renamed from: K */
    private final Rect f3847K = new Rect();

    /* renamed from: L */
    private final C1105b f3848L = new C1105b();

    /* renamed from: M */
    private boolean f3849M = false;

    /* renamed from: N */
    private boolean f3850N = true;

    /* renamed from: O */
    private int[] f3851O;

    /* renamed from: P */
    private final Runnable f3852P = new C1104a();

    /* renamed from: s */
    private int f3853s = -1;

    /* renamed from: t */
    C1112f[] f3854t;

    /* renamed from: u */
    C1143i f3855u;

    /* renamed from: v */
    C1143i f3856v;

    /* renamed from: w */
    private int f3857w;

    /* renamed from: x */
    private int f3858x;

    /* renamed from: y */
    private final C1139f f3859y;

    /* renamed from: z */
    boolean f3860z = false;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class C1104a implements Runnable {
        C1104a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo4527V1();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C1105b {

        /* renamed from: a */
        int f3862a;

        /* renamed from: b */
        int f3863b;

        /* renamed from: c */
        boolean f3864c;

        /* renamed from: d */
        boolean f3865d;

        /* renamed from: e */
        boolean f3866e;

        /* renamed from: f */
        int[] f3867f;

        C1105b() {
            mo4539c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4537a() {
            this.f3863b = this.f3864c ? StaggeredGridLayoutManager.this.f3855u.mo4706i() : StaggeredGridLayoutManager.this.f3855u.mo4710m();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4538b(int i) {
            this.f3863b = this.f3864c ? StaggeredGridLayoutManager.this.f3855u.mo4706i() - i : StaggeredGridLayoutManager.this.f3855u.mo4710m() + i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4539c() {
            this.f3862a = -1;
            this.f3863b = Integer.MIN_VALUE;
            this.f3864c = false;
            this.f3865d = false;
            this.f3866e = false;
            int[] iArr = this.f3867f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4540d(C1112f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f3867f;
            if (iArr == null || iArr.length < length) {
                this.f3867f = new int[StaggeredGridLayoutManager.this.f3854t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f3867f[i] = fVarArr[i].mo4586p(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C1106c extends RecyclerView.C1089p {

        /* renamed from: e */
        C1112f f3869e;

        /* renamed from: f */
        boolean f3870f;

        public C1106c(int i, int i2) {
            super(i, i2);
        }

        public C1106c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1106c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1106c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: e */
        public final int mo4541e() {
            C1112f fVar = this.f3869e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f3891e;
        }

        /* renamed from: f */
        public boolean mo4542f() {
            return this.f3870f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    static class C1107d {

        /* renamed from: a */
        int[] f3871a;

        /* renamed from: b */
        List<C1108a> f3872b;

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        static class C1108a implements Parcelable {
            public static final Parcelable.Creator<C1108a> CREATOR = new C1109a();

            /* renamed from: d */
            int f3873d;

            /* renamed from: e */
            int f3874e;

            /* renamed from: f */
            int[] f3875f;

            /* renamed from: g */
            boolean f3876g;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            static class C1109a implements Parcelable.Creator<C1108a> {
                C1109a() {
                }

                /* renamed from: a */
                public C1108a createFromParcel(Parcel parcel) {
                    return new C1108a(parcel);
                }

                /* renamed from: b */
                public C1108a[] newArray(int i) {
                    return new C1108a[i];
                }
            }

            C1108a() {
            }

            C1108a(Parcel parcel) {
                this.f3873d = parcel.readInt();
                this.f3874e = parcel.readInt();
                this.f3876g = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f3875f = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo4555a(int i) {
                int[] iArr = this.f3875f;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3873d + ", mGapDir=" + this.f3874e + ", mHasUnwantedGapAfter=" + this.f3876g + ", mGapPerSpan=" + Arrays.toString(this.f3875f) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f3873d);
                parcel.writeInt(this.f3874e);
                parcel.writeInt(this.f3876g ? 1 : 0);
                int[] iArr = this.f3875f;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f3875f);
            }
        }

        C1107d() {
        }

        /* renamed from: i */
        private int m5422i(int i) {
            if (this.f3872b == null) {
                return -1;
            }
            C1108a f = mo4548f(i);
            if (f != null) {
                this.f3872b.remove(f);
            }
            int size = this.f3872b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f3872b.get(i2).f3873d >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f3872b.remove(i2);
            return this.f3872b.get(i2).f3873d;
        }

        /* renamed from: l */
        private void m5423l(int i, int i2) {
            List<C1108a> list = this.f3872b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C1108a aVar = this.f3872b.get(size);
                    int i3 = aVar.f3873d;
                    if (i3 >= i) {
                        aVar.f3873d = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: m */
        private void m5424m(int i, int i2) {
            List<C1108a> list = this.f3872b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C1108a aVar = this.f3872b.get(size);
                    int i4 = aVar.f3873d;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f3872b.remove(size);
                        } else {
                            aVar.f3873d = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo4543a(C1108a aVar) {
            if (this.f3872b == null) {
                this.f3872b = new ArrayList();
            }
            int size = this.f3872b.size();
            for (int i = 0; i < size; i++) {
                C1108a aVar2 = this.f3872b.get(i);
                if (aVar2.f3873d == aVar.f3873d) {
                    this.f3872b.remove(i);
                }
                if (aVar2.f3873d >= aVar.f3873d) {
                    this.f3872b.add(i, aVar);
                    return;
                }
            }
            this.f3872b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4544b() {
            int[] iArr = this.f3871a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3872b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4545c(int i) {
            int[] iArr = this.f3871a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f3871a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[mo4554o(i)];
                this.f3871a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3871a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo4546d(int i) {
            List<C1108a> list = this.f3872b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f3872b.get(size).f3873d >= i) {
                        this.f3872b.remove(size);
                    }
                }
            }
            return mo4550h(i);
        }

        /* renamed from: e */
        public C1108a mo4547e(int i, int i2, int i3, boolean z) {
            List<C1108a> list = this.f3872b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C1108a aVar = this.f3872b.get(i4);
                int i5 = aVar.f3873d;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f3874e == i3 || (z && aVar.f3876g))) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: f */
        public C1108a mo4548f(int i) {
            List<C1108a> list = this.f3872b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C1108a aVar = this.f3872b.get(size);
                if (aVar.f3873d == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo4549g(int i) {
            int[] iArr = this.f3871a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo4550h(int i) {
            int[] iArr = this.f3871a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = m5422i(i);
            if (i2 == -1) {
                int[] iArr2 = this.f3871a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f3871a.length;
            }
            int i3 = i2 + 1;
            Arrays.fill(this.f3871a, i, i3, -1);
            return i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo4551j(int i, int i2) {
            int[] iArr = this.f3871a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo4545c(i3);
                int[] iArr2 = this.f3871a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f3871a, i, i3, -1);
                m5423l(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo4552k(int i, int i2) {
            int[] iArr = this.f3871a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo4545c(i3);
                int[] iArr2 = this.f3871a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f3871a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m5424m(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo4553n(int i, C1112f fVar) {
            mo4545c(i);
            this.f3871a[i] = fVar.f3891e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo4554o(int i) {
            int length = this.f3871a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C1110e implements Parcelable {
        public static final Parcelable.Creator<C1110e> CREATOR = new C1111a();

        /* renamed from: d */
        int f3877d;

        /* renamed from: e */
        int f3878e;

        /* renamed from: f */
        int f3879f;

        /* renamed from: g */
        int[] f3880g;

        /* renamed from: h */
        int f3881h;

        /* renamed from: i */
        int[] f3882i;

        /* renamed from: j */
        List<C1107d.C1108a> f3883j;

        /* renamed from: k */
        boolean f3884k;

        /* renamed from: l */
        boolean f3885l;

        /* renamed from: m */
        boolean f3886m;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        static class C1111a implements Parcelable.Creator<C1110e> {
            C1111a() {
            }

            /* renamed from: a */
            public C1110e createFromParcel(Parcel parcel) {
                return new C1110e(parcel);
            }

            /* renamed from: b */
            public C1110e[] newArray(int i) {
                return new C1110e[i];
            }
        }

        public C1110e() {
        }

        C1110e(Parcel parcel) {
            this.f3877d = parcel.readInt();
            this.f3878e = parcel.readInt();
            int readInt = parcel.readInt();
            this.f3879f = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3880g = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f3881h = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3882i = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f3884k = parcel.readInt() == 1;
            this.f3885l = parcel.readInt() == 1;
            this.f3886m = parcel.readInt() == 1 ? true : z;
            this.f3883j = parcel.readArrayList(C1107d.C1108a.class.getClassLoader());
        }

        public C1110e(C1110e eVar) {
            this.f3879f = eVar.f3879f;
            this.f3877d = eVar.f3877d;
            this.f3878e = eVar.f3878e;
            this.f3880g = eVar.f3880g;
            this.f3881h = eVar.f3881h;
            this.f3882i = eVar.f3882i;
            this.f3884k = eVar.f3884k;
            this.f3885l = eVar.f3885l;
            this.f3886m = eVar.f3886m;
            this.f3883j = eVar.f3883j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4563a() {
            this.f3880g = null;
            this.f3879f = 0;
            this.f3877d = -1;
            this.f3878e = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4564c() {
            this.f3880g = null;
            this.f3879f = 0;
            this.f3881h = 0;
            this.f3882i = null;
            this.f3883j = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3877d);
            parcel.writeInt(this.f3878e);
            parcel.writeInt(this.f3879f);
            if (this.f3879f > 0) {
                parcel.writeIntArray(this.f3880g);
            }
            parcel.writeInt(this.f3881h);
            if (this.f3881h > 0) {
                parcel.writeIntArray(this.f3882i);
            }
            parcel.writeInt(this.f3884k ? 1 : 0);
            parcel.writeInt(this.f3885l ? 1 : 0);
            parcel.writeInt(this.f3886m ? 1 : 0);
            parcel.writeList(this.f3883j);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    class C1112f {

        /* renamed from: a */
        ArrayList<View> f3887a = new ArrayList<>();

        /* renamed from: b */
        int f3888b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f3889c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f3890d = 0;

        /* renamed from: e */
        final int f3891e;

        C1112f(int i) {
            this.f3891e = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4571a(View view) {
            C1106c n = mo4584n(view);
            n.f3869e = this;
            this.f3887a.add(view);
            this.f3889c = Integer.MIN_VALUE;
            if (this.f3887a.size() == 1) {
                this.f3888b = Integer.MIN_VALUE;
            }
            if (n.mo4431c() || n.mo4430b()) {
                this.f3890d += StaggeredGridLayoutManager.this.f3855u.mo4702e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4572b(boolean z, int i) {
            int l = z ? mo4582l(Integer.MIN_VALUE) : mo4586p(Integer.MIN_VALUE);
            mo4575e();
            if (l != Integer.MIN_VALUE) {
                if (z && l < StaggeredGridLayoutManager.this.f3855u.mo4706i()) {
                    return;
                }
                if (z || l <= StaggeredGridLayoutManager.this.f3855u.mo4710m()) {
                    if (i != Integer.MIN_VALUE) {
                        l += i;
                    }
                    this.f3889c = l;
                    this.f3888b = l;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4573c() {
            C1107d.C1108a f;
            ArrayList<View> arrayList = this.f3887a;
            View view = arrayList.get(arrayList.size() - 1);
            C1106c n = mo4584n(view);
            this.f3889c = StaggeredGridLayoutManager.this.f3855u.mo4701d(view);
            if (n.f3870f && (f = StaggeredGridLayoutManager.this.f3841E.mo4548f(n.mo4429a())) != null && f.f3874e == 1) {
                this.f3889c += f.mo4555a(this.f3891e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4574d() {
            C1107d.C1108a f;
            View view = this.f3887a.get(0);
            C1106c n = mo4584n(view);
            this.f3888b = StaggeredGridLayoutManager.this.f3855u.mo4704g(view);
            if (n.f3870f && (f = StaggeredGridLayoutManager.this.f3841E.mo4548f(n.mo4429a())) != null && f.f3874e == -1) {
                this.f3888b -= f.mo4555a(this.f3891e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4575e() {
            this.f3887a.clear();
            mo4587q();
            this.f3890d = 0;
        }

        /* renamed from: f */
        public int mo4576f() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f3860z) {
                i2 = this.f3887a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f3887a.size();
            }
            return mo4579i(i2, i, true);
        }

        /* renamed from: g */
        public int mo4577g() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f3860z) {
                i2 = 0;
                i = this.f3887a.size();
            } else {
                i2 = this.f3887a.size() - 1;
                i = -1;
            }
            return mo4579i(i2, i, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo4578h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.f3855u.mo4710m();
            int i3 = StaggeredGridLayoutManager.this.f3855u.mo4706i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f3887a.get(i);
                int g = StaggeredGridLayoutManager.this.f3855u.mo4704g(view);
                int d = StaggeredGridLayoutManager.this.f3855u.mo4701d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g < i3 : g <= i3;
                if (!z3 ? d > m : d >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && g >= m && d <= i3) {
                        }
                    } else if (g >= m && d <= i3) {
                    }
                    return StaggeredGridLayoutManager.this.mo4396k0(view);
                }
                i += i4;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo4579i(int i, int i2, boolean z) {
            return mo4578h(i, i2, false, false, z);
        }

        /* renamed from: j */
        public int mo4580j() {
            return this.f3890d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public int mo4581k() {
            int i = this.f3889c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo4573c();
            return this.f3889c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public int mo4582l(int i) {
            int i2 = this.f3889c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3887a.size() == 0) {
                return i;
            }
            mo4573c();
            return this.f3889c;
        }

        /* renamed from: m */
        public View mo4583m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f3887a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3887a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3860z && staggeredGridLayoutManager.mo4396k0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3860z && staggeredGridLayoutManager2.mo4396k0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3887a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f3887a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3860z && staggeredGridLayoutManager3.mo4396k0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3860z && staggeredGridLayoutManager4.mo4396k0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C1106c mo4584n(View view) {
            return (C1106c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo4585o() {
            int i = this.f3888b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo4574d();
            return this.f3888b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public int mo4586p(int i) {
            int i2 = this.f3888b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3887a.size() == 0) {
                return i;
            }
            mo4574d();
            return this.f3888b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo4587q() {
            this.f3888b = Integer.MIN_VALUE;
            this.f3889c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo4588r(int i) {
            int i2 = this.f3888b;
            if (i2 != Integer.MIN_VALUE) {
                this.f3888b = i2 + i;
            }
            int i3 = this.f3889c;
            if (i3 != Integer.MIN_VALUE) {
                this.f3889c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo4589s() {
            int size = this.f3887a.size();
            View remove = this.f3887a.remove(size - 1);
            C1106c n = mo4584n(remove);
            n.f3869e = null;
            if (n.mo4431c() || n.mo4430b()) {
                this.f3890d -= StaggeredGridLayoutManager.this.f3855u.mo4702e(remove);
            }
            if (size == 1) {
                this.f3888b = Integer.MIN_VALUE;
            }
            this.f3889c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo4590t() {
            View remove = this.f3887a.remove(0);
            C1106c n = mo4584n(remove);
            n.f3869e = null;
            if (this.f3887a.size() == 0) {
                this.f3889c = Integer.MIN_VALUE;
            }
            if (n.mo4431c() || n.mo4430b()) {
                this.f3890d -= StaggeredGridLayoutManager.this.f3855u.mo4702e(remove);
            }
            this.f3888b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo4591u(View view) {
            C1106c n = mo4584n(view);
            n.f3869e = this;
            this.f3887a.add(0, view);
            this.f3888b = Integer.MIN_VALUE;
            if (this.f3887a.size() == 1) {
                this.f3889c = Integer.MIN_VALUE;
            }
            if (n.mo4431c() || n.mo4430b()) {
                this.f3890d += StaggeredGridLayoutManager.this.f3855u.mo4702e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4592v(int i) {
            this.f3888b = i;
            this.f3889c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C1084o.C1088d l0 = RecyclerView.C1084o.m5074l0(context, attributeSet, i, i2);
        mo4519K2(l0.f3798a);
        mo4521M2(l0.f3799b);
        mo4520L2(l0.f3800c);
        this.f3859y = new C1139f();
        m5342d2();
    }

    /* renamed from: A2 */
    private boolean m5318A2(int i) {
        if (this.f3857w == 0) {
            return (i == -1) != this.f3837A;
        }
        return ((i == -1) == this.f3837A) == mo4535w2();
    }

    /* renamed from: C2 */
    private void m5319C2(View view) {
        for (int i = this.f3853s - 1; i >= 0; i--) {
            this.f3854t[i].mo4591u(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.f4016e == -1) goto L_0x0012;
     */
    /* renamed from: D2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5320D2(androidx.recyclerview.widget.RecyclerView.C1096v r3, androidx.recyclerview.widget.C1139f r4) {
        /*
            r2 = this;
            boolean r0 = r4.f4012a
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.f4020i
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.f4013b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f4016e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f4018g
        L_0x0014:
            r2.m5321E2(r3, r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.f4017f
        L_0x001a:
            r2.m5322F2(r3, r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.f4016e
            if (r0 != r1) goto L_0x0037
            int r0 = r4.f4017f
            int r1 = r2.m5349p2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.f4018g
            int r4 = r4.f4013b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.f4018g
            int r0 = r2.m5350q2(r0)
            int r1 = r4.f4018g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.f4017f
            int r4 = r4.f4013b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5320D2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.f):void");
    }

    /* renamed from: E2 */
    private void m5321E2(RecyclerView.C1096v vVar, int i) {
        int K = mo4350K() - 1;
        while (K >= 0) {
            View J = mo4348J(K);
            if (this.f3855u.mo4704g(J) >= i && this.f3855u.mo4714q(J) >= i) {
                C1106c cVar = (C1106c) J.getLayoutParams();
                if (cVar.f3870f) {
                    int i2 = 0;
                    while (i2 < this.f3853s) {
                        if (this.f3854t[i2].f3887a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f3853s; i3++) {
                        this.f3854t[i3].mo4589s();
                    }
                } else if (cVar.f3869e.f3887a.size() != 1) {
                    cVar.f3869e.mo4589s();
                } else {
                    return;
                }
                mo4405p1(J, vVar);
                K--;
            } else {
                return;
            }
        }
    }

    /* renamed from: F2 */
    private void m5322F2(RecyclerView.C1096v vVar, int i) {
        while (mo4350K() > 0) {
            View J = mo4348J(0);
            if (this.f3855u.mo4701d(J) <= i && this.f3855u.mo4713p(J) <= i) {
                C1106c cVar = (C1106c) J.getLayoutParams();
                if (cVar.f3870f) {
                    int i2 = 0;
                    while (i2 < this.f3853s) {
                        if (this.f3854t[i2].f3887a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f3853s; i3++) {
                        this.f3854t[i3].mo4590t();
                    }
                } else if (cVar.f3869e.f3887a.size() != 1) {
                    cVar.f3869e.mo4590t();
                } else {
                    return;
                }
                mo4405p1(J, vVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: G2 */
    private void m5323G2() {
        if (this.f3856v.mo4708k() != 1073741824) {
            float f = 0.0f;
            int K = mo4350K();
            for (int i = 0; i < K; i++) {
                View J = mo4348J(i);
                float e = (float) this.f3856v.mo4702e(J);
                if (e >= f) {
                    if (((C1106c) J.getLayoutParams()).mo4542f()) {
                        e = (e * 1.0f) / ((float) this.f3853s);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f3858x;
            int round = Math.round(f * ((float) this.f3853s));
            if (this.f3856v.mo4708k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f3856v.mo4711n());
            }
            mo4526S2(round);
            if (this.f3858x != i2) {
                for (int i3 = 0; i3 < K; i3++) {
                    View J2 = mo4348J(i3);
                    C1106c cVar = (C1106c) J2.getLayoutParams();
                    if (!cVar.f3870f) {
                        if (!mo4535w2() || this.f3857w != 1) {
                            int i4 = cVar.f3869e.f3891e;
                            int i5 = this.f3857w;
                            int i6 = (this.f3858x * i4) - (i4 * i2);
                            if (i5 == 1) {
                                J2.offsetLeftAndRight(i6);
                            } else {
                                J2.offsetTopAndBottom(i6);
                            }
                        } else {
                            int i7 = this.f3853s;
                            int i8 = cVar.f3869e.f3891e;
                            J2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f3858x) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: H2 */
    private void m5324H2() {
        this.f3837A = (this.f3857w == 1 || !mo4535w2()) ? this.f3860z : !this.f3860z;
    }

    /* renamed from: J2 */
    private void m5325J2(int i) {
        C1139f fVar = this.f3859y;
        fVar.f4016e = i;
        int i2 = 1;
        if (this.f3837A != (i == -1)) {
            i2 = -1;
        }
        fVar.f4015d = i2;
    }

    /* renamed from: N2 */
    private void m5326N2(int i, int i2) {
        for (int i3 = 0; i3 < this.f3853s; i3++) {
            if (!this.f3854t[i3].f3887a.isEmpty()) {
                m5332T2(this.f3854t[i3], i, i2);
            }
        }
    }

    /* renamed from: O2 */
    private boolean m5327O2(RecyclerView.C1064a0 a0Var, C1105b bVar) {
        boolean z = this.f3843G;
        int b = a0Var.mo4196b();
        bVar.f3862a = z ? m5345j2(b) : m5344f2(b);
        bVar.f3863b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: P1 */
    private void m5328P1(View view) {
        for (int i = this.f3853s - 1; i >= 0; i--) {
            this.f3854t[i].mo4571a(view);
        }
    }

    /* renamed from: Q1 */
    private void m5329Q1(C1105b bVar) {
        boolean z;
        C1110e eVar = this.f3845I;
        int i = eVar.f3879f;
        if (i > 0) {
            if (i == this.f3853s) {
                for (int i2 = 0; i2 < this.f3853s; i2++) {
                    this.f3854t[i2].mo4575e();
                    C1110e eVar2 = this.f3845I;
                    int i3 = eVar2.f3880g[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += eVar2.f3885l ? this.f3855u.mo4706i() : this.f3855u.mo4710m();
                    }
                    this.f3854t[i2].mo4592v(i3);
                }
            } else {
                eVar.mo4564c();
                C1110e eVar3 = this.f3845I;
                eVar3.f3877d = eVar3.f3878e;
            }
        }
        C1110e eVar4 = this.f3845I;
        this.f3844H = eVar4.f3886m;
        mo4520L2(eVar4.f3884k);
        m5324H2();
        C1110e eVar5 = this.f3845I;
        int i4 = eVar5.f3877d;
        if (i4 != -1) {
            this.f3839C = i4;
            z = eVar5.f3885l;
        } else {
            z = this.f3837A;
        }
        bVar.f3864c = z;
        if (eVar5.f3881h > 1) {
            C1107d dVar = this.f3841E;
            dVar.f3871a = eVar5.f3882i;
            dVar.f3872b = eVar5.f3883j;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: R2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5330R2(int r5, androidx.recyclerview.widget.RecyclerView.C1064a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.f3859y
            r1 = 0
            r0.f4013b = r1
            r0.f4014c = r5
            boolean r0 = r4.mo4329A0()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.mo4197c()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f3837A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.i r5 = r4.f3855u
            int r5 = r5.mo4711n()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.i r5 = r4.f3855u
            int r5 = r5.mo4711n()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.mo4354N()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.f r0 = r4.f3859y
            androidx.recyclerview.widget.i r3 = r4.f3855u
            int r3 = r3.mo4710m()
            int r3 = r3 - r6
            r0.f4017f = r3
            androidx.recyclerview.widget.f r6 = r4.f3859y
            androidx.recyclerview.widget.i r0 = r4.f3855u
            int r0 = r0.mo4706i()
            int r0 = r0 + r5
            r6.f4018g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.f r0 = r4.f3859y
            androidx.recyclerview.widget.i r3 = r4.f3855u
            int r3 = r3.mo4705h()
            int r3 = r3 + r5
            r0.f4018g = r3
            androidx.recyclerview.widget.f r5 = r4.f3859y
            int r6 = -r6
            r5.f4017f = r6
        L_0x005d:
            androidx.recyclerview.widget.f r5 = r4.f3859y
            r5.f4019h = r1
            r5.f4012a = r2
            androidx.recyclerview.widget.i r6 = r4.f3855u
            int r6 = r6.mo4708k()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.i r6 = r4.f3855u
            int r6 = r6.mo4705h()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f4020i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5330R2(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    /* renamed from: T1 */
    private void m5331T1(View view, C1106c cVar, C1139f fVar) {
        if (fVar.f4016e == 1) {
            if (cVar.f3870f) {
                m5328P1(view);
            } else {
                cVar.f3869e.mo4571a(view);
            }
        } else if (cVar.f3870f) {
            m5319C2(view);
        } else {
            cVar.f3869e.mo4591u(view);
        }
    }

    /* renamed from: T2 */
    private void m5332T2(C1112f fVar, int i, int i2) {
        int j = fVar.mo4580j();
        if (i == -1) {
            if (fVar.mo4585o() + j > i2) {
                return;
            }
        } else if (fVar.mo4581k() - j < i2) {
            return;
        }
        this.f3838B.set(fVar.f3891e, false);
    }

    /* renamed from: U1 */
    private int m5333U1(int i) {
        if (mo4350K() == 0) {
            return this.f3837A ? 1 : -1;
        }
        return (i < mo4531m2()) != this.f3837A ? -1 : 1;
    }

    /* renamed from: U2 */
    private int m5334U2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: W1 */
    private boolean m5335W1(C1112f fVar) {
        if (this.f3837A) {
            if (fVar.mo4581k() < this.f3855u.mo4706i()) {
                ArrayList<View> arrayList = fVar.f3887a;
                return !fVar.mo4584n(arrayList.get(arrayList.size() - 1)).f3870f;
            }
        } else if (fVar.mo4585o() > this.f3855u.mo4710m()) {
            return !fVar.mo4584n(fVar.f3887a.get(0)).f3870f;
        }
        return false;
    }

    /* renamed from: X1 */
    private int m5336X1(RecyclerView.C1064a0 a0Var) {
        if (mo4350K() == 0) {
            return 0;
        }
        return C1150l.m5699a(a0Var, this.f3855u, mo4529h2(!this.f3850N), mo4528g2(!this.f3850N), this, this.f3850N);
    }

    /* renamed from: Y1 */
    private int m5337Y1(RecyclerView.C1064a0 a0Var) {
        if (mo4350K() == 0) {
            return 0;
        }
        return C1150l.m5700b(a0Var, this.f3855u, mo4529h2(!this.f3850N), mo4528g2(!this.f3850N), this, this.f3850N, this.f3837A);
    }

    /* renamed from: Z1 */
    private int m5338Z1(RecyclerView.C1064a0 a0Var) {
        if (mo4350K() == 0) {
            return 0;
        }
        return C1150l.m5701c(a0Var, this.f3855u, mo4529h2(!this.f3850N), mo4528g2(!this.f3850N), this, this.f3850N);
    }

    /* renamed from: a2 */
    private int m5339a2(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f3857w == 1) ? 1 : Integer.MIN_VALUE : this.f3857w == 0 ? 1 : Integer.MIN_VALUE : this.f3857w == 1 ? -1 : Integer.MIN_VALUE : this.f3857w == 0 ? -1 : Integer.MIN_VALUE : (this.f3857w != 1 && mo4535w2()) ? -1 : 1 : (this.f3857w != 1 && mo4535w2()) ? 1 : -1;
    }

    /* renamed from: b2 */
    private C1107d.C1108a m5340b2(int i) {
        C1107d.C1108a aVar = new C1107d.C1108a();
        aVar.f3875f = new int[this.f3853s];
        for (int i2 = 0; i2 < this.f3853s; i2++) {
            aVar.f3875f[i2] = i - this.f3854t[i2].mo4582l(i);
        }
        return aVar;
    }

    /* renamed from: c2 */
    private C1107d.C1108a m5341c2(int i) {
        C1107d.C1108a aVar = new C1107d.C1108a();
        aVar.f3875f = new int[this.f3853s];
        for (int i2 = 0; i2 < this.f3853s; i2++) {
            aVar.f3875f[i2] = this.f3854t[i2].mo4586p(i) - i;
        }
        return aVar;
    }

    /* renamed from: d2 */
    private void m5342d2() {
        this.f3855u = C1143i.m5623b(this, this.f3857w);
        this.f3856v = C1143i.m5623b(this, 1 - this.f3857w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* renamed from: e2 */
    private int m5343e2(RecyclerView.C1096v vVar, C1139f fVar, RecyclerView.C1064a0 a0Var) {
        int i;
        C1112f fVar2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        RecyclerView.C1096v vVar2 = vVar;
        C1139f fVar3 = fVar;
        ? r9 = 0;
        this.f3838B.set(0, this.f3853s, true);
        if (this.f3859y.f4020i) {
            i = fVar3.f4016e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = fVar3.f4016e == 1 ? fVar3.f4018g + fVar3.f4013b : fVar3.f4017f - fVar3.f4013b;
        }
        m5326N2(fVar3.f4016e, i);
        int i8 = this.f3837A ? this.f3855u.mo4706i() : this.f3855u.mo4710m();
        boolean z = false;
        while (fVar.mo4686a(a0Var) && (this.f3859y.f4020i || !this.f3838B.isEmpty())) {
            View b = fVar3.mo4687b(vVar2);
            C1106c cVar = (C1106c) b.getLayoutParams();
            int a = cVar.mo4429a();
            int g = this.f3841E.mo4549g(a);
            boolean z2 = g == -1;
            if (z2) {
                fVar2 = cVar.f3870f ? this.f3854t[r9] : m5352s2(fVar3);
                this.f3841E.mo4553n(a, fVar2);
            } else {
                fVar2 = this.f3854t[g];
            }
            C1112f fVar4 = fVar2;
            cVar.f3869e = fVar4;
            if (fVar3.f4016e == 1) {
                mo4381e(b);
            } else {
                mo4384f(b, r9);
            }
            m5355y2(b, cVar, r9);
            if (fVar3.f4016e == 1) {
                int o2 = cVar.f3870f ? m5348o2(i8) : fVar4.mo4582l(i8);
                int e = this.f3855u.mo4702e(b) + o2;
                if (z2 && cVar.f3870f) {
                    C1107d.C1108a b2 = m5340b2(o2);
                    b2.f3874e = -1;
                    b2.f3873d = a;
                    this.f3841E.mo4543a(b2);
                }
                i2 = e;
                i3 = o2;
            } else {
                int r2 = cVar.f3870f ? m5351r2(i8) : fVar4.mo4586p(i8);
                i3 = r2 - this.f3855u.mo4702e(b);
                if (z2 && cVar.f3870f) {
                    C1107d.C1108a c2 = m5341c2(r2);
                    c2.f3874e = 1;
                    c2.f3873d = a;
                    this.f3841E.mo4543a(c2);
                }
                i2 = r2;
            }
            if (cVar.f3870f && fVar3.f4015d == -1) {
                if (!z2) {
                    if (!(fVar3.f4016e == 1 ? mo4524R1() : mo4525S1())) {
                        C1107d.C1108a f = this.f3841E.mo4548f(a);
                        if (f != null) {
                            f.f3876g = true;
                        }
                    }
                }
                this.f3849M = true;
            }
            m5331T1(b, cVar, fVar3);
            if (!mo4535w2() || this.f3857w != 1) {
                int m = cVar.f3870f ? this.f3856v.mo4710m() : (fVar4.f3891e * this.f3858x) + this.f3856v.mo4710m();
                i5 = m;
                i4 = this.f3856v.mo4702e(b) + m;
            } else {
                int i9 = cVar.f3870f ? this.f3856v.mo4706i() : this.f3856v.mo4706i() - (((this.f3853s - 1) - fVar4.f3891e) * this.f3858x);
                i4 = i9;
                i5 = i9 - this.f3856v.mo4702e(b);
            }
            if (this.f3857w == 1) {
                staggeredGridLayoutManager = this;
                view = b;
                i7 = i5;
                i5 = i3;
                i6 = i4;
            } else {
                staggeredGridLayoutManager = this;
                view = b;
                i7 = i3;
                i6 = i2;
                i2 = i4;
            }
            staggeredGridLayoutManager.mo4333C0(view, i7, i5, i6, i2);
            if (cVar.f3870f) {
                m5326N2(this.f3859y.f4016e, i);
            } else {
                m5332T2(fVar4, this.f3859y.f4016e, i);
            }
            m5320D2(vVar2, this.f3859y);
            if (this.f3859y.f4019h && b.hasFocusable()) {
                if (cVar.f3870f) {
                    this.f3838B.clear();
                } else {
                    this.f3838B.set(fVar4.f3891e, false);
                    z = true;
                    r9 = 0;
                }
            }
            z = true;
            r9 = 0;
        }
        if (!z) {
            m5320D2(vVar2, this.f3859y);
        }
        int m2 = this.f3859y.f4016e == -1 ? this.f3855u.mo4710m() - m5351r2(this.f3855u.mo4710m()) : m5348o2(this.f3855u.mo4706i()) - this.f3855u.mo4706i();
        if (m2 > 0) {
            return Math.min(fVar3.f4013b, m2);
        }
        return 0;
    }

    /* renamed from: f2 */
    private int m5344f2(int i) {
        int K = mo4350K();
        for (int i2 = 0; i2 < K; i2++) {
            int k0 = mo4396k0(mo4348J(i2));
            if (k0 >= 0 && k0 < i) {
                return k0;
            }
        }
        return 0;
    }

    /* renamed from: j2 */
    private int m5345j2(int i) {
        for (int K = mo4350K() - 1; K >= 0; K--) {
            int k0 = mo4396k0(mo4348J(K));
            if (k0 >= 0 && k0 < i) {
                return k0;
            }
        }
        return 0;
    }

    /* renamed from: k2 */
    private void m5346k2(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, boolean z) {
        int i;
        int o2 = m5348o2(Integer.MIN_VALUE);
        if (o2 != Integer.MIN_VALUE && (i = this.f3855u.mo4706i() - o2) > 0) {
            int i2 = i - (-mo4518I2(-i, vVar, a0Var));
            if (z && i2 > 0) {
                this.f3855u.mo4715r(i2);
            }
        }
    }

    /* renamed from: l2 */
    private void m5347l2(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, boolean z) {
        int m;
        int r2 = m5351r2(Integer.MAX_VALUE);
        if (r2 != Integer.MAX_VALUE && (m = r2 - this.f3855u.mo4710m()) > 0) {
            int I2 = m - mo4518I2(m, vVar, a0Var);
            if (z && I2 > 0) {
                this.f3855u.mo4715r(-I2);
            }
        }
    }

    /* renamed from: o2 */
    private int m5348o2(int i) {
        int l = this.f3854t[0].mo4582l(i);
        for (int i2 = 1; i2 < this.f3853s; i2++) {
            int l2 = this.f3854t[i2].mo4582l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: p2 */
    private int m5349p2(int i) {
        int p = this.f3854t[0].mo4586p(i);
        for (int i2 = 1; i2 < this.f3853s; i2++) {
            int p2 = this.f3854t[i2].mo4586p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: q2 */
    private int m5350q2(int i) {
        int l = this.f3854t[0].mo4582l(i);
        for (int i2 = 1; i2 < this.f3853s; i2++) {
            int l2 = this.f3854t[i2].mo4582l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: r2 */
    private int m5351r2(int i) {
        int p = this.f3854t[0].mo4586p(i);
        for (int i2 = 1; i2 < this.f3853s; i2++) {
            int p2 = this.f3854t[i2].mo4586p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: s2 */
    private C1112f m5352s2(C1139f fVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m5318A2(fVar.f4016e)) {
            i2 = this.f3853s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f3853s;
            i = 1;
        }
        C1112f fVar2 = null;
        if (fVar.f4016e == 1) {
            int i4 = Integer.MAX_VALUE;
            int m = this.f3855u.mo4710m();
            while (i2 != i3) {
                C1112f fVar3 = this.f3854t[i2];
                int l = fVar3.mo4582l(m);
                if (l < i4) {
                    fVar2 = fVar3;
                    i4 = l;
                }
                i2 += i;
            }
            return fVar2;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = this.f3855u.mo4706i();
        while (i2 != i3) {
            C1112f fVar4 = this.f3854t[i2];
            int p = fVar4.mo4586p(i6);
            if (p > i5) {
                fVar2 = fVar4;
                i5 = p;
            }
            i2 += i;
        }
        return fVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: t2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5353t2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f3837A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo4532n2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo4531m2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f3841E
            r4.mo4550h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3841E
            r9.mo4552k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f3841E
            r7.mo4551j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3841E
            r9.mo4552k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3841E
            r9.mo4551j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f3837A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo4531m2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo4532n2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo4417w1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5353t2(int, int, int):void");
    }

    /* renamed from: x2 */
    private void m5354x2(View view, int i, int i2, boolean z) {
        mo4395k(view, this.f3847K);
        C1106c cVar = (C1106c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect = this.f3847K;
        int U2 = m5334U2(i, i3 + rect.left, cVar.rightMargin + rect.right);
        int i4 = cVar.topMargin;
        Rect rect2 = this.f3847K;
        int U22 = m5334U2(i2, i4 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z ? mo4352K1(view, U2, U22, cVar) : mo4347I1(view, U2, U22, cVar)) {
            view.measure(U2, U22);
        }
    }

    /* renamed from: y2 */
    private void m5355y2(View view, C1106c cVar, boolean z) {
        int i;
        int i2;
        if (cVar.f3870f) {
            if (this.f3857w == 1) {
                i2 = this.f3846J;
            } else {
                m5354x2(view, RecyclerView.C1084o.m5071L(mo4408r0(), mo4410s0(), mo4386g0() + mo4387h0(), cVar.width, true), this.f3846J, z);
                return;
            }
        } else if (this.f3857w == 1) {
            i2 = RecyclerView.C1084o.m5071L(this.f3858x, mo4410s0(), 0, cVar.width, false);
        } else {
            i2 = RecyclerView.C1084o.m5071L(mo4408r0(), mo4410s0(), mo4386g0() + mo4387h0(), cVar.width, true);
            i = RecyclerView.C1084o.m5071L(this.f3858x, mo4370Y(), 0, cVar.height, false);
            m5354x2(view, i2, i, z);
        }
        i = RecyclerView.C1084o.m5071L(mo4369X(), mo4370Y(), mo4393j0() + mo4382e0(), cVar.height, true);
        m5354x2(view, i2, i, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014b, code lost:
        if (mo4527V1() != false) goto L_0x014f;
     */
    /* renamed from: z2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5356z2(androidx.recyclerview.widget.RecyclerView.C1096v r9, androidx.recyclerview.widget.RecyclerView.C1064a0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f3848L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f3845I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f3839C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo4196b()
            if (r1 != 0) goto L_0x0018
            r8.mo4401n1(r9)
            r0.mo4539c()
            return
        L_0x0018:
            boolean r1 = r0.f3866e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f3839C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f3845I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo4539c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f3845I
            if (r5 == 0) goto L_0x0037
            r8.m5329Q1(r0)
            goto L_0x003e
        L_0x0037:
            r8.m5324H2()
            boolean r5 = r8.f3837A
            r0.f3864c = r5
        L_0x003e:
            r8.mo4523Q2(r10, r0)
            r0.f3866e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f3845I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f3839C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f3864c
            boolean r6 = r8.f3843G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo4535w2()
            boolean r6 = r8.f3844H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f3841E
            r5.mo4544b()
            r0.f3865d = r4
        L_0x0060:
            int r5 = r8.mo4350K()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f3845I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f3879f
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f3865d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f3853s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3854t
            r5 = r5[r1]
            r5.mo4575e()
            int r5 = r0.f3863b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.f3854t
            r6 = r6[r1]
            r6.mo4592v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f3848L
            int[] r1 = r1.f3867f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f3853s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3854t
            r5 = r5[r1]
            r5.mo4575e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f3848L
            int[] r6 = r6.f3867f
            r6 = r6[r1]
            r5.mo4592v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f3853s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3854t
            r5 = r5[r1]
            boolean r6 = r8.f3837A
            int r7 = r0.f3863b
            r5.mo4572b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f3848L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3854t
            r1.mo4540d(r5)
        L_0x00c9:
            r8.mo4418x(r9)
            androidx.recyclerview.widget.f r1 = r8.f3859y
            r1.f4012a = r3
            r8.f3849M = r3
            androidx.recyclerview.widget.i r1 = r8.f3856v
            int r1 = r1.mo4711n()
            r8.mo4526S2(r1)
            int r1 = r0.f3862a
            r8.m5330R2(r1, r10)
            boolean r1 = r0.f3864c
            if (r1 == 0) goto L_0x00f0
            r8.m5325J2(r2)
            androidx.recyclerview.widget.f r1 = r8.f3859y
            r8.m5343e2(r9, r1, r10)
            r8.m5325J2(r4)
            goto L_0x00fb
        L_0x00f0:
            r8.m5325J2(r4)
            androidx.recyclerview.widget.f r1 = r8.f3859y
            r8.m5343e2(r9, r1, r10)
            r8.m5325J2(r2)
        L_0x00fb:
            androidx.recyclerview.widget.f r1 = r8.f3859y
            int r2 = r0.f3862a
            int r5 = r1.f4015d
            int r2 = r2 + r5
            r1.f4014c = r2
            r8.m5343e2(r9, r1, r10)
            r8.m5323G2()
            int r1 = r8.mo4350K()
            if (r1 <= 0) goto L_0x0121
            boolean r1 = r8.f3837A
            if (r1 == 0) goto L_0x011b
            r8.m5346k2(r9, r10, r4)
            r8.m5347l2(r9, r10, r3)
            goto L_0x0121
        L_0x011b:
            r8.m5347l2(r9, r10, r4)
            r8.m5346k2(r9, r10, r3)
        L_0x0121:
            if (r11 == 0) goto L_0x014e
            boolean r11 = r10.mo4199e()
            if (r11 != 0) goto L_0x014e
            int r11 = r8.f3842F
            if (r11 == 0) goto L_0x013f
            int r11 = r8.mo4350K()
            if (r11 <= 0) goto L_0x013f
            boolean r11 = r8.f3849M
            if (r11 != 0) goto L_0x013d
            android.view.View r11 = r8.mo4533u2()
            if (r11 == 0) goto L_0x013f
        L_0x013d:
            r11 = 1
            goto L_0x0140
        L_0x013f:
            r11 = 0
        L_0x0140:
            if (r11 == 0) goto L_0x014e
            java.lang.Runnable r11 = r8.f3852P
            r8.mo4409r1(r11)
            boolean r11 = r8.mo4527V1()
            if (r11 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r4 = 0
        L_0x014f:
            boolean r11 = r10.mo4199e()
            if (r11 == 0) goto L_0x015a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f3848L
            r11.mo4539c()
        L_0x015a:
            boolean r11 = r0.f3864c
            r8.f3843G = r11
            boolean r11 = r8.mo4535w2()
            r8.f3844H = r11
            if (r4 == 0) goto L_0x016e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f3848L
            r11.mo4539c()
            r8.m5356z2(r9, r10, r3)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5356z2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    /* renamed from: A1 */
    public void mo3970A1(int i) {
        C1110e eVar = this.f3845I;
        if (!(eVar == null || eVar.f3877d == i)) {
            eVar.mo4563a();
        }
        this.f3839C = i;
        this.f3840D = Integer.MIN_VALUE;
        mo4417w1();
    }

    /* renamed from: B1 */
    public int mo3930B1(int i, RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        return mo4518I2(i, vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B2 */
    public void mo4517B2(int i, RecyclerView.C1064a0 a0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo4532n2();
            i2 = 1;
        } else {
            i3 = mo4531m2();
            i2 = -1;
        }
        this.f3859y.f4012a = true;
        m5330R2(i3, a0Var);
        m5325J2(i2);
        C1139f fVar = this.f3859y;
        fVar.f4014c = i3 + fVar.f4015d;
        fVar.f4013b = Math.abs(i);
    }

    /* renamed from: E */
    public RecyclerView.C1089p mo3931E() {
        return this.f3857w == 0 ? new C1106c(-2, -1) : new C1106c(-1, -2);
    }

    /* renamed from: F */
    public RecyclerView.C1089p mo3932F(Context context, AttributeSet attributeSet) {
        return new C1106c(context, attributeSet);
    }

    /* renamed from: F0 */
    public void mo4339F0(int i) {
        super.mo4339F0(i);
        for (int i2 = 0; i2 < this.f3853s; i2++) {
            this.f3854t[i2].mo4588r(i);
        }
    }

    /* renamed from: F1 */
    public void mo3933F1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int g0 = mo4386g0() + mo4387h0();
        int j0 = mo4393j0() + mo4382e0();
        if (this.f3857w == 1) {
            i4 = RecyclerView.C1084o.m5075o(i2, rect.height() + j0, mo4376c0());
            i3 = RecyclerView.C1084o.m5075o(i, (this.f3858x * this.f3853s) + g0, mo4379d0());
        } else {
            i3 = RecyclerView.C1084o.m5075o(i, rect.width() + g0, mo4379d0());
            i4 = RecyclerView.C1084o.m5075o(i2, (this.f3858x * this.f3853s) + j0, mo4376c0());
        }
        mo4338E1(i3, i4);
    }

    /* renamed from: G */
    public RecyclerView.C1089p mo3934G(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1106c((ViewGroup.MarginLayoutParams) layoutParams) : new C1106c(layoutParams);
    }

    /* renamed from: G0 */
    public void mo4340G0(int i) {
        super.mo4340G0(i);
        for (int i2 = 0; i2 < this.f3853s; i2++) {
            this.f3854t[i2].mo4588r(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I2 */
    public int mo4518I2(int i, RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        if (mo4350K() == 0 || i == 0) {
            return 0;
        }
        mo4517B2(i, a0Var);
        int e2 = m5343e2(vVar, this.f3859y, a0Var);
        if (this.f3859y.f4013b >= e2) {
            i = i < 0 ? -e2 : e2;
        }
        this.f3855u.mo4715r(-i);
        this.f3843G = this.f3837A;
        C1139f fVar = this.f3859y;
        fVar.f4013b = 0;
        m5320D2(vVar, fVar);
        return i;
    }

    /* renamed from: K2 */
    public void mo4519K2(int i) {
        if (i == 0 || i == 1) {
            mo3993h((String) null);
            if (i != this.f3857w) {
                this.f3857w = i;
                C1143i iVar = this.f3855u;
                this.f3855u = this.f3856v;
                this.f3856v = iVar;
                mo4417w1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: L0 */
    public void mo3977L0(RecyclerView recyclerView, RecyclerView.C1096v vVar) {
        super.mo3977L0(recyclerView, vVar);
        mo4409r1(this.f3852P);
        for (int i = 0; i < this.f3853s; i++) {
            this.f3854t[i].mo4575e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: L1 */
    public void mo3978L1(RecyclerView recyclerView, RecyclerView.C1064a0 a0Var, int i) {
        C1140g gVar = new C1140g(recyclerView.getContext());
        gVar.mo4510p(i);
        mo4353M1(gVar);
    }

    /* renamed from: L2 */
    public void mo4520L2(boolean z) {
        mo3993h((String) null);
        C1110e eVar = this.f3845I;
        if (!(eVar == null || eVar.f3884k == z)) {
            eVar.f3884k = z;
        }
        this.f3860z = z;
        mo4417w1();
    }

    /* renamed from: M0 */
    public View mo3936M0(View view, int i, RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        View C;
        View m;
        if (mo4350K() == 0 || (C = mo4332C(view)) == null) {
            return null;
        }
        m5324H2();
        int a2 = m5339a2(i);
        if (a2 == Integer.MIN_VALUE) {
            return null;
        }
        C1106c cVar = (C1106c) C.getLayoutParams();
        boolean z = cVar.f3870f;
        C1112f fVar = cVar.f3869e;
        int n2 = a2 == 1 ? mo4532n2() : mo4531m2();
        m5330R2(n2, a0Var);
        m5325J2(a2);
        C1139f fVar2 = this.f3859y;
        fVar2.f4014c = fVar2.f4015d + n2;
        fVar2.f4013b = (int) (((float) this.f3855u.mo4711n()) * 0.33333334f);
        C1139f fVar3 = this.f3859y;
        fVar3.f4019h = true;
        fVar3.f4012a = false;
        m5343e2(vVar, fVar3, a0Var);
        this.f3843G = this.f3837A;
        if (!z && (m = fVar.mo4583m(n2, a2)) != null && m != C) {
            return m;
        }
        if (m5318A2(a2)) {
            for (int i2 = this.f3853s - 1; i2 >= 0; i2--) {
                View m2 = this.f3854t[i2].mo4583m(n2, a2);
                if (m2 != null && m2 != C) {
                    return m2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f3853s; i3++) {
                View m3 = this.f3854t[i3].mo4583m(n2, a2);
                if (m3 != null && m3 != C) {
                    return m3;
                }
            }
        }
        boolean z2 = (this.f3860z ^ true) == (a2 == -1);
        if (!z) {
            View D = mo3972D(z2 ? fVar.mo4576f() : fVar.mo4577g());
            if (!(D == null || D == C)) {
                return D;
            }
        }
        if (m5318A2(a2)) {
            for (int i4 = this.f3853s - 1; i4 >= 0; i4--) {
                if (i4 != fVar.f3891e) {
                    C1112f[] fVarArr = this.f3854t;
                    View D2 = mo3972D(z2 ? fVarArr[i4].mo4576f() : fVarArr[i4].mo4577g());
                    if (!(D2 == null || D2 == C)) {
                        return D2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f3853s; i5++) {
                C1112f[] fVarArr2 = this.f3854t;
                View D3 = mo3972D(z2 ? fVarArr2[i5].mo4576f() : fVarArr2[i5].mo4577g());
                if (D3 != null && D3 != C) {
                    return D3;
                }
            }
        }
        return null;
    }

    /* renamed from: M2 */
    public void mo4521M2(int i) {
        mo3993h((String) null);
        if (i != this.f3853s) {
            mo4534v2();
            this.f3853s = i;
            this.f3838B = new BitSet(this.f3853s);
            this.f3854t = new C1112f[this.f3853s];
            for (int i2 = 0; i2 < this.f3853s; i2++) {
                this.f3854t[i2] = new C1112f(i2);
            }
            mo4417w1();
        }
    }

    /* renamed from: N0 */
    public void mo3979N0(AccessibilityEvent accessibilityEvent) {
        super.mo3979N0(accessibilityEvent);
        if (mo4350K() > 0) {
            View h2 = mo4529h2(false);
            View g2 = mo4528g2(false);
            if (h2 != null && g2 != null) {
                int k0 = mo4396k0(h2);
                int k02 = mo4396k0(g2);
                if (k0 < k02) {
                    accessibilityEvent.setFromIndex(k0);
                    accessibilityEvent.setToIndex(k02);
                    return;
                }
                accessibilityEvent.setFromIndex(k02);
                accessibilityEvent.setToIndex(k0);
            }
        }
    }

    /* renamed from: O */
    public int mo3937O(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        return this.f3857w == 1 ? this.f3853s : super.mo3937O(vVar, a0Var);
    }

    /* renamed from: O1 */
    public boolean mo3938O1() {
        return this.f3845I == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P2 */
    public boolean mo4522P2(RecyclerView.C1064a0 a0Var, C1105b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!a0Var.mo4199e() && (i = this.f3839C) != -1) {
            if (i < 0 || i >= a0Var.mo4196b()) {
                this.f3839C = -1;
                this.f3840D = Integer.MIN_VALUE;
            } else {
                C1110e eVar = this.f3845I;
                if (eVar == null || eVar.f3877d == -1 || eVar.f3879f < 1) {
                    View D = mo3972D(this.f3839C);
                    if (D != null) {
                        bVar.f3862a = this.f3837A ? mo4532n2() : mo4531m2();
                        if (this.f3840D != Integer.MIN_VALUE) {
                            if (bVar.f3864c) {
                                i3 = this.f3855u.mo4706i() - this.f3840D;
                                i2 = this.f3855u.mo4701d(D);
                            } else {
                                i3 = this.f3855u.mo4710m() + this.f3840D;
                                i2 = this.f3855u.mo4704g(D);
                            }
                            bVar.f3863b = i3 - i2;
                            return true;
                        } else if (this.f3855u.mo4702e(D) > this.f3855u.mo4711n()) {
                            bVar.f3863b = bVar.f3864c ? this.f3855u.mo4706i() : this.f3855u.mo4710m();
                            return true;
                        } else {
                            int g = this.f3855u.mo4704g(D) - this.f3855u.mo4710m();
                            if (g < 0) {
                                bVar.f3863b = -g;
                                return true;
                            }
                            int i4 = this.f3855u.mo4706i() - this.f3855u.mo4701d(D);
                            if (i4 < 0) {
                                bVar.f3863b = i4;
                                return true;
                            }
                            bVar.f3863b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i5 = this.f3839C;
                        bVar.f3862a = i5;
                        int i6 = this.f3840D;
                        if (i6 == Integer.MIN_VALUE) {
                            if (m5333U1(i5) == 1) {
                                z = true;
                            }
                            bVar.f3864c = z;
                            bVar.mo4537a();
                        } else {
                            bVar.mo4538b(i6);
                        }
                        bVar.f3865d = true;
                    }
                } else {
                    bVar.f3863b = Integer.MIN_VALUE;
                    bVar.f3862a = this.f3839C;
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q2 */
    public void mo4523Q2(RecyclerView.C1064a0 a0Var, C1105b bVar) {
        if (!mo4522P2(a0Var, bVar) && !m5327O2(a0Var, bVar)) {
            bVar.mo4537a();
            bVar.f3862a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R1 */
    public boolean mo4524R1() {
        int l = this.f3854t[0].mo4582l(Integer.MIN_VALUE);
        for (int i = 1; i < this.f3853s; i++) {
            if (this.f3854t[i].mo4582l(Integer.MIN_VALUE) != l) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: S0 */
    public void mo3940S0(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var, View view, C0624d dVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1106c)) {
            super.mo4362R0(view, dVar);
            return;
        }
        C1106c cVar = (C1106c) layoutParams;
        if (this.f3857w == 0) {
            i4 = cVar.mo4541e();
            i3 = cVar.f3870f ? this.f3853s : 1;
            i2 = -1;
            i = -1;
        } else {
            i4 = -1;
            i3 = -1;
            i2 = cVar.mo4541e();
            i = cVar.f3870f ? this.f3853s : 1;
        }
        dVar.mo2712a0(C0624d.C0627c.m2777a(i4, i3, i2, i, false, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S1 */
    public boolean mo4525S1() {
        int p = this.f3854t[0].mo4586p(Integer.MIN_VALUE);
        for (int i = 1; i < this.f3853s; i++) {
            if (this.f3854t[i].mo4586p(Integer.MIN_VALUE) != p) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S2 */
    public void mo4526S2(int i) {
        this.f3858x = i / this.f3853s;
        this.f3846J = View.MeasureSpec.makeMeasureSpec(i, this.f3856v.mo4708k());
    }

    /* renamed from: U0 */
    public void mo3941U0(RecyclerView recyclerView, int i, int i2) {
        m5353t2(i, i2, 1);
    }

    /* renamed from: V0 */
    public void mo3942V0(RecyclerView recyclerView) {
        this.f3841E.mo4544b();
        mo4417w1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V1 */
    public boolean mo4527V1() {
        int i;
        int i2;
        if (mo4350K() == 0 || this.f3842F == 0 || !mo4414u0()) {
            return false;
        }
        if (this.f3837A) {
            i2 = mo4532n2();
            i = mo4531m2();
        } else {
            i2 = mo4531m2();
            i = mo4532n2();
        }
        if (i2 == 0 && mo4533u2() != null) {
            this.f3841E.mo4544b();
        } else if (!this.f3849M) {
            return false;
        } else {
            int i3 = this.f3837A ? -1 : 1;
            int i4 = i + 1;
            C1107d.C1108a e = this.f3841E.mo4547e(i2, i4, i3, true);
            if (e == null) {
                this.f3849M = false;
                this.f3841E.mo4546d(i4);
                return false;
            }
            C1107d.C1108a e2 = this.f3841E.mo4547e(i2, e.f3873d, i3 * -1, true);
            if (e2 == null) {
                this.f3841E.mo4546d(e.f3873d);
            } else {
                this.f3841E.mo4546d(e2.f3873d + 1);
            }
        }
        mo4420x1();
        mo4417w1();
        return true;
    }

    /* renamed from: W0 */
    public void mo3943W0(RecyclerView recyclerView, int i, int i2, int i3) {
        m5353t2(i, i2, 8);
    }

    /* renamed from: X0 */
    public void mo3944X0(RecyclerView recyclerView, int i, int i2) {
        m5353t2(i, i2, 2);
    }

    /* renamed from: Z0 */
    public void mo3945Z0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m5353t2(i, i2, 4);
    }

    /* renamed from: a1 */
    public void mo3947a1(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        m5356z2(vVar, a0Var, true);
    }

    /* renamed from: b */
    public PointF mo3986b(int i) {
        int U1 = m5333U1(i);
        PointF pointF = new PointF();
        if (U1 == 0) {
            return null;
        }
        if (this.f3857w == 0) {
            pointF.x = (float) U1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) U1;
        }
        return pointF;
    }

    /* renamed from: b1 */
    public void mo3949b1(RecyclerView.C1064a0 a0Var) {
        super.mo3949b1(a0Var);
        this.f3839C = -1;
        this.f3840D = Integer.MIN_VALUE;
        this.f3845I = null;
        this.f3848L.mo4539c();
    }

    /* renamed from: f1 */
    public void mo3989f1(Parcelable parcelable) {
        if (parcelable instanceof C1110e) {
            this.f3845I = (C1110e) parcelable;
            mo4417w1();
        }
    }

    /* renamed from: g1 */
    public Parcelable mo3991g1() {
        int i;
        int i2;
        int[] iArr;
        if (this.f3845I != null) {
            return new C1110e(this.f3845I);
        }
        C1110e eVar = new C1110e();
        eVar.f3884k = this.f3860z;
        eVar.f3885l = this.f3843G;
        eVar.f3886m = this.f3844H;
        C1107d dVar = this.f3841E;
        if (dVar == null || (iArr = dVar.f3871a) == null) {
            eVar.f3881h = 0;
        } else {
            eVar.f3882i = iArr;
            eVar.f3881h = iArr.length;
            eVar.f3883j = dVar.f3872b;
        }
        if (mo4350K() > 0) {
            eVar.f3877d = this.f3843G ? mo4532n2() : mo4531m2();
            eVar.f3878e = mo4530i2();
            int i3 = this.f3853s;
            eVar.f3879f = i3;
            eVar.f3880g = new int[i3];
            for (int i4 = 0; i4 < this.f3853s; i4++) {
                if (this.f3843G) {
                    i = this.f3854t[i4].mo4582l(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f3855u.mo4706i();
                    } else {
                        eVar.f3880g[i4] = i;
                    }
                } else {
                    i = this.f3854t[i4].mo4586p(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f3855u.mo4710m();
                    } else {
                        eVar.f3880g[i4] = i;
                    }
                }
                i -= i2;
                eVar.f3880g[i4] = i;
            }
        } else {
            eVar.f3877d = -1;
            eVar.f3878e = -1;
            eVar.f3879f = 0;
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g2 */
    public View mo4528g2(boolean z) {
        int m = this.f3855u.mo4710m();
        int i = this.f3855u.mo4706i();
        View view = null;
        for (int K = mo4350K() - 1; K >= 0; K--) {
            View J = mo4348J(K);
            int g = this.f3855u.mo4704g(J);
            int d = this.f3855u.mo4701d(J);
            if (d > m && g < i) {
                if (d <= i || !z) {
                    return J;
                }
                if (view == null) {
                    view = J;
                }
            }
        }
        return view;
    }

    /* renamed from: h */
    public void mo3993h(String str) {
        if (this.f3845I == null) {
            super.mo3993h(str);
        }
    }

    /* renamed from: h1 */
    public void mo4388h1(int i) {
        if (i == 0) {
            mo4527V1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h2 */
    public View mo4529h2(boolean z) {
        int m = this.f3855u.mo4710m();
        int i = this.f3855u.mo4706i();
        int K = mo4350K();
        View view = null;
        for (int i2 = 0; i2 < K; i2++) {
            View J = mo4348J(i2);
            int g = this.f3855u.mo4704g(J);
            if (this.f3855u.mo4701d(J) > m && g < i) {
                if (g >= m || !z) {
                    return J;
                }
                if (view == null) {
                    view = J;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i2 */
    public int mo4530i2() {
        View g2 = this.f3837A ? mo4528g2(true) : mo4529h2(true);
        if (g2 == null) {
            return -1;
        }
        return mo4396k0(g2);
    }

    /* renamed from: l */
    public boolean mo3995l() {
        return this.f3857w == 0;
    }

    /* renamed from: m */
    public boolean mo3996m() {
        return this.f3857w == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m2 */
    public int mo4531m2() {
        if (mo4350K() == 0) {
            return 0;
        }
        return mo4396k0(mo4348J(0));
    }

    /* renamed from: n */
    public boolean mo3952n(RecyclerView.C1089p pVar) {
        return pVar instanceof C1106c;
    }

    /* renamed from: n0 */
    public int mo3953n0(RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        return this.f3857w == 0 ? this.f3853s : super.mo3953n0(vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n2 */
    public int mo4532n2() {
        int K = mo4350K();
        if (K == 0) {
            return 0;
        }
        return mo4396k0(mo4348J(K - 1));
    }

    /* renamed from: p */
    public void mo3997p(int i, int i2, RecyclerView.C1064a0 a0Var, RecyclerView.C1084o.C1087c cVar) {
        int i3;
        int i4;
        if (this.f3857w != 0) {
            i = i2;
        }
        if (mo4350K() != 0 && i != 0) {
            mo4517B2(i, a0Var);
            int[] iArr = this.f3851O;
            if (iArr == null || iArr.length < this.f3853s) {
                this.f3851O = new int[this.f3853s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f3853s; i6++) {
                C1139f fVar = this.f3859y;
                if (fVar.f4015d == -1) {
                    i4 = fVar.f4017f;
                    i3 = this.f3854t[i6].mo4586p(i4);
                } else {
                    i4 = this.f3854t[i6].mo4582l(fVar.f4018g);
                    i3 = this.f3859y.f4018g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f3851O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f3851O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f3859y.mo4686a(a0Var); i8++) {
                cVar.mo4428a(this.f3859y.f4014c, this.f3851O[i8]);
                C1139f fVar2 = this.f3859y;
                fVar2.f4014c += fVar2.f4015d;
            }
        }
    }

    /* renamed from: r */
    public int mo3999r(RecyclerView.C1064a0 a0Var) {
        return m5336X1(a0Var);
    }

    /* renamed from: s */
    public int mo3954s(RecyclerView.C1064a0 a0Var) {
        return m5337Y1(a0Var);
    }

    /* renamed from: t */
    public int mo3955t(RecyclerView.C1064a0 a0Var) {
        return m5338Z1(a0Var);
    }

    /* renamed from: u */
    public int mo4003u(RecyclerView.C1064a0 a0Var) {
        return m5336X1(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: u2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4533u2() {
        /*
            r12 = this;
            int r0 = r12.mo4350K()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3853s
            r2.<init>(r3)
            int r3 = r12.f3853s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3857w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo4535w2()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f3837A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo4348J(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1106c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3869e
            int r9 = r9.f3891e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3869e
            boolean r9 = r12.m5335W1(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3869e
            int r9 = r9.f3891e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f3870f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo4348J(r9)
            boolean r10 = r12.f3837A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.i r10 = r12.f3855u
            int r10 = r10.mo4701d(r7)
            androidx.recyclerview.widget.i r11 = r12.f3855u
            int r11 = r11.mo4701d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.i r10 = r12.f3855u
            int r10 = r10.mo4704g(r7)
            androidx.recyclerview.widget.i r11 = r12.f3855u
            int r11 = r11.mo4704g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1106c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f3869e
            int r8 = r8.f3891e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f3869e
            int r9 = r9.f3891e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4533u2():android.view.View");
    }

    /* renamed from: v */
    public int mo3956v(RecyclerView.C1064a0 a0Var) {
        return m5337Y1(a0Var);
    }

    /* renamed from: v0 */
    public boolean mo4005v0() {
        return this.f3842F != 0;
    }

    /* renamed from: v2 */
    public void mo4534v2() {
        this.f3841E.mo4544b();
        mo4417w1();
    }

    /* renamed from: w */
    public int mo3958w(RecyclerView.C1064a0 a0Var) {
        return m5338Z1(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w2 */
    public boolean mo4535w2() {
        return mo4373a0() == 1;
    }

    /* renamed from: z1 */
    public int mo3960z1(int i, RecyclerView.C1096v vVar, RecyclerView.C1064a0 a0Var) {
        return mo4518I2(i, vVar, a0Var);
    }
}
