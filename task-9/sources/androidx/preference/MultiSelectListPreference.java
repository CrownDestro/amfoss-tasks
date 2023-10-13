package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.content.res.C0502k;
import java.util.HashSet;
import java.util.Set;
import p052h0.C2000c;
import p052h0.C2004g;

public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: P */
    private CharSequence[] f3503P;

    /* renamed from: Q */
    private CharSequence[] f3504Q;

    /* renamed from: R */
    private Set<String> f3505R;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502k.m2294a(context, C2000c.dialogPreferenceStyle, 16842897));
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3505R = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2004g.f6965D, i, i2);
        this.f3503P = C0502k.m2310q(obtainStyledAttributes, C2004g.f6971G, C2004g.f6967E);
        this.f3504Q = C0502k.m2310q(obtainStyledAttributes, C2004g.f6973H, C2004g.f6969F);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo3858v(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
