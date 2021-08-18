package microservices.template.simpleeventsource.services.commands;

import microservices.template.simpleeventsource.dto.commands.AccountCreateDTO;
import microservices.template.simpleeventsource.dto.commands.MoneyCreditDTO;
import microservices.template.simpleeventsource.dto.commands.MoneyDebitDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {

    public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}
