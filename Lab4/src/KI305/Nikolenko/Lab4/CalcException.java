package KI305.Nikolenko.Lab4;
/**
 * Class <code>CalcException</code> more precises ArithmeticException
 * @author Oleksandr Nikolenko
 * @version 1.0
 */

class CalcException extends ArithmeticException
{
    public CalcException(){}

    public CalcException(String cause)
    {
        super(cause);
    }
}

