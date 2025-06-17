package desafio.api.springboot.services;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.boot.autoconfigure.pulsar.PulsarProperties.Transaction;
import org.springframework.stereotype.Service;

import desafio.api.springboot.transaction;

@Service
public class transactionservice {
    
    private final Queue<Transaction> transactions = new ConcurrentLinkedQueue<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void clearTransaction(){
        transactions.clear();
    }

    public DoubleSummaryStatistics getStatiscs() {
        OffsetDateTime now = OffsetDateTime.now();
        return transactions.stream()
            .filter(t -> t.getDataHora().isAfter(now.minusSeconds(60)))
            .mapToDouble(Transaction::getValor)
            .sumaryStatiscs();
    }

}
