public class GoodStudentDriver
{
    public static void main(String[] args)
    {
        GoodStudent alan = new GoodStudent("Alan", "Turing", 191254, 3.56, true);
        GoodStudent florence = new GoodStudent("Florence", "Nightingale", 182010, 3.89, false);
        GoodStudent grace = new GoodStudent("Grace", "Hopper", 190692, 3.99, true);

        System.out.println(alan.toString());

        florence.setId(95366);
        florence.setGpa(3.92);
        System.out.println("\nFlorence id Num: " + florence.getId());
        System.out.println("Florence GPA: " + florence.getGpa());

        System.out.println("Grace first name: " + grace.getFirstName());
        System.out.println("Grace in CS: " + grace.getInCs());

        System.out.println("Alan's created id: " + alan.createId());
        System.out.println("Florence's created id: " + florence.createId());
        System.out.println("Grace's created id: " + grace.createId());
        System.out.println("Alan's CS GPA: " + alan.csGpa());
        System.out.println("Florence's CS GPA: " + florence.csGpa());
        System.out.println("Grace's CS GPA: " + grace.csGpa());
    }//end main method
}//end GoodStudentDriver class
