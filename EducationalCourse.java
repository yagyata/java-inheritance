class Course{
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails(){
        System.out.println("Course Name: " + courseName + "\nDuration: " + duration + " months");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform + "\nIs Recorded?: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    protected double fee;
    protected int discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, int discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Fee: " + fee + "\nDiscount Offered: " + discount + "%");
    }
}

public class EducationalCourse {
    public static void main(String[] args) {
        Course course = new Course("Web development", 4);
        course.displayDetails();
        System.out.println();

        OnlineCourse onCourse = new OnlineCourse("Artificial Intelligence", 6, "Coursera", true);
        onCourse.displayDetails();
        System.out.println();

        Course paidCourse = new PaidOnlineCourse("Cloud Computing", 5, "AWS", false, 1200, 10);
        paidCourse.displayDetails();
    }
}

/*
Course Name: Web development
Duration: 4 months

Course Name: Artificial Intelligence
Duration: 6 months
Platform: Coursera
Is Recorded?: true

Course Name: Cloud Computing
Duration: 5 months
Platform: AWS
Is Recorded?: false
Fee: 1200.0
Discount Offered: 10%
 */