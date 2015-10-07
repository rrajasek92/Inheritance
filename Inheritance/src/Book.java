public class Book extends Product
{
    private String author;
   
    
    public Book(String author,String code,String description,Double price, Integer count)
    {
    	this.author=author;
    	super.code="";
    	super.description=description;
    	super.price=price;
    	
        count++;
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
    }

    
    @Override
    public String toString()
    {
        return super.toString() + "Author:      " +
            author + "\n";
    }
}
