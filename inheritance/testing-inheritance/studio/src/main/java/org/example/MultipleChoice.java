package org.example;

import java.util.Scanner;

public class MultipleChoice extends Question {

    private String[] choices = null;

    public MultipleChoice(String question, String answer, String[] choices) {
        super(question, answer);
        this.choices = choices;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    public String getResponse() {
        Scanner input = new Scanner(System.in);
        System.out.println(getQuestion() + "? ");
        for (int i = 0; i < getChoices().length; i++) {
            System.out.println((char)(65+i) + ". " + getChoices()[i]);
        }
        return input.next();
    }

    public boolean gradeResponse(String response) {
        return response.toLowerCase().equals(getAnswer().toLowerCase());
    }

    public void provideFeedback(String response) {
        if (gradeResponse(response)) {
            System.out.println("That's correct!");
        } else {
            System.out.println("That's not quite right.  Here's what I'm looking for:  " + getAnswer() + ". " + getChoices()[getAnswer().charAt(0)-65]);
        }
    }

}
