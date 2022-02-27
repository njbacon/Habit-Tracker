import java.util.Scanner;
class HabitTracker{
    HabitList habitList = new HabitList();
    Scanner scan = new Scanner(System.in);

    public HabitTracker(){
        init();
    }

    public void init(){
        habits();
    }

    public void habits(){
        display();
        System.out.println("Habits:\n" +
                           "[1] Complete\n" +
                           "[2] Add\n" +
                           "[3] Remove\n" + 
                           "[4] Refresh\n");
        String input = scan.next();
        int select = Integer.parseInt(input);
        if (select == 1){
            complete();
        }
        if (select == 2){
            add();
        }
        if (select == 3){
            remove();
        }
        if (select == 4){
            habitList.refresh();
        }
        habits();
    }

    public void complete(){
        displayComplete();
        String input = scan.next();
        int select = Integer.parseInt(input);
        habitList.complete(select-1);
    }

    public void add(){
        String name;
        int priority = -1;
        int difficulty = -1;

        System.out.print("Name: ");
        name = scan.next();
        System.out.print("Priority: ");
        priority = Integer.parseInt(scan.next());
        System.out.print("Difficulty: ");
        difficulty = Integer.parseInt(scan.next());
        habitList.add(new Habit(name, priority, difficulty));
    }

    public void remove(){
        displayRemove();
        String input = scan.next();
        int select = Integer.parseInt(input);
        habitList.remove(select-1);
    }

    public void display(){
        System.out.println(habitList.display(0));
    }

    public void displayComplete(){
        System.out.println(habitList.display(1));
    }

    public void displayRemove(){
        System.out.println(habitList.display(2));
    }

    public static void main(String[] args){
        HabitTracker a = new HabitTracker();
    }
}
