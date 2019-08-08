package education.elhazent.com.mysubmission.ui.detail.tvshow;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import education.elhazent.com.mysubmission.R;
import education.elhazent.com.mysubmission.model.MoviesEntity;

import static org.junit.Assert.*;

public class DetailTvShowViewModelTest {

    private DetailTvShowViewModel viewModel;
    private MoviesEntity dummyTvShow;

    @Before
    public void setUp() {
        viewModel = new DetailTvShowViewModel();
        dummyTvShow = new MoviesEntity("b32",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "English",
                "Arrow",
                false,
                "Arrow",
                "",
                7.8,
                83.128,
                "42m",
                R.drawable.poster_arrow,
                R.drawable.arrow);
    }

    @After
    public void tearDown() {
    }


    @Test
    public void getTvShow() {
        viewModel.setTvShowId(dummyTvShow.getMovieId());
        MoviesEntity moviesEntity = viewModel.getTvShow();
        assertNotNull(moviesEntity);
        assertEquals(dummyTvShow.getMovieId(), moviesEntity.getMovieId());
        assertEquals(dummyTvShow.getReleaseDate(), moviesEntity.getReleaseDate());
        assertEquals(dummyTvShow.getOverview(), moviesEntity.getOverview());
        assertEquals(dummyTvShow.getImagePath(), moviesEntity.getImagePath());
        assertEquals(dummyTvShow.getTitle(), moviesEntity.getTitle());
    }
}