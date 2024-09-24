package org.example;

import java.util.Scanner;

public class Question {

    private String question = null;
    private String answer = null;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getResponse() {
        Scanner input = new Scanner(System.in);
        System.out.println(getQuestion() + "? ");
        return input.next();
    }

    public boolean gradeResponse(String response) {
        return response.toLowerCase().equals(getAnswer().toLowerCase());
    }

    public void provideFeedback(String response) {
        if (gradeResponse(response)) {
            System.out.println("That's correct!");
        } else {
            System.out.println("That's not quite right.  Here's what I'm looking for:  " + getAnswer());
        }
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
