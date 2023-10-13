package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.util.C0612h;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.o */
public abstract class C0927o<E> extends C0913l {

    /* renamed from: d */
    private final Activity f3245d;

    /* renamed from: e */
    private final Context f3246e;

    /* renamed from: f */
    private final Handler f3247f;

    /* renamed from: g */
    private final int f3248g;

    /* renamed from: h */
    final C0937w f3249h;

    C0927o(Activity activity, Context context, Handler handler, int i) {
        this.f3249h = new C0953x();
        this.f3245d = activity;
        this.f3246e = (Context) C0612h.m2671h(context, "context == null");
        this.f3247f = (Handler) C0612h.m2671h(handler, "handler == null");
        this.f3248g = i;
    }

    C0927o(C0906j jVar) {
        this(jVar, jVar, new Handler(), 0);
    }

    /* renamed from: h */
    public View mo3327h(int i) {
        return null;
    }

    /* renamed from: j */
    public boolean mo3328j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Activity mo3594n() {
        return this.f3245d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public Context mo3595p() {
        return this.f3246e;
    }

    /* renamed from: t */
    public Handler mo3596t() {
        return this.f3247f;
    }

    /* renamed from: w */
    public void mo3535w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: x */
    public abstract E mo3536x();

    /* renamed from: y */
    public LayoutInflater mo3537y() {
        return LayoutInflater.from(this.f3246e);
    }

    /* renamed from: z */
    public void mo3538z() {
    }
}
