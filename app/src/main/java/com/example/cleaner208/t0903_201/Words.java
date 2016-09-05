package com.example.cleaner208.t0903_201;

import android.provider.BaseColumns;

public class Words{
    public Words(){
    }
    public   abstract class Word implements BaseColumns {
        public static final String TABLE_NAME="words";
        public  static final String COLUMN_NAME_WORD="word";//列：单词
        public static final String COLUMN_NAME_MEANING="meaning";//列：单词含义
        public static final String COLUMN_NAME_SAMPLE="sample";//单词示例
    }
}