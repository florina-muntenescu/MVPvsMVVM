package upday.patterns.datamodel;

import android.support.annotation.NonNull;

import rx.Observable;

public class DataModel implements IDataModel {

    @NonNull
    @Override
    public Observable<String> getGreetingAsync() {
        return Observable.just("Hello, World!");
    }

    @NonNull
    @Override
    public String getGreetingSync() {
        return "Hello World";
    }
}
