package sajid.com.androidinstrumentalsample;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class ShowTextActivityTest {

    public static final String STRING_TO_BE_MATCHED = "Espresso";


    @Rule
    public ActivityTestRule<ShowTextActivity> activityScenarioRule
            = new ActivityTestRule<>(ShowTextActivity.class);

    @Test
    public void changeText_sameActivity() {
        // Check that the text was changed.
        onView(withId(R.id.show_text_view)).check(matches(withText(STRING_TO_BE_MATCHED)));
    }


}