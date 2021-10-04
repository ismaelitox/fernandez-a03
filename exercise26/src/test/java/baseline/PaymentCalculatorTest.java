package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    private int months;

    @Test
    void calculatedMonthsUntilPaidOfTests(){
        months = 60;
        months = PaymentCalculator.calculateMonthsUntilPaidOff();
        
    }

}