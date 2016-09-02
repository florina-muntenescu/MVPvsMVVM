package upday.mvpvsmvvm.datamodel;

import android.support.annotation.NonNull;

import rx.Observable;

/**
 * The Data Model used by all patterns
 */
public interface IDataModel {

    /**
     * @return a stream of the greeting. The stream will emit once and then complete.
     * Allows asynchronous retrieval of the greeting.
     */
    @NonNull
    Observable<String> getGreetingAsync();

    /**
     * @return a greeting synchronously.
     */
    @NonNull
    String getGreetingSync();
}
