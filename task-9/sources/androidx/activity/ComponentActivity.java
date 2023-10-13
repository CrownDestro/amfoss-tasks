package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.C0069d;
import androidx.activity.result.C0073e;
import androidx.core.app.C0458e;
import androidx.core.app.C0459f;
import androidx.core.app.C0463i;
import androidx.core.app.C0464j;
import androidx.core.app.C0465k;
import androidx.core.content.C0469a;
import androidx.core.content.C0474b;
import androidx.core.content.C0475c;
import androidx.core.p008os.C0545a;
import androidx.core.util.C0604a;
import androidx.core.view.C0680i;
import androidx.core.view.C0682j;
import androidx.core.view.C0700l;
import androidx.lifecycle.C0974c0;
import androidx.lifecycle.C0986e;
import androidx.lifecycle.C0988f;
import androidx.lifecycle.C0994f0;
import androidx.lifecycle.C0996g0;
import androidx.lifecycle.C0998h0;
import androidx.lifecycle.C1001i0;
import androidx.lifecycle.C1002j;
import androidx.lifecycle.C1005m;
import androidx.lifecycle.C1006n;
import androidx.lifecycle.C1020v;
import androidx.lifecycle.C1028y;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.C0000a;
import p000a.C0001b;
import p038f0.C1899a;
import p038f0.C1904d;
import p065j0.C2312c;
import p065j0.C2316d;
import p065j0.C2318e;
import p065j0.C2319f;
import p077l0.C2459a;

public class ComponentActivity extends C0458e implements C0996g0, C0986e, C2318e, C0062k, C0073e, C0474b, C0475c, C0463i, C0464j, C0680i {

    /* renamed from: f */
    final C0000a f152f = new C0000a();

    /* renamed from: g */
    private final C0682j f153g = new C0682j(new C0055d(this));

    /* renamed from: h */
    private final C1006n f154h = new C1006n(this);

    /* renamed from: i */
    final C2316d f155i;

    /* renamed from: j */
    private C0994f0 f156j;

    /* renamed from: k */
    private final OnBackPressedDispatcher f157k;

    /* renamed from: l */
    private int f158l;

    /* renamed from: m */
    private final AtomicInteger f159m;

    /* renamed from: n */
    private final C0069d f160n;

    /* renamed from: o */
    private final CopyOnWriteArrayList<C0604a<Configuration>> f161o;

    /* renamed from: p */
    private final CopyOnWriteArrayList<C0604a<Integer>> f162p;

    /* renamed from: q */
    private final CopyOnWriteArrayList<C0604a<Intent>> f163q;

    /* renamed from: r */
    private final CopyOnWriteArrayList<C0604a<C0459f>> f164r;

    /* renamed from: s */
    private final CopyOnWriteArrayList<C0604a<C0465k>> f165s;

    /* renamed from: t */
    private boolean f166t;

