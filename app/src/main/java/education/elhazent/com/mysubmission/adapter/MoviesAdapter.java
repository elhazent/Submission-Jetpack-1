package education.elhazent.com.mysubmission.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import education.elhazent.com.mysubmission.R;
import education.elhazent.com.mysubmission.model.MoviesEntity;
import education.elhazent.com.mysubmission.ui.detail.movies.DetailMoviesActivity;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder> {
    private final Activity activity;
    private List<MoviesEntity> movies = new ArrayList<>();

    public MoviesAdapter(Activity activity) {
        this.activity = activity;
    }

    private List<MoviesEntity> getListMovies() {
        return movies;
    }

    public void setListCourses(List<MoviesEntity> movies) {
        if (movies == null) return;
        this.movies.clear();
        this.movies.addAll(movies);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_movies, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.tvTitle.setText(getListMovies().get(position).getTitle());
        holder.tvDescription.setText(getListMovies().get(position).getOverview());
        holder.tvDate.setText(String.format(getListMovies().get(position).getReleaseDate()));
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(activity, DetailMoviesActivity.class);
            intent.putExtra(DetailMoviesActivity.EXTRA_MOVIES, getListMovies().get(position).getMovieId());
            activity.startActivity(intent);
        });
        Picasso.get()
                .load(getListMovies().get(position).getImagePath())
                .into(holder.imgPoster);
    }

    @Override
    public int getItemCount() {
        return getListMovies().size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        final TextView tvTitle;
        final TextView tvDescription;
        final TextView tvDate;
        final ImageView imgPoster;

        ViewHolder(View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_item_title);
            imgPoster = itemView.findViewById(R.id.img_poster);
            tvDescription = itemView.findViewById(R.id.tv_item_description);
            tvDate = itemView.findViewById(R.id.tv_item_date);
        }
    }
}

