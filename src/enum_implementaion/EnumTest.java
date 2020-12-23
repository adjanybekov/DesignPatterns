package enum_implementaion;


class EnumTest extends Enum{
    public static final /* enum */ EnumTest FOO= new EnumTest("FOO", 0);;
    public static final /* enum */ EnumTest BAR=new EnumTest("BAR", 1);;
    public static final /* enum */ EnumTest BAP=new EnumTest("BAP", 2);;
    private static final /* synthetic */ EnumTest[] $VALUES=new EnumTest[]{EnumTest.FOO, EnumTest.BAR, EnumTest.BAP};;


    public static EnumTest[] values()
    {
        return EnumTest.$VALUES.clone();
    }

    public EnumTest valueOf(String name)
    {
//        return Enum.valueOf(name);
        if(name.equals(FOO.name())){
            return FOO;
        }
        if(name.equals(BAR.name())){
            return BAR;
        }
        if(name.equals(BAP.name())){
            return BAP;
        }
        return null;
    }


    private EnumTest(String name, int ordinal) {
        super(name, ordinal);
//        init();
    }

    public EnumTest getEnum(){
        return this;
    }

}