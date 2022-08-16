package domain;

import com.litesoftwares.coingecko.CoinGeckoApiClient;
import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AdapterAPICoinCripto {
    CoinGeckoApiClient client = new CoinGeckoApiClientImpl();
    private Valor valorBTC = new Valor(client.getPrice("bitcoin","usd",false,false,false,false).get("bitcoin").get("usd"), LocalDateTime.now());
     private Valor valorETH = new Valor(client.getPrice("ethereum","usd",false,false,false,false).get("ethereum").get("usd"),LocalDateTime.now());
     private Valor valorDOGE = new Valor(client.getPrice("dogecoin","usd",false,false,false,false).get("dogecoin").get("usd"),LocalDateTime.now());
     private Valor valorTether = new Valor(client.getPrice("tether","usd",false,false,false,false).get("tether").get("usd"),LocalDateTime.now());
     private Valor valorADA = new Valor(client.getPrice("cardano","usd",false,false,false,false).get("cardano").get("usd"),LocalDateTime.now());

      private Criptomoneda bitcoin = new Criptomoneda("bitcoin", Disponibilidad.DISPONIBLE,valorBTC);
      private Criptomoneda ethereum = new Criptomoneda("ethereum", Disponibilidad.DISPONIBLE,valorETH);
      private Criptomoneda dogecoin = new Criptomoneda("dogecoin", Disponibilidad.DISPONIBLE,valorDOGE);
      private Criptomoneda tether = new Criptomoneda("tether", Disponibilidad.DISPONIBLE,valorTether);
      private Criptomoneda cardano = new Criptomoneda("cardano", Disponibilidad.DISPONIBLE,valorADA);


    @Scheduled(fixedRate = 60000) //Actualiza cada 5 segundos
    public void actualizacionDePrecios() {
        Valor newValorBTC = new Valor(client.getPrice("bitcoin","usd",false,false,false,false).get("bitcoin").get("usd"),LocalDateTime.now());
        Valor newValorETH = new Valor(client.getPrice("ethereum","usd",false,false,false,false).get("ethereum").get("usd"),LocalDateTime.now());
        Valor newValorDOGE = new Valor(client.getPrice("dogecoin","usd",false,false,false,false).get("dogecoin").get("usd"),LocalDateTime.now());
        Valor newValorTether = new Valor(client.getPrice("tether","usd",false,false,false,false).get("tether").get("usd"),LocalDateTime.now());
        Valor newValorADA = new Valor(client.getPrice("cardano","usd",false,false,false,false).get("cardano").get("usd"),LocalDateTime.now());
        bitcoin.setValor(newValorBTC);
        ethereum.setValor(newValorETH);
        dogecoin.setValor(newValorDOGE);
        tether.setValor(newValorTether);
        cardano.setValor(newValorADA);
        System.out.println("Actualizacion | Precios de Criptomonedas al dia de la fecha:" + LocalDateTime.now());
    }
}
