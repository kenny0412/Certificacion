package com.google.developers.mojimaster2.paging;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.google.developers.mojimaster2.data.Smiley;
import com.google.developers.mojimaster2.data.DataRepository;

import java.util.List;

/**
 * Store and manage data for SmileyListActivity.
 */
public class SmileyViewModel extends ViewModel {

    private final DataRepository mRepository;
    public static int PAGE_SIZE = 30;
    public static boolean PLACEHOLDERS = true;
    private LiveData<List<Smiley>> mAllSmiley;

    public SmileyViewModel(DataRepository repository) {
        mRepository = repository;
    }

    public void save(Smiley smiley) {
        mRepository.insert(smiley);
    }

    public void delete(Smiley smiley) {
        mRepository.delete(smiley);
    }

}
