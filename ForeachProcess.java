import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;
class ForeachProcess
{
    public static void main(String[] args) {
        List<String> stringname = Arrays.asList("Poovarasan", "Preethi", "Ramya", "Sabari", "kausalya", "Gowsalya");
        stringname.forEach(System.out::println);
        Consumer<String> cs;
       System.out.println(stringname);
       for (String st : stringname) {
           if(st=="kausalya")
           {

           }
           else
           {
           System.out.println(st);
           }
       }
    }
}