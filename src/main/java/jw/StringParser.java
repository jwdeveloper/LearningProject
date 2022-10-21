package jw;

public class StringParser
{
    public String[] parse(String[] args) throws Exception {

        if(args.length == 0)
        {
            throw new Exception("Empty array not allowed");
        }

        var result = new String[args.length];
        var i =0;
        for(var arg : args)
        {
            result[i] =  "Argument - "+i+": "+arg;
        }
        return result;
    }
}
