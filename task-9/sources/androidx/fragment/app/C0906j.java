package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0062k;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.C0069d;
import androidx.activity.result.C0073e;
import androidx.core.app.C0443b;
import androidx.core.app.C0459f;
import androidx.core.app.C0463i;
import androidx.core.app.C0464j;
import androidx.core.app.C0465k;
import androidx.core.content.C0474b;
import androidx.core.content.C0475c;
import androidx.core.util.C0604a;
import androidx.core.view.C0680i;
import androidx.core.view.C0700l;
import androidx.lifecycle.C0988f;
import androidx.lifecycle.C0994f0;
import androidx.lifecycle.C0996g0;
import androidx.lifecycle.C1006n;
import androidx.loader.app.C1035a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p065j0.C2312c;
import p065j0.C2318e;

/* renamed from: androidx.fragment.app.j */
public class C0906j extends ComponentActivity implements C0443b.C0447d, C0443b.C0449f {

    /* renamed from: v */
    final C0923m f3195v = C0923m.m4163b(new C0907a());

    /* renamed from: w */
    final C1006n f3196w = new C1006n(this);

    /* renamed from: x */
    boolean f3197x;

    /* renamed from: y */
    boolean f3198y;

    /* renamed from: z */
    boolean f3199z = true;

    /* renamed from: androidx.fragment.app.j$a */
    class C0907a extends C0927o<C0906j> implements C0474b, C0475c, C0463i, C0464j, C0996g0, C0062k, C0073e, C2318e, C0857a0, C0680i {
        public C0907a() {
            super(C0906j.this);
        }

        /* renamed from: A */
        public void mo3533A() {
            C0906j.this.invalidateOptionsMenu();
        }

        /* renamed from: B */
        public C0906j mo3536x() {
            return C0906j.this;
        }

        /* renamed from: a */
        public C0988f mo102a() {
            return C0906j.this.f3196w;
        }

        /* renamed from: b */
        public void mo3365b(C0937w wVar, Fragment fragment) {
            C0906j.this.mo3525W(fragment);
        }

        /* renamed from: d */
        public void mo105d(C0604a<C0465k> aVar) {
            C0906j.this.mo105d(aVar);
        }

        /* renamed from: e */
        public void mo106e(C0700l lVar) {
            C0906j.this.mo106e(lVar);
        }

        /* renamed from: f */
        public void mo107f(C0700l lVar) {
            C0906j.this.mo107f(lVar);
        }

        /* renamed from: g */
        public C0069d mo108g() {
            return C0906j.this.mo108g();
        }

        /* renamed from: h */
        public View mo3327h(int i) {
            return C0906j.this.findViewById(i);
        }

        /* renamed from: i */
        public void mo109i(C0604a<C0459f> aVar) {
            C0906j.this.mo109i(aVar);
        }

        /* renamed from: j */
        public boolean mo3328j() {
            Window window = C0906j.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: k */
        public OnBackPressedDispatcher mo110k() {
            return C0906j.this.mo110k();
        }

        /* renamed from: l */
        public C2312c mo111l() {
            return C0906j.this.mo111l();
        }

        /* renamed from: m */
        public void mo112m(C0604a<Configuration> aVar) {
            C0906j.this.mo112m(aVar);
        }

        /* renamed from: o */
        public C0994f0 mo113o() {
            return C0906j.this.mo113o();
        }

        /* renamed from: q */
        public void mo131q(C0604a<C0459f> aVar) {
            C0906j.this.mo131q(aVar);
        }

        /* renamed from: r */
        public void mo132r(C0604a<C0465k> aVar) {
            C0906j.this.mo132r(aVar);
        }

        /* renamed from: s */
        public void mo134s(C0604a<Integer> aVar) {
            C0906j.this.mo134s(aVar);
        }

        /* renamed from: u */
        public void mo142u(C0604a<Integer> aVar) {
            C0906j.this.mo142u(aVar);
        }

        /* renamed from: v */
        public void mo143v(C0604a<Configuration> aVar) {
            C0906j.this.mo143v(aVar);
        }

        /* renamed from: w */
        public void mo3535w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C0906j.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: y */
        public LayoutInflater mo3537y() {
            return C0906j.this.getLayoutInflater().cloneInContext(C0906j.this);
        }

        /* renamed from: z */
        public void mo3538z() {
            mo3533A();
        }
    }

