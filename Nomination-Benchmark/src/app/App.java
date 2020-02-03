package app;

import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Name: ");
        String name = in.nextLine();

        System.out.println("Email: ");
        String email = in.nextLine();

        System.out.println("School District/Affiliation: ");
        String schoolOrAffiliation = in.nextLine();

        System.out.println("position: ");
        String position = in.nextLine();

        System.out.println("relation to nominee: ");
        String relationToNominee = in.nextLine();

        System.out.println("student name: ");
        String studentName = in.nextLine();

        System.out.println("student age: ");
        Int studentAge = in.nextLine();

        System.out.println("student contact: ");
        Strint studentContact = in.nextLine();

        System.out.println("graduation date: ");
        String graduationDate = in.nextLine();

        System.out.println(
                "Apptitude: Do you have any experiences when this student has demonstrated a strong ability to think logically and/or strategically?: ");
        String aptitudeQuestion = in.nextLine();

        System.out.println(
                "Perseverance: Is there any evidence of the applicant being engaged in something they are passionate about?: ");
        String perseveranceQuestion = in.nextLine();

        System.out.println(
                "Dedication: Do you think the applicant would be able to reliably attend the program five days a week in Water Valley?: ");
        String dedicationQuestion = in.nextLine();

        System.out.println("Work Ethic/Heart: Why does this student deserve a position at Base Camp?: ");
        String workEthicQuestion = in.nextLine();

    }
}