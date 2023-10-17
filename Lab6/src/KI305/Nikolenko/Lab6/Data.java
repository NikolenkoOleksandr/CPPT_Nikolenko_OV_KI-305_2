package KI305.Nikolenko.Lab6;

/**
 * Interface <code>Data</code> extends Comparable
 * @author Oleksandr Nikolenko
 * @version 1.0
 **/
interface Data extends Comparable<Data>
{
    public int getSize();
    public void print();
    public String getTextName();
    public int getsize();
}
