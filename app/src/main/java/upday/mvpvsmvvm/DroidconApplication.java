package upday.mvpvsmvvm;

import android.app.Application;
import android.support.annotation.NonNull;

import upday.mvpvsmvvm.datamodel.DataModel;
import upday.mvpvsmvvm.datamodel.IDataModel;

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
