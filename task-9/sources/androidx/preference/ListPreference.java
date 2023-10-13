package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.res.C0502k;
import androidx.preference.Preference;
import p052h0.C2000c;
import p052h0.C2003f;
import p052h0.C2004g;

public class ListPreference extends DialogPreference {

    /* renamed from: P */
    private CharSequence[] f3497P;

    /* renamed from: Q */
    private CharSequence[] f3498Q;

    /* renamed from: R */
    private String f3499R;

    /* renamed from: S */
    private String f3500S;

    /* renamed from: T */
    private boolean f3501T;

    /* renamed from: androidx.preference.ListPreference$a */
    public static final class C1043a implements Preference.C1048e<ListPreference> {

        /* renamed from: a */
        private static C1043a f3502a;

        private C1043a() {
        }

        /* renamed from: b */
        public static C1043a m4585b() {
            if (f3502a == null) {
                f3502a = new C1043a();
            }
            return f3502a;
        }

        /* renamed from: c */
        public CharSequence mo3859a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.mo3863H()) ? listPreference.mo3875c().getString(C2003f.not_set) : listPreference.mo3863H();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502k.m2294a(context, C2000c.dialogPreferenceStyle, 16842897));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2004g.f7062x, i, i2);
        this.f3497P = C0502k.m2310q(obtainStyledAttributes, C2004g.f6959A, C2004g.f7064y);
        this.f3498Q = C0502k.m2310q(obtainStyledAttributes, C2004g.f6961B, C2004g.f7066z);
        int i3 = C2004g.f6963C;
        if (C0502k.m2295b(obtainStyledAttributes, i3, i3, false)) {
            mo3871C(C1043a.m4585b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C2004g.f6975I, i, i2);
        this.f3500S = C0502k.m2308o(obtainStyledAttributes2, C2004g.f7049q0, C2004g.f6991Q);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: K */
    private int m4576K() {
        return mo3861F(this.f3499R);
    }

    /* renamed from: F */
    public int mo3861F(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f3498Q) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f3498Q[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: G */
    public CharSequence[] mo3862G() {
        return this.f3497P;
    }

    /* renamed from: H */
    public CharSequence mo3863H() {
        CharSequence[] charSequenceArr;
        int K = m4576K();
        if (K < 0 || (charSequenceArr = this.f3497P) == null) {
            return null;
        }
        return charSequenceArr[K];
    }

    /* renamed from: I */
    public CharSequence[] mo3864I() {
        return this.f3498Q;
    }

    /* renamed from: J */
    public String mo3865J() {
        return this.f3499R;
    }

    /* renamed from: L */
    public void mo3866L(String str) {
        boolean z = !TextUtils.equals(this.f3499R, str);
        if (z || !this.f3501T) {
            this.f3499R = str;
            this.f3501T = true;
            mo3870B(str);
            if (z) {
                mo3853r();
            }
        }
    }

    /* renamed from: l */
    public CharSequence mo3867l() {
        if (mo3885m() != null) {
            return mo3885m().mo3859a(this);
        }
        Object H = mo3863H();
        CharSequence l = super.mo3867l();
        String str = this.f3500S;
        if (str == null) {
            return l;
        }
        Object[] objArr = new Object[1];
        if (H == null) {
            H = "";
        }
        objArr[0] = H;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, l)) {
            return l;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo3858v(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
