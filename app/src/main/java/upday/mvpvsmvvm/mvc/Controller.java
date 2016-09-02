package upday.mvpvsmvvm.mvc;

import android.support.annotation.NonNull;

/**
 * Implementation class for the Controller in the MVC pattern, with a passive model.
 */
public class Controller {

    @NonNull
    private final IView mView;

    public Controller(@NonNull final IView view) {
        mView = view;
        mView.update();
    }
}
