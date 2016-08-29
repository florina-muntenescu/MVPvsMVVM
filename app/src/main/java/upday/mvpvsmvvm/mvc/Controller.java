package upday.mvpvsmvvm.mvp;

import android.support.annotation.NonNull;

import rx.subscriptions.CompositeSubscription;
import upday.mvpvsmvvm.datamodel.IDataModel;

/**
 * Implementation class for the Controller in the MVC model.
 */
public class Controller {

    @NonNull
    private final IView mView;

    private CompositeSubscription mSubscription;

    public Controller(@NonNull final IView view) {
        mDataModel = dataModel;
        mView = view;
    }

    @Override
    public void bind() {
        mSubscription = new CompositeSubscription();

        mSubscription.add(mDataModel.getGreeting()
                                    .subscribe(this::setGreeting));
    }

    @Override
    public void unBind() {
        mSubscription.unsubscribe();
    }

    private void setGreeting(@NonNull final String greeting) {
        mView.setGreeting(greeting);
    }
}
