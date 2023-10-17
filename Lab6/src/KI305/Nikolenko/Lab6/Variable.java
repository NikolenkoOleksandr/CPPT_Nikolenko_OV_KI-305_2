package KI305.Nikolenko.Lab6;
/**
 * Class <code>Thing</code> implements Data
 * @author Oleksandr Nikolenko
 * @version 1.0
 **/
public  class Variable implements Data
{
    private String varName;
    private int size;
    private static int countIntegerObjects = 0;
    /**
     * Constructor
     * @param vName Name of variable
     * @param vsize Variable size
     */
    public Variable (String vName,  int vsize)
    {
        varName = vName;
        size = vsize;
        if (varName.equals("Integer")) {
            countIntegerObjects++;
        }
    }

    public static int getCountIntegerObjects() {
        return countIntegerObjects;
    }

    /**
     * Method returns variable name
     * @return variable name
     */
    public String getTextName()
    {
        return varName;
    }
    /**
     * Method sets the new variable name
     * @param name variable name
     */
    public void setVarName(String name)
    {
        varName = name;
    }

    /**
     * Method returns variable size
     * @return variable size
     */
    public int getsize()
    {
        return size;
    }
    /**
     * Method simulates comparing variable size
     */
    public int compareTo(Data p)
    {
        Integer s = size;
        return s.compareTo(p.getSize());
    }

    /**
     * Method simulates printing info about variable
     */
    public void print()
    {
        System.out.print("Variable: " + varName + ", Variable size: " + size + " byte;\n");
    }
    //@Override
    public int getSize() {
        // TODO Auto-generated method stub
        return 0;
    }


}
