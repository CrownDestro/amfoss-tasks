package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import p052h0.C2000c;

public class DropDownPreference extends ListPreference {

    /* renamed from: U */
    private final Context f3490U;

    /* renamed from: V */
    private final ArrayAdapter f3491V;

    /* renamed from: W */
    private Spinner f3492W;

    /* renamed from: X */
    private final AdapterView.OnItemSelectedListener f3493X;

    /* renamed from: androidx.preference.DropDownPreference$a */
    class C1041a implements AdapterView.OnItemSelectedListener {
        C1041a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.mo3864I()[i].toString();
                if (!charSequence.equals(DropDownPreference.this.mo3865J()) && DropDownPreference.this.mo3873a(charSequence)) {
                    DropDownPreference.this.mo3866L(charSequence);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2000c.dropdownPreferenceStyle);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3493X = new C1041a();
        this.f3490U = context;
        this.f3491V = mo3852M();
        m4566N();
    }

    /* renamed from: N */
    private void m4566N() {
        this.f3491V.clear();
        if (mo3862G() != null) {
            for (CharSequence charSequence : mo3862G()) {
                this.f3491V.add(charSequence.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public ArrayAdapter mo3852M() {
        return new ArrayAdapter(this.f3490U, 17367049);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo3853r() {
        super.mo3853r();
        ArrayAdapter arrayAdapter = this.f3491V;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo3851t() {
        this.f3492W.performClick();
    }
}
