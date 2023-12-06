package bank;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTests {

    private static final  String NAME = "test_Bank";
    private static final int CAPACITY = 10;
    private Client client;
    private Bank bank;

    @Before
    public void setUp (){
        this.bank = new Bank(NAME, CAPACITY);
        this.client = new Client("test_Client");
    }

    @Test (expected = NullPointerException.class)
        public void test_CreateBank_with_nullName_shouldThrow (){
        Bank bank = new Bank(null, CAPACITY);


        }
    @Test (expected = NullPointerException.class)
    public void test_CreateBank_with_EmptyName_shouldThrow (){
        Bank bank = new Bank("      ", CAPACITY);


    }
    @Test (expected = IllegalArgumentException.class)
    public void test_CreateBank_with_negativeCapacity_shouldThrow (){
        Bank bank = new Bank(NAME, -5);
    }
    @Test ()
    public void test_CreateBank_with_validArguments (){
        Bank bank = new Bank(NAME, CAPACITY);
        Assert.assertEquals(NAME, bank.getName());
        Assert.assertEquals(CAPACITY, bank.getCapacity());
    }
    @Test(expected = IllegalArgumentException.class)
    public void test_addClient_shouldFail_whenCapacity_reached (){
        Bank bank = new Bank(NAME, 0);
        bank.addClient(new Client("testClient"));

    }
    @Test
    public void test_addClient_shouldSucceed_whenCapacity_Exists (){
        bank.addClient(client);
        Assert.assertEquals(1,bank.getCount());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveClient_shouldFail_when_Missing (){
        bank.removeClient(client.getName());
    }
    @Test
    public void test_removeClient_should_Decrease_Clients_Size (){
        bank.addClient(client);
        bank.removeClient(client.getName());
        Assert.assertEquals(0, bank.getCount());

    }
    @Test (expected = IllegalArgumentException.class)
    public void test_loanWithdrawal_shouldFail_when_Missing (){
        bank.removeClient(client.getName());
    }
    @Test
    public void test_loanWithdrawal_shoulSet_client_notApproved (){
        bank.addClient(client);
        bank.loanWithdrawal(client.getName());
        Assert.assertFalse(client.isApprovedForLoan());

    }
}



