package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.C0502k;
import java.util.List;
import p052h0.C1998a;
import p052h0.C1999b;
import p052h0.C2000c;

public class Preference implements Comparable<Preference> {

    /* renamed from: A */
    private boolean f3506A;

    /* renamed from: B */
    private boolean f3507B;

    /* renamed from: C */
    private boolean f3508C;

    /* renamed from: D */
    private int f3509D;

    /* renamed from: E */
    private int f3510E;

    /* renamed from: F */
    private C1045b f3511F;

    /* renamed from: G */
    private List<Preference> f3512G;

    /* renamed from: H */
    private C1048e f3513H;

    /* renamed from: I */
    private final View.OnClickListener f3514I;

    /* renamed from: d */
    private final Context f3515d;

    /* renamed from: e */
    private C1046c f3516e;

    /* renamed from: f */
    private C1047d f3517f;

    /* renamed from: g */
    private int f3518g;

    /* renamed from: h */
    private int f3519h;

    /* renamed from: i */
    private CharSequence f3520i;

    /* renamed from: j */
    private CharSequence f3521j;

    /* renamed from: k */
    private int f3522k;

    /* renamed from: l */
    private String f3523l;

    /* renamed from: m */
    private Intent f3524m;

    /* renamed from: n */
    private String f3525n;

    /* renamed from: o */
    private boolean f3526o;

    /* renamed from: p */
    private boolean f3527p;

    /* renamed from: q */
    private boolean f3528q;

    /* renamed from: r */
    private String f3529r;

    /* renamed from: s */
    private Object f3530s;

    /* renamed from: t */
    private boolean f3531t;

    /* renamed from: u */
    private boolean f3532u;

    /* renamed from: v */
    private boolean f3533v;

    /* renamed from: w */
    private boolean f3534w;

    /* renamed from: x */
    private boolean f3535x;

    /* renamed from: y */
    private boolean f3536y;

    /* renamed from: z */
    private boolean f3537z;

    /* renamed from: androidx.preference.Preference$a */
    class C1044a implements View.OnClickListener {
        C1044a() {
        }

        public void onClick(View view) {
            Preference.this.mo3849y(view);
        }
    }

    /* renamed from: androidx.preference.Preference$b */
    interface C1045b {
        /* renamed from: a */
        void mo3897a(Preference preference);
    }

    /* renamed from: androidx.preference.Preference$c */
    public interface C1046c {
        /* renamed from: a */
        boolean mo3898a(Preference preference, Object obj);
    }

    /* renamed from: androidx.preference.Preference$d */
    public interface C1047d {
        /* renamed from: a */
        boolean mo3899a(Preference preference);
    }

