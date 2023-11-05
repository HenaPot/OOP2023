package org.example.lab5.task1;

class CivilService implements NationalService {
    private int daysLeft;

    public CivilService(){
        this.daysLeft = 362;
    }

    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }

    @Override
    public void work() {
        if (this.daysLeft > 0){
            this.daysLeft--;
        }

    }
}

class MilitaryService implements NationalService{
    private int daysLeft;

    public MilitaryService(int daysLeft){
        this.daysLeft = daysLeft;
    }
    @Override
    public int getDaysLeft(){
        return this.daysLeft;
    }

    @Override
    public void work(){

    }
}