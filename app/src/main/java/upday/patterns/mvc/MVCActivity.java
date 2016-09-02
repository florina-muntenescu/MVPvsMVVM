package upday.patterns.mvc;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import upday.patterns.DroidconApplication;
import upday.patterns.R;
import upday.patterns.datamodel.IDataModel;

/**
 * Implements the view class of the MVC pattern with passive model.
 */
public class MVCActivity extends AppCompatActivity implements IView {

    @NonNull
    private Controller mController;

    @NonNull
    private IDataModel mDataModel;

    @Nullable
    private TextView mGreetingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDataModel = getDataModel();
        mController = new Controller(this);

        setupViews();
    }

    private void setupViews() {
        mGreetingView = (TextView) findViewById(R.id.greeting);
    }

    @Override
    public void update() {
        assert mGreetingView != null;
        mGreetingView.setText(mDataModel.getGreetingSync());
    }

    @NonNull
    private IDataModel getDataModel() {
        return ((DroidconApplication) getApplication()).getDataModel();
    }

}
