package education.elhazent.com.mysubmission.ui.detail.tvshow;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import education.elhazent.com.mysubmission.R;
import education.elhazent.com.mysubmission.model.MoviesEntity;

public class DetailTvShowActivity extends AppCompatActivity {

    public static final String EXTRA_TVSHOW = "extra_tvshow";
    private TextView textTitle;
    private TextView textVote;
    private TextView textPop;
    private TextView textOverView;
    private TextView textDate;
    private ImageView poster;
    private ImageView posterBack;
    private DetailTvShowViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tv_show);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        viewModel = ViewModelProviders.of(this).get(DetailTvShowViewModel.class);


        textTitle = findViewById(R.id.title_detail_show);
        textOverView = findViewById(R.id.overview_detail_show);
        textVote = findViewById(R.id.rate_detail_show);
        textPop = findViewById(R.id.popularity_detail_show);
        poster = findViewById(R.id.img_detail_show);
        posterBack = findViewById(R.id.header_img_detail_show);
        textDate = findViewById(R.id.release_detail_show);



        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String tvshowId = extras.getString(EXTRA_TVSHOW);
            if (tvshowId != null) {
                viewModel.setTvShowId(tvshowId);
                populateTvShow(viewModel.getTvShow());
            }
        }

    }

    @SuppressLint("SetTextI18n")
    private void populateTvShow(MoviesEntity moviesEntity) {
        textTitle.setText(moviesEntity.getTitle());
        textOverView.setText(moviesEntity.getOverview());
        textPop.setText(moviesEntity.getPopularity().toString());
        textVote.setText(moviesEntity.getVoteAverange().toString());
        textDate.setText(moviesEntity.getRunTime());


        Glide.with(getApplicationContext())
                .load(moviesEntity.getImagePath())
                .override(600, 200)
                .into(poster);

        Glide.with(getApplicationContext())
                .load(moviesEntity.getImageBackDroph())
                .override(600, 200)
                .into(posterBack);

    }
}


