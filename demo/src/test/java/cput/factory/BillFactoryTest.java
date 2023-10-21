package cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Bill;
import za.ac.cput.factory.BillFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BillFactoryTest {

    @Test
    public void testPass(){
        Bill bill = BillFactory.createBill(584.0);
        System.out.print(bill.toString());
        assertNotNull(bill);
    }
    Double totalBill = 56.9;
    @Test
    public void testEquals(){
        Bill bill = BillFactory.createBill(56.9);
        System.out.print(bill.toString());
        assertEquals(totalBill, bill.getTotalBill());
    }

}

