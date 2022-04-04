package com.bridgelabz.MoodAnalyzer;

public class MoodAnalyzerRefactor {
    private String message;
    public MoodAnalyzerRefactor() {             //Default Constructor
    }
    public MoodAnalyzerRefactor(String message) {
        this.message = message;
    }           //Parameterized Constructor
    public String analyseMood() {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}