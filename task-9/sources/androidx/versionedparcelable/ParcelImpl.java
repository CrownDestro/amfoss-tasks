package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p089n0.C2670a;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1187a();

    /* renamed from: d */
    private final C2670a f4170d;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C1187a implements Parcelable.Creator<ParcelImpl> {
        C1187a() {
        }

        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f4170d = new C1189b(parcel).mo4972u();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C1189b(parcel).mo4953L(this.f4170d);
    }
}
