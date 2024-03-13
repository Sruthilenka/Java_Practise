package Collections.EnumSet;

import org.testng.Assert;

import java.util.EnumSet;

public class removeES {
    enum job {
        TEACHER, POSTMAN, CLERK, DRIVER
    }

    public static void main(String[] args) {
        EnumSet<job> jobset1 = EnumSet.allOf(job.class);
        Boolean b = jobset1.remove(job.CLERK); //this returns boolean
        System.out.println(b);
        System.out.println(jobset1);


        //    Assert.assertTrue(jobset1.remove(job.CLERK)); // just trying assertions

        //removeAll
        Boolean b1 = jobset1.removeAll(jobset1);
        System.out.println(b1);
        System.out.println(jobset1);
    }
}
