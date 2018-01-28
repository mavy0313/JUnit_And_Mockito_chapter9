package exercises;

import org.junit.Test;

import static exercises.State.OK;
import static org.junit.Assert.assertEquals;

public class TransactionTest {

    @Test
    public void shouldCreateTransaction() {
        Transaction transaction = new Transaction();
        transaction.setId(1);
        transaction.setBillingId("1");
        transaction.setMessage("Message");
        transaction.setRetryAllowed(true);
        transaction.setState(OK);

        assertEquals(1, transaction.getId());
    }

    @Test
    public void shouldCreateTransactionViaBuilder() {
        TransactionBuilder transactionBuilder = new TransactionBuilder();
        Transaction transaction = transactionBuilder
                .withId(1)
                .withState(OK)
                .withMessage("Message")
                .withRetryAllowed(true)
                .withBillingId("1")
                .build();

        assertEquals(1, transaction.getId());
    }

    @Test
    public void shouldCreateTransactionViaBuilderWithoutBillingId() {
        TransactionBuilder transactionBuilder = new TransactionBuilder();
        Transaction transaction = transactionBuilder
                .withId(1)
                .withState(OK)
                .withMessage("Message")
                .withRetryAllowed(true)
                .build();

        assertEquals(null, transaction.getBillingId());
    }
}
