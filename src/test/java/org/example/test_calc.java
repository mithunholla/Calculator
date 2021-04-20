package org.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test_calc {


    @Test
    public void calc_test_add() {

        double n1 =  55;
        double n2 =  65;
        double n3 =  120;
        double act_add =   caculator.addition(n1,n2);


        assertEquals(n3, act_add, 0);

        double a1 =  55;
        double a2 =  65;
        double a3 =  3575;
        double act_mul =   caculator.mul(a1,a2);

        assertEquals(a3, act_mul, 0);



        double b1 =  55;
        double b2 =  65;
        double b3 =  -10;
        double act_sub =   caculator.sub(b1,b2);

        assertEquals(b3, act_sub, 0);



        double c1 =  55;
        double c2 =  65;
        double c3 =  0.8461538461538461;
        double act_div =   caculator.div(c1,c2);

        assertEquals(c3, act_div, 0);
    }
}
