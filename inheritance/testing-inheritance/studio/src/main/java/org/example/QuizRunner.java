package org.example;

public class QuizRunner {
    public static void main(String[] args) {
        System.out.println("Preparing quiz...");
        Question q1 = new Question("What's 2 plus 2","4");
        String r1 = q1.getResponse();
        q1.provideFeedback(r1);
        MultipleChoice q2 = new MultipleChoice("What 2 squared","B",new String[]{"1","4","5","8"});
        String r2 = q2.getResponse();
        q2.provideFeedback(r2);
    }
}