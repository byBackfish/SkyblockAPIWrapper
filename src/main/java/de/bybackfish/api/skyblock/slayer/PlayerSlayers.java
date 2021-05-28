package de.bybackfish.api.skyblock.slayer;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class PlayerSlayers {

  @SerializedName(
      "zombie"
  )
  private PlayerSlayer zombie = new PlayerSlayer();

  @SerializedName(
      "spider"
  )
  private PlayerSlayer spider = new PlayerSlayer();

  @SerializedName(
      "wolf"
  )
  private PlayerSlayer wolf = new PlayerSlayer();

}
