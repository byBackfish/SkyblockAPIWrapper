package de.bybackfish.api.skyblock.dungeons;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class PlayerDungeons {

  @SerializedName(
      "catacombs"
  )
  private PlayerDungeon catacombs = new PlayerDungeon();

  @SerializedName(
      "berserk"
  )
  private PlayerDungeon berserk = new PlayerDungeon();

  @SerializedName(
      "healer"
  )
  private PlayerDungeon healer = new PlayerDungeon();

  @SerializedName(
      "archer"
  )
  private PlayerDungeon archer = new PlayerDungeon();

  @SerializedName(
      "tank"
  )
  private PlayerDungeon tank = new PlayerDungeon();

  @SerializedName(
      "mage"
  )
  private PlayerDungeon mage = new PlayerDungeon();

}
