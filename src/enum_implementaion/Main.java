package enum_implementaion;

public class Main {
    public static void main(String[] args) {
        ClassWithEnum classWithEnum = new ClassWithEnum();

        if(EnumTest.BAP == classWithEnum.et.FOO){

        }

        Day day;
        System.out.println(Day.MONDAY.ordinal());
        System.out.println(Day.TUESDAY.ordinal());
        System.out.println(Day.WEDNESDAY.ordinal());
    }
}
enum Day{MONDAY,TUESDAY,WEDNESDAY}