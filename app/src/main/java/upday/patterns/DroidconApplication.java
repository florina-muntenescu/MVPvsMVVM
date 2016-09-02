package upday.patterns;

import android.app.Application;
import android.support.annotation.NonNull;

import upday.patterns.datamodel.DataModel;
import upday.patterns.datamodel.IDataModel;

public class DroidconApplication extends Application {

    @NonNull
    private final IDataModel mDataModel;

    public DroidconApplication() {
        mDataModel = new DataModel();
    }

    @NonNull
    public IDataModel getDataModel() {
        return mDataModel;
    }
}
