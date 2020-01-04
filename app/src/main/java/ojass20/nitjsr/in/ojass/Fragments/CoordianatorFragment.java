package ojass20.nitjsr.in.ojass.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ojass20.nitjsr.in.ojass.R;

public class CoordianatorFragment extends Fragment {
    //widgets
    private RecyclerView rView;
//    private BtmNavVisCallback mCallback;
//    private CoordinatorsAdapter mAdapter;
    private RelativeLayout pLayout;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_coordinator,container,false);
        init(view);
//        rView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                mCallback.onCallback();
//            }
//        });
//        mAdapter = new CoordinatorsAdapter(getData());
//        rView.setAdapter(mAdapter);
        return view;
    }
    void init(View view){
        rView = view.findViewById(R.id.coord_rview);
        pLayout = view.findViewById(R.id.coord_layout);
        rView.setLayoutManager(new LinearLayoutManager(getContext()));
    }
//    List<CoordinatorsModel> getData(){
//        List<CoordinatorsModel> list = new ArrayList<>();
//        for(EventModel em: HomeActivity.data){
//            if(em.getName()!=null) {
//                if (em.getName().compareToIgnoreCase(SubEventsActivity.event_name) == 0) {
//                    list = em.getCoordinatorsModelArrayList();
//                    break;
//
//                }
//            }
//        }
//        return list;
//    }
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        mCallback = (BtmNavVisCallback) context;
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mCallback = null;
//    }
}
