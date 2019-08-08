package education.elhazent.com.mysubmission.ui.detail.movies;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import education.elhazent.com.mysubmission.R;
import education.elhazent.com.mysubmission.model.MoviesEntity;
import education.elhazent.com.mysubmission.ui.detail.tvshow.DetailTvShowViewModel;

import static org.junit.Assert.*;

public class DetailMoviesViewModelTest {


    private DetailMoviesViewModel viewModel;
    private MoviesEntity dummyMovies;

    @Before
    public void setUp() {
        viewModel = new DetailMoviesViewModel();
        dummyMovies = new MoviesEntity("a55", "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                "English",
                "A Star Is Born",
                false,
                "A Star Is Born",
                "October 5, 2018",
                7.8,
                83.128,
                "",
                R.drawable.poster_a_start_is_born,
                R.drawable.starborn);
    }

    @After
    public void tearDown() {
    }


    @Test
    public void getMovies() {
        viewModel.setMoviesId(dummyMovies.getMovieId());
        MoviesEntity moviesEntity = viewModel.getMovies();
        assertNotNull(moviesEntity);
        assertEquals(dummyMovies.getMovieId(), moviesEntity.getMovieId());
        assertEquals(dummyMovies.getReleaseDate(), moviesEntity.getReleaseDate());
        assertEquals(dummyMovies.getOverview(), moviesEntity.getOverview());
        assertEquals(dummyMovies.getImagePath(), moviesEntity.getImagePath());
        assertEquals(dummyMovies.getTitle(), moviesEntity.getTitle());
    }
}