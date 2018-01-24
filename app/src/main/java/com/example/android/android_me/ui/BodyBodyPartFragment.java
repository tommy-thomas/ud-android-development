package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;

import java.util.List;

/**
 * Created by tommy-thomas on 1/24/18.
 */

public class BodyBodyPartFragment extends Fragment {

    private static final String TAG = "BodyPartFragment";

    private List<Integer> mImageIDs;
    private int mListIndex;

    public BodyBodyPartFragment(){}

    /**
     * Inflates the fragment layout file and sets the correct resource for the image to display
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the Android-Me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_body_body_part, container, false);

        // Get a reference to the ImageView in the fragment layout
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_body_part_image_view);

        // TODO (3) If a list of image ids exists, set the image resource to the correct item in that list
        // Otherwise, create a Log statement that indicates that the list was not found
        if( mImageIDs != null){
            imageView.setImageResource(mImageIDs.get(mListIndex));
        } else {
            Log.v(TAG , "This fragment has a null list of image ids.");
        }

        // Return the rootView
        return rootView;
    }

    public void setImageIDs(List<Integer> imageIDs){
        mImageIDs = imageIDs;
    }

    public void setListIndex(int index){
        mListIndex = index;
    }
}
