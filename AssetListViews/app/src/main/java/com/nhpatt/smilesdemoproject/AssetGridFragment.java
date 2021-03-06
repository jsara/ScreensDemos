package com.nhpatt.smilesdemoproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liferay.mobile.screens.assetlist.AssetEntry;
import com.liferay.mobile.screens.assetlist.AssetListScreenlet;
import com.liferay.mobile.screens.base.list.BaseListListener;
import com.liferay.mobile.screens.base.list.BaseListScreenlet;
import com.liferay.mobile.screens.webcontent.WebContent;

import java.util.List;


/**
 * @author Javier Gamarra
 */
public class AssetGridFragment extends Fragment implements BaseListListener<AssetEntry> {

    public static AssetGridFragment newInstance() {

        Bundle args = new Bundle();

        AssetGridFragment fragment = new AssetGridFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.asset_grid, container, false);
        AssetListScreenlet assetListScreenlet = (AssetListScreenlet) view.findViewById(R.id.asset_grid_screenlet);
        assetListScreenlet.setListener(this);
        return view;
    }

    @Override
    public void onListPageFailed(BaseListScreenlet source, int page, Exception e) {

    }

    @Override
    public void onListPageReceived(BaseListScreenlet source, int page, List<AssetEntry> entries, int rowCount) {

    }

    @Override
    public void onListItemSelected(AssetEntry element, View view) {
        View content = getActivity().findViewById(android.R.id.content);
        Snackbar.make(content, ((WebContent) element).getLocalized("titulo_home_promocoes"), Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void loadingFromCache(boolean success) {

    }

    @Override
    public void retrievingOnline(boolean triedInCache, Exception e) {

    }

    @Override
    public void storingToCache(Object object) {

    }
}
