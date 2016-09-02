package upday.patterns.mvp;

import android.support.annotation.NonNull;

/**
 * Interface for the view classes in the MVP pattern.
 */
interface IView {

    void setGreeting(@NonNull final String greeting);
}
