package KI305.Nikolenko.Lab4;
/**
 * Class <code>Equations</code> implements method for  y=tg(x)ctg(2x) expression calculation
 * @author Oleksandr Nikolenko
 * @version 1.0
 */
class Equations
{
    public double calculate(int x) throws CalcException
    {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try
        {
            y = Math.tan(rad) * ( 1 / Math.tan(rad * 2));
            if (x==90 || x== -90 || x==0 || x==-180 || x==180 || 2*x == 90 || 2*x == -90 || 2*x == 180 || 2*x == -180 )
                throw new ArithmeticException();
        }
        catch (ArithmeticException ex)
        {
            if (x==90 || x== -90 || x==-180 || x==180 || 2*x == 90 || 2*x == -90 || 2*x == 180 || 2*x == -180 )
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");

            else if (x==0)
                throw new CalcException("Exception reason: X = 0");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");

        }
        return y;
    }

}

