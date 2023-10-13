package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.C0057f;
import androidx.lifecycle.C0998h0;
import androidx.lifecycle.C1001i0;
import androidx.lifecycle.C1005m;
import androidx.lifecycle.C1013s;
import p065j0.C2319f;

/* renamed from: androidx.fragment.app.e */
public class C0883e extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: f0 */
    private Handler f3113f0;

    /* renamed from: g0 */
    private Runnable f3114g0 = new C0884a();

    /* renamed from: h0 */
    private DialogInterface.OnCancelListener f3115h0 = new C0885b();
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public DialogInterface.OnDismissListener f3116i0 = new C0886c();

    /* renamed from: j0 */
    private int f3117j0 = 0;

    /* renamed from: k0 */
    private int f3118k0 = 0;

    /* renamed from: l0 */
    private boolean f3119l0 = true;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public boolean f3120m0 = true;

    /* renamed from: n0 */
    private int f3121n0 = -1;

    /* renamed from: o0 */
    private boolean f3122o0;

    /* renamed from: p0 */
    private C1013s<C1005m> f3123p0 = new C0887d();
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public Dialog f3124q0;

    /* renamed from: r0 */
    private boolean f3125r0;

    /* renamed from: s0 */
    private boolean f3126s0;

    /* renamed from: t0 */
    private boolean f3127t0;

    /* renamed from: u0 */
    private boolean f3128u0 = false;

    /* renamed from: androidx.fragment.app.e$a */
    class C0884a implements Runnable {
        C0884a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            C0883e.this.f3116i0.onDismiss(C0883e.this.f3124q0);
        }
    }

    /* renamed from: androidx.fragment.app.e$b */
    class C0885b implements DialogInterface.OnCancelListener {
        C0885b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (C0883e.this.f3124q0 != null) {
                C0883e eVar = C0883e.this;
                eVar.onCancel(eVar.f3124q0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$c */
    class C0886c implements DialogInterface.OnDismissListener {
        C0886c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (C0883e.this.f3124q0 != null) {
                C0883e eVar = C0883e.this;
                eVar.onDismiss(eVar.f3124q0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$d */
    class C0887d implements C1013s<C1005m> {
        C0887d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo3448a(C1005m mVar) {
            if (mVar != null && C0883e.this.f3120m0) {
                View l1 = C0883e.this.mo3281l1();
                if (l1.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (C0883e.this.f3124q0 != null) {
                    if (C0937w.m4207H0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + C0883e.this.f3124q0);
                    }
                    C0883e.this.f3124q0.setContentView(l1);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$e */
    class C0888e extends C0913l {

        /* renamed from: a */
        final /* synthetic */ C0913l f3133a;

        C0888e(C0913l lVar) {
            this.f3133a = lVar;
        }

        /* renamed from: h */
        public View mo3327h(int i) {
            return this.f3133a.mo3328j() ? this.f3133a.mo3327h(i) : C0883e.this.mo3439F1(i);
        }

        /* renamed from: j */
        public boolean mo3328j() {
            return this.f3133a.mo3328j() || C0883e.this.mo3440G1();
        }
    }

    /* renamed from: B1 */
    private void m3953B1(boolean z, boolean z2, boolean z3) {
        if (!this.f3126s0) {
            this.f3126s0 = true;
            this.f3127t0 = false;
            Dialog dialog = this.f3124q0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f3124q0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f3113f0.getLooper()) {
                        onDismiss(this.f3124q0);
                    } else {
                        this.f3113f0.post(this.f3114g0);
                    }
                }
            }
            this.f3125r0 = true;
            if (this.f3121n0 >= 0) {
                if (z3) {
                    mo3207D().mo3654a1(this.f3121n0, 1);
                } else {
                    mo3207D().mo3651Y0(this.f3121n0, 1, z);
                }
                this.f3121n0 = -1;
                return;
            }
            C0891f0 o = mo3207D().mo3675o();
            o.mo3484n(true);
            o.mo3353k(this);
            if (z3) {
                o.mo3350g();
            } else if (z) {
                o.mo3349f();
            } else {
                o.mo3348e();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: H1 */
    private void m3954H1(Bundle bundle) {
        if (this.f3120m0 && !this.f3128u0) {
            try {
                this.f3122o0 = true;
                Dialog E1 = mo3438E1(bundle);
                this.f3124q0 = E1;
                if (this.f3120m0) {
                    mo3442J1(E1, this.f3117j0);
                    Context q = mo3295q();
                    if (q instanceof Activity) {
                        this.f3124q0.setOwnerActivity((Activity) q);
                    }
                    this.f3124q0.setCancelable(this.f3119l0);
                    this.f3124q0.setOnCancelListener(this.f3115h0);
                    this.f3124q0.setOnDismissListener(this.f3116i0);
                    this.f3128u0 = true;
                } else {
                    this.f3124q0 = null;
                }
                this.f3122o0 = false;
            } catch (Throwable th) {
                this.f3122o0 = false;
                throw th;
            }
        }
    }

    /* renamed from: A1 */
    public void mo3435A1() {
        m3953B1(false, false, false);
    }

    /* renamed from: C1 */
    public Dialog mo3436C1() {
        return this.f3124q0;
    }

    /* renamed from: D1 */
    public int mo3437D1() {
        return this.f3118k0;
    }

    /* renamed from: E1 */
    public Dialog mo3438E1(Bundle bundle) {
        if (C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new C0057f(mo3279k1(), mo3437D1());
    }

    /* renamed from: F0 */
    public void mo3212F0(Bundle bundle) {
        super.mo3212F0(bundle);
        Dialog dialog = this.f3124q0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f3117j0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f3118k0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f3119l0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f3120m0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f3121n0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F1 */
    public View mo3439F1(int i) {
        Dialog dialog = this.f3124q0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    /* renamed from: G0 */
    public void mo3214G0() {
        super.mo3214G0();
        Dialog dialog = this.f3124q0;
        if (dialog != null) {
            this.f3125r0 = false;
            dialog.show();
            View decorView = this.f3124q0.getWindow().getDecorView();
            C0998h0.m4467a(decorView, this);
            C1001i0.m4469a(decorView, this);
            C2319f.m10786a(decorView, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G1 */
    public boolean mo3440G1() {
        return this.f3128u0;
    }

    /* renamed from: H0 */
    public void mo3216H0() {
        super.mo3216H0();
        Dialog dialog = this.f3124q0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: I1 */
    public final Dialog mo3441I1() {
        Dialog C1 = mo3436C1();
        if (C1 != null) {
            return C1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* renamed from: J0 */
    public void mo3220J0(Bundle bundle) {
        Bundle bundle2;
        super.mo3220J0(bundle);
        if (this.f3124q0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f3124q0.onRestoreInstanceState(bundle2);
        }
    }

    /* renamed from: J1 */
    public void mo3442J1(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo3233Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo3233Q0(layoutInflater, viewGroup, bundle);
        if (this.f2948L == null && this.f3124q0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f3124q0.onRestoreInstanceState(bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0913l mo3257d() {
        return new C0888e(super.mo3257d());
    }

    @Deprecated
    /* renamed from: d0 */
    public void mo3258d0(Bundle bundle) {
        super.mo3258d0(bundle);
    }

    /* renamed from: g0 */
    public void mo3267g0(Context context) {
        super.mo3267g0(context);
        mo3236S().mo3740e(this.f3123p0);
        if (!this.f3127t0) {
            this.f3126s0 = false;
        }
    }

    /* renamed from: j0 */
    public void mo3276j0(Bundle bundle) {
        super.mo3276j0(bundle);
        this.f3113f0 = new Handler();
        this.f3120m0 = this.f2938B == 0;
        if (bundle != null) {
            this.f3117j0 = bundle.getInt("android:style", 0);
            this.f3118k0 = bundle.getInt("android:theme", 0);
            this.f3119l0 = bundle.getBoolean("android:cancelable", true);
            this.f3120m0 = bundle.getBoolean("android:showsDialog", this.f3120m0);
            this.f3121n0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f3125r0) {
            if (C0937w.m4207H0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            m3953B1(true, true, false);
        }
    }

    /* renamed from: q0 */
    public void mo3296q0() {
        super.mo3296q0();
        Dialog dialog = this.f3124q0;
        if (dialog != null) {
            this.f3125r0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f3124q0.dismiss();
            if (!this.f3126s0) {
                onDismiss(this.f3124q0);
            }
            this.f3124q0 = null;
            this.f3128u0 = false;
        }
    }

    /* renamed from: r0 */
    public void mo3299r0() {
        super.mo3299r0();
        if (!this.f3127t0 && !this.f3126s0) {
            this.f3126s0 = true;
        }
        mo3236S().mo3743h(this.f3123p0);
    }

    /* renamed from: s0 */
    public LayoutInflater mo3302s0(Bundle bundle) {
        String str;
        StringBuilder sb;
        LayoutInflater s0 = super.mo3302s0(bundle);
        if (!this.f3120m0 || this.f3122o0) {
            if (C0937w.m4207H0(2)) {
                String str2 = "getting layout inflater for DialogFragment " + this;
                if (!this.f3120m0) {
                    sb = new StringBuilder();
                    str = "mShowsDialog = false: ";
                } else {
                    sb = new StringBuilder();
                    str = "mCreatingDialog = true: ";
                }
                sb.append(str);
                sb.append(str2);
                Log.d("FragmentManager", sb.toString());
            }
            return s0;
        }
        m3954H1(bundle);
        if (C0937w.m4207H0(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f3124q0;
        return dialog != null ? s0.cloneInContext(dialog.getContext()) : s0;
    }
}
