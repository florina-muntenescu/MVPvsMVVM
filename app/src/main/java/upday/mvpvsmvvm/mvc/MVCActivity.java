package upday.mvpvsmvvm.mvp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import upday.mvpvsmvvm.DroidconApplication;
import upday.mvpvsmvvm.R;
import upday.mvpvsmvvm.datamodel.IDataModel;

/**
 * Implements the view class of the MVP pattern.
 */
public class MVCActivity extends AppCompatActivity implements IVew {

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

        mController = new Controller(this);
        mDataModel = getDataModel();

        setupViews();
    }

    private void setupViews() {
        mGreetingView = (TextView) findViewById(R.id.greeting);
    }

    @Override
    public void update() {
        String greeting = mDataModel.getGreeting();

        assert mGreetingView!=null;
        mGreetingView.setText(greeting);
    }

    @NonNull
    private IDataModel getDataModel() {
        return ((DroidconApplication) getApplication()).getDataModel();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mController.unBind();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mController.bind();
    }
}
