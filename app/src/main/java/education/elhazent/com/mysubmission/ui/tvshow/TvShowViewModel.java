package education.elhazent.com.mysubmission.ui.tvshow;

import androidx.lifecycle.ViewModel;


import java.util.List;

import education.elhazent.com.mysubmission.entity.DataDummy;
import education.elhazent.com.mysubmission.model.MoviesEntity;

public class TvShowViewModel extends ViewModel {

    List<MoviesEntity> getTvShow() {
        return DataDummy.generateDummyTvShow();
    }
}

