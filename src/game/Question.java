
package game;

import java.util.List;


public class Question {
    private int questionNumber;
    
    private String question;
    
    private List<Choice> choices;
    
    private String hint;

    public Question(int questionNumber, String question, List<Choice> choices, String hint) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.choices = choices;
        this.hint = hint;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }
    
    

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }
    
    public String getAnswer() {
        return this.choices.stream().filter(Choice::isAnswer).findAny().get().getChoice();
    }
}
