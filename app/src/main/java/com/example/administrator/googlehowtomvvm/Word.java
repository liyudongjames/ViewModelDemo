package com.example.administrator.googlehowtomvvm;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table")
public class Word {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "word")
    private String mWord;

    public Word(String mWord){
        this.mWord = mWord;
    }

    public String getWord() {
        return this.mWord;
    }
}
