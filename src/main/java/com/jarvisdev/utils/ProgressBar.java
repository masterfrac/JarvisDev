package com.jarvisdev.utils;

public class ProgressBar {

    private static final int BAR_LENGTH = 30;

    public static String create(long used, long total) {

        if (total <= 0) {
            return "";
        }

        double percent = (used * 100.0) / total;

        int filled = (int) ((percent / 100.0) * BAR_LENGTH);

        StringBuilder bar = new StringBuilder();

        for (int i = 0; i < BAR_LENGTH; i++) {

            if (i < filled) {
                bar.append("█");
            } else {
                bar.append("░");
            }
        }

        return String.format("%s %.1f%%", bar, percent);
    }
}
