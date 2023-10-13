package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C0058g;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.C0065a;
import androidx.activity.result.C0067b;
import androidx.activity.result.C0068c;
import androidx.core.app.C0459f;
import androidx.core.app.C0463i;
import androidx.core.app.C0464j;
import androidx.core.app.C0465k;
import androidx.core.content.C0474b;
import androidx.core.content.C0475c;
import androidx.core.util.C0604a;
import androidx.core.view.C0680i;
import androidx.core.view.C0700l;
import androidx.fragment.app.C0891f0;
import androidx.lifecycle.C0988f;
import androidx.lifecycle.C0994f0;
import androidx.lifecycle.C0996g0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p009b.C1244a;
import p010b0.C1250b;
import p017c0.C1283d;

/* renamed from: androidx.fragment.app.w */
public abstract class C0937w {

    /* renamed from: S */
    private static boolean f3261S = false;

    /* renamed from: A */
    private C0925n f3262A = new C0941d();

    /* renamed from: B */
    private C0924m0 f3263B = null;

    /* renamed from: C */
    private C0924m0 f3264C = new C0942e();

    /* renamed from: D */
    private C0068c<Intent> f3265D;

    /* renamed from: E */
    private C0068c<Object> f3266E;

    /* renamed from: F */
    private C0068c<String[]> f3267F;

    /* renamed from: G */
    ArrayDeque<C0948k> f3268G = new ArrayDeque<>();

    /* renamed from: H */
    private boolean f3269H;

    /* renamed from: I */
    private boolean f3270I;

    /* renamed from: J */
    private boolean f3271J;

    /* renamed from: K */
    private boolean f3272K;

    /* renamed from: L */
    private boolean f3273L;

    /* renamed from: M */
    private ArrayList<C0856a> f3274M;

    /* renamed from: N */
    private ArrayList<Boolean> f3275N;

    /* renamed from: O */
    private ArrayList<Fragment> f3276O;

    /* renamed from: P */
    private C0956z f3277P;

    /* renamed from: Q */
    private C1283d.C1286c f3278Q;

    /* renamed from: R */
    private Runnable f3279R = new C0943f();

    /* renamed from: a */
    private final ArrayList<C0951m> f3280a = new ArrayList<>();

    /* renamed from: b */
    private boolean f3281b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0889e0 f3282c = new C0889e0();

    /* renamed from: d */
    ArrayList<C0856a> f3283d;

    /* renamed from: e */
    private ArrayList<Fragment> f3284e;

    /* renamed from: f */
    private final C0928p f3285f = new C0928p(this);

    /* renamed from: g */
    private OnBackPressedDispatcher f3286g;

    /* renamed from: h */
    private final C0058g f3287h = new C0939b(false);

    /* renamed from: i */
    private final AtomicInteger f3288i = new AtomicInteger();

    /* renamed from: j */
    private final Map<String, C0861c> f3289j = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Map<String, Bundle> f3290k = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Map<String, Object> f3291l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    private ArrayList<C0950l> f3292m;

    /* renamed from: n */
    private final C0930q f3293n = new C0930q(this);

    /* renamed from: o */
    private final CopyOnWriteArrayList<C0857a0> f3294o = new CopyOnWriteArrayList<>();

    /* renamed from: p */
    private final C0604a<Configuration> f3295p = new C0932r(this);

    /* renamed from: q */
    private final C0604a<Integer> f3296q = new C0935u(this);

    /* renamed from: r */
    private final C0604a<C0459f> f3297r = new C0933s(this);

    /* renamed from: s */
    private final C0604a<C0465k> f3298s = new C0934t(this);

    /* renamed from: t */
    private final C0700l f3299t = new C0940c();

    /* renamed from: u */
    int f3300u = -1;

    /* renamed from: v */
    private C0927o<?> f3301v;

    /* renamed from: w */
    private C0913l f3302w;

    /* renamed from: x */
    private Fragment f3303x;

    /* renamed from: y */
    Fragment f3304y;

    /* renamed from: z */
    private C0925n f3305z = null;

