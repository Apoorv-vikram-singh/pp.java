class parent
{
    int i=10;
    void meth2(){
        System.out.println("value og i"+i);
    }
}

class child extends parent{
    void meth1()
    {
        System.out.println("value of i  " +i);
    }
}
class apoorv23
{
    public static void main(String args[])
    {
    child obj=new child();
    obj.meth1();
    obj.meth2();
    }
}