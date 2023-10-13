package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.content.res.C0502k;
import androidx.preference.Preference;
import p052h0.C2000c;
import p052h0.C2003f;
import p052h0.C2004g;

public class EditTextPreference extends DialogPreference {

    /* renamed from: P */
    private String f3495P;

    /* renamed from: androidx.preference.EditTextPreference$a */
    public static final class C1042a implements Preference.C1048e<EditTextPreference> {

        /* renamed from: a */
        private static C1042a f3496a;

        private C1042a() {
        }

        /* renamed from: b */
        public static C1042a m4573b() {
            if (f3496a == null) {
                f3496a = new C1042a();
            }
            return f3496a;
        }

        /* renamed from: c */
        public CharSequence mo3859a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.mo3857F()) ? editTextPreference.mo3875c().getString(C2003f.not_set) : editTextPreference.mo3857F();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502k.m2294a(context, C2000c.editTextPreferenceStyle, 16842898));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2004g.f7058v, i, i2);
        int i3 = C2004g.f7060w;
        if (C0502k.m2295b(obtainStyledAttributes, i3, i3, false)) {
            mo3871C(C1042a.m4573b());
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: D */
    public boolean mo3856D() {
        return TextUtils.isEmpty(this.f3495P) || super.mo3856D();
    }

    /* renamed from: F */
    public String mo3857F() {
        return this.f3495P;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo3858v(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