    /* renamed from: androidx.preference.Preference$e */
    public interface C1048e<T extends Preference> {
        /* renamed from: a */
        CharSequence mo3859a(T t);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502k.m2294a(context, C2000c.preferenceStyle, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x00d4, code lost:
        if (r6.hasValue(r7) != false) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Preference(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r5.f3518g = r0
            r1 = 0
            r5.f3519h = r1
            r2 = 1
            r5.f3526o = r2
            r5.f3527p = r2
            r5.f3528q = r2
            r5.f3531t = r2
            r5.f3532u = r2
            r5.f3533v = r2
            r5.f3534w = r2
            r5.f3535x = r2
            r5.f3537z = r2
            r5.f3508C = r2
            int r3 = p052h0.C2002e.preference
            r5.f3509D = r3
            androidx.preference.Preference$a r4 = new androidx.preference.Preference$a
            r4.<init>()
            r5.f3514I = r4
            r5.f3515d = r6
            int[] r4 = p052h0.C2004g.f6975I
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r4, r8, r9)
            int r7 = p052h0.C2004g.f7029g0
            int r8 = p052h0.C2004g.f6977J
            int r7 = androidx.core.content.res.C0502k.m2307n(r6, r7, r8, r1)
            r5.f3522k = r7
            int r7 = p052h0.C2004g.f7035j0
            int r8 = p052h0.C2004g.f6989P
            java.lang.String r7 = androidx.core.content.res.C0502k.m2308o(r6, r7, r8)
            r5.f3523l = r7
            int r7 = p052h0.C2004g.f7051r0
            int r8 = p052h0.C2004g.f6985N
            java.lang.CharSequence r7 = androidx.core.content.res.C0502k.m2309p(r6, r7, r8)
            r5.f3520i = r7
            int r7 = p052h0.C2004g.f7049q0
            int r8 = p052h0.C2004g.f6991Q
            java.lang.CharSequence r7 = androidx.core.content.res.C0502k.m2309p(r6, r7, r8)
            r5.f3521j = r7
            int r7 = p052h0.C2004g.f7039l0
            int r8 = p052h0.C2004g.f6993R
            int r7 = androidx.core.content.res.C0502k.m2297d(r6, r7, r8, r0)
            r5.f3518g = r7
            int r7 = p052h0.C2004g.f7027f0
            int r8 = p052h0.C2004g.f7003W
            java.lang.String r7 = androidx.core.content.res.C0502k.m2308o(r6, r7, r8)
            r5.f3525n = r7
            int r7 = p052h0.C2004g.f7037k0
            int r8 = p052h0.C2004g.f6983M
            int r7 = androidx.core.content.res.C0502k.m2307n(r6, r7, r8, r3)
            r5.f3509D = r7
            int r7 = p052h0.C2004g.f7053s0
            int r8 = p052h0.C2004g.f6995S
            int r7 = androidx.core.content.res.C0502k.m2307n(r6, r7, r8, r1)
            r5.f3510E = r7
            int r7 = p052h0.C2004g.f7024e0
            int r8 = p052h0.C2004g.f6981L
            boolean r7 = androidx.core.content.res.C0502k.m2295b(r6, r7, r8, r2)
            r5.f3526o = r7
            int r7 = p052h0.C2004g.f7043n0
            int r8 = p052h0.C2004g.f6987O
            boolean r7 = androidx.core.content.res.C0502k.m2295b(r6, r7, r8, r2)
            r5.f3527p = r7
            int r7 = p052h0.C2004g.f7041m0
            int r8 = p052h0.C2004g.f6979K
            boolean r7 = androidx.core.content.res.C0502k.m2295b(r6, r7, r8, r2)
            r5.f3528q = r7
            int r7 = p052h0.C2004g.f7018c0
            int r8 = p052h0.C2004g.f6997T
            java.lang.String r7 = androidx.core.content.res.C0502k.m2308o(r6, r7, r8)
            r5.f3529r = r7
            int r7 = p052h0.C2004g.f7009Z
            boolean r8 = r5.f3527p
            boolean r7 = androidx.core.content.res.C0502k.m2295b(r6, r7, r7, r8)
            r5.f3534w = r7
            int r7 = p052h0.C2004g.f7012a0
            boolean r8 = r5.f3527p
            boolean r7 = androidx.core.content.res.C0502k.m2295b(r6, r7, r7, r8)
            r5.f3535x = r7
            int r7 = p052h0.C2004g.f7015b0
            boolean r8 = r6.hasValue(r7)
            if (r8 == 0) goto L_0x00ce
        L_0x00c7:
            java.lang.Object r7 = r5.mo3858v(r6, r7)
            r5.f3530s = r7
            goto L_0x00d7
        L_0x00ce:
            int r7 = p052h0.C2004g.f6999U
            boolean r8 = r6.hasValue(r7)
            if (r8 == 0) goto L_0x00d7
            goto L_0x00c7
        L_0x00d7:
            int r7 = p052h0.C2004g.f7045o0
            int r8 = p052h0.C2004g.f7001V
            boolean r7 = androidx.core.content.res.C0502k.m2295b(r6, r7, r8, r2)
            r5.f3508C = r7
            int r7 = p052h0.C2004g.f7047p0
            boolean r8 = r6.hasValue(r7)
            r5.f3536y = r8
            if (r8 == 0) goto L_0x00f3
            int r8 = p052h0.C2004g.f7005X
            boolean r7 = androidx.core.content.res.C0502k.m2295b(r6, r7, r8, r2)
            r5.f3537z = r7
        L_0x00f3:
            int r7 = p052h0.C2004g.f7031h0
            int r8 = p052h0.C2004g.f7007Y
            boolean r7 = androidx.core.content.res.C0502k.m2295b(r6, r7, r8, r1)
            r5.f3506A = r7
            int r7 = p052h0.C2004g.f7033i0
            boolean r7 = androidx.core.content.res.C0502k.m2295b(r6, r7, r7, r2)
            r5.f3533v = r7
            int r7 = p052h0.C2004g.f7021d0
            boolean r7 = androidx.core.content.res.C0502k.m2295b(r6, r7, r7, r1)
            r5.f3507B = r7
            r6.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo3869A(int i) {
        if (!mo3872E()) {
            return false;
        }
        if (i == mo3881h(i ^ -1)) {
            return true;
        }
        mo3883j();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo3870B(String str) {
        if (!mo3872E()) {
            return false;
        }
        if (TextUtils.equals(str, mo3882i((String) null))) {
            return true;
        }
        mo3883j();
        throw null;
    }

    /* renamed from: C */
    public final void mo3871C(C1048e eVar) {
        this.f3513H = eVar;
        mo3853r();
    }

    /* renamed from: D */
    public boolean mo3856D() {
        return !mo3888p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo3872E() {
        return false;
    }

    /* renamed from: a */
    public boolean mo3873a(Object obj) {
        C1046c cVar = this.f3516e;
        return cVar == null || cVar.mo3898a(this, obj);
    }

    /* renamed from: b */
    public int compareTo(Preference preference) {
        int i = this.f3518g;
        int i2 = preference.f3518g;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f3520i;
        CharSequence charSequence2 = preference.f3520i;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f3520i.toString());
    }

    /* renamed from: c */
    public Context mo3875c() {
        return this.f3515d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public StringBuilder mo3877d() {
        StringBuilder sb = new StringBuilder();
        CharSequence n = mo3886n();
        if (!TextUtils.isEmpty(n)) {
            sb.append(n);
            sb.append(' ');
        }
        CharSequence l = mo3867l();
        if (!TextUtils.isEmpty(l)) {
            sb.append(l);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    /* renamed from: e */
    public String mo3878e() {
        return this.f3525n;
    }

    /* renamed from: f */
    public Intent mo3879f() {
        return this.f3524m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo3880g(boolean z) {
        if (!mo3872E()) {
            return z;
        }
        mo3883j();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo3881h(int i) {
        if (!mo3872E()) {
            return i;
        }
        mo3883j();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo3882i(String str) {
        if (!mo3872E()) {
            return str;
        }
        mo3883j();
        throw null;
    }

    /* renamed from: j */
    public C1998a mo3883j() {
        return null;
    }

    /* renamed from: k */
    public C1999b mo3884k() {
        return null;
    }

    /* renamed from: l */
    public CharSequence mo3867l() {
        return mo3885m() != null ? mo3885m().mo3859a(this) : this.f3521j;
    }

    /* renamed from: m */
    public final C1048e mo3885m() {
        return this.f3513H;
    }

    /* renamed from: n */
    public CharSequence mo3886n() {
        return this.f3520i;
    }

    /* renamed from: o */
    public boolean mo3887o() {
        return !TextUtils.isEmpty(this.f3523l);
    }

    /* renamed from: p */
    public boolean mo3888p() {
        return this.f3526o && this.f3531t && this.f3532u;
    }

    /* renamed from: q */
    public boolean mo3889q() {
        return this.f3527p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo3853r() {
        C1045b bVar = this.f3511F;
        if (bVar != null) {
            bVar.mo3897a(this);
        }
    }

    /* renamed from: s */
    public void mo3890s(boolean z) {
        List<Preference> list = this.f3512G;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).mo3892u(this, z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo3851t() {
    }

    public String toString() {
        return mo3877d().toString();
    }

    /* renamed from: u */
    public void mo3892u(Preference preference, boolean z) {
        if (this.f3531t == z) {
            this.f3531t = !z;
            mo3890s(mo3856D());
            mo3853r();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo3858v(TypedArray typedArray, int i) {
        return null;
    }

    /* renamed from: w */
    public void mo3893w(Preference preference, boolean z) {
        if (this.f3532u == z) {
            this.f3532u = !z;
            mo3890s(mo3856D());
            mo3853r();
        }
    }

    /* renamed from: x */
    public void mo3894x() {
        if (mo3888p() && mo3889q()) {
            mo3851t();
            C1047d dVar = this.f3517f;
            if (dVar == null || !dVar.mo3899a(this)) {
                mo3884k();
                if (this.f3524m != null) {
                    mo3875c().startActivity(this.f3524m);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo3849y(View view) {
        mo3894x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public boolean mo3895z(boolean z) {
        if (!mo3872E()) {
            return false;
        }
        if (z == mo3880g(!z)) {
            return true;
        }
        mo3883j();
        throw null;
    }
}
