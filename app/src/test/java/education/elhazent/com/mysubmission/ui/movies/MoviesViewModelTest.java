package education.elhazent.com.mysubmission.ui.movies;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import education.elhazent.com.mysubmission.model.MoviesEntity;
import education.elhazent.com.mysubmission.ui.tvshow.TvShowViewModel;

import static org.junit.Assert.*;

public class MoviesViewModelTest {

    private MoviesViewModel viewModel;

    @Before
    public void setUp() {
        viewModel = new MoviesViewModel();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getMovies() {
        List<MoviesEntity> moviesEntities = viewModel.getMovies();
        assertNotNull(moviesEntities);
        assertEquals(19, moviesEntities.size());
    }
}