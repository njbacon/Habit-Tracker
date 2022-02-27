class Habit{
    String name;
    boolean due = true;
    int priority;
    int difficulty;
    int streak = 0;

    public Habit(String name, int priority, int difficulty){
        this.name = name;
        this.priority = priority;
        this.difficulty = difficulty;
    }

    public String getName(){
        return name;
    }

    public boolean isDue(){
        return due;
    }
    
    public int getPriority(){
        return priority;
    }

    public int getDifficulty(){
        return difficulty;
    }

    public int getStreak(){
        return streak;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDue(boolean due){
        this.due = due;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public void setDifficulty(int difficulty){
        this.difficulty = difficulty;
    }

    public void setStreak(int streak){
        this.streak = streak;
    }
}
