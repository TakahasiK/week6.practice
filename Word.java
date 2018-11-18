package com.company;

public class Word{
    String word;
    String meaning;

    public Word(String input_name,String input_meaning) {
        word = input_name;
        meaning=input_meaning;
    }
    @Override
    public String toString() {
        return "単語："+word+" 意味："+meaning;
    }

}
