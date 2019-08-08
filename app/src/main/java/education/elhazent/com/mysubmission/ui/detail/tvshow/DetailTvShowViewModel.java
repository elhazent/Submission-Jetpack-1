package education.elhazent.com.mysubmission.ui.detail.tvshow;

import androidx.lifecycle.ViewModel;

import education.elhazent.com.mysubmission.entity.DataDummy;
import education.elhazent.com.mysubmission.model.MoviesEntity;


public class DetailTvShowViewModel extends ViewModel {
    private MoviesEntity mTvShow;
    private String tvshowId;

    public MoviesEntity getTvShow() {
        for (int i = 0; i < DataDummy.generateDummyTvShow().size(); i++) {
            MoviesEntity moviesEntity = DataDummy.generateDummyTvShow().get(i);
            if (moviesEntity.getMovieId().equals(tvshowId)) {
                mTvShow = moviesEntity;
            }
        }
        return mTvShow;
    }


    public String getTvShowId() {
        return tvshowId;
    }

    public void setTvShowId(String tvShowId) {
        this.tvshowId = tvShowId;
    }
}

