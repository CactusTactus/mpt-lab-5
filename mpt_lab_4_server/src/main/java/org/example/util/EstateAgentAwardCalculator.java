package org.example.util;

import org.example.entity.EstateAgent;
import org.example.entity.EstateAgentAward;
import org.example.entity.EstateTransaction;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.stream.Collectors;

public class EstateAgentAwardCalculator {

    public static EstateAgentAward getAgentAward(EstateAgent agent) {
        int award = 0;
        List<EstateTransaction> estateTransactionsInThisMonth = agent.getEstateTransactions().stream()
                .filter(et ->
                        et.getTransactionDate() * 1000 >= UnixTimeHelper.getStartOfCurrentMonthMillis() &&
                        et.getTransactionDate() * 1000 <= UnixTimeHelper.getEndOfCurrentMonthMillis())
                .collect(Collectors.toList());

        int estateTransactionsCount = estateTransactionsInThisMonth.size();
        long totalEstateTransactionsSum = estateTransactionsInThisMonth.stream()
                .mapToLong(EstateTransaction::getApartmentCost)
                .sum();

        if (estateTransactionsCount == 0) {
            award = (int) (agent.getSalary() * -0.05);
        }
        if (estateTransactionsCount > 3 || totalEstateTransactionsSum > 5_000_000) {
            award = (int) (agent.getSalary() * 0.1);
        }

        return new EstateAgentAward(agent.getEstateAgentId(), agent.getName(), award);
    }
}
