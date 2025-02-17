package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import java.util.List;

public interface ParseTransactionService {
    List<FruitTransaction> parseTransaction(List<String> linesFromFile);
}
