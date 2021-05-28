package de.bybackfish.api.skyblock.economy;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;

@Getter
public class PlayerCoin {

  @SerializedName("raw")
  private double coins;

  @SerializedName("cute")
  private String prettyCoins;

}
