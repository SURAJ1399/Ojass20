package ojass20.nitjsr.in.ojass.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import ojass20.nitjsr.in.ojass.R;

public class DetailsFragment extends Fragment {
    private TextView details;
    private LinearLayout details_layout;
//    private BtmNavVisCallback mCallback;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details,container,false);
        init(view);
//        details_layout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mCallback.onCallback();
//            }
//        });
        getData();
        return view;
    }

    private void init(View view) {
        details = view.findViewById(R.id.text_details);
        details_layout = view.findViewById(R.id.details_layout);
    }
    void getData(){
//        for(EventModel em: HomeActivity.data){
//            if(em.getName()!=null) {
//                if (em.getName().compareToIgnoreCase(SubEventsActivity.event_name) == 0) {
//                    if (em.getDetails() != null) {
//                        details.setText(Html.fromHtml(em.getDetails()));
//                    }
//                    break;
//
//                }
//            }
//        }

    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        mCallback = (BtmNavVisCallback) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
//        mCallback = null;
    }
}
