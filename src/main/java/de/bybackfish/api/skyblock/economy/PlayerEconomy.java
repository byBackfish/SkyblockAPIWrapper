package de.bybackfish.api.skyblock.economy;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class PlayerEconomy {

  @SerializedName("purse")
  private PlayerCoin purse = new PlayerCoin();

  @SerializedName("bank")
  private PlayerCoin bank = new PlayerCoin();

}
