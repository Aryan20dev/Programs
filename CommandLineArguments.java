public class CommandLineArguments 
{
public static void main(String[] args)
{
    String numbers[][]={
        {"Tom","9876541230"},
        {"Mary","9876543210"},
        {"Jess","9876542310"},
        {"Ralph","9876540132"}
    };
    int i;
    if(args.length!=1)
    {
        System.out.println("java CommandLineArguments <name>");

    }
    else
    {
    for(i=0;i<args.length;i++)
    {
        if(args[i].equals(numbers[i][0]))
        {System.out.println(numbers[i][0]+":"+numbers[i][1]);
        break;
    }
}
    if(numbers.length==i)
    System.out.println("Number not found");
}    
}
}
