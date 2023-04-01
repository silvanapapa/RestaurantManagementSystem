public class Database_Exception extends Exception
{
    public String errormess;
    public Database_Exception(String msg)
    {
        errormess = msg;
    }

    public String getErrMessage()
    {
        return errormess;
    }
}
