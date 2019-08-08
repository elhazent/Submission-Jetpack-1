package education.elhazent.com.mysubmission.ui.detail.movies;

import androidx.lifecycle.ViewModel;

import education.elhazent.com.mysubmission.entity.DataDummy;
import education.elhazent.com.mysubmission.model.MoviesEntity;


public class DetailMoviesViewModel extends ViewModel {
    private MoviesEntity mMovies;
    private String moviesId;

    public MoviesEntity getMovies() {
        for (int i = 0; i < DataDummy.generateDummyMovies().size(); i++) {
            MoviesEntity moviesEntity = DataDummy.generateDummyMovies().get(i);
            if (moviesEntity.getMovieId().equals(moviesId)) {
                mMovies = moviesEntity;
            }
        }
        return mMovies;
    }


    public String getMoviesId() {
        return moviesId;
    }

    public void setMoviesId(String moviesId) {
        this.moviesId = moviesId;
    }
}

