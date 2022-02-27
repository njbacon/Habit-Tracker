import java.util.ArrayList;
class HabitList{
    ArrayList<Habit> habits = new ArrayList<>();
    
    public ArrayList<Habit> getList(){
        return habits;
    }

    public void add(Habit h){
        if (h.isDue()){
            for (int i=0;i<habits.size();i++){
                if (h.getPriority() >= habits.get(i).getPriority() || habits.get(i).isDue() == false){
                    habits.add(i, h);
                    return;
                }
            }
        }
        else{
            for (int i=0;i<habits.size();i++){
                if (habits.get(i).isDue() == false && h.getPriority() >= habits.get(i).getPriority() ){
                    habits.add(i, h);
                    return;
                }
            }
        }
        habits.add(h); 
    }

    public void remove(int x){
        habits.remove(x);
    }

    public void complete(int x){
        Habit h = habits.get(x);
        h.setDue(false);
        h.setStreak(h.getStreak()+1);
        remove(x);
        add(h);
    }

    public void refresh(){
        for (int i=0;i<habits.size();i++){
            Habit h = habits.get(i);
            h.setDue(true);
            remove(i);
            add(h);
        }
    }

    public String display(int a){
        String str = "TODO-----------------------------\n";
        int count = 1;
        boolean remain = true;
        for (int i=0;i<habits.size();i++){
            if (habits.get(i).due == true){
                if (a == 1 || a == 2){
                    str += "[" + count + "]";
                    count++;
                }
            }
            else if (remain == true){
                str += "DONE-----------------------------\n";
                remain = false;
            }
            if (remain == false && a == 2){
                str += "[" + count + "]";
                count++;
            }
            for(int n=0;n<habits.get(i).getPriority();n++){
                str += "*";
            }
            str += " ";
            str += habits.get(i).getName();
            str += " <" + habits.get(i).getDifficulty() + "> ";
            str += "Streak: " + habits.get(i).getStreak();
            str += "\n";
        }
        return str;
    }
}
