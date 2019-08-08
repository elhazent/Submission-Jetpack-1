package education.elhazent.com.mysubmission.ui.tvshow;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

import education.elhazent.com.mysubmission.R;
import education.elhazent.com.mysubmission.adapter.TvShowAdapter;
import education.elhazent.com.mysubmission.model.MoviesEntity;


/**
 * A simple {@link Fragment} subclass.
 */
public class TvShowFragment extends Fragment{
    private TvShowAdapter adapter;
    private RecyclerView recyclerView;
    private TvShowViewModel viewModel;
    private List<MoviesEntity> tvshow;

    public TvShowFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        return new TvShowFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tvshow, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_tvshow);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() != null) {
            viewModel = ViewModelProviders.of(this).get(TvShowViewModel.class);
            tvshow = viewModel.getTvShow();

            adapter = new TvShowAdapter(getActivity());
            adapter.setListCourses(tvshow);

            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(adapter);
        }
    }

}

