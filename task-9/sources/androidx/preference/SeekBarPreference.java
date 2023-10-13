package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import p052h0.C2000c;
import p052h0.C2004g;

public class SeekBarPreference extends Preference {

    /* renamed from: J */
    int f3550J;

    /* renamed from: K */
    int f3551K;

    /* renamed from: L */
    private int f3552L;

    /* renamed from: M */
    private int f3553M;

    /* renamed from: N */
    boolean f3554N;

    /* renamed from: O */
    SeekBar f3555O;

    /* renamed from: P */
    private TextView f3556P;

    /* renamed from: Q */
    boolean f3557Q;

    /* renamed from: R */
    private boolean f3558R;

    /* renamed from: S */
    boolean f3559S;

    /* renamed from: T */
    private final SeekBar.OnSeekBarChangeListener f3560T;

    /* renamed from: U */
    private final View.OnKeyListener f3561U;

    /* renamed from: androidx.preference.SeekBarPreference$a */
    class C1051a implements SeekBar.OnSeekBarChangeListener {
        C1051a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f3559S || !seekBarPreference.f3554N) {
                    seekBarPreference.mo3906I(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.mo3907J(i + seekBarPreference2.f3551K);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f3554N = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f3554N = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f3551K != seekBarPreference.f3550J) {
                seekBarPreference.mo3906I(seekBar);
            }
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$b */
    class C1052b implements View.OnKeyListener {
        C1052b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f3557Q && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f3555O;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2000c.seekBarPreferenceStyle);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3560T = new C1051a();
        this.f3561U = new C1052b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2004g.f6964C0, i, i2);
        this.f3551K = obtainStyledAttributes.getInt(C2004g.f6970F0, 0);
        mo3904F(obtainStyledAttributes.getInt(C2004g.f6966D0, 100));
        mo3905G(obtainStyledAttributes.getInt(C2004g.f6972G0, 0));
        this.f3557Q = obtainStyledAttributes.getBoolean(C2004g.f6968E0, true);
        this.f3558R = obtainStyledAttributes.getBoolean(C2004g.f6974H0, false);
        this.f3559S = obtainStyledAttributes.getBoolean(C2004g.f6976I0, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: H */
    private void m4631H(int i, boolean z) {
        int i2 = this.f3551K;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f3552L;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f3550J) {
            this.f3550J = i;
            mo3907J(i);
            mo3869A(i);
            if (z) {
                mo3853r();
            }
        }
    }

    /* renamed from: F */
    public final void mo3904F(int i) {
        int i2 = this.f3551K;
        if (i < i2) {
            i = i2;
        }
        if (i != this.f3552L) {
            this.f3552L = i;
            mo3853r();
        }
    }

    /* renamed from: G */
    public final void mo3905G(int i) {
        if (i != this.f3553M) {
            this.f3553M = Math.min(this.f3552L - this.f3551K, Math.abs(i));
            mo3853r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo3906I(SeekBar seekBar) {
        int progress = this.f3551K + seekBar.getProgress();
        if (progress == this.f3550J) {
            return;
        }
        if (mo3873a(Integer.valueOf(progress))) {
            m4631H(progress, false);
            return;
        }
        seekBar.setProgress(this.f3550J - this.f3551K);
        mo3907J(this.f3550J);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo3907J(int i) {
        TextView textView = this.f3556P;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo3858v(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }
}
