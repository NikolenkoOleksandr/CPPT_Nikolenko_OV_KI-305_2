package KI305.Nikolenko.Lab6;
/**
 * Class <code>text</code> implements Data
 * @author Oleksandr Nikolenko
 * @version 1.0
 **/
public  class text implements Data
{
    private String textName;
    private int size;

    /**
     * Constructor
     * @param tName Name of text
     * @param tsize Text size
     */
    public text(String tName,  int tsize)
    {
        textName = tName;
        size = tsize;
    }

    /**
     * Method returns text name
     * @return text name
     */
    public String getTextName()
    {
        return textName;
    }
    /**
     * Method sets the new text name
     * @param name text name
     */
    public void setThingName(String name)
    {
        textName = name;
    }
    /**
     * Method returns text size
     * @return text size
     */
    public int getsize()
    {
        return size;
    }
    /**
     * Method simulates comparing text size
     */
    public int compareTo(Data p)
    {
        Integer s = size;
        return s.compareTo(p.getSize());
    }

    /**
     * Method simulates printing info about text
     */
    public void print()
    {
        System.out.print("Text: " + textName + ", Text size: " + size + " symbols;\n");
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return 0;
    }

}

