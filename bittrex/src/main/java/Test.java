import com.github.dognjen.clients.BittrexClient;
import com.github.dognjen.enums.CryptoExchange;
import com.github.dognjen.factories.Exchange;
import com.github.dognjen.clients.cred.ExchangeCredentials;
import com.github.dognjen.factories.ExchangeFactory;

/**
 * Created by Dejan on 02/01/2018.
 */
public class Test {

    public static void main(String[] args) {
        ExchangeCredentials credentials = new ExchangeCredentials("", "");

        Exchange exchange = ExchangeFactory.create(CryptoExchange.BITTREX, credentials);

        System.out.print(exchange.getUrl());

        ((BittrexClient) exchange).getMarkets();
    }
}
