package education.elhazent.com.mysubmission.ui.detail.movies;

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

public class DetailMoviesActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIES = "extra_movies";
    private TextView textTitle;
    private TextView textVote;
    private TextView textPop;
    private TextView textOverView;
    private TextView textDate;
    private ImageView poster;
    private ImageView posterBack;
    private DetailMoviesViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movies);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        viewModel = ViewModelProviders.of(this).get(DetailMoviesViewModel.class);


        textTitle = findViewById(R.id.title_detail);
        textOverView = findViewById(R.id.overview_detail);
        textVote = findViewById(R.id.rate_detail);
        textPop = findViewById(R.id.popularity_detail);
        poster = findViewById(R.id.img_detail);
        posterBack = findViewById(R.id.header_img_detail);
        textDate = findViewById(R.id.release_detail);



        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String moviesId = extras.getString(EXTRA_MOVIES);
            if (moviesId != null) {
                viewModel.setMoviesId(moviesId);
                populateCourse(viewModel.getMovies());
            }
        }

    }

    @SuppressLint("SetTextI18n")
    private void populateCourse(MoviesEntity moviesEntity) {
        textTitle.setText(moviesEntity.getTitle());
        textOverView.setText(moviesEntity.getOverview());
        textPop.setText(moviesEntity.getPopularity().toString());
        textVote.setText(moviesEntity.getVoteAverange().toString());
        textDate.setText(moviesEntity.getReleaseDate());


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


