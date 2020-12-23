package enum_implementaion;

class  Enum{
    private final String name;
    private final int ordinal;
    public final String name(){return this.name;}
    public final int ordinal(){return this.ordinal;}


//    public static Enum valueOf(String name){
//        if(name.equals(name1))return this;
//        return null;
//    }
//
    protected Enum(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    @Override
    public final boolean equals(Object o) {
        return  (this == o) ;

    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }
}

