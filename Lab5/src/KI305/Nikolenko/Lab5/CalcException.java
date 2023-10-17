package KI305.Nikolenko.Lab5;
/**
 * Class <code>CalcException</code> more precises ArithmeticException
 * @author Oleksandr Nikolenko
 * @version 1.0
 */
class CalcException extends ArithmeticException
{

    private static final long serialVersionUID = 1L;

    public CalcException(){}

    public CalcException(String cause)
    {
        super(cause);
    }
}