    /* renamed from: u */
    private boolean f167u;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0045a implements Runnable {
        C0045a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    class C0046b extends C0069d {
        C0046b() {
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    static class C0047c {
        /* renamed from: a */
        static void m176a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    static class C0048d {
        /* renamed from: a */
        static OnBackInvokedDispatcher m177a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$e */
    static final class C0049e {

        /* renamed from: a */
        Object f173a;

        /* renamed from: b */
        C0994f0 f174b;

        C0049e() {
        }
    }

    public ComponentActivity() {
        C2316d a = C2316d.m10779a(this);
        this.f155i = a;
        this.f157k = new OnBackPressedDispatcher(new C0045a());
        this.f159m = new AtomicInteger();
        this.f160n = new C0046b();
        this.f161o = new CopyOnWriteArrayList<>();
        this.f162p = new CopyOnWriteArrayList<>();
        this.f163q = new CopyOnWriteArrayList<>();
        this.f164r = new CopyOnWriteArrayList<>();
        this.f165s = new CopyOnWriteArrayList<>();
        this.f166t = false;
        this.f167u = false;
        if (mo102a() != null) {
            int i = Build.VERSION.SDK_INT;
            mo102a().mo3774a(new C1002j() {
                /* renamed from: j */
                public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
                    if (aVar == C0988f.C0989a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            C0047c.m176a(peekDecorView);
                        }
                    }
                }
            });
            mo102a().mo3774a(new C1002j() {
                /* renamed from: j */
                public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
                    if (aVar == C0988f.C0989a.ON_DESTROY) {
                        ComponentActivity.this.f152f.mo2b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.mo113o().mo3783a();
                        }
                    }
                }
            });
            mo102a().mo3774a(new C1002j() {
                /* renamed from: j */
                public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
                    ComponentActivity.this.mo99D();
                    ComponentActivity.this.mo102a().mo3777d(this);
                }
            });
            a.mo8634c();
            C1028y.m4535a(this);
            if (i <= 23) {
                mo102a().mo3774a(new ImmLeaksCleaner(this));
            }
            mo111l().mo8631h("android:support:activity-result", new C0054c(this));
            mo97B(new C0053b(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: E */
    private void m147E() {
        C0998h0.m4467a(getWindow().getDecorView(), this);
        C1001i0.m4469a(getWindow().getDecorView(), this);
        C2319f.m10786a(getWindow().getDecorView(), this);
        C0064m.m208a(getWindow().getDecorView(), this);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ Bundle m148G() {
        Bundle bundle = new Bundle();
        this.f160n.mo187f(bundle);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m149H(Context context) {
        Bundle b = mo111l().mo8626b("android:support:activity-result");
        if (b != null) {
            this.f160n.mo186e(b);
        }
    }

    /* renamed from: B */
    public final void mo97B(C0001b bVar) {
        this.f152f.mo1a(bVar);
    }

    /* renamed from: C */
    public final void mo98C(C0604a<Intent> aVar) {
        this.f163q.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo99D() {
        if (this.f156j == null) {
            C0049e eVar = (C0049e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.f156j = eVar.f174b;
            }
            if (this.f156j == null) {
                this.f156j = new C0994f0();
            }
        }
    }

    /* renamed from: F */
    public void mo100F() {
        invalidateOptionsMenu();
    }

    @Deprecated
    /* renamed from: I */
    public Object mo101I() {
        return null;
    }

    /* renamed from: a */
    public C0988f mo102a() {
        return this.f154h;
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m147E();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: b */
    public C1899a mo104b() {
        C1904d dVar = new C1904d();
        if (getApplication() != null) {
            dVar.mo7622b(C0974c0.C0975a.f3410e, getApplication());
        }
        dVar.mo7622b(C1028y.f3464a, this);
        dVar.mo7622b(C1028y.f3465b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            dVar.mo7622b(C1028y.f3466c, getIntent().getExtras());
        }
        return dVar;
    }

    /* renamed from: d */
    public final void mo105d(C0604a<C0465k> aVar) {
        this.f165s.add(aVar);
    }

    /* renamed from: e */
    public void mo106e(C0700l lVar) {
        this.f153g.mo2820f(lVar);
    }

    /* renamed from: f */
    public void mo107f(C0700l lVar) {
        this.f153g.mo2815a(lVar);
    }

    /* renamed from: g */
    public final C0069d mo108g() {
        return this.f160n;
    }

    /* renamed from: i */
    public final void mo109i(C0604a<C0459f> aVar) {
        this.f164r.add(aVar);
    }

    /* renamed from: k */
    public final OnBackPressedDispatcher mo110k() {
        return this.f157k;
    }

    /* renamed from: l */
    public final C2312c mo111l() {
        return this.f155i.mo8633b();
    }

    /* renamed from: m */
    public final void mo112m(C0604a<Configuration> aVar) {
        this.f161o.add(aVar);
    }

    /* renamed from: o */
    public C0994f0 mo113o() {
        if (getApplication() != null) {
            mo99D();
            return this.f156j;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f160n.mo185b(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.f157k.mo149f();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<C0604a<Configuration>> it = this.f161o.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f155i.mo8635d(bundle);
        this.f152f.mo3c(this);
        super.onCreate(bundle);
        C1020v.m4519f(this);
        if (C0545a.m2512c()) {
            this.f157k.mo150g(C0048d.m177a(this));
        }
        int i = this.f158l;
        if (i != 0) {
            setContentView(i);
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.f153g.mo2816b(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f153g.mo2818d(menuItem);
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z) {
        if (!this.f166t) {
            Iterator<C0604a<C0459f>> it = this.f164r.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0459f(z));
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f166t = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f166t = false;
            Iterator<C0604a<C0459f>> it = this.f164r.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0459f(z, configuration));
            }
        } catch (Throwable th) {
            this.f166t = false;
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<C0604a<Intent>> it = this.f163q.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f153g.mo2817c(menu);
        super.onPanelClosed(i, menu);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        if (!this.f167u) {
            Iterator<C0604a<C0465k>> it = this.f165s.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0465k(z));
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f167u = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f167u = false;
            Iterator<C0604a<C0465k>> it = this.f165s.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0465k(z, configuration));
            }
        } catch (Throwable th) {
            this.f167u = false;
            throw th;
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.f153g.mo2819e(menu);
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.f160n.mo185b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        C0049e eVar;
        Object I = mo101I();
        C0994f0 f0Var = this.f156j;
        if (f0Var == null && (eVar = (C0049e) getLastNonConfigurationInstance()) != null) {
            f0Var = eVar.f174b;
        }
        if (f0Var == null && I == null) {
            return null;
        }
        C0049e eVar2 = new C0049e();
        eVar2.f173a = I;
        eVar2.f174b = f0Var;
        return eVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C0988f a = mo102a();
        if (a instanceof C1006n) {
            ((C1006n) a).mo3789o(C0988f.C0993b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f155i.mo8636e(bundle);
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<C0604a<Integer>> it = this.f162p.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    /* renamed from: q */
    public final void mo131q(C0604a<C0459f> aVar) {
        this.f164r.remove(aVar);
    }

    /* renamed from: r */
    public final void mo132r(C0604a<C0465k> aVar) {
        this.f165s.remove(aVar);
    }

    public void reportFullyDrawn() {
        try {
            if (C2459a.m11415h()) {
                C2459a.m11410c("reportFullyDrawn() for ComponentActivity");
            }
            int i = Build.VERSION.SDK_INT;
            if (i > 19 || (i == 19 && C0469a.m2171a(this, "android.permission.UPDATE_DEVICE_STATS") == 0)) {
                super.reportFullyDrawn();
            }
        } finally {
            C2459a.m11413f();
        }
    }

    /* renamed from: s */
    public final void mo134s(C0604a<Integer> aVar) {
        this.f162p.remove(aVar);
    }

    public void setContentView(int i) {
        m147E();
        super.setContentView(i);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m147E();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m147E();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: u */
    public final void mo142u(C0604a<Integer> aVar) {
        this.f162p.add(aVar);
    }

    /* renamed from: v */
    public final void mo143v(C0604a<Configuration> aVar) {
        this.f161o.remove(aVar);
    }
}
