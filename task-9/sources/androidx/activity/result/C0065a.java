package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.a */
public final class C0065a implements Parcelable {
    public static final Parcelable.Creator<C0065a> CREATOR = new C0066a();

    /* renamed from: d */
    private final int f208d;

    /* renamed from: e */
    private final Intent f209e;

    /* renamed from: androidx.activity.result.a$a */
    class C0066a implements Parcelable.Creator<C0065a> {
        C0066a() {
        }

        /* renamed from: a */
        public C0065a createFromParcel(Parcel parcel) {
            return new C0065a(parcel);
        }

        /* renamed from: b */
        public C0065a[] newArray(int i) {
            return new C0065a[i];
        }
    }

    public C0065a(int i, Intent intent) {
        this.f208d = i;
        this.f209e = intent;
    }

    C0065a(Parcel parcel) {
        this.f208d = parcel.readInt();
        this.f209e = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: e */
    public static String m210e(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    /* renamed from: a */
    public Intent mo174a() {
        return this.f209e;
    }

    /* renamed from: c */
    public int mo175c() {
        return this.f208d;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m210e(this.f208d) + ", data=" + this.f209e + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f208d);
        parcel.writeInt(this.f209e == null ? 0 : 1);
        Intent intent = this.f209e;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
