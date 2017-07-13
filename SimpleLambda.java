interface inter{
    public void poov();
}
public class SimpleLambda
{
    public static void main(String[] args) {
        int age=21;
        inter in=()->{
            System.out.println("Poovarasan-Age::"+age);
        };
        in.poov();
    }
}