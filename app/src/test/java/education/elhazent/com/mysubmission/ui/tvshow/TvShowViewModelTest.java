package education.elhazent.com.mysubmission.ui.tvshow;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import education.elhazent.com.mysubmission.model.MoviesEntity;

import static org.junit.Assert.*;

public class TvShowViewModelTest {

    private TvShowViewModel viewModel;

    @Before
    public void setUp() {
        viewModel = new TvShowViewModel();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getTvShow() {
        List<MoviesEntity> tvshowEntities = viewModel.getTvShow();
        assertNotNull(tvshowEntities);
        assertEquals(20, tvshowEntities.size());
    }
}