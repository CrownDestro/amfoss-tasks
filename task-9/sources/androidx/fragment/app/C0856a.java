package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.C0891f0;
import androidx.fragment.app.C0937w;
import java.io.PrintWriter;
import java.util.ArrayList;
import p152x3.C3538d;

/* renamed from: androidx.fragment.app.a */
final class C0856a extends C0891f0 implements C0937w.C0951m {

    /* renamed from: t */
    final C0937w f3026t;

    /* renamed from: u */
    boolean f3027u;

    /* renamed from: v */
    int f3028v;

    /* renamed from: w */
    boolean f3029w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0856a(C0937w wVar) {
        super(wVar.mo3680s0(), wVar.mo3684u0() != null ? wVar.mo3684u0().mo3595p().getClassLoader() : null);
        this.f3028v = -1;
        this.f3029w = false;
        this.f3026t = wVar;
    }

    /* renamed from: a */
    public boolean mo3347a(ArrayList<C0856a> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0937w.m4207H0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3148i) {
            return true;
        }
        this.f3026t.mo3662i(this);
        return true;
    }

    /* renamed from: e */
    public int mo3348e() {
        return mo3355p(false);
    }

    /* renamed from: f */
    public int mo3349f() {
        return mo3355p(true);
    }

    /* renamed from: g */
    public void mo3350g() {
        mo3481i();
        this.f3026t.mo3656c0(this, false);
    }

    /* renamed from: h */
    public void mo3351h() {
        mo3481i();
        this.f3026t.mo3656c0(this, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3352j(int i, Fragment fragment, String str, int i2) {
        super.mo3352j(i, fragment, str, i2);
        fragment.f2986w = this.f3026t;
    }

    /* renamed from: k */
    public C0891f0 mo3353k(Fragment fragment) {
        C0937w wVar = fragment.f2986w;
        if (wVar == null || wVar == this.f3026t) {
            return super.mo3353k(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo3354o(int i) {
        if (this.f3148i) {
            if (C0937w.m4207H0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f3142c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0891f0.C0892a aVar = this.f3142c.get(i2);
                Fragment fragment = aVar.f3160b;
                if (fragment != null) {
                    fragment.f2985v += i;
                    if (C0937w.m4207H0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3160b + " to " + aVar.f3160b.f2985v);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo3355p(boolean z) {
        if (!this.f3027u) {
            if (C0937w.m4207H0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C0912k0("FragmentManager"));
                mo3356q("  ", printWriter);
                printWriter.close();
            }
            this.f3027u = true;
            this.f3028v = this.f3148i ? this.f3026t.mo3670l() : -1;
            this.f3026t.mo3652Z(this, z);
            return this.f3028v;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: q */
    public void mo3356q(String str, PrintWriter printWriter) {
        mo3357r(str, printWriter, true);
    }

    /* renamed from: r */
    public void mo3357r(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3150k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3028v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3027u);
            if (this.f3147h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3147h));
            }
            if (!(this.f3143d == 0 && this.f3144e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3143d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3144e));
            }
            if (!(this.f3145f == 0 && this.f3146g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3145f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3146g));
            }
            if (!(this.f3151l == 0 && this.f3152m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3151l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3152m);
            }
            if (!(this.f3153n == 0 && this.f3154o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3153n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3154o);
            }
        }
        if (!this.f3142c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3142c.size();
            for (int i = 0; i < size; i++) {
                C0891f0.C0892a aVar = this.f3142c.get(i);
                switch (aVar.f3159a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = C3538d.f11491H;
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f3159a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3160b);
                if (z) {
                    if (!(aVar.f3162d == 0 && aVar.f3163e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3162d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3163e));
                    }
                    if (aVar.f3164f != 0 || aVar.f3165g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3164f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3165g));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3358s() {
        C0937w wVar;
        int size = this.f3142c.size();
        for (int i = 0; i < size; i++) {
            C0891f0.C0892a aVar = this.f3142c.get(i);
            Fragment fragment = aVar.f3160b;
            if (fragment != null) {
                fragment.f2980q = this.f3029w;
                fragment.mo3306t1(false);
                fragment.mo3303s1(this.f3147h);
                fragment.mo3313v1(this.f3155p, this.f3156q);
            }
            switch (aVar.f3159a) {
                case 1:
                    fragment.mo3294p1(aVar.f3162d, aVar.f3163e, aVar.f3164f, aVar.f3165g);
                    this.f3026t.mo3669k1(fragment, false);
                    this.f3026t.mo3665j(fragment);
                    continue;
                case 3:
                    fragment.mo3294p1(aVar.f3162d, aVar.f3163e, aVar.f3164f, aVar.f3165g);
                    this.f3026t.mo3658d1(fragment);
                    continue;
                case 4:
                    fragment.mo3294p1(aVar.f3162d, aVar.f3163e, aVar.f3164f, aVar.f3165g);
                    this.f3026t.mo3623E0(fragment);
                    continue;
                case 5:
                    fragment.mo3294p1(aVar.f3162d, aVar.f3163e, aVar.f3164f, aVar.f3165g);
                    this.f3026t.mo3669k1(fragment, false);
                    this.f3026t.mo3677o1(fragment);
                    continue;
                case 6:
                    fragment.mo3294p1(aVar.f3162d, aVar.f3163e, aVar.f3164f, aVar.f3165g);
                    this.f3026t.mo3688x(fragment);
                    continue;
                case 7:
                    fragment.mo3294p1(aVar.f3162d, aVar.f3163e, aVar.f3164f, aVar.f3165g);
                    this.f3026t.mo3669k1(fragment, false);
                    this.f3026t.mo3674n(fragment);
                    continue;
                case 8:
                    wVar = this.f3026t;
                    break;
                case 9:
                    wVar = this.f3026t;
                    fragment = null;
                    break;
                case 10:
                    this.f3026t.mo3671l1(fragment, aVar.f3167i);
                    continue;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3159a);
            }
            wVar.mo3673m1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3359t() {
        C0937w wVar;
        for (int size = this.f3142c.size() - 1; size >= 0; size--) {
            C0891f0.C0892a aVar = this.f3142c.get(size);
            Fragment fragment = aVar.f3160b;
            if (fragment != null) {
                fragment.f2980q = this.f3029w;
                fragment.mo3306t1(true);
                fragment.mo3303s1(C0937w.m4234h1(this.f3147h));
                fragment.mo3313v1(this.f3156q, this.f3155p);
            }
            switch (aVar.f3159a) {
                case 1:
                    fragment.mo3294p1(aVar.f3162d, aVar.f3163e, aVar.f3164f, aVar.f3165g);
                    this.f3026t.mo3669k1(fragment, true);
                    this.f3026t.mo3658d1(fragment);
                    continue;
                case 3:
                    fragment.mo3294p1(aVar.f3162d, aVar.f3163e, aVar.f3164f, aVar.f3165g);
                    this.f3026t.mo3665j(fragment);
                    continue;
                case 4:
                    fragment.mo3294p1(aVar.f3162d, aVar.f3163e, aVar.f3164f, aVar.f3165g);
                    this.f3026t.mo3677o1(fragment);
                    continue;
                case 5:
                    fragment.mo3294p1(aVar.f3162d, aVar.f3163e, aVar.f3164f, aVar.f3165g);
                    this.f3026t.mo3669k1(fragment, true);
                    this.f3026t.mo3623E0(fragment);
                    continue;
                case 6:
                    fragment.mo3294p1(aVar.f3162d, aVar.f3163e, aVar.f3164f, aVar.f3165g);
                    this.f3026t.mo3674n(fragment);
                    continue;
                case 7:
                    fragment.mo3294p1(aVar.f3162d, aVar.f3163e, aVar.f3164f, aVar.f3165g);
                    this.f3026t.mo3669k1(fragment, true);
                    this.f3026t.mo3688x(fragment);
                    continue;
                case 8:
                    wVar = this.f3026t;
                    fragment = null;
                    break;
                case 9:
                    wVar = this.f3026t;
                    break;
                case 10:
                    this.f3026t.mo3671l1(fragment, aVar.f3166h);
                    continue;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3159a);
            }
            wVar.mo3673m1(fragment);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3028v >= 0) {
            sb.append(" #");
            sb.append(this.f3028v);
        }
        if (this.f3150k != null) {
            sb.append(" ");
            sb.append(this.f3150k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public Fragment mo3361u(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f3142c.size()) {
            C0891f0.C0892a aVar = this.f3142c.get(i);
            int i2 = aVar.f3159a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f3160b;
                    int i3 = fragment3.f2938B;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.f2938B == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f3142c.add(i, new C0891f0.C0892a(9, fragment4, true));
                                    i++;
                                    fragment2 = null;
                                }
                                C0891f0.C0892a aVar2 = new C0891f0.C0892a(3, fragment4, true);
                                aVar2.f3162d = aVar.f3162d;
                                aVar2.f3164f = aVar.f3164f;
                                aVar2.f3163e = aVar.f3163e;
                                aVar2.f3165g = aVar.f3165g;
                                this.f3142c.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f3142c.remove(i);
                        i--;
                    } else {
                        aVar.f3159a = 1;
                        aVar.f3161c = true;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f3160b);
                    Fragment fragment5 = aVar.f3160b;
                    if (fragment5 == fragment2) {
                        this.f3142c.add(i, new C0891f0.C0892a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f3142c.add(i, new C0891f0.C0892a(9, fragment2, true));
                        aVar.f3161c = true;
                        i++;
                        fragment2 = aVar.f3160b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f3160b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: v */
    public String mo3362v() {
        return this.f3150k;
    }

    /* renamed from: w */
    public void mo3363w() {
        if (this.f3158s != null) {
            for (int i = 0; i < this.f3158s.size(); i++) {
                this.f3158s.get(i).run();
            }
            this.f3158s = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public Fragment mo3364x(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f3142c.size() - 1; size >= 0; size--) {
            C0891f0.C0892a aVar = this.f3142c.get(size);
            int i = aVar.f3159a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3160b;
                            break;
                        case 10:
                            aVar.f3167i = aVar.f3166h;
                            break;
                    }
                }
                arrayList.add(aVar.f3160b);
            }
            arrayList.remove(aVar.f3160b);
        }
        return fragment;
    }
}
