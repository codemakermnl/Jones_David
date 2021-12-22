/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

public class Choice {
    private String choice;
    
    private boolean isAnswer;

    public Choice(String choice) {
        this.choice = choice;
        this.isAnswer = false;
    }

    public Choice(String choice, boolean isAnswer) {
        this.choice = choice;
        this.isAnswer = isAnswer;
    }
  

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public boolean isAnswer() {
        return isAnswer;
    }

    public void setIsAnswer(boolean isAnswer) {
        this.isAnswer = isAnswer;
    }
}
