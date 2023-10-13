package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.res.C0502k;
import java.util.ArrayList;
import java.util.List;
import p052h0.C2004g;
import p070k.C2348g;

public abstract class PreferenceGroup extends Preference {

    /* renamed from: J */
    final C2348g<String, Long> f3539J;

    /* renamed from: K */
    private final Handler f3540K;

    /* renamed from: L */
    private final List<Preference> f3541L;

    /* renamed from: M */
    private boolean f3542M;

    /* renamed from: N */
    private int f3543N;

    /* renamed from: O */
    private boolean f3544O;

    /* renamed from: P */
    private int f3545P;

    /* renamed from: Q */
    private C1050b f3546Q;

    /* renamed from: R */
    private final Runnable f3547R;

    /* renamed from: androidx.preference.PreferenceGroup$a */
    class C1049a implements Runnable {
        C1049a() {
        }

        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f3539J.clear();
            }
        }
    }

    /* renamed from: androidx.preference.PreferenceGroup$b */
    public interface C1050b {
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3539J = new C2348g<>();
        this.f3540K = new Handler(Looper.getMainLooper());
        this.f3542M = true;
        this.f3543N = 0;
        this.f3544O = false;
        this.f3545P = Integer.MAX_VALUE;
        this.f3546Q = null;
        this.f3547R = new C1049a();
        this.f3541L = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2004g.f7059v0, i, i2);
        int i3 = C2004g.f7063x0;
        this.f3542M = C0502k.m2295b(obtainStyledAttributes, i3, i3, true);
        int i4 = C2004g.f7061w0;
        if (obtainStyledAttributes.hasValue(i4)) {
            mo3902H(C0502k.m2297d(obtainStyledAttributes, i4, i4, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: F */
    public Preference mo3900F(int i) {
        return this.f3541L.get(i);
    }

    /* renamed from: G */
    public int mo3901G() {
        return this.f3541L.size();
    }

    /* renamed from: H */
    public void mo3902H(int i) {
        if (i != Integer.MAX_VALUE && !mo3887o()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f3545P = i;
    }

    /* renamed from: s */
    public void mo3890s(boolean z) {
        super.mo3890s(z);
        int G = mo3901G();
        for (int i = 0; i < G; i++) {
            mo3900F(i).mo3893w(this, z);
        }
    }
}
