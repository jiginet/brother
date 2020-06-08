package com.jigi.brother.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class DartGame {
    public int solution(String dartResult) {
        Pattern splitPattern = Pattern.compile("\\d{1,2}[SDT*#]{1,2}");
        Matcher splitMatcher = splitPattern.matcher(dartResult);

        int[] scoreArray = new int[3];
        for (int i = 0; splitMatcher.find(); i++) {
            String scoreString = splitMatcher.group();
            double score = getScore(scoreString);
            double index = getIndex(scoreString);
            int option = getOption(scoreString);

            scoreArray[i] = (int) Math.pow(score, index) * option;
            if (i != 0 && option == 2) {
                scoreArray[i - 1] = scoreArray[i - 1] * option;
            }
        }

        return IntStream.of(scoreArray).sum();
    }

    private int getOption(String string) {
        Pattern pattern = Pattern.compile("[*#]");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            return "*".equals(matcher.group()) ? 2 : -1;
        } else {
            return 1;
        }
    }

    private double getScore(String string) {
        Pattern pattern = Pattern.compile("\\d{1,2}");
        Matcher matcher = pattern.matcher(string);
        matcher.find();
        return Double.parseDouble(matcher.group());
    }

    private double getIndex(String string) {
        Pattern pattern = Pattern.compile("[SDT]");
        Matcher matcher = pattern.matcher(string);
        matcher.find();
        return "D".equals(matcher.group()) ? 2.0 : ("T".equals(matcher.group()) ? 3.0 : 1.0);
    }

}
