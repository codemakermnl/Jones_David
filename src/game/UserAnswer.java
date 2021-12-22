/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

public class UserAnswer {
    private String answer;
    
    private int choiceNumber;

    public UserAnswer(String answer, int choiceNumber) {
        this.answer = answer;
        this.choiceNumber = choiceNumber;
    }
    
    

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getChoiceNumber() {
        return choiceNumber;
    }

    public void setChoiceNumber(int choiceNumber) {
        this.choiceNumber = choiceNumber;
    }

    @Override
    public String toString() {
        return "UserAnswer{" + "answer=" + answer + ", choiceNumber=" + choiceNumber + '}';
    }
    
    
}
