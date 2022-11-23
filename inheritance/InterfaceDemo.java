package javaTut.inheritance;

interface InterfaceDemo {
    static final int x =100;
    int y = 200;

    void speak();
    abstract public void eat();
}

interface InterfaceDemo1 {
    
    
    void speak();
    abstract public void eat();
}

interface child extends InterfaceDemo,InterfaceDemo1{
    
}