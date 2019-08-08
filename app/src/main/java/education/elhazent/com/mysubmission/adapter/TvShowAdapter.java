package education.elhazent.com.mysubmission.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import education.elhazent.com.mysubmission.R;
import education.elhazent.com.mysubmission.model.MoviesEntity;
import education.elhazent.com.mysubmission.ui.detail.tvshow.DetailTvShowActivity;

public class TvShowAdapter extends RecyclerView.Adapter<TvShowAdapter.AcademyViewHolder> {
    private final Activity activity;
    private ArrayList<MoviesEntity> tvshow = new ArrayList<>();

    public TvShowAdapter(Activity activity) {
        this.activity = activity;
    }

    public void setListCourses(List<MoviesEntity> tvshow) {
        if (tvshow == null) return;
        this.tvshow.clear();
        this.tvshow.addAll(tvshow);
    }

    @NonNull
    @Override
    public AcademyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_tvshow, parent, false);
        return new AcademyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AcademyViewHolder holder, int position) {
        MoviesEntity tvshowEntity = tvshow.get(position);

        holder.tvTitle.setText(tvshowEntity.getTitle());
        holder.tvDate.setText(tvshowEntity.getReleaseDate());
        holder.tvDescription.setText(tvshowEntity.getOverview());
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(activity, DetailTvShowActivity.class);
            intent.putExtra(DetailTvShowActivity.EXTRA_TVSHOW, tvshowEntity.getMovieId());
            activity.startActivity(intent);
        });

        Picasso.get()
                .load(tvshowEntity.getImagePath())
                .into(holder.imgPoster);
    }

    @Override
    public int getItemCount() {
        return tvshow.size();
    }

    class AcademyViewHolder extends RecyclerView.ViewHolder {
        final TextView tvTitle;
        final TextView tvDescription;
        final TextView tvDate;
        final ImageView imgPoster;

        AcademyViewHolder(View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_item_title);
            tvDescription = itemView.findViewById(R.id.tv_item_description);
            tvDate = itemView.findViewById(R.id.tv_item_date);
            imgPoster = itemView.findViewById(R.id.img_poster);
        }
    }
}

