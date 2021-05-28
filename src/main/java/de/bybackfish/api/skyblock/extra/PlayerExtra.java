package de.bybackfish.api.skyblock.extra;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;

@Getter
public class PlayerExtra {

  @SerializedName("fairySouls")
  private int fairySouls;

  @SerializedName("cuteName")
  public String profileName;

  @SerializedName("lastLogin")
  private long lastLogin;

}