    public C0906j() {
        m4073P();
    }

    /* renamed from: P */
    private void m4073P() {
        mo111l().mo8631h("android:support:lifecycle", new C0903i(this));
        mo112m(new C0895h(this));
        mo98C(new C0893g(this));
        mo97B(new C0890f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ Bundle m4074Q() {
        mo3524U();
        this.f3196w.mo3787i(C0988f.C0989a.ON_STOP);
        return new Bundle();
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m4075R(Configuration configuration) {
        this.f3195v.mo3590m();
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m4076S(Intent intent) {
        this.f3195v.mo3590m();
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m4077T(Context context) {
        this.f3195v.mo3579a((Fragment) null);
    }

    /* renamed from: V */
    private static boolean m4078V(C0937w wVar, C0988f.C0993b bVar) {
        boolean z = false;
        for (Fragment next : wVar.mo3682t0()) {
            if (next != null) {
                if (next.mo3319y() != null) {
                    z |= m4078V(next.mo3292p(), bVar);
                }
                C0908j0 j0Var = next.f2959W;
                if (j0Var != null && j0Var.mo102a().mo3775b().mo3782b(C0988f.C0993b.STARTED)) {
                    next.f2959W.mo3544h(bVar);
                    z = true;
                }
                if (next.f2958V.mo3775b().mo3782b(C0988f.C0993b.STARTED)) {
                    next.f2958V.mo3789o(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final View mo3522N(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3195v.mo3591n(view, str, context, attributeSet);
    }

    /* renamed from: O */
    public C0937w mo3523O() {
        return this.f3195v.mo3589l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo3524U() {
        do {
        } while (m4078V(mo3523O(), C0988f.C0993b.CREATED));
    }

    @Deprecated
    /* renamed from: W */
    public void mo3525W(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo3526X() {
        this.f3196w.mo3787i(C0988f.C0989a.ON_RESUME);
        this.f3195v.mo3585h();
    }

    @Deprecated
    /* renamed from: c */
    public final void mo2426c(int i) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (mo2438w(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f3197x);
            printWriter.print(" mResumed=");
            printWriter.print(this.f3198y);
            printWriter.print(" mStopped=");
            printWriter.print(this.f3199z);
            if (getApplication() != null) {
                C1035a.m4544b(this).mo3840a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f3195v.mo3589l().mo3649X(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f3195v.mo3590m();
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3196w.mo3787i(C0988f.C0989a.ON_CREATE);
        this.f3195v.mo3582e();
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View N = mo3522N(view, str, context, attributeSet);
        return N == null ? super.onCreateView(view, str, context, attributeSet) : N;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View N = mo3522N((View) null, str, context, attributeSet);
        return N == null ? super.onCreateView(str, context, attributeSet) : N;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f3195v.mo3583f();
        this.f3196w.mo3787i(C0988f.C0989a.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.f3195v.mo3581d(menuItem);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f3198y = false;
        this.f3195v.mo3584g();
        this.f3196w.mo3787i(C0988f.C0989a.ON_PAUSE);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo3526X();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f3195v.mo3590m();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.f3195v.mo3590m();
        super.onResume();
        this.f3198y = true;
        this.f3195v.mo3588k();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        this.f3195v.mo3590m();
        super.onStart();
        this.f3199z = false;
        if (!this.f3197x) {
            this.f3197x = true;
            this.f3195v.mo3580c();
        }
        this.f3195v.mo3588k();
        this.f3196w.mo3787i(C0988f.C0989a.ON_START);
        this.f3195v.mo3586i();
    }

    public void onStateNotSaved() {
        this.f3195v.mo3590m();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f3199z = true;
        mo3524U();
        this.f3195v.mo3587j();
        this.f3196w.mo3787i(C0988f.C0989a.ON_STOP);
    }
}
