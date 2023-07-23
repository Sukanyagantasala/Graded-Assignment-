import java.util.*;

class Student{
   private int id;
   private String firstname;
   private double cgpa;
   public Student(int id, String firstname, double cgpa) {
      super();
      this.id = id;
      this.firstname = firstname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return id;
   }
   public String getFirstname() {
      return firstname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class PriorityQueue {

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tEvents = Integer.parseInt(sc.nextLine());
        PriorityQueue<Stu> list =
                new PriorityQueue<>(new Comparator<Stu>() {
            @Override
            public int compare(Stu s1, Stu s2) {
                if(s1.getCgpa() != s2.getCgpa())
                    return s1.getCgpa() < s2.getCgpa() ? 1 : -1;
                else{
                    if(!s1.getFname().equals(s2.getFname()))
                        return s1.getFname().compareTo(s2.getFname());
                    else
                        return s1.getToken() < s2.getToken() ? 1 : -1;
                }
            }
        });

        while (tEvents > 0) {
            String event = sc.next();

            if (event.equals("ENTER")) {
                String n = sc.next();
                double g = sc.nextDouble();
                int i = sc.nextInt();
                list.add(new Student(i, n, g));
            } else if (list.size() > 0 && event.equals("SERVED")) {
                list.remove();
            }

            tEvents--;
        }
        sc.close();

        if(list.size() == 0) {
            System.out.println("EMPTY");
            return;
        }

        while(list.size() > 0){
            System.out.println(list.poll().getFirstname());
        }
    }
}