    /* renamed from: androidx.fragment.app.w$a */
    class C0938a implements C0067b<Map<String, Boolean>> {
        C0938a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo183a(Map<String, Boolean> map) {
            StringBuilder sb;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            C0948k pollFirst = C0937w.this.f3268G.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = pollFirst.f3316d;
                int i2 = pollFirst.f3317e;
                Fragment i3 = C0937w.this.f3282c.mo3460i(str);
                if (i3 == null) {
                    sb = new StringBuilder();
                    sb.append("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    i3.mo3208D0(i2, strArr, iArr);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* renamed from: androidx.fragment.app.w$b */
    class C0939b extends C0058g {
        C0939b(boolean z) {
            super(z);
        }

        /* renamed from: b */
        public void mo165b() {
            C0937w.this.mo3621D0();
        }
    }

    /* renamed from: androidx.fragment.app.w$c */
    class C0940c implements C0700l {
        C0940c() {
        }

        /* renamed from: a */
        public void mo2847a(Menu menu, MenuInflater menuInflater) {
            C0937w.this.mo3620D(menu, menuInflater);
        }

        /* renamed from: b */
        public void mo2848b(Menu menu) {
            C0937w.this.mo3640P(menu);
        }

        /* renamed from: c */
        public boolean mo2849c(MenuItem menuItem) {
            return C0937w.this.mo3631K(menuItem);
        }

        /* renamed from: d */
        public void mo2850d(Menu menu) {
            C0937w.this.mo3633L(menu);
        }
    }

    /* renamed from: androidx.fragment.app.w$d */
    class C0941d extends C0925n {
        C0941d() {
        }

        /* renamed from: a */
        public Fragment mo3593a(ClassLoader classLoader, String str) {
            return C0937w.this.mo3684u0().mo3551c(C0937w.this.mo3684u0().mo3595p(), str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.w$e */
    class C0942e implements C0924m0 {
        C0942e() {
        }

        /* renamed from: a */
        public C0914l0 mo3592a(ViewGroup viewGroup) {
            return new C0865d(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.w$f */
    class C0943f implements Runnable {
        C0943f() {
        }

        public void run() {
            C0937w.this.mo3655b0(true);
        }
    }

    /* renamed from: androidx.fragment.app.w$g */
    class C0944g implements C0857a0 {

        /* renamed from: d */
        final /* synthetic */ Fragment f3312d;

        C0944g(Fragment fragment) {
            this.f3312d = fragment;
        }

        /* renamed from: b */
        public void mo3365b(C0937w wVar, Fragment fragment) {
            this.f3312d.mo3270h0(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.w$h */
    class C0945h implements C0067b<C0065a> {
        C0945h() {
        }

        /* renamed from: b */
        public void mo183a(C0065a aVar) {
            C0948k pollFirst = C0937w.this.f3268G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f3316d;
            int i = pollFirst.f3317e;
            Fragment i2 = C0937w.this.f3282c.mo3460i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i2.mo3261e0(i, aVar.mo175c(), aVar.mo174a());
        }
    }

    /* renamed from: androidx.fragment.app.w$i */
    class C0946i implements C0067b<C0065a> {
        C0946i() {
        }

        /* renamed from: b */
        public void mo183a(C0065a aVar) {
            C0948k pollFirst = C0937w.this.f3268G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f3316d;
            int i = pollFirst.f3317e;
            Fragment i2 = C0937w.this.f3282c.mo3460i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i2.mo3261e0(i, aVar.mo175c(), aVar.mo174a());
        }
    }

    /* renamed from: androidx.fragment.app.w$j */
    static class C0947j extends C1244a<Object, C0065a> {
        C0947j() {
        }

        /* renamed from: b */
        public C0065a mo3698a(int i, Intent intent) {
            return new C0065a(i, intent);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.w$k */
    static class C0948k implements Parcelable {
        public static final Parcelable.Creator<C0948k> CREATOR = new C0949a();

        /* renamed from: d */
        String f3316d;

        /* renamed from: e */
        int f3317e;

        /* renamed from: androidx.fragment.app.w$k$a */
        class C0949a implements Parcelable.Creator<C0948k> {
            C0949a() {
            }

            /* renamed from: a */
            public C0948k createFromParcel(Parcel parcel) {
                return new C0948k(parcel);
            }

            /* renamed from: b */
            public C0948k[] newArray(int i) {
                return new C0948k[i];
            }
        }

        C0948k(Parcel parcel) {
            this.f3316d = parcel.readString();
            this.f3317e = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f3316d);
            parcel.writeInt(this.f3317e);
        }
    }

    /* renamed from: androidx.fragment.app.w$l */
    public interface C0950l {
        /* renamed from: a */
        void mo3706a();
    }

    /* renamed from: androidx.fragment.app.w$m */
    interface C0951m {
        /* renamed from: a */
        boolean mo3347a(ArrayList<C0856a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.w$n */
    private class C0952n implements C0951m {

        /* renamed from: a */
        final String f3318a;

        /* renamed from: b */
        final int f3319b;

        /* renamed from: c */
        final int f3320c;

        C0952n(String str, int i, int i2) {
            this.f3318a = str;
            this.f3319b = i;
            this.f3320c = i2;
        }

        /* renamed from: a */
        public boolean mo3347a(ArrayList<C0856a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = C0937w.this.f3304y;
            if (fragment != null && this.f3319b < 0 && this.f3318a == null && fragment.mo3292p().mo3653Z0()) {
                return false;
            }
            return C0937w.this.mo3657c1(arrayList, arrayList2, this.f3318a, this.f3319b, this.f3320c);
        }
    }

    /* renamed from: B0 */
    static Fragment m4206B0(View view) {
        Object tag = view.getTag(C1250b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: H0 */
    public static boolean m4207H0(int i) {
        return f3261S || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: I0 */
    private boolean m4208I0(Fragment fragment) {
        return (fragment.f2944H && fragment.f2945I) || fragment.f2988y.mo3678p();
    }

    /* renamed from: J0 */
    private boolean m4209J0() {
        Fragment fragment = this.f3303x;
        if (fragment == null) {
            return true;
        }
        return fragment.mo3242W() && this.f3303x.mo3207D().m4209J0();
    }

    /* renamed from: M */
    private void m4210M(Fragment fragment) {
        if (fragment != null && fragment.equals(mo3659f0(fragment.f2972i))) {
            fragment.mo3256c1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public /* synthetic */ void m4212Q0(Configuration configuration) {
        if (m4209J0()) {
            mo3615A(configuration, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R0 */
    public /* synthetic */ void m4213R0(Integer num) {
        if (m4209J0() && num.intValue() == 80) {
            mo3626G(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public /* synthetic */ void m4214S0(C0459f fVar) {
        if (m4209J0()) {
            mo3628H(fVar.mo2439a(), false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: T */
    private void m4215T(int i) {
        try {
            this.f3281b = true;
            this.f3282c.mo3455d(i);
            mo3645U0(i, false);
            for (C0914l0 j : m4248u()) {
                j.mo3557j();
            }
            this.f3281b = false;
            mo3655b0(true);
        } catch (Throwable th) {
            this.f3281b = false;
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T0 */
    public /* synthetic */ void m4216T0(C0465k kVar) {
        if (m4209J0()) {
            mo3638O(kVar.mo2441a(), false);
        }
    }

    /* renamed from: W */
    private void m4217W() {
        if (this.f3273L) {
            this.f3273L = false;
            m4241p1();
        }
    }

    /* renamed from: Y */
    private void m4218Y() {
        for (C0914l0 j : m4248u()) {
            j.mo3557j();
        }
    }

    /* renamed from: a0 */
    private void m4220a0(boolean z) {
        if (this.f3281b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f3301v == null) {
            if (this.f3272K) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f3301v.mo3596t().getLooper()) {
            if (!z) {
                m4242q();
            }
            if (this.f3274M == null) {
                this.f3274M = new ArrayList<>();
                this.f3275N = new ArrayList<>();
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: b1 */
    private boolean m4222b1(String str, int i, int i2) {
        mo3655b0(false);
        m4220a0(true);
        Fragment fragment = this.f3304y;
        if (fragment != null && i < 0 && str == null && fragment.mo3292p().mo3653Z0()) {
            return true;
        }
        boolean c1 = mo3657c1(this.f3274M, this.f3275N, str, i, i2);
        if (c1) {
            this.f3281b = true;
            try {
                m4228e1(this.f3274M, this.f3275N);
            } finally {
                m4244r();
            }
        }
        m4246r1();
        m4217W();
        this.f3282c.mo3453b();
        return c1;
    }

    /* renamed from: d0 */
    private static void m4225d0(ArrayList<C0856a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0856a aVar = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                aVar.mo3354o(-1);
                aVar.mo3359t();
            } else {
                aVar.mo3354o(1);
                aVar.mo3358s();
            }
            i++;
        }
    }

    /* renamed from: e0 */
    private void m4227e0(ArrayList<C0856a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        boolean z = arrayList.get(i).f3157r;
        ArrayList<Fragment> arrayList3 = this.f3276O;
        if (arrayList3 == null) {
            this.f3276O = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f3276O.addAll(this.f3282c.mo3466o());
        Fragment y0 = mo3691y0();
        boolean z2 = false;
        for (int i3 = i; i3 < i2; i3++) {
            C0856a aVar = arrayList.get(i3);
            y0 = !arrayList2.get(i3).booleanValue() ? aVar.mo3361u(this.f3276O, y0) : aVar.mo3364x(this.f3276O, y0);
            z2 = z2 || aVar.f3148i;
        }
        this.f3276O.clear();
        if (!z && this.f3300u >= 1) {
            for (int i4 = i; i4 < i2; i4++) {
                Iterator<C0891f0.C0892a> it = arrayList.get(i4).f3142c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f3160b;
                    if (!(fragment == null || fragment.f2986w == null)) {
                        this.f3282c.mo3469r(mo3686w(fragment));
                    }
                }
            }
        }
        m4225d0(arrayList, arrayList2, i, i2);
        boolean booleanValue = arrayList2.get(i2 - 1).booleanValue();
        for (int i5 = i; i5 < i2; i5++) {
            C0856a aVar2 = arrayList.get(i5);
            if (booleanValue) {
                for (int size = aVar2.f3142c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = aVar2.f3142c.get(size).f3160b;
                    if (fragment2 != null) {
                        mo3686w(fragment2).mo3424m();
                    }
                }
            } else {
                Iterator<C0891f0.C0892a> it2 = aVar2.f3142c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().f3160b;
                    if (fragment3 != null) {
                        mo3686w(fragment3).mo3424m();
                    }
                }
            }
        }
        mo3645U0(this.f3300u, true);
        for (C0914l0 next : m4249v(arrayList, i, i2)) {
            next.mo3562r(booleanValue);
            next.mo3561p();
            next.mo3556g();
        }
        while (i < i2) {
            C0856a aVar3 = arrayList.get(i);
            if (arrayList2.get(i).booleanValue() && aVar3.f3028v >= 0) {
                aVar3.f3028v = -1;
            }
            aVar3.mo3363w();
            i++;
        }
        if (z2) {
            m4230f1();
        }
    }

    /* renamed from: e1 */
    private void m4228e1(ArrayList<C0856a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f3157r) {
                        if (i2 != i) {
                            m4227e0(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f3157r) {
                                i2++;
                            }
                        }
                        m4227e0(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m4227e0(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: f1 */
    private void m4230f1() {
        if (this.f3292m != null) {
            for (int i = 0; i < this.f3292m.size(); i++) {
                this.f3292m.get(i).mo3706a();
            }
        }
    }

    /* renamed from: g0 */
    private int m4232g0(String str, int i, boolean z) {
        ArrayList<C0856a> arrayList = this.f3283d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str != null || i >= 0) {
            int size = this.f3283d.size() - 1;
            while (size >= 0) {
                C0856a aVar = this.f3283d.get(size);
                if ((str != null && str.equals(aVar.mo3362v())) || (i >= 0 && i == aVar.f3028v)) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return size;
            }
            if (z) {
                while (size > 0) {
                    C0856a aVar2 = this.f3283d.get(size - 1);
                    if ((str == null || !str.equals(aVar2.mo3362v())) && (i < 0 || i != aVar2.f3028v)) {
                        return size;
                    }
                    size--;
                }
                return size;
            } else if (size == this.f3283d.size() - 1) {
                return -1;
            } else {
                return size + 1;
            }
        } else if (z) {
            return 0;
        } else {
            return this.f3283d.size() - 1;
        }
    }

    /* renamed from: h1 */
    static int m4234h1(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i == 8194) {
            return 4097;
        }
        if (i == 8197) {
            return 4100;
        }
        if (i != 4099) {
            return i != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    /* renamed from: k0 */
    static C0937w m4235k0(View view) {
        Fragment l0 = m4236l0(view);
        if (l0 == null) {
            Context context = view.getContext();
            C0906j jVar = null;
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof C0906j) {
                    jVar = (C0906j) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (jVar != null) {
                return jVar.mo3523O();
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (l0.mo3242W()) {
            return l0.mo3292p();
        } else {
            throw new IllegalStateException("The Fragment " + l0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    /* renamed from: l0 */
    private static Fragment m4236l0(View view) {
        while (view != null) {
            Fragment B0 = m4206B0(view);
            if (B0 != null) {
                return B0;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* renamed from: m0 */
    private void m4237m0() {
        for (C0914l0 k : m4248u()) {
            k.mo3558k();
        }
    }

    /* renamed from: n0 */
    private boolean m4238n0(ArrayList<C0856a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3280a) {
            if (this.f3280a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f3280a.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    z |= this.f3280a.get(i).mo3347a(arrayList, arrayList2);
                }
                return z;
            } finally {
                this.f3280a.clear();
                this.f3301v.mo3596t().removeCallbacks(this.f3279R);
            }
        }
    }

    /* renamed from: n1 */
    private void m4239n1(Fragment fragment) {
        ViewGroup r0 = m4245r0(fragment);
        if (r0 != null && fragment.mo3298r() + fragment.mo3308u() + fragment.mo3211F() + fragment.mo3213G() > 0) {
            int i = C1250b.visible_removing_fragment_view_tag;
            if (r0.getTag(i) == null) {
                r0.setTag(i, fragment);
            }
            ((Fragment) r0.getTag(i)).mo3306t1(fragment.mo3209E());
        }
    }

    /* renamed from: p0 */
    private C0956z m4240p0(Fragment fragment) {
        return this.f3277P.mo3720j(fragment);
    }

    /* renamed from: p1 */
    private void m4241p1() {
        for (C0880d0 X0 : this.f3282c.mo3462k()) {
            mo3650X0(X0);
        }
    }

    /* renamed from: q */
    private void m4242q() {
        if (mo3639O0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: q1 */
    private void m4243q1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0912k0("FragmentManager"));
        C0927o<?> oVar = this.f3301v;
        if (oVar != null) {
            try {
                oVar.mo3535w("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            mo3649X("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* renamed from: r */
    private void m4244r() {
        this.f3281b = false;
        this.f3275N.clear();
        this.f3274M.clear();
    }

    /* renamed from: r0 */
    private ViewGroup m4245r0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f2947K;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f2938B > 0 && this.f3302w.mo3328j()) {
            View h = this.f3302w.mo3327h(fragment.f2938B);
            if (h instanceof ViewGroup) {
                return (ViewGroup) h;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo3676o0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo3635M0(r3.f3303x) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.mo169f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f3287h;
     */
    /* renamed from: r1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4246r1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.w$m> r0 = r3.f3280a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.w$m> r1 = r3.f3280a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.g r1 = r3.f3287h     // Catch:{ all -> 0x002a }
            r1.mo169f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.g r0 = r3.f3287h
            int r1 = r3.mo3676o0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f3303x
            boolean r1 = r3.mo3635M0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.mo169f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0937w.m4246r1():void");
    }

    /* renamed from: s */
    private void m4247s() {
        C0927o<?> oVar = this.f3301v;
        boolean z = true;
        if (oVar instanceof C0996g0) {
            z = this.f3282c.mo3467p().mo3723n();
        } else if (oVar.mo3595p() instanceof Activity) {
            z = true ^ ((Activity) this.f3301v.mo3595p()).isChangingConfigurations();
        }
        if (z) {
            for (C0861c cVar : this.f3289j.values()) {
                for (String g : cVar.f3044d) {
                    this.f3282c.mo3467p().mo3717g(g);
                }
            }
        }
    }

    /* renamed from: u */
    private Set<C0914l0> m4248u() {
        HashSet hashSet = new HashSet();
        for (C0880d0 k : this.f3282c.mo3462k()) {
            ViewGroup viewGroup = k.mo3423k().f2947K;
            if (viewGroup != null) {
                hashSet.add(C0914l0.m4131o(viewGroup, mo3693z0()));
            }
        }
        return hashSet;
    }

    /* renamed from: v */
    private Set<C0914l0> m4249v(ArrayList<C0856a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<C0891f0.C0892a> it = arrayList.get(i).f3142c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f3160b;
                if (!(fragment == null || (viewGroup = fragment.f2947K) == null)) {
                    hashSet.add(C0914l0.m4130n(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo3615A(Configuration configuration, boolean z) {
        if (z && (this.f3301v instanceof C0474b)) {
            m4243q1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment next : this.f3282c.mo3466o()) {
            if (next != null) {
                next.mo3226M0(configuration);
                if (z) {
                    next.f2988y.mo3615A(configuration, true);
                }
            }
        }
    }

    /* renamed from: A0 */
    public C1283d.C1286c mo3616A0() {
        return this.f3278Q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo3617B(MenuItem menuItem) {
        if (this.f3300u < 1) {
            return false;
        }
        for (Fragment next : this.f3282c.mo3466o()) {
            if (next != null && next.mo3228N0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo3618C() {
        this.f3270I = false;
        this.f3271J = false;
        this.f3277P.mo3725p(false);
        m4215T(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public C0994f0 mo3619C0(Fragment fragment) {
        return this.f3277P.mo3722m(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo3620D(Menu menu, MenuInflater menuInflater) {
        if (this.f3300u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment next : this.f3282c.mo3466o()) {
            if (next != null && mo3634L0(next) && next.mo3232P0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (this.f3284e != null) {
            for (int i = 0; i < this.f3284e.size(); i++) {
                Fragment fragment = this.f3284e.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.mo3293p0();
                }
            }
        }
        this.f3284e = arrayList;
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo3621D0() {
        mo3655b0(true);
        if (this.f3287h.mo166c()) {
            mo3653Z0();
        } else {
            this.f3286g.mo149f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo3622E() {
        this.f3272K = true;
        mo3655b0(true);
        m4218Y();
        m4247s();
        m4215T(-1);
        C0927o<?> oVar = this.f3301v;
        if (oVar instanceof C0475c) {
            ((C0475c) oVar).mo134s(this.f3296q);
        }
        C0927o<?> oVar2 = this.f3301v;
        if (oVar2 instanceof C0474b) {
            ((C0474b) oVar2).mo143v(this.f3295p);
        }
        C0927o<?> oVar3 = this.f3301v;
        if (oVar3 instanceof C0463i) {
            ((C0463i) oVar3).mo131q(this.f3297r);
        }
        C0927o<?> oVar4 = this.f3301v;
        if (oVar4 instanceof C0464j) {
            ((C0464j) oVar4).mo132r(this.f3298s);
        }
        C0927o<?> oVar5 = this.f3301v;
        if (oVar5 instanceof C0680i) {
            ((C0680i) oVar5).mo106e(this.f3299t);
        }
        this.f3301v = null;
        this.f3302w = null;
        this.f3303x = null;
        if (this.f3286g != null) {
            this.f3287h.mo167d();
            this.f3286g = null;
        }
        C0068c<Intent> cVar = this.f3265D;
        if (cVar != null) {
            cVar.mo184a();
            this.f3266E.mo184a();
            this.f3267F.mo184a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void mo3623E0(Fragment fragment) {
        if (m4207H0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f2940D) {
            fragment.f2940D = true;
            fragment.f2953Q = true ^ fragment.f2953Q;
            m4239n1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo3624F() {
        m4215T(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F0 */
    public void mo3625F0(Fragment fragment) {
        if (fragment.f2978o && m4208I0(fragment)) {
            this.f3269H = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo3626G(boolean z) {
        if (z && (this.f3301v instanceof C0475c)) {
            m4243q1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment next : this.f3282c.mo3466o()) {
            if (next != null) {
                next.mo3241V0();
                if (z) {
                    next.f2988y.mo3626G(true);
                }
            }
        }
    }

    /* renamed from: G0 */
    public boolean mo3627G0() {
        return this.f3272K;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo3628H(boolean z, boolean z2) {
        if (z2 && (this.f3301v instanceof C0463i)) {
            m4243q1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment next : this.f3282c.mo3466o()) {
            if (next != null) {
                next.mo3243W0(z);
                if (z2) {
                    next.f2988y.mo3628H(z, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo3629I(Fragment fragment) {
        Iterator<C0857a0> it = this.f3294o.iterator();
        while (it.hasNext()) {
            it.next().mo3365b(this, fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo3630J() {
        for (Fragment next : this.f3282c.mo3463l()) {
            if (next != null) {
                next.mo3305t0(next.mo3244X());
                next.f2988y.mo3630J();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo3631K(MenuItem menuItem) {
        if (this.f3300u < 1) {
            return false;
        }
        for (Fragment next : this.f3282c.mo3466o()) {
            if (next != null && next.mo3245X0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public boolean mo3632K0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.mo3244X();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo3633L(Menu menu) {
        if (this.f3300u >= 1) {
            for (Fragment next : this.f3282c.mo3466o()) {
                if (next != null) {
                    next.mo3247Y0(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public boolean mo3634L0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.mo3248Z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public boolean mo3635M0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        C0937w wVar = fragment.f2986w;
        return fragment.equals(wVar.mo3691y0()) && mo3635M0(wVar.f3303x);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo3636N() {
        m4215T(5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public boolean mo3637N0(int i) {
        return this.f3300u >= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo3638O(boolean z, boolean z2) {
        if (z2 && (this.f3301v instanceof C0464j)) {
            m4243q1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment next : this.f3282c.mo3466o()) {
            if (next != null) {
                next.mo3251a1(z);
                if (z2) {
                    next.f2988y.mo3638O(z, true);
                }
            }
        }
    }

    /* renamed from: O0 */
    public boolean mo3639O0() {
        return this.f3270I || this.f3271J;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo3640P(Menu menu) {
        boolean z = false;
        if (this.f3300u < 1) {
            return false;
        }
        for (Fragment next : this.f3282c.mo3466o()) {
            if (next != null && mo3634L0(next) && next.mo3253b1(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo3641Q() {
        m4246r1();
        m4210M(this.f3304y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo3642R() {
        this.f3270I = false;
        this.f3271J = false;
        this.f3277P.mo3725p(false);
        m4215T(7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo3643S() {
        this.f3270I = false;
        this.f3271J = false;
        this.f3277P.mo3725p(false);
        m4215T(5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo3644U() {
        this.f3271J = true;
        this.f3277P.mo3725p(true);
        m4215T(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void mo3645U0(int i, boolean z) {
        C0927o<?> oVar;
        if (this.f3301v == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f3300u) {
            this.f3300u = i;
            this.f3282c.mo3471t();
            m4241p1();
            if (this.f3269H && (oVar = this.f3301v) != null && this.f3300u == 7) {
                oVar.mo3538z();
                this.f3269H = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo3646V() {
        m4215T(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void mo3647V0() {
        if (this.f3301v != null) {
            this.f3270I = false;
            this.f3271J = false;
            this.f3277P.mo3725p(false);
            for (Fragment next : this.f3282c.mo3466o()) {
                if (next != null) {
                    next.mo3255c0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void mo3648W0(FragmentContainerView fragmentContainerView) {
        View view;
        for (C0880d0 next : this.f3282c.mo3462k()) {
            Fragment k = next.mo3423k();
            if (k.f2938B == fragmentContainerView.getId() && (view = k.f2948L) != null && view.getParent() == null) {
                k.f2947K = fragmentContainerView;
                next.mo3414b();
            }
        }
    }

    /* renamed from: X */
    public void mo3649X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3282c.mo3456e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3284e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f3284e.get(i).toString());
            }
        }
        ArrayList<C0856a> arrayList2 = this.f3283d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C0856a aVar = this.f3283d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo3356q(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3288i.get());
        synchronized (this.f3280a) {
            int size3 = this.f3280a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f3280a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3301v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3302w);
        if (this.f3303x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3303x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3300u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3270I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3271J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3272K);
        if (this.f3269H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3269H);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X0 */
    public void mo3650X0(C0880d0 d0Var) {
        Fragment k = d0Var.mo3423k();
        if (!k.f2949M) {
            return;
        }
        if (this.f3281b) {
            this.f3273L = true;
            return;
        }
        k.f2949M = false;
        d0Var.mo3424m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void mo3651Y0(int i, int i2, boolean z) {
        if (i >= 0) {
            mo3652Z(new C0952n((String) null, i, i2), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo3652Z(C0951m mVar, boolean z) {
        if (!z) {
            if (this.f3301v != null) {
                m4242q();
            } else if (this.f3272K) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f3280a) {
            if (this.f3301v != null) {
                this.f3280a.add(mVar);
                mo3667j1();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: Z0 */
    public boolean mo3653Z0() {
        return m4222b1((String) null, -1, 0);
    }

    /* renamed from: a1 */
    public boolean mo3654a1(int i, int i2) {
        if (i >= 0) {
            return m4222b1((String) null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public boolean mo3655b0(boolean z) {
        m4220a0(z);
        boolean z2 = false;
        while (m4238n0(this.f3274M, this.f3275N)) {
            this.f3281b = true;
            try {
                m4228e1(this.f3274M, this.f3275N);
                m4244r();
                z2 = true;
            } catch (Throwable th) {
                m4244r();
                throw th;
            }
        }
        m4246r1();
        m4217W();
        this.f3282c.mo3453b();
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo3656c0(C0951m mVar, boolean z) {
        if (!z || (this.f3301v != null && !this.f3272K)) {
            m4220a0(z);
            if (mVar.mo3347a(this.f3274M, this.f3275N)) {
                this.f3281b = true;
                try {
                    m4228e1(this.f3274M, this.f3275N);
                } finally {
                    m4244r();
                }
            }
            m4246r1();
            m4217W();
            this.f3282c.mo3453b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public boolean mo3657c1(ArrayList<C0856a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int g0 = m4232g0(str, i, (i2 & 1) != 0);
        if (g0 < 0) {
            return false;
        }
        for (int size = this.f3283d.size() - 1; size >= g0; size--) {
            arrayList.add(this.f3283d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public void mo3658d1(Fragment fragment) {
        if (m4207H0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f2985v);
        }
        boolean z = !fragment.mo3246Y();
        if (!fragment.f2941E || z) {
            this.f3282c.mo3472u(fragment);
            if (m4208I0(fragment)) {
                this.f3269H = true;
            }
            fragment.f2979p = true;
            m4239n1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public Fragment mo3659f0(String str) {
        return this.f3282c.mo3457f(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void mo3660g1(Parcelable parcelable) {
        C0880d0 d0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable != null) {
            Bundle bundle3 = (Bundle) parcelable;
            for (String str : bundle3.keySet()) {
                if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                    bundle2.setClassLoader(this.f3301v.mo3595p().getClassLoader());
                    this.f3290k.put(str.substring(7), bundle2);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (String str2 : bundle3.keySet()) {
                if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                    bundle.setClassLoader(this.f3301v.mo3595p().getClassLoader());
                    arrayList.add((C0863c0) bundle.getParcelable("state"));
                }
            }
            this.f3282c.mo3475x(arrayList);
            C0954y yVar = (C0954y) bundle3.getParcelable("state");
            if (yVar != null) {
                this.f3282c.mo3473v();
                Iterator<String> it = yVar.f3322d.iterator();
                while (it.hasNext()) {
                    C0863c0 B = this.f3282c.mo3451B(it.next(), (C0863c0) null);
                    if (B != null) {
                        Fragment i = this.f3277P.mo3719i(B.f3047e);
                        if (i != null) {
                            if (m4207H0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + i);
                            }
                            d0Var = new C0880d0(this.f3293n, this.f3282c, i, B);
                        } else {
                            d0Var = new C0880d0(this.f3293n, this.f3282c, this.f3301v.mo3595p().getClassLoader(), mo3680s0(), B);
                        }
                        Fragment k = d0Var.mo3423k();
                        k.f2986w = this;
                        if (m4207H0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k.f2972i + "): " + k);
                        }
                        d0Var.mo3426o(this.f3301v.mo3595p().getClassLoader());
                        this.f3282c.mo3469r(d0Var);
                        d0Var.mo3430t(this.f3300u);
                    }
                }
                for (Fragment next : this.f3277P.mo3721l()) {
                    if (!this.f3282c.mo3454c(next.f2972i)) {
                        if (m4207H0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next + " that was not found in the set of active Fragments " + yVar.f3322d);
                        }
                        this.f3277P.mo3724o(next);
                        next.f2986w = this;
                        C0880d0 d0Var2 = new C0880d0(this.f3293n, this.f3282c, next);
                        d0Var2.mo3430t(1);
                        d0Var2.mo3424m();
                        next.f2979p = true;
                        d0Var2.mo3424m();
                    }
                }
                this.f3282c.mo3474w(yVar.f3323e);
                if (yVar.f3324f != null) {
                    this.f3283d = new ArrayList<>(yVar.f3324f.length);
                    int i2 = 0;
                    while (true) {
                        C0858b[] bVarArr = yVar.f3324f;
                        if (i2 >= bVarArr.length) {
                            break;
                        }
                        C0856a c = bVarArr[i2].mo3366c(this);
                        if (m4207H0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + c.f3028v + "): " + c);
                            PrintWriter printWriter = new PrintWriter(new C0912k0("FragmentManager"));
                            c.mo3357r("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f3283d.add(c);
                        i2++;
                    }
                } else {
                    this.f3283d = null;
                }
                this.f3288i.set(yVar.f3325g);
                String str3 = yVar.f3326h;
                if (str3 != null) {
                    Fragment f0 = mo3659f0(str3);
                    this.f3304y = f0;
                    m4210M(f0);
                }
                ArrayList<String> arrayList2 = yVar.f3327i;
                if (arrayList2 != null) {
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        this.f3289j.put(arrayList2.get(i3), yVar.f3328j.get(i3));
                    }
                }
                this.f3268G = new ArrayDeque<>(yVar.f3329k);
            }
        }
    }

    /* renamed from: h0 */
    public Fragment mo3661h0(int i) {
        return this.f3282c.mo3458g(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3662i(C0856a aVar) {
        if (this.f3283d == null) {
            this.f3283d = new ArrayList<>();
        }
        this.f3283d.add(aVar);
    }

    /* renamed from: i0 */
    public Fragment mo3663i0(String str) {
        return this.f3282c.mo3459h(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public Bundle m4211P0() {
        int size;
        Bundle bundle = new Bundle();
        m4237m0();
        m4218Y();
        mo3655b0(true);
        this.f3270I = true;
        this.f3277P.mo3725p(true);
        ArrayList<String> y = this.f3282c.mo3476y();
        ArrayList<C0863c0> m = this.f3282c.mo3464m();
        if (!m.isEmpty()) {
            ArrayList<String> z = this.f3282c.mo3477z();
            C0858b[] bVarArr = null;
            ArrayList<C0856a> arrayList = this.f3283d;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                bVarArr = new C0858b[size];
                for (int i = 0; i < size; i++) {
                    bVarArr[i] = new C0858b(this.f3283d.get(i));
                    if (m4207H0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f3283d.get(i));
                    }
                }
            }
            C0954y yVar = new C0954y();
            yVar.f3322d = y;
            yVar.f3323e = z;
            yVar.f3324f = bVarArr;
            yVar.f3325g = this.f3288i.get();
            Fragment fragment = this.f3304y;
            if (fragment != null) {
                yVar.f3326h = fragment.f2972i;
            }
            yVar.f3327i.addAll(this.f3289j.keySet());
            yVar.f3328j.addAll(this.f3289j.values());
            yVar.f3329k = new ArrayList<>(this.f3268G);
            bundle.putParcelable("state", yVar);
            for (String next : this.f3290k.keySet()) {
                bundle.putBundle("result_" + next, this.f3290k.get(next));
            }
            Iterator<C0863c0> it = m.iterator();
            while (it.hasNext()) {
                C0863c0 next2 = it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", next2);
                bundle.putBundle("fragment_" + next2.f3047e, bundle2);
            }
        } else if (m4207H0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0880d0 mo3665j(Fragment fragment) {
        String str = fragment.f2956T;
        if (str != null) {
            C1283d.m6157h(fragment, str);
        }
        if (m4207H0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C0880d0 w = mo3686w(fragment);
        fragment.f2986w = this;
        this.f3282c.mo3469r(w);
        if (!fragment.f2941E) {
            this.f3282c.mo3452a(fragment);
            fragment.f2979p = false;
            if (fragment.f2948L == null) {
                fragment.f2953Q = false;
            }
            if (m4208I0(fragment)) {
                this.f3269H = true;
            }
        }
        return w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public Fragment mo3666j0(String str) {
        return this.f3282c.mo3460i(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void mo3667j1() {
        synchronized (this.f3280a) {
            boolean z = true;
            if (this.f3280a.size() != 1) {
                z = false;
            }
            if (z) {
                this.f3301v.mo3596t().removeCallbacks(this.f3279R);
                this.f3301v.mo3596t().post(this.f3279R);
                m4246r1();
            }
        }
    }

    /* renamed from: k */
    public void mo3668k(C0857a0 a0Var) {
        this.f3294o.add(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k1 */
    public void mo3669k1(Fragment fragment, boolean z) {
        ViewGroup r0 = m4245r0(fragment);
        if (r0 != null && (r0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) r0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo3670l() {
        return this.f3288i.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public void mo3671l1(Fragment fragment, C0988f.C0993b bVar) {
        if (!fragment.equals(mo3659f0(fragment.f2972i)) || !(fragment.f2987x == null || fragment.f2986w == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.f2957U = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.activity.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0150  */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3672m(androidx.fragment.app.C0927o<?> r4, androidx.fragment.app.C0913l r5, androidx.fragment.app.Fragment r6) {
        /*
            r3 = this;
            androidx.fragment.app.o<?> r0 = r3.f3301v
            if (r0 != 0) goto L_0x0167
            r3.f3301v = r4
            r3.f3302w = r5
            r3.f3303x = r6
            if (r6 == 0) goto L_0x0015
            androidx.fragment.app.w$g r5 = new androidx.fragment.app.w$g
            r5.<init>(r6)
        L_0x0011:
            r3.mo3668k(r5)
            goto L_0x001d
        L_0x0015:
            boolean r5 = r4 instanceof androidx.fragment.app.C0857a0
            if (r5 == 0) goto L_0x001d
            r5 = r4
            androidx.fragment.app.a0 r5 = (androidx.fragment.app.C0857a0) r5
            goto L_0x0011
        L_0x001d:
            androidx.fragment.app.Fragment r5 = r3.f3303x
            if (r5 == 0) goto L_0x0024
            r3.m4246r1()
        L_0x0024:
            boolean r5 = r4 instanceof androidx.activity.C0062k
            if (r5 == 0) goto L_0x0039
            r5 = r4
            androidx.activity.k r5 = (androidx.activity.C0062k) r5
            androidx.activity.OnBackPressedDispatcher r0 = r5.mo110k()
            r3.f3286g = r0
            if (r6 == 0) goto L_0x0034
            r5 = r6
        L_0x0034:
            androidx.activity.g r1 = r3.f3287h
            r0.mo146b(r5, r1)
        L_0x0039:
            if (r6 == 0) goto L_0x0044
            androidx.fragment.app.w r4 = r6.f2986w
            androidx.fragment.app.z r4 = r4.m4240p0(r6)
        L_0x0041:
            r3.f3277P = r4
            goto L_0x005a
        L_0x0044:
            boolean r5 = r4 instanceof androidx.lifecycle.C0996g0
            if (r5 == 0) goto L_0x0053
            androidx.lifecycle.g0 r4 = (androidx.lifecycle.C0996g0) r4
            androidx.lifecycle.f0 r4 = r4.mo113o()
            androidx.fragment.app.z r4 = androidx.fragment.app.C0956z.m4352k(r4)
            goto L_0x0041
        L_0x0053:
            androidx.fragment.app.z r4 = new androidx.fragment.app.z
            r5 = 0
            r4.<init>(r5)
            goto L_0x0041
        L_0x005a:
            androidx.fragment.app.z r4 = r3.f3277P
            boolean r5 = r3.mo3639O0()
            r4.mo3725p(r5)
            androidx.fragment.app.e0 r4 = r3.f3282c
            androidx.fragment.app.z r5 = r3.f3277P
            r4.mo3450A(r5)
            androidx.fragment.app.o<?> r4 = r3.f3301v
            boolean r5 = r4 instanceof p065j0.C2318e
            if (r5 == 0) goto L_0x008b
            if (r6 != 0) goto L_0x008b
            j0.e r4 = (p065j0.C2318e) r4
            j0.c r4 = r4.mo111l()
            androidx.fragment.app.v r5 = new androidx.fragment.app.v
            r5.<init>(r3)
            java.lang.String r0 = "android:support:fragments"
            r4.mo8631h(r0, r5)
            android.os.Bundle r4 = r4.mo8626b(r0)
            if (r4 == 0) goto L_0x008b
            r3.mo3660g1(r4)
        L_0x008b:
            androidx.fragment.app.o<?> r4 = r3.f3301v
            boolean r5 = r4 instanceof androidx.activity.result.C0073e
            if (r5 == 0) goto L_0x0123
            androidx.activity.result.e r4 = (androidx.activity.result.C0073e) r4
            androidx.activity.result.d r4 = r4.mo108g()
            if (r6 == 0) goto L_0x00ad
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r6.f2972i
            r5.append(r0)
            java.lang.String r0 = ":"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto L_0x00af
        L_0x00ad:
            java.lang.String r5 = ""
        L_0x00af:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FragmentManager:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartActivityForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            b.c r1 = new b.c
            r1.<init>()
            androidx.fragment.app.w$h r2 = new androidx.fragment.app.w$h
            r2.<init>()
            androidx.activity.result.c r0 = r4.mo188g(r0, r1, r2)
            r3.f3265D = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartIntentSenderForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.w$j r1 = new androidx.fragment.app.w$j
            r1.<init>()
            androidx.fragment.app.w$i r2 = new androidx.fragment.app.w$i
            r2.<init>()
            androidx.activity.result.c r0 = r4.mo188g(r0, r1, r2)
            r3.f3266E = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "RequestPermissions"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            b.b r0 = new b.b
            r0.<init>()
            androidx.fragment.app.w$a r1 = new androidx.fragment.app.w$a
            r1.<init>()
            androidx.activity.result.c r4 = r4.mo188g(r5, r0, r1)
            r3.f3267F = r4
        L_0x0123:
            androidx.fragment.app.o<?> r4 = r3.f3301v
            boolean r5 = r4 instanceof androidx.core.content.C0474b
            if (r5 == 0) goto L_0x0130
            androidx.core.content.b r4 = (androidx.core.content.C0474b) r4
            androidx.core.util.a<android.content.res.Configuration> r5 = r3.f3295p
            r4.mo112m(r5)
        L_0x0130:
            androidx.fragment.app.o<?> r4 = r3.f3301v
            boolean r5 = r4 instanceof androidx.core.content.C0475c
            if (r5 == 0) goto L_0x013d
            androidx.core.content.c r4 = (androidx.core.content.C0475c) r4
            androidx.core.util.a<java.lang.Integer> r5 = r3.f3296q
            r4.mo142u(r5)
        L_0x013d:
            androidx.fragment.app.o<?> r4 = r3.f3301v
            boolean r5 = r4 instanceof androidx.core.app.C0463i
            if (r5 == 0) goto L_0x014a
            androidx.core.app.i r4 = (androidx.core.app.C0463i) r4
            androidx.core.util.a<androidx.core.app.f> r5 = r3.f3297r
            r4.mo109i(r5)
        L_0x014a:
            androidx.fragment.app.o<?> r4 = r3.f3301v
            boolean r5 = r4 instanceof androidx.core.app.C0464j
            if (r5 == 0) goto L_0x0157
            androidx.core.app.j r4 = (androidx.core.app.C0464j) r4
            androidx.core.util.a<androidx.core.app.k> r5 = r3.f3298s
            r4.mo105d(r5)
        L_0x0157:
            androidx.fragment.app.o<?> r4 = r3.f3301v
            boolean r5 = r4 instanceof androidx.core.view.C0680i
            if (r5 == 0) goto L_0x0166
            if (r6 != 0) goto L_0x0166
            androidx.core.view.i r4 = (androidx.core.view.C0680i) r4
            androidx.core.view.l r5 = r3.f3299t
            r4.mo107f(r5)
        L_0x0166:
            return
        L_0x0167:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            goto L_0x0170
        L_0x016f:
            throw r4
        L_0x0170:
            goto L_0x016f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0937w.mo3672m(androidx.fragment.app.o, androidx.fragment.app.l, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m1 */
    public void mo3673m1(Fragment fragment) {
        if (fragment == null || (fragment.equals(mo3659f0(fragment.f2972i)) && (fragment.f2987x == null || fragment.f2986w == this))) {
            Fragment fragment2 = this.f3304y;
            this.f3304y = fragment;
            m4210M(fragment2);
            m4210M(this.f3304y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3674n(Fragment fragment) {
        if (m4207H0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f2941E) {
            fragment.f2941E = false;
            if (!fragment.f2978o) {
                this.f3282c.mo3452a(fragment);
                if (m4207H0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (m4208I0(fragment)) {
                    this.f3269H = true;
                }
            }
        }
    }

    /* renamed from: o */
    public C0891f0 mo3675o() {
        return new C0856a(this);
    }

    /* renamed from: o0 */
    public int mo3676o0() {
        ArrayList<C0856a> arrayList = this.f3283d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o1 */
    public void mo3677o1(Fragment fragment) {
        if (m4207H0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f2940D) {
            fragment.f2940D = false;
            fragment.f2953Q = !fragment.f2953Q;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo3678p() {
        boolean z = false;
        for (Fragment next : this.f3282c.mo3463l()) {
            if (next != null) {
                z = m4208I0(next);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public C0913l mo3679q0() {
        return this.f3302w;
    }

    /* renamed from: s0 */
    public C0925n mo3680s0() {
        C0925n nVar = this.f3305z;
        if (nVar != null) {
            return nVar;
        }
        Fragment fragment = this.f3303x;
        return fragment != null ? fragment.f2986w.mo3680s0() : this.f3262A;
    }

    /* renamed from: t */
    public final void mo3681t(String str) {
        this.f3290k.remove(str);
        if (m4207H0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    /* renamed from: t0 */
    public List<Fragment> mo3682t0() {
        return this.f3282c.mo3466o();
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3303x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f3303x;
        } else {
            C0927o<?> oVar = this.f3301v;
            if (oVar != null) {
                sb.append(oVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.f3301v;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u0 */
    public C0927o<?> mo3684u0() {
        return this.f3301v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public LayoutInflater.Factory2 mo3685v0() {
        return this.f3285f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C0880d0 mo3686w(Fragment fragment) {
        C0880d0 n = this.f3282c.mo3465n(fragment.f2972i);
        if (n != null) {
            return n;
        }
        C0880d0 d0Var = new C0880d0(this.f3293n, this.f3282c, fragment);
        d0Var.mo3426o(this.f3301v.mo3595p().getClassLoader());
        d0Var.mo3430t(this.f3300u);
        return d0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public C0930q mo3687w0() {
        return this.f3293n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3688x(Fragment fragment) {
        if (m4207H0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f2941E) {
            fragment.f2941E = true;
            if (fragment.f2978o) {
                if (m4207H0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f3282c.mo3472u(fragment);
                if (m4208I0(fragment)) {
                    this.f3269H = true;
                }
                m4239n1(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public Fragment mo3689x0() {
        return this.f3303x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo3690y() {
        this.f3270I = false;
        this.f3271J = false;
        this.f3277P.mo3725p(false);
        m4215T(4);
    }

    /* renamed from: y0 */
    public Fragment mo3691y0() {
        return this.f3304y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo3692z() {
        this.f3270I = false;
        this.f3271J = false;
        this.f3277P.mo3725p(false);
        m4215T(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public C0924m0 mo3693z0() {
        C0924m0 m0Var = this.f3263B;
        if (m0Var != null) {
            return m0Var;
        }
        Fragment fragment = this.f3303x;
        return fragment != null ? fragment.f2986w.mo3693z0() : this.f3264C;
    }
}
