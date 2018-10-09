package com.example.administrator.googlehowtomvvm;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;



public class WordViewModel extends AndroidViewModel {

    private WordRepository mRepository;
    private LiveData<List<Word>> mAllwords;

    public WordViewModel(Application application) {
        super(application);
        mRepository =  new WordRepository(application);
        mAllwords = mRepository.getAllWords();
    }

    public LiveData<List<Word>> getmAllwords() {
        return mAllwords;
    }

    public void insert(Word word){
        mRepository.insert(word);
    }
}
