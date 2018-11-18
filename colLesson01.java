package com.company;
import java.util.Scanner;

public class colLesson01 {
	public static void main(String[] args) {
		Word[] word_array = new Word[10];

        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");

		int answer_count = 0;

		for(int i = 0; i < 10; i++) {
			Scanner scanner = new Scanner(System.in);
			String word = scanner.next();
			String meaning = scanner.next();
			word_array[i] = new Word(word, meaning);


			if (word.contains("e")) {
				break;
			} else {
				answer_count++;
				System.out.println("次の単語の意味を入力して下さい。\"e\"で終了します。");
				continue;
			}
		}
		for(int i = 0;i <answer_count; i++){
			System.out.println("単語："+word_array[i].word+" 意味："+word_array[i].meaning);
		}
		System.out.println(answer_count+"件、登録しました。");
	}
}
