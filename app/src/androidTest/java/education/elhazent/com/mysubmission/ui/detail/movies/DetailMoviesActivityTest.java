package education.elhazent.com.mysubmission.ui.detail.movies;

import android.content.Context;
import android.content.Intent;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import education.elhazent.com.mysubmission.R;
import education.elhazent.com.mysubmission.model.MoviesEntity;
import education.elhazent.com.mysubmission.utils.FakeDataDummy;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class DetailMoviesActivityTest {

    private MoviesEntity dummyCourse = FakeDataDummy.generateDummyMovies().get(0);

    @Rule
    public ActivityTestRule<DetailMoviesActivity> activityRule = new ActivityTestRule<DetailMoviesActivity>(DetailMoviesActivity.class) {
        @Override
        protected Intent getActivityIntent() {
            Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
            Intent result = new Intent(targetContext, DetailMoviesActivity.class);
            result.putExtra(DetailMoviesActivity.EXTRA_MOVIES, dummyCourse.getMovieId());
            return result;
        }
    };

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    @Test
    public void loadDetailMovies() {
        onView(withId(R.id.title_detail)).check(matches(isDisplayed()));
        onView(withId(R.id.title_detail)).check(matches(withText(dummyCourse.getTitle())));
        onView(withId(R.id.release_detail)).check(matches(isDisplayed()));
        onView(withId(R.id.release_detail)).check(matches(withText(dummyCourse.getReleaseDate())));
    }

}