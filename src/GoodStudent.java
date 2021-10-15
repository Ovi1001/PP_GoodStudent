import java.text.DecimalFormat;

public class GoodStudent
{
    private String firstName;
    private String lastName;
    private int idNum;
    private double gpa;
    private boolean inCs;

    // Constructor classes
    // Multi argument constructor classes & default constructor
    public GoodStudent(String newFirstName, String newLastName, int newIdNum, double newGpa, boolean newInCs)
    {
        firstName = newFirstName;
        lastName = newLastName;
        idNum = newIdNum;
        gpa = newGpa;
        inCs = newInCs;
    }
    public GoodStudent(String newFirstName, String newLastName, int newIdNum)
    {
        firstName = newFirstName;
        lastName = newLastName;
        idNum = newIdNum;
        gpa = 0;
        inCs = false;
    }
    public GoodStudent()
    {
        firstName = "Unnamed";
        lastName = "";
        idNum = 0;
        gpa = 0;
        inCs = false;
    }

    //The accessors methods
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getId()
    {
        return idNum;
    }
    public double getGpa()
    {
        return gpa;
    }
    public boolean getInCs()
    {
        return inCs;
    }

    //The mutators methods
    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }
    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }
    public void setId(int newIdNum)
    {
        idNum = newIdNum;
    }
    public void setGpa(double newGpa)
    {
        gpa = newGpa;
    }
    public void setInCs(boolean newInCs)
    {
        inCs = newInCs;
    }

    //The brain methods
    public String createId()
    {
        String newId = "";
        String newIdString = idNum + "";
        if (firstName.length() >= 1) //Checks to make sure the string length is always greater than 1
        {
            newId = firstName.substring(0, 1);
        }
        newId += lastName;
        if (newIdString.length() >= 3)
        {
            newId += newIdString.substring(newIdString.length() - 3, newIdString.length());
        }
        else
        {
            newId += newIdString;
        }
        newId = newId.toLowerCase();
        return newId;
    }

    public String csGpa()
    {
        DecimalFormat fmt = new DecimalFormat("0.##");
        double boostedGpa = gpa;
        if (inCs)
        {
            boostedGpa *= 1.15;
        }
        return fmt.format(boostedGpa);
    }

    //toString method to print out values of object
    public String toString()
    {
        return "Name: " + firstName + " " + lastName
                + "\nId Num: " + idNum
                + "\nGPA: " + gpa
                + "\nIn CSA: " + inCs;
    }
}//end GoodStudent class
