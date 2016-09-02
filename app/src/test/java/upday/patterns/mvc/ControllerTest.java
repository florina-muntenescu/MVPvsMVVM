package upday.patterns.mvc;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Class that tests the implementation of {@link Controller}
 */
public class ControllerTest {

    @Mock
    private IView mView;

    private Controller mController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void updateCalled_whenControllerCreated() {
        mController = new Controller(mView);

        Mockito.verify(mView).update();
    }
}
