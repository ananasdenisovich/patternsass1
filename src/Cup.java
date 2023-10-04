package src;
//we need this class for singleton
class Cup {
    static private Cup instance;
    private Cup(){}
    public static Cup getInstance(){
        return new Cup();
    }
}
