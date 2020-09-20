package com.jigi.kakao;

public class Question3 {

    final static int MAX_COLUMN = 702;
    final static char[] LETTERS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static String solution(long n) {

        String[] columns = new String[MAX_COLUMN];
        columns[0] = "A";
        for (int i = 1; i < MAX_COLUMN; i++) {
            columns[i] = getColumn(columns[i - 1]);
        }
        int columnIndex = (int) (n % MAX_COLUMN) - 1;
        String column = columns[columnIndex < 0 ? MAX_COLUMN - 1 : columnIndex];
        String answer = n <= MAX_COLUMN ? 1 + column : n / MAX_COLUMN + 1 + column;

        return answer;
    }

    private static String getColumn(String previous) {

        String column = "";
        if (previous.length() == 2) {
            char firstLetter = previous.charAt(0);
            char secondLetter = getLetter(previous.charAt(1));
            if (secondLetter == 'A') firstLetter = getLetter(firstLetter);
            return column + firstLetter + secondLetter;
        }

        char letter = getLetter(previous.charAt(0));
        return letter == 'A' ? "A" + letter : String.valueOf(letter);


    }

    private static char getLetter(char letter) {
        int idx = letter % 'A';
        return LETTERS[idx == LETTERS.length - 1 ? 0 : idx + 1];
    }

}
