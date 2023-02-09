enum Day
{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class enum_Asser
{
    public static void main(String args[])
    {
        Day today=Day.MONDAY;
        Day tomorrow=Day.TUESDAY;
        switch(today)
        {
            case MONDAY:
            System.out.println("today is monday");
            break;
            case  TUESDAY:System.out.println("today is tuesday");
            break;
            default:System.out.println("today is neither monday nor tuesday");
        }
        assert today!=tomorrow:"today and tomorrow are in the same day";
        System.out.println("today and tomorrow are different days");

    }    
}
