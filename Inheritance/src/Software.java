public class Software extends Product
{
    private String version=null;

    public Software()
    {
        this.version="";
    	super.setCode(" ");
        super.setDescription("");
        super.setPrice(0);
        
        count++;
    }

    public String getVersion()
    {
        return version;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Version:     " +
            version + "\nCode:        " + code + "\n" +
            "Description: " + description + "\n" +
            "Price:       " + this.getFormattedPrice() + 
            "\n";
    }
}