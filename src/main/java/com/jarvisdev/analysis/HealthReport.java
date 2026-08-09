package com.jarvisdev.analysis;

import java.util.ArrayList;
import java.util.List;

public class HealthReport {

    private int score;

    private String status;

    private final List<String> recommendations = new ArrayList<>();

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getRecommendations() {
        return recommendations;
    }

    public void addRecommendation(String recommendation) {
        recommendations.add(recommendation);
    }
}