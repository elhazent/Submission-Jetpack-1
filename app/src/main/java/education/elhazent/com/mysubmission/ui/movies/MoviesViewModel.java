package education.elhazent.com.mysubmission.ui.movies;

import androidx.lifecycle.ViewModel;


import java.util.List;

import education.elhazent.com.mysubmission.entity.DataDummy;
import education.elhazent.com.mysubmission.model.MoviesEntity;

public class MoviesViewModel extends ViewModel {

    public List<MoviesEntity> getMovies() {
        return DataDummy.generateDummyMovies();
    }
}

